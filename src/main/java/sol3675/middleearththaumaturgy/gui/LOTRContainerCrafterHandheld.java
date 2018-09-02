package sol3675.middleearththaumaturgy.gui;

import java.util.ArrayList;
import java.util.List;

import lotr.common.LOTRFaction;
import lotr.common.recipe.LOTRRecipes;
import lotr.common.recipe.LOTRRecipesPouch;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ContainerWorkbench;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;

public abstract class LOTRContainerCrafterHandheld extends ContainerWorkbench{
	
	private World world_;
	private int coordX;
	private int coordY;
	private int coordZ;
	public final List<IRecipe> recipeList;

	public LOTRContainerCrafterHandheld(InventoryPlayer inv, World world, int x, int y, int z, List<IRecipe> list, EntityPlayer player, LOTRFaction faction)
	{
		super(inv, world, x, y, z);
		this.world_ = world;
		this.coordX = x;
		this.coordY = y;
		this.coordZ = z;
		
		this.recipeList = new ArrayList(list);
		this.recipeList.add(new LOTRRecipesPouch(faction));
	}
	
	@Override
	public void onContainerClosed(EntityPlayer player)
	{
		super.onContainerClosed(player);
		if(!this.world_.isRemote)
		{
			for(int i = 0; i < 9; ++i)
			{
				ItemStack stack = this.craftMatrix.getStackInSlotOnClosing(i);
				if(stack != null)
				{
					player.dropPlayerItemWithRandomChoice(stack, false);
				}
			}
		}
	}
	
	@Override
	public void onCraftMatrixChanged(IInventory inv)
	{
		if(this.recipeList == null)
		{
			return;
		}
		this.craftResult.setInventorySlotContents(0, LOTRRecipes.findMatchingRecipe(this.recipeList, this.craftMatrix, this.world_));
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer player)
	{
		return true;
	}
	
	public static class Morgul
    extends LOTRContainerCrafterHandheld
    {
    public Morgul(InventoryPlayer inv, World world, int i, int j, int k)
    	{
    	super(inv, world, i, j, k, LOTRRecipes.morgulRecipes, null, LOTRFaction.MORDOR);
    	}
    }

}
