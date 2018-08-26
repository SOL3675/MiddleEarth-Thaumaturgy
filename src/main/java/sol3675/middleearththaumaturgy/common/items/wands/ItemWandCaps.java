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

public class ItemWandCaps extends Item{
	
	public final String[] types = {
			
		"mithril",
		"orcsteel",
		"dwarvensteel",
		"galvorn",
		"uruksteel",
		"morgulsteel",
		"bluedwarvensteel",
		"blackuruksteel",
		"elvensteel",
		"gildediron"
			
	};
	
	public IIcon[] icon;
	
	public ItemWandCaps() {
		this.setMaxStackSize(64);
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		this.setCreativeTab(MiddleEarthThaumaturgy.tabMiddleEarthThaumaturgy);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister ir) {
		icon = new IIcon[types.length];
		for(int i = 0; i < types.length; ++i) {
			this.icon[i] = ir.registerIcon("middleearththaumaturgy:wand_cap_" + types[i]);
		}
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIconFromDamage(int meta) {
		return this.icon[meta];
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list) {
		for(int i = 0; i < types.length; ++i) {
			list.add(new ItemStack(this, 1, i));
		}
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return super.getUnlocalizedName() + "." + types[stack.getItemDamage()];
	}

}
