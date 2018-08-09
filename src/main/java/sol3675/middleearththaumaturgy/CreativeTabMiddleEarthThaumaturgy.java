package sol3675.middleearththaumaturgy;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import sol3675.middleearththaumaturgy.common.items.MiddleEarthThaumaturgyItems;

public class CreativeTabMiddleEarthThaumaturgy extends CreativeTabs{
	
	public CreativeTabMiddleEarthThaumaturgy(String label) {
		super(label);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return MiddleEarthThaumaturgyItems.iconMiddleEarthThaumaturgy;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public String getTranslatedTabLabel() {
		return "TabMiddleEarthThaumaturgy";
	}

}
