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
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import sol3675.middleearththaumaturgy.MiddleEarthThaumaturgy;
import sol3675.middleearththaumaturgy.references.FactionIDs;
import sol3675.middleearththaumaturgy.references.GuiIDs;
import sol3675.middleearththaumaturgy.references.LibMisc;

public class ItemHandheldFactionCrafter extends Item{
	
	@SideOnly(Side.CLIENT)
	public IIcon[] icons;
	
	public ItemHandheldFactionCrafter() {
		this.setMaxStackSize(1);
		this.setMaxDamage(0);
		this.setCreativeTab(MiddleEarthThaumaturgy.tabMiddleEarthThaumaturgy);
		this.setUnlocalizedName("HandheldCrafter");
		this.setTextureName(LibMisc.MODFULLID + ":handheldCrafter");
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		if(!world.isRemote) {
			player.openGui(MiddleEarthThaumaturgy.instance, GuiIDs.HANDHELDCRAFTING, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
		}
		return stack;
	}
	
}
