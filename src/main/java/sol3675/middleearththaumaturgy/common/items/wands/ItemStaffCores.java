package sol3675.middleearththaumaturgy.common.items.wands;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import sol3675.middleearththaumaturgy.MiddleEarthThaumaturgy;
import sol3675.middleearththaumaturgy.references.WandType;
import thaumcraft.api.wands.WandCap;
import thaumcraft.api.wands.WandRod;
import thaumcraft.common.config.ConfigItems;
import thaumcraft.common.items.wands.ItemWandCasting;

public class ItemStaffCores extends ItemWandCores
{
	
	public IIcon[] icon;
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister ir) {
		icon = new IIcon[WandType.types.length];
		for (int i = 0; i<WandType.types.length; ++i) {
			this.icon[i] = ir.registerIcon("middleearththaumaturgy:staff_rod_" + WandType.types[i]);
		}
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list) {
		for (int i = 0; i < WandType.types.length; ++i) {
			list.add(new ItemStack(this, 1, i));
		}
	}

}
