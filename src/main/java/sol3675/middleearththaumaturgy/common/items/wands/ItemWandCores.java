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


public class ItemWandCores extends Item{
	
	public IIcon[] icon;
	
	public ItemWandCores() {
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
			this.icon[i] = ir.registerIcon("middleearththaumaturgy:wand_rod_" + WandType.types[i]);
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
		for (int i = 0; i < WandType.types.length; ++i) {
			list.add(new ItemStack(this, 1, i));
		}
		
		ItemStack wand = new ItemStack(ConfigItems.itemWandCasting, 1, 72);
		((ItemWandCasting) wand.getItem()).setCap(wand, (WandCap) WandCap.caps.get("mithril"));
		((ItemWandCasting) wand.getItem()).setRod(wand, (WandRod) WandRod.rods.get("GONDOR"));
		list.add(wand);
		
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return super.getUnlocalizedName() + "." + WandType.types[stack.getItemDamage()];
	}
	

}
