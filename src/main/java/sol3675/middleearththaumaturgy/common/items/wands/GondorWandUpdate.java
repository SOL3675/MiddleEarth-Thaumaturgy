package sol3675.middleearththaumaturgy.common.items.wands;

import lotr.common.LOTRFaction;
import lotr.common.LOTRPlayerData;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.wands.IWandRodOnUpdate;
import thaumcraft.common.items.wands.ItemWandCasting;

public class GondorWandUpdate implements IWandRodOnUpdate{
	
	Aspect allAspects[] = {Aspect.FIRE, Aspect.WATER, Aspect.AIR, Aspect.EARTH, Aspect.ORDER, Aspect.ENTROPY};
	
	@Override
	public void onUpdate(ItemStack itemstack, EntityPlayer player) {
		
		LOTRPlayerData store = new LOTRPlayerData(player.getUniqueID());
		
		for(int i = 0; i < allAspects.length; ++i)
		{
			if(((ItemWandCasting)itemstack.getItem()).getVis(itemstack, Aspect.AIR) < ((ItemWandCasting)itemstack.getItem()).getMaxVis(itemstack))
			{
				if(store.getAlignment(LOTRFaction.GONDOR)>100)
				{
					((ItemWandCasting)itemstack.getItem()).addVis(itemstack, allAspects[i], 1, true);
				}
			}
		}
	}
}
