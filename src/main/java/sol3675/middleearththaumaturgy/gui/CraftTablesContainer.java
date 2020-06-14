package sol3675.middleearththaumaturgy.gui;

import java.util.ArrayList;
import java.util.List;

import lotr.common.fac.LOTRFaction;
import lotr.common.recipe.LOTRRecipes;
import lotr.common.recipe.LOTRRecipesPouch;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ContainerWorkbench;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;

public abstract class CraftTablesContainer extends ContainerWorkbench
{
	private World world;
	public final List<IRecipe> recipeList;
	public final LOTRFaction faction;
	
	public CraftTablesContainer(InventoryPlayer inventory, World world, int x, int y, int z, List<IRecipe> list, LOTRFaction faction)
	{
		super(inventory, world, x, y, z);
		this.faction = faction;
		this.recipeList = new ArrayList(list);
		this.recipeList.add(new LOTRRecipesPouch(this.faction));
	}
	
	@Override
	public void onCraftMatrixChanged(IInventory inventory)
	{
		if(this.recipeList == null)
		{
			return;
		}
		this.craftResult.setInventorySlotContents(0, LOTRRecipes.findMatchingRecipe(this.recipeList, this.craftMatrix, this.world));
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer player)
	{
		return true;
	}
	
	public static class Hobbit extends CraftTablesContainer
	{
		public Hobbit(InventoryPlayer inventory, World world, int x, int y, int z)
		{
			super(inventory, world, x, y, z, LOTRRecipes.hobbitRecipes, LOTRFaction.HOBBIT);
		}
	}
	
	public static class Ranger extends CraftTablesContainer
	{
		public Ranger(InventoryPlayer inventory, World world, int x, int y, int z)
		{
			super(inventory, world, x, y, z, LOTRRecipes.rangerRecipes, LOTRFaction.RANGER_NORTH);
		}
	}
	
	public static class BlueMountains extends CraftTablesContainer
	{
		public BlueMountains(InventoryPlayer inventory, World world, int x, int y, int z)
		{
			super(inventory, world, x, y, z, LOTRRecipes.blueMountainsRecipes, LOTRFaction.BLUE_MOUNTAINS);
		}
	}
	
	public static class Lindon extends CraftTablesContainer
	{
		public Lindon(InventoryPlayer inventory, World world, int x, int y, int z)
		{
			super(inventory, world, x, y, z, LOTRRecipes.highElvenRecipes, LOTRFaction.HIGH_ELF);
		}
	}
	
	public static class Gundabad extends CraftTablesContainer
	{
		public Gundabad(InventoryPlayer inventory, World world, int x, int y, int z)
		{
			super(inventory, world, x, y, z, LOTRRecipes.gundabadRecipes, LOTRFaction.GUNDABAD);
		}
	}
	
	public static class Angmar extends CraftTablesContainer
	{
		public Angmar(InventoryPlayer inventory, World world, int x, int y, int z)
		{
			super(inventory, world, x, y, z, LOTRRecipes.angmarRecipes, LOTRFaction.ANGMAR);
		}
	}
	
	public static class WoodElf extends CraftTablesContainer
	{
		public WoodElf(InventoryPlayer inventory, World world, int x, int y, int z)
		{
			super(inventory, world, x, y, z, LOTRRecipes.woodElvenRecipes, LOTRFaction.WOOD_ELF);
		}
	}
	
	public static class DolGuldur extends CraftTablesContainer
	{
		public DolGuldur(InventoryPlayer inventory, World world, int x, int y, int z)
		{
			super(inventory, world, x, y, z, LOTRRecipes.dolGuldurRecipes, LOTRFaction.DOL_GULDUR);
		}
	}
	
	public static class Dale extends CraftTablesContainer
	{
		public Dale(InventoryPlayer inventory, World world, int x, int y, int z)
		{
			super(inventory, world, x, y, z, LOTRRecipes.daleRecipes, LOTRFaction.DALE);
		}
	}
	
	public static class Dwarven extends CraftTablesContainer
	{
		public Dwarven(InventoryPlayer inventory, World world, int x, int y, int z)
		{
			super(inventory, world, x, y, z, LOTRRecipes.dwarvenRecipes, LOTRFaction.DURINS_FOLK);
		}
	}
	
	public static class Galadhrim extends CraftTablesContainer
	{
		public Galadhrim(InventoryPlayer inventory, World world, int x, int y, int z)
		{
			super(inventory, world, x, y, z, LOTRRecipes.elvenRecipes, LOTRFaction.LOTHLORIEN);
		}
	}
	
	public static class Dunlending extends CraftTablesContainer
	{
		public Dunlending(InventoryPlayer inventory, World world, int x, int y, int z)
		{
			super(inventory, world, x, y, z, LOTRRecipes.dunlendingRecipes, LOTRFaction.DUNLAND);
		}
	}
	
	public static class Uruk extends CraftTablesContainer
	{
		public Uruk(InventoryPlayer inventory, World world, int x, int y, int z)
		{
			super(inventory, world, x, y, z, LOTRRecipes.urukRecipes, LOTRFaction.ISENGARD);
		}
	}
	
	public static class Rohirric extends CraftTablesContainer
	{
		public Rohirric(InventoryPlayer inventory, World world, int x, int y, int z)
		{
			super(inventory, world, x, y, z, LOTRRecipes.rohirricRecipes, LOTRFaction.ROHAN);
		}
	}
	
	public static class Gondorian extends CraftTablesContainer
	{
		public Gondorian(InventoryPlayer inventory, World world, int x, int y, int z)
		{
			super(inventory, world, x, y, z, LOTRRecipes.gondorianRecipes, LOTRFaction.GONDOR);
		}
	}
	
	public static class DolAmroth extends CraftTablesContainer
	{
		public DolAmroth(InventoryPlayer inventory, World world, int x, int y, int z)
		{
			super(inventory, world, x, y, z, LOTRRecipes.dolAmrothRecipes, LOTRFaction.GONDOR);
		}
	}
	
	public static class Morgul extends CraftTablesContainer
	{
		public Morgul(InventoryPlayer inventory, World world, int x, int y, int z)
		{
			super(inventory, world, x, y, z, LOTRRecipes.morgulRecipes, LOTRFaction.MORDOR);
		}
	}
	
	public static class Dorwinion extends CraftTablesContainer
	{
		public Dorwinion(InventoryPlayer inventory, World world, int x, int y, int z)
		{
			super(inventory, world, x, y, z, LOTRRecipes.dorwinionRecipes, LOTRFaction.DORWINION);
		}
	}
	
	public static class Rhunic extends CraftTablesContainer
	{
		public Rhunic(InventoryPlayer inventory, World world, int x, int y, int z)
		{
			super(inventory, world, x, y, z, LOTRRecipes.rhunRecipes, LOTRFaction.RHUDEL);
		}
	}
	
	public static class Haradric extends CraftTablesContainer
	{
		public Haradric(InventoryPlayer inventory, World world, int x, int y, int z)
		{
			super(inventory, world, x, y, z, LOTRRecipes.nearHaradRecipes, LOTRFaction.NEAR_HARAD);
		}
	}
	
	public static class Moredain extends CraftTablesContainer
	{
		public Moredain(InventoryPlayer inventory, World world, int x, int y, int z)
		{
			super(inventory, world, x, y, z, LOTRRecipes.moredainRecipes, LOTRFaction.MORWAITH);
		}
	}
	
	public static class Tauredain extends CraftTablesContainer
	{
		public Tauredain(InventoryPlayer inventory, World world, int x, int y, int z)
		{
			super(inventory, world, x, y, z, LOTRRecipes.tauredainRecipes, LOTRFaction.TAURETHRIM);
		}
	}
	
	public static class HalfTroll extends CraftTablesContainer
	{
		public HalfTroll(InventoryPlayer inventory, World world, int x, int y, int z)
		{
			super(inventory, world, x, y, z, LOTRRecipes.halfTrollRecipes, LOTRFaction.HALF_TROLL);
		}
	}
	
	public static class Rivendell extends CraftTablesContainer
	{
		public Rivendell(InventoryPlayer inventory, World world, int x, int y, int z)
		{
			super(inventory, world, x, y, z, LOTRRecipes.rivendellRecipes, LOTRFaction.HIGH_ELF);
		}
	}
	
	public static class Umbaric extends CraftTablesContainer
	{
		public Umbaric(InventoryPlayer inventory, World world, int x, int y, int z)
		{
			super(inventory, world, x, y, z, LOTRRecipes.umbarRecipes, LOTRFaction.NEAR_HARAD);
		}
	}
	
	public static class Gulfen extends CraftTablesContainer
	{
		public Gulfen(InventoryPlayer inventory, World world, int x, int y, int z)
		{
			super(inventory, world, x, y, z, LOTRRecipes.gulfRecipes, LOTRFaction.NEAR_HARAD);
		}
	}
	
	public static class Bree extends CraftTablesContainer
	{
		public Bree(InventoryPlayer inventory, World world, int x, int y, int z)
		{
			super(inventory, world, x, y, z, LOTRRecipes.breeRecipes, LOTRFaction.BREE);
		}
	}
}
