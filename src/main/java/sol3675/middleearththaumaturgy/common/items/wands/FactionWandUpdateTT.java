package sol3675.middleearththaumaturgy.common.items.wands;

import lotr.common.fac.LOTRFaction;
import lotr.common.LOTRLevelData;
import lotr.common.LOTRPlayerData;
import net.minecraft.entity.player.EntityPlayer;

public class FactionWandUpdateTT extends FactionWandUpdate{
	
	public FactionWandUpdateTT(LOTRFaction faction)
	{
		super(faction);
	}
	
	@Override
	int getVisRecovery(float alignment)
	{
		int i = 0;
		if (alignment >= 100000.0F)
		{
			i = 400;
		}
		else if (alignment >= 10000.0F)
		{
			i = 100;
		}
		else if (alignment >= 1000.0F)
		{
			i = 20;
		}
		else if (alignment >= 100.0F)
		{
			i = 10;
		}
		return i;
	}
}