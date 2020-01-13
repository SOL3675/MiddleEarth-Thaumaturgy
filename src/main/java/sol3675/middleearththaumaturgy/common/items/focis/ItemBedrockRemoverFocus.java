package sol3675.middleearththaumaturgy.common.items.focis;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import sol3675.middleearththaumaturgy.references.LibMisc;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.wands.ItemFocusBasic.WandFocusAnimation;
import thaumcraft.common.items.wands.ItemWandCasting;

public class ItemBedrockRemoverFocus extends ItemMETTFocus
{
	public ItemBedrockRemoverFocus()
	{
		super("bedrock_remover");
		this.setUnlocalizedName("focus_bedrock_remover");
	}
	
	@Override
	public AspectList getVisCost(final ItemStack focus)
	{
		return new AspectList().add(Aspect.AIR, 1000).add(Aspect.EARTH, 1000).add(Aspect.ORDER, 500).add(Aspect.ENTROPY, 2000);
	}
	
	@Override
	public WandFocusAnimation getAnimation(ItemStack stack)
	{
		return WandFocusAnimation.CHARGE;
	}
	
	@Override
	public int getFocusColor(final ItemStack focus)
	{
		return 0x757575;
	}
	
	@Override
	public ItemStack onFocusRightClick(final ItemStack itemStack, final World world, final EntityPlayer player, final MovingObjectPosition pos)
	{
		final ItemWandCasting wand = (ItemWandCasting)itemStack.getItem();
		if(pos == null)
		{
			return itemStack;
		}
		int x = pos.blockX;
		int y = pos.blockY;
		int z = pos.blockZ;
		if(world.getBlock(x, y, z) == Blocks.bedrock && y != 0 && wand.consumeAllVis(itemStack, player, this.getVisCost(itemStack), true, false))
		{
			world.setBlockToAir(x, y, z);
			if(!world.isRemote)
			{
				world.playSoundEffect(x, y, z, "thaumcraft:wand", 1.0F, 1.0F);
			}
		}
		return itemStack;
	}
}
