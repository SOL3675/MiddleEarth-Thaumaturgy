package sol3675.middleearththaumaturgy.common.items.wands;

import lotr.common.LOTRFaction;
import lotr.common.LOTRLevelData;
import lotr.common.LOTRPlayerData;
import net.minecraft.entity.player.EntityPlayer;

public class FactionWandUpdateTT extends FactionWandUpdate{
	
	public FactionWandUpdateTT(LOTRFaction faction)
	{
		super(faction);
	}
	
	@Override
	int getVisRecovery(int alignment)
	{
		int i = 0;
		if (alignment >= 100000)
		{
			i = 400;
		}
		else if (alignment >= 10000)
		{
			i = 100;
		}
		else if (alignment >= 1000)
		{
			i = 20;
		}
		else if (alignment >= 100)
		{
			i = 10;
		}
		return i;
	}
}