package sol3675.middleearththaumaturgy.common.items.focis;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import lotr.common.LOTRLevelData;
import lotr.common.fac.LOTRAlignmentValues;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import sol3675.middleearththaumaturgy.references.LibMisc;
import sol3675.middleearththaumaturgy.references.WandType;
import thaumcraft.common.items.wands.ItemWandCasting;

public class ItemSummonFocus extends ItemMETTFocus
{
	
	public IIcon[] icon;
	
	public ItemSummonFocus()
	{
		super("summon");
		this.setHasSubtypes(true);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister register)
	{
		icon = new IIcon[WandType.types.length];
		for (int i = 0; i<WandType.types.length; ++i)
		{
			this.icon[i] = register.registerIcon(LibMisc.MODFULLID + ":focus_" + getName() + "_" + WandType.types[i]);
		}
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIconFromDamage(int meta) {
		return this.icon[meta];
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void getSubItems(final Item item, final CreativeTabs tab, final List list)
	{
		for (int i = 0; i < WandType.types.length; ++i)
		{
			list.add(new ItemStack(this, 1, i));
		}
	}
	
	@Override
	public ItemStack onFocusRightClick(final ItemStack itemStack, final World world, final EntityPlayer player, final MovingObjectPosition pos)
	{
		final ItemWandCasting wand = (ItemWandCasting)itemStack.getItem();
		int factionId = wand.getFocusItem(itemStack).getItemDamage();
		int x = pos.blockX;
		int y = pos.blockY;
		int z = pos.blockZ;
		
		if(LOTRLevelData.getData(player).getAlignment(WandType.faction[factionId]) >= 100.0F)
		{
			switch(pos.sideHit)
			{
				case 0:
				{
					--y;
					break;
				}
				case 1:
				{
					++y;
					break;
				}
				case 2:
				{
					--z;
					break;
				}
				case 3:
				{
					++z;
					break;
				}
				case 4:
				{
					--x;
					break;
				}
				case 5:
				{
					++x;
					break;
				}
			}
		}
		else
		{
			LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 100.0F, WandType.faction[factionId]);
		}
		
		return itemStack;
	}
}
