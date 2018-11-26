package sol3675.middleearththaumaturgy.common.items.wands;

import lotr.common.LOTRFaction;
import lotr.common.LOTRLevelData;
import lotr.common.LOTRPlayerData;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.wands.IWandRodOnUpdate;
import thaumcraft.common.items.wands.ItemWandCasting;

public class FactionWandUpdate implements IWandRodOnUpdate{
	
	private static final Aspect[] PRIMAL_ASPECTS = new Aspect[] {Aspect.FIRE, Aspect.WATER, Aspect.AIR, Aspect.EARTH, Aspect.ORDER, Aspect.ENTROPY};
	private final LOTRFaction FACTION;
	private int duration = 0;
	
	public FactionWandUpdate(LOTRFaction faction)
	{
		super();
		this.FACTION = faction;
	}
	
	@Override
	public void onUpdate(ItemStack itemstack, EntityPlayer player)
	{
		if(++duration == 19)
		{
			duration = 0;
			int recoveryVis = this.getVisRecovery(LOTRLevelData.getData(player).getAlignment(this.getfaction()));
			for(Aspect aspect : PRIMAL_ASPECTS)
			{
				ItemWandCasting wand = (ItemWandCasting)itemstack.getItem();
				if(wand.getVis(itemstack, aspect) < wand.getMaxVis(itemstack) * 0.9)
				{
					wand.addRealVis(itemstack, aspect, recoveryVis, true);
				}
			}	
		}
	}

	int getVisRecovery(int alignment)
	{
		int i = 0;
		if (alignment >= 10000)
		{
			i = 50;
		}
		else if (alignment >= 1000)
		{
			i = 10;
		}
		else if (alignment >= 100)
		{
			i = 5;
		}
		return i;			
	}

	private LOTRFaction getfaction()
	{
		return this.FACTION;
	}
}
