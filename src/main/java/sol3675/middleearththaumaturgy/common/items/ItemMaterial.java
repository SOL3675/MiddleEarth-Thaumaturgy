package sol3675.middleearththaumaturgy.common.items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import sol3675.middleearththaumaturgy.MiddleEarthThaumaturgy;
import sol3675.middleearththaumaturgy.references.LibMisc;

public class ItemMaterial extends Item{
	
	public static final String[] ITEMNAMES = new String[]{
			"guldurilBlackUruk",
			"ithildinBlueDwarven",
			"ithildinDwarven",
			"edhelmirElven",
			"daedelosGalvorn",
			"staredMithril",
			"daedelosMorgul",
			"durnaurOrc",
			"guldurilUruk",
			"brightenGildediron",
			"jarBinder",
			"jarBinderAdvanced",
			"extremeJarCap"
		};
	
	@SideOnly(Side.CLIENT)
	public IIcon[] icons;
	
	public ItemMaterial() {
		this.setMaxStackSize(64);
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		this.setCreativeTab(MiddleEarthThaumaturgy.tabMiddleEarthThaumaturgy);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public boolean hasEffect(ItemStack parItemStack) {
		return true;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister ir) {
		icons = new IIcon[ITEMNAMES.length];
		
		for(int i = 0; i<ITEMNAMES.length; ++i) {
			icons[i] = ir.registerIcon(LibMisc.MODFULLID + ":" + ITEMNAMES[i]);
		}
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamage(int meta) {
		return this.icons[meta];
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return super.getUnlocalizedName() + "." + ITEMNAMES[stack.getItemDamage()];
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list) {
		for(int i = 0; i<ITEMNAMES.length; ++i) {
			list.add(new ItemStack(item, 1, i));
		}
	}

}
