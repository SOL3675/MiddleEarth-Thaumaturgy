package sol3675.middleearththaumaturgy.common.items.wands;

import lotr.common.LOTRFaction;
import lotr.common.LOTRLevelData;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.wands.IWandRodOnUpdate;
import thaumcraft.common.items.wands.ItemWandCasting;

public class FactionWandUpdateTT implements IWandRodOnUpdate{
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
					if(LOTRLevelData.getData(player).getAlignment(faction(itemstack))>=100000)
					{
						((ItemWandCasting)itemstack.getItem()).addRealVis(itemstack, allAspects[i], 400, true);
					}
					else if(LOTRLevelData.getData(player).getAlignment(faction(itemstack))>=10000)
					{
						((ItemWandCasting)itemstack.getItem()).addRealVis(itemstack, allAspects[i], 100, true);
					}
					else if(LOTRLevelData.getData(player).getAlignment(faction(itemstack))>=1000)
					{
						((ItemWandCasting)itemstack.getItem()).addRealVis(itemstack, allAspects[i], 20, true);
					}
					else if(LOTRLevelData.getData(player).getAlignment(faction(itemstack))>=100)
					{
						((ItemWandCasting)itemstack.getItem()).addRealVis(itemstack, allAspects[i], 10, true);
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
		case "GONDOR_TT":
			return LOTRFaction.GONDOR;
		case "HOBBIT_TT":
			return LOTRFaction.HOBBIT;
		case "RANGER_NORTH_TT":
			return LOTRFaction.RANGER_NORTH;
		case "BLUE_MOUNTAINS_TT":
			return LOTRFaction.BLUE_MOUNTAINS;
		case "HIGH_ELF_TT":
			return LOTRFaction.HIGH_ELF;
		case "GUNDABAD_TT":
			return LOTRFaction.GUNDABAD;
		case "ANGMAR_TT":
			return LOTRFaction.ANGMAR;
		case "WOOD_ELF_TT":
			return LOTRFaction.WOOD_ELF;
		case "DOL_GULDUR_TT":
			return LOTRFaction.DOL_GULDUR;
		case "DALE_TT":
			return LOTRFaction.DALE;
		case "DWARF_TT":
			return LOTRFaction.DWARF;
		case "GALADHRIM_TT":
			return LOTRFaction.GALADHRIM;
		case "DUNLAND_TT":
			return LOTRFaction.DUNLAND;
		case "URUK_HAI_TT":
			return LOTRFaction.URUK_HAI;
		case "FANGORN_TT":
			return LOTRFaction.FANGORN;
		case "ROHAN_TT":
			return LOTRFaction.ROHAN;
		case "MORDOR_TT":
			return LOTRFaction.MORDOR;
		case "DORWINION_TT":
			return LOTRFaction.DORWINION;
		case "RHUN_TT":
			return LOTRFaction.RHUN;
		case "NEAR_HARAD_TT":
			return LOTRFaction.NEAR_HARAD;
		case "MOREDAIN_TT":
			return LOTRFaction.MOREDAIN;
		case "TAUREDAIN_TT":
			return LOTRFaction.TAUREDAIN;
		case "HALF_TROLL_TT":
			return LOTRFaction.HALF_TROLL;
		default:
			return LOTRFaction.UTUMNO;
		}
	}
}
