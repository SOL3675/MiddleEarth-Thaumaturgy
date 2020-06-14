package sol3675.middleearththaumaturgy.gui;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.world.World;
import sol3675.middleearththaumaturgy.references.FactionIDs;
import sol3675.middleearththaumaturgy.references.GuiIDs;

public class GuiHandler implements IGuiHandler{
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == GuiIDs.HANDHELDCRAFTING)
		{
			return new HandheldCrafterContainer(player.inventory);
		}
		if(ID == GuiIDs.HOBBIT)
		{
			return new CraftTablesContainer.Hobbit(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.RANGER)
		{
			return new CraftTablesContainer.Ranger(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.BLUE_MOUNTAINS)
		{
			return new CraftTablesContainer.BlueMountains(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.LINDON)
		{
			return new CraftTablesContainer.Lindon(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.GUNDABAD)
		{
			return new CraftTablesContainer.Gundabad(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.ANGMAR)
		{
			return new CraftTablesContainer.Angmar(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.WOOD_ELF)
		{
			return new CraftTablesContainer.WoodElf(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.DOL_GULDUR)
		{
			return new CraftTablesContainer.DolGuldur(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.DALISH)
		{
			return new CraftTablesContainer.Dale(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.DWARVEN)
		{
			return new CraftTablesContainer.Dwarven(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.GALADHRIM)
		{
			return new CraftTablesContainer.Galadhrim(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.DUNLENDING)
		{
			return new CraftTablesContainer.Dunlending(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.URUK)
		{
			return new CraftTablesContainer.Uruk(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.ROHIRRIC)
		{
			return new CraftTablesContainer.Rohirric(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.GONDORIAN)
		{
			return new CraftTablesContainer.Gondorian(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.DOL_AMROTH)
		{
			return new CraftTablesContainer.DolAmroth(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.MORGUL)
		{
			return new CraftTablesContainer.Morgul(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.DORWINION)
		{
			return new CraftTablesContainer.Dorwinion(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.RHUNIC)
		{
			return new CraftTablesContainer.Rhunic(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.HARADRIC)
		{
			return new CraftTablesContainer.Haradric(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.MOREDAIN)
		{
			return new CraftTablesContainer.Moredain(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.TAUREDAIN)
		{
			return new CraftTablesContainer.Tauredain(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.HALF_TROLL)
		{
			return new CraftTablesContainer.HalfTroll(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.RIVENDELL)
		{
			return new CraftTablesContainer.Rivendell(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.UMBARIC)
		{
			return new CraftTablesContainer.Umbaric(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.GULFEN)
		{
			return new CraftTablesContainer.Gulfen(player.inventory, world, x, y, z);
		}
		
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == GuiIDs.HANDHELDCRAFTING)
		{
			return new HandheldCrafterGuiContainer(player.inventory);
		}
		
		if(ID == GuiIDs.HOBBIT)
		{
			return new CraftTablesGuiContainer.Hobbit(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.RANGER)
		{
			return new CraftTablesGuiContainer.Ranger(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.BLUE_MOUNTAINS)
		{
			return new CraftTablesGuiContainer.BlueMountains(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.LINDON)
		{
			return new CraftTablesGuiContainer.Lindon(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.GUNDABAD)
		{
			return new CraftTablesGuiContainer.Gundabad(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.ANGMAR)
		{
			return new CraftTablesGuiContainer.Angmar(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.WOOD_ELF)
		{
			return new CraftTablesGuiContainer.WoodElf(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.DOL_GULDUR)
		{
			return new CraftTablesGuiContainer.DolGuldur(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.DALISH)
		{
			return new CraftTablesGuiContainer.Dale(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.DWARVEN)
		{
			return new CraftTablesGuiContainer.Dwarven(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.GALADHRIM)
		{
			return new CraftTablesGuiContainer.Galadhrim(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.DUNLENDING)
		{
			return new CraftTablesGuiContainer.Dunlending(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.URUK)
		{
			return new CraftTablesGuiContainer.Uruk(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.ROHIRRIC)
		{
			return new CraftTablesGuiContainer.Rohirric(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.GONDORIAN)
		{
			return new CraftTablesGuiContainer.Gondorian(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.DOL_AMROTH)
		{
			return new CraftTablesGuiContainer.DolAmroth(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.MORGUL)
		{
			return new CraftTablesGuiContainer.Morgul(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.DORWINION)
		{
			return new CraftTablesGuiContainer.Dorwinion(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.RHUNIC)
		{
			return new CraftTablesGuiContainer.Rhunic(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.HARADRIC)
		{
			return new CraftTablesGuiContainer.Haradric(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.MOREDAIN)
		{
			return new CraftTablesGuiContainer.Moredain(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.TAUREDAIN)
		{
			return new CraftTablesGuiContainer.Tauredain(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.HALF_TROLL)
		{
			return new CraftTablesGuiContainer.HalfTroll(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.RIVENDELL)
		{
			return new CraftTablesGuiContainer.Rivendell(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.UMBARIC)
		{
			return new CraftTablesGuiContainer.Umbaric(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.GULFEN)
		{
			return new CraftTablesGuiContainer.Gulfen(player.inventory, world, x, y, z);
		}
		if(ID == GuiIDs.BREE)
		{
			return new CraftTablesGuiContainer.Bree(player.inventory, world, x, y, z);
		}
		return null;
	}

}
