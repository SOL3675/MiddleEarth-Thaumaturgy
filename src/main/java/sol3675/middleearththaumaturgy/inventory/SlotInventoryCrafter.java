package sol3675.middleearththaumaturgy.inventory;

import lotr.common.LOTRMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import sol3675.middleearththaumaturgy.common.items.MiddleEarthThaumaturgyItems;

public class SlotInventoryCrafter extends Slot{
	
	private Item item;
	
	public SlotInventoryCrafter(IInventory _1, int _2, int _3, int _4)
	{
		super(_1, _2, _3, _4);
	}
	
	
	@Override
	public boolean canTakeStack(EntityPlayer player)
	{
		if(getStack().getItem() == item.getItemFromBlock(LOTRMod.hobbitTable) || getStack().getItem() == item.getItemFromBlock(LOTRMod.rangerTable) || getStack().getItem() == item.getItemFromBlock(LOTRMod.blueDwarvenTable) || getStack().getItem() == item.getItemFromBlock(LOTRMod.highElvenTable) || getStack().getItem() == item.getItemFromBlock(LOTRMod.gundabadTable) || getStack().getItem() == item.getItemFromBlock(LOTRMod.angmarTable) ||
				getStack().getItem() == item.getItemFromBlock(LOTRMod.woodElvenTable) || getStack().getItem() == item.getItemFromBlock(LOTRMod.dolGuldurTable) || getStack().getItem() == item.getItemFromBlock(LOTRMod.daleTable) || getStack().getItem() == item.getItemFromBlock(LOTRMod.dwarvenTable) || getStack().getItem() == item.getItemFromBlock(LOTRMod.elvenTable) || getStack().getItem() == item.getItemFromBlock(LOTRMod.dunlendingTable) ||
				getStack().getItem() == item.getItemFromBlock(LOTRMod.urukTable) || getStack().getItem() == item.getItemFromBlock(LOTRMod.rohirricTable) || getStack().getItem() == item.getItemFromBlock(LOTRMod.gondorianTable) || getStack().getItem() == item.getItemFromBlock(LOTRMod.dolAmrothTable) || getStack().getItem() == item.getItemFromBlock(LOTRMod.morgulTable) || getStack().getItem() == item.getItemFromBlock(LOTRMod.dorwinionTable) ||
				getStack().getItem() == item.getItemFromBlock(LOTRMod.rhunTable) || getStack().getItem() == item.getItemFromBlock(LOTRMod.nearHaradTable) || getStack().getItem() == item.getItemFromBlock(LOTRMod.moredainTable) || getStack().getItem() == item.getItemFromBlock(LOTRMod.tauredainTable) || getStack().getItem() == item.getItemFromBlock(LOTRMod.halfTrollTable) || getStack().getItem() == item.getItemFromBlock(LOTRMod.rivendellTable) ||
				getStack().getItem() == item.getItemFromBlock(LOTRMod.umbarTable) || getStack().getItem() == item.getItemFromBlock(LOTRMod.gulfTable) || getStack().getItem() == item.getItemFromBlock(LOTRMod.breeTable))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
