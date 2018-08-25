package sol3675.middleearththaumaturgy.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

public class MeetContainer extends Container{
	int xCoord, yCoord, zCoord;
	public MeetContainer(int x, int y, int z)
	{
		this.xCoord = x;
		this.yCoord = y;
		this.zCoord = z;
	}
	@Override
	public boolean canInteractWith(EntityPlayer player)
	{
		return true;
	}
}
