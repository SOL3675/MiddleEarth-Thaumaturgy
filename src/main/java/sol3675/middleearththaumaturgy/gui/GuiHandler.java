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
			return new MeetContainer(x, y, z);
		}
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == GuiIDs.HANDHELDCRAFTING)
		{
			return new HandheldCrafterGuiContainer(player, world, x, y, z);
		}
		return null;
	}

}
