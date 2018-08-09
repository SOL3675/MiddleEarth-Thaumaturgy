package sol3675.middleearththaumaturgy.common.items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import sol3675.middleearththaumaturgy.MiddleEarthThaumaturgy;
import sol3675.middleearththaumaturgy.references.FactionIDs;
import sol3675.middleearththaumaturgy.references.LibMisc;

public class ItemHandheldFactionCrafter extends Item{
	
	private static final String[] FUCTIONS = new String[]
	{
		"Angmar",
		"BlueDwarven",
		"Dale",
		"DolAmroth",
		"DolGuldur",
		"Dorwinion",
		"Dunlending",
		"Dwarven",
		"Elven",
		"Gondorian",
		"Gundabad",
		"HalfTroll",
		"HighElven",
		"Hobbit",
		"Moredain",
		"Morgul",
		"NearHarad",
		"Ranger",
		"Rhun",
		"Rivendell",
		"Rohirric",
		"Tauredain",
		"Uruk",
		"WoodElven"
	};
	
	@SideOnly(Side.CLIENT)
	public IIcon[] icons;
	
	public ItemHandheldFactionCrafter() {
		this.setMaxStackSize(1);
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		this.setCreativeTab(MiddleEarthThaumaturgy.tabMiddleEarthThaumaturgy);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		if(!world.isRemote) {
			if(stack.getItemDamage()==0) {
				player.openGui(MiddleEarthThaumaturgy.instance, FactionIDs.ANGMAR, world, (int)player.posX, (int)player.posY, (int)player.posZ);
			}
		}
		return stack;
	}
	//lotr.common.LOTRFaction.ANGMAR.ordinal()
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister ir) {
		icons = new IIcon[FUCTIONS.length];
		
		for(int i = 0; i<FUCTIONS.length; ++i) {
			icons[i] = ir.registerIcon(LibMisc.MODFULLID + ":" + FUCTIONS[i]);
		}
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamage(int meta) {
		return this.icons[meta];
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return super.getUnlocalizedName() + "." + FUCTIONS[stack.getItemDamage()];
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list) {
		for(int i = 0; i<FUCTIONS.length; ++i) {
			list.add(new ItemStack(item, 1, i));
		}
	}
	
}
