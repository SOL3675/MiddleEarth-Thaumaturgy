package sol3675.middleearththaumaturgy.client;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.world.World;
import sol3675.middleearththaumaturgy.references.FactionIDs;

public class GuiHandler implements IGuiHandler{
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID == FactionIDs.ANGMAR) {
			return new lotr.client.gui.LOTRGuiCraftingTable.Angmar(player.inventory, world, x, y, z);
		}
		return null;
	}

}
