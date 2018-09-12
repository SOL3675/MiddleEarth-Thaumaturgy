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
	
	Aspect allAspects[] = {Aspect.FIRE, Aspect.WATER, Aspect.AIR, Aspect.EARTH, Aspect.ORDER, Aspect.ENTROPY};
	private int duration = 0;
	
	@Override
	public void onUpdate(ItemStack itemstack, EntityPlayer player) {
		++duration;
		if(duration == 19)
		{
			duration = 0;
			for(int i = 0; i < allAspects.length; ++i)
			{
				if(((ItemWandCasting)itemstack.getItem()).getVis(itemstack, allAspects[i]) < ((ItemWandCasting)itemstack.getItem()).getMaxVis(itemstack) * 0.9)
				{
					if(LOTRLevelData.getData(player).getAlignment(faction(itemstack))>=10000)
					{
						((ItemWandCasting)itemstack.getItem()).addRealVis(itemstack, allAspects[i], 50, true);
					}
					else if(LOTRLevelData.getData(player).getAlignment(faction(itemstack))>=1000)
					{
						((ItemWandCasting)itemstack.getItem()).addRealVis(itemstack, allAspects[i], 10, true);
					}
					else if(LOTRLevelData.getData(player).getAlignment(faction(itemstack))>=100)
					{
						((ItemWandCasting)itemstack.getItem()).addRealVis(itemstack, allAspects[i], 5, true);
					}
				}
			}	
		}
		
	}
	
	private static LOTRFaction faction(ItemStack itemstack)
	{
		String factionname = ((ItemWandCasting)itemstack.getItem()).getRod(itemstack).getTag();
		switch(factionname)
		{
		case "GONDOR":
			return LOTRFaction.GONDOR;
		case "HOBBIT":
			return LOTRFaction.HOBBIT;
		case "RANGER_NORTH":
			return LOTRFaction.RANGER_NORTH;
		case "BLUE_MOUNTAINS":
			return LOTRFaction.BLUE_MOUNTAINS;
		case "HIGH_ELF":
			return LOTRFaction.HIGH_ELF;
		case "GUNDABAD":
			return LOTRFaction.GUNDABAD;
		case "ANGMAR":
			return LOTRFaction.ANGMAR;
		case "WOOD_ELF":
			return LOTRFaction.WOOD_ELF;
		case "DOL_GULDUR":
			return LOTRFaction.DOL_GULDUR;
		case "DALE":
			return LOTRFaction.DALE;
		case "DWARF":
			return LOTRFaction.DWARF;
		case "GALADHRIM":
			return LOTRFaction.GALADHRIM;
		case "DUNLAND":
			return LOTRFaction.DUNLAND;
		case "URUK_HAI":
			return LOTRFaction.URUK_HAI;
		case "FANGORN":
			return LOTRFaction.FANGORN;
		case "ROHAN":
			return LOTRFaction.ROHAN;
		case "MORDOR":
			return LOTRFaction.MORDOR;
		case "DORWINION":
			return LOTRFaction.DORWINION;
		case "RHUN":
			return LOTRFaction.RHUN;
		case "NEAR_HARAD":
			return LOTRFaction.NEAR_HARAD;
		case "MOREDAIN":
			return LOTRFaction.MOREDAIN;
		case "TAUREDAIN":
			return LOTRFaction.TAUREDAIN;
		case "HALF_TROLL":
			return LOTRFaction.HALF_TROLL;
		default:
			return LOTRFaction.UTUMNO;
		}
	}
}
