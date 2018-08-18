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
	
	public static LOTRFaction faction(ItemStack itemstack)
	{
		String factionname = ((ItemWandCasting)itemstack.getItem()).getRod(itemstack).getTag();
		if(factionname == "GONDOR")
		{
			return LOTRFaction.GONDOR;
		}
		if(factionname == "HOBBIT")
		{
			return LOTRFaction.HOBBIT;
		}
		if(factionname == "RANGER_NORTH")
		{
			return LOTRFaction.RANGER_NORTH;
		}
		if(factionname == "BLUE_MOUNTAINS")
		{
			return LOTRFaction.BLUE_MOUNTAINS;
		}
		if(factionname == "HIGH_ELF")
		{
			return LOTRFaction.HIGH_ELF;
		}
		if(factionname == "GUNDABAD")
		{
			return LOTRFaction.GUNDABAD;
		}
		if(factionname == "ANGMAR")
		{
			return LOTRFaction.ANGMAR;
		}
		if(factionname == "WOOD_ELF")
		{
			return LOTRFaction.WOOD_ELF;
		}
		if(factionname == "DOL_GULDUR")
		{
			return LOTRFaction.DOL_GULDUR;
		}
		if(factionname == "DALE")
		{
			return LOTRFaction.DALE;
		}
		if(factionname == "DWARF")
		{
			return LOTRFaction.DWARF;
		}
		if(factionname == "GALADHRIM")
		{
			return LOTRFaction.GALADHRIM;
		}
		if(factionname == "DUNLAND")
		{
			return LOTRFaction.DUNLAND;
		}
		if(factionname == "URUK_HAI")
		{
			return LOTRFaction.URUK_HAI;
		}
		if(factionname == "FANGORN")
		{
			return LOTRFaction.FANGORN;
		}
		if(factionname == "ROHAN")
		{
			return LOTRFaction.ROHAN;
		}
		if(factionname == "MORDOR")
		{
			return LOTRFaction.MORDOR;
		}
		if(factionname == "DORWINION")
		{
			return LOTRFaction.DORWINION;
		}
		if(factionname == "RHUN")
		{
			return LOTRFaction.RHUN;
		}
		if(factionname == "NEAR_HARAD")
		{
			return LOTRFaction.NEAR_HARAD;
		}
		if(factionname == "MOREDAIN")
		{
			return LOTRFaction.MOREDAIN;
		}
		if(factionname == "TAUREDAIN")
		{
			return LOTRFaction.TAUREDAIN;
		}
		if(factionname == "HALF_TROLL")
		{
			return LOTRFaction.HALF_TROLL;
		}
		return LOTRFaction.UTUMNO;
	}
}
