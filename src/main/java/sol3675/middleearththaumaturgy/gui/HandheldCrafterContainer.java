package sol3675.middleearththaumaturgy.gui;

import lotr.common.LOTRMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import sol3675.middleearththaumaturgy.common.items.MiddleEarthThaumaturgyItems;
import sol3675.middleearththaumaturgy.inventory.InventoryItem;
import sol3675.middleearththaumaturgy.inventory.SlotInventoryCrafter;
import sol3675.middleearththaumaturgy.references.LibMisc;

public class HandheldCrafterContainer extends Container{
	
	private InventoryItem inventory;
	
	public HandheldCrafterContainer(InventoryPlayer inventoryPlayer)
	{
		this.inventory = new InventoryItem(inventoryPlayer);
		inventory.openInventory();
		
		int i = 2 * 18 + 1;
		for(int j = 0; j<LibMisc.CRAFTERSLOTROW; ++j)
		{
			for(int k = 0; k < LibMisc.CRAFTERSLOTCOLUMN; ++k)
			{
				this.addSlotToContainer(new Slot(inventory, k + j * LibMisc.CRAFTERSLOTCOLUMN, 8 + k * 18, 18 + j * 18));
			}
		}
		
		for(int j = 0; j<3; ++j)
		{
			for(int k = 0; k<9; ++k)
			{
				this.addSlotToContainer(new SlotInventoryCrafter(inventoryPlayer, k + j * 9 + 9, 8 + k * 18, 103 + j * 18 + i));
			}
		}
		
		for(int j = 0; j<9; ++j)
		{
			this.addSlotToContainer(new SlotInventoryCrafter(inventoryPlayer, j, 8 + j * 18, 161 + i));
		}
	}
	
	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int numSlot)
	{
		/*
		ItemStack itemstack = null;
		Slot slot = (Slot)this.inventorySlots.get(numSlot);
		
		if(slot != null && slot.getHasStack())
		{
			ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();
			if(numSlot < this.inventory.getSizeInventory())
			{
				if(!this.mergeItemStack(itemstack1, this.inventory.getSizeInventory(), this.inventorySlots.size(), true))
				{
					return null;
				}
			}
			else if(slot.getStack() != null && slot.getStack().getItem() == MiddleEarthThaumaturgyItems.factionCrafter)
			{
				return null;
			}
			else if(slot.getStack() != null)
			{
				if(!slot.getStack().isItemEqual(new ItemStack(LOTRMod.hobbitTable)) && !slot.getStack().isItemEqual(new ItemStack(LOTRMod.rangerTable)) && !slot.getStack().isItemEqual(new ItemStack(LOTRMod.blueDwarvenTable)) && !slot.getStack().isItemEqual(new ItemStack(LOTRMod.highElvenTable)) && !slot.getStack().isItemEqual(new ItemStack(LOTRMod.gundabadTable)) && !slot.getStack().isItemEqual(new ItemStack(LOTRMod.angmarTable)) &&
						!slot.getStack().isItemEqual(new ItemStack(LOTRMod.woodElvenTable)) && !slot.getStack().isItemEqual(new ItemStack(LOTRMod.dolGuldurTable)) && !slot.getStack().isItemEqual(new ItemStack(LOTRMod.daleTable)) && !slot.getStack().isItemEqual(new ItemStack(LOTRMod.dwarvenTable)) && !slot.getStack().isItemEqual(new ItemStack(LOTRMod.elvenTable)) && !slot.getStack().isItemEqual(new ItemStack(LOTRMod.dunlendingTable)) &&
						!slot.getStack().isItemEqual(new ItemStack(LOTRMod.urukTable)) && !slot.getStack().isItemEqual(new ItemStack(LOTRMod.rohirricTable)) && !slot.getStack().isItemEqual(new ItemStack(LOTRMod.gondorianTable)) && !slot.getStack().isItemEqual(new ItemStack(LOTRMod.dolAmrothTable)) && !slot.getStack().isItemEqual(new ItemStack(LOTRMod.morgulTable)) && !slot.getStack().isItemEqual(new ItemStack(LOTRMod.dorwinionTable)) &&
						!slot.getStack().isItemEqual(new ItemStack(LOTRMod.rhunTable)) && !slot.getStack().isItemEqual(new ItemStack(LOTRMod.nearHaradTable)) && !slot.getStack().isItemEqual(new ItemStack(LOTRMod.moredainTable)) && !slot.getStack().isItemEqual(new ItemStack(LOTRMod.tauredainTable)) && !slot.getStack().isItemEqual(new ItemStack(LOTRMod.halfTrollTable)) && !slot.getStack().isItemEqual(new ItemStack(LOTRMod.rivendellTable)) &&
						!slot.getStack().isItemEqual(new ItemStack(LOTRMod.umbarTable)) && !slot.getStack().isItemEqual(new ItemStack(LOTRMod.gulfTable)))
				{
					return null;
				}
				
			}
			else if(!this.mergeItemStack(itemstack1, 0, this.inventory.getSizeInventory(), false))
			{
				return null;
			}
			if(itemstack1.stackSize == 0)
			{
				slot.putStack((ItemStack)null);
			}
			else
			{
				slot.onSlotChanged();
			}
		}
		return itemstack;
		*/
		return null;
	}
	
	@Override
	public void onContainerClosed(EntityPlayer player)
	{
		super.onContainerClosed(player);
		this.inventory.closeInventory();
	}

	@Override
	public boolean canInteractWith(EntityPlayer player) {
		
		return true;
	}
}
