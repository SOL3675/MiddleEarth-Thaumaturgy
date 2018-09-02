package sol3675.middleearththaumaturgy.common.items.tgstuff;

import java.util.ArrayList;
import java.util.List;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.IIcon;
import net.minecraft.util.StatCollector;
import sol3675.middleearththaumaturgy.MiddleEarthThaumaturgy;
import sol3675.middleearththaumaturgy.references.ConstantsTG;
import sol3675.middleearththaumaturgy.references.LibMisc;
import sol3675.middleearththaumaturgy.references.TitlesTG;
import travellersgear.api.ITravellersGear;

public class ItemTitle extends Item implements ITravellersGear{
	
	public ItemTitle() {
		super();
		this.setHasSubtypes(true);
		this.setCreativeTab(MiddleEarthThaumaturgy.tabMiddleEarthThaumaturgy);
		this.setMaxStackSize(1);
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon[] icons;

	@Override
	public int getSlot(ItemStack stack) {
		return ConstantsTG.SLOT_TITLE_ID;
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list) {
		list.addAll(getSubItems());
	}
	
	public ArrayList<ItemStack> getSubItems(){
		ArrayList<ItemStack> list = new ArrayList<ItemStack>();
		for(String title : TitlesTG.TITLES) {
			ItemStack stack = new ItemStack(this);
			stack.setTagCompound(new NBTTagCompound());
			stack.getTagCompound().setString("title", LibMisc.MODID + ".title_" + title);
			list.add(stack);
		}
		return list;
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean bool) {
		list.add(StatCollector.translateToLocalFormatted("TG.desc.gearSlot.tg" + ConstantsTG.SLOT_TITLE_ID));
		if (stack.hasTagCompound() && stack.getTagCompound().hasKey("title")) {
			list.add(StatCollector.translateToLocal(stack.getTagCompound().getString("title")));
            list.add(StatCollector.translateToLocal(LibMisc.MODID + ".tooltip_titleItem"));
		}
	}

	@Override
	public void onTravelGearTick(EntityPlayer player, ItemStack stack) {
		
	}

	@Override
	public void onTravelGearEquip(EntityPlayer player, ItemStack stack) {
		
	}

	@Override
	public void onTravelGearUnequip(EntityPlayer player, ItemStack stack) {
		
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister ir) {
		icons = new IIcon[TitlesTG.TITLES.length];
		
		for(int i = 0; i<TitlesTG.TITLES.length; ++i) {
			icons[i] = ir.registerIcon("middleearththaumaturgy:title_" + TitlesTG.TITLES[i]);
		}
		
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamage(int meta) {
		return this.icons[meta];
	}
	
	public static void addTitleItems()
	{
		ItemTitle titles;
		titles = new ItemTitle();
		titles.setUnlocalizedName(LibMisc.MODID.toLowerCase() + ':' + "titleItem");
		GameRegistry.registerItem(titles, "titleItem");
	}

}
