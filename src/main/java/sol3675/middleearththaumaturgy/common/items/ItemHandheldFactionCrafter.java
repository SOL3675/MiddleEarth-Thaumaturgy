package sol3675.middleearththaumaturgy.common.items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import lotr.common.LOTRMod;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import sol3675.middleearththaumaturgy.MiddleEarthThaumaturgy;
import sol3675.middleearththaumaturgy.references.FactionIDs;
import sol3675.middleearththaumaturgy.references.GuiIDs;
import sol3675.middleearththaumaturgy.references.LibMisc;

public class ItemHandheldFactionCrafter extends Item{
	
	@SideOnly(Side.CLIENT)
	public IIcon[] icons;
	
	public static final int TAG_HOBBIT = 44;
	public static final int TAG_RANGER = 28;
	public static final int TAG_BLUE_MOUNTAINS = 27;
	public static final int TAG_LINDON = 26;
	public static final int TAG_GUNDABAD = 31;
	public static final int TAG_ANGMAR = 23;
	public static final int TAG_WOOD_ELF = 12;
	public static final int TAG_DOL_GULDUR = 30;
	public static final int TAG_DALISH = 42;
	public static final int TAG_DWARVEN = 4;
	public static final int TAG_GALADHRIM = 2;
	public static final int TAG_DUNLENDING = 18;
	public static final int TAG_URUK = 8;
	public static final int TAG_ROHIRRIC = 14;
	public static final int TAG_GONDORIAN = 13;
	public static final int TAG_DOL_AMROTH = 36;
	public static final int TAG_MORGUL = 1;
	public static final int TAG_DORWINION = 43;
	public static final int TAG_RHUNIC = 49;
	public static final int TAG_HARADRIC = 25;
	public static final int TAG_MOREDAIN = 37;
	public static final int TAG_TAUREDAIN = 39;
	public static final int TAG_HALF_TROLL = 34;
	public static final int TAG_RIVENDELL = 51;
	
	
	public ItemHandheldFactionCrafter() {
		this.setMaxStackSize(1);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		this.setCreativeTab(MiddleEarthThaumaturgy.tabMiddleEarthThaumaturgy);
		this.setUnlocalizedName("HandheldCrafter");
		this.setTextureName(LibMisc.MODFULLID + ":handheldCrafter");
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		if(!world.isRemote && player.isSneaking())
		{
			player.openGui(MiddleEarthThaumaturgy.instance, GuiIDs.HANDHELDCRAFTING, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
		}
		else if(!world.isRemote) {
			if(stack.getItemDamage() != 0) {
				player.openGui(LOTRMod.instance, stack.getItemDamage(), world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
			}
			else
			{
				player.openGui(MiddleEarthThaumaturgy.instance, GuiIDs.HANDHELDCRAFTING, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
			}
		}
		return stack;
	}
	
}
