package sol3675.middleearththaumaturgy.common.items.wands;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import sol3675.middleearththaumaturgy.MiddleEarthThaumaturgy;
import sol3675.middleearththaumaturgy.references.LibMisc;
import sol3675.middleearththaumaturgy.references.WandType;

public class ItemTTWandCores extends Item{
	
public IIcon[] icon;
	
	public ItemTTWandCores() 
	{
		this.setMaxStackSize(64);
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		this.setCreativeTab(MiddleEarthThaumaturgy.tabMiddleEarthThaumaturgy);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister ir) {
		icon = new IIcon[WandType.types.length];
		for (int i = 0; i<WandType.types.length; ++i) {
			this.icon[i] = ir.registerIcon(LibMisc.MODFULLID + ":wand_rod_TT_" + WandType.types[i]);
		}
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIconFromDamage(int meta) {
		return this.icon[meta];
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return super.getUnlocalizedName() + ".TT." + WandType.types[stack.getItemDamage()];
	}

}
