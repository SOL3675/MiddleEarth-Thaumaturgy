package sol3675.middleearththaumaturgy.inventory;

import lotr.common.LOTRMod;
import lotr.common.block.LOTRBlockCraftingTable;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import sol3675.middleearththaumaturgy.references.LibMisc;

public class InventoryItem implements IInventory{
	
	private InventoryPlayer inventory;
	private ItemStack currentItem;
	private ItemStack[] items;
	
	private static final int SLOTSIZE = LibMisc.CRAFTERSLOTROW * LibMisc.CRAFTERSLOTCOLUMN;
	
	public InventoryItem(InventoryPlayer inventory)
	{
		this.inventory = inventory;
		currentItem = this.inventory.getCurrentItem();
		
		items = new ItemStack[SLOTSIZE];
	}
	
	@Override
	public int getSizeInventory()
	{
		return items.length;
	}
	
	@Override
	public ItemStack getStackInSlot(int slot)
	{
		return items[slot];
	}
	
	@Override
	public ItemStack decrStackSize(int _1, int _2)
	{
		if(this.items[_1] != null)
		{
			ItemStack itemstack;
			
			if(this.items[_1].stackSize <= _2)
			{
				itemstack = this.items[_1];
				this.items[_1] = null;
				this.markDirty();
				return itemstack;
			}
			
			else
			{
				itemstack = this.items[_1].splitStack(_2);
				
				if (this.items[_1].stackSize == 0)
				{
					this.items[_1] = null;
				}
				
				this.markDirty();
				return itemstack;
			}
		}
		return null;
	}
	
	@Override
	public ItemStack getStackInSlotOnClosing(int _1)
	{
		if(this.items[_1] != null)
		{
			ItemStack itemstack = this.items[_1];
			this.items[_1] = null;
			return itemstack;
		}
		
		return null;
	}
	
	@Override
	public void setInventorySlotContents(int _1, ItemStack _2)
	{
		this.items[_1] = _2;
		
		if(_2 != null && _2.stackSize > this.getInventoryStackLimit())
		{
			_2.stackSize = this.getInventoryStackLimit();
		}
		this.markDirty();
	}
	
	@Override
	public String getInventoryName()
	{
		return "InventoryItem";
	}
	
	@Override
	public boolean hasCustomInventoryName()
	{
		return false;
	}
	
	@Override
	public int getInventoryStackLimit()
	{
		return 1;
	}
	
	@Override
	public void markDirty()
	{
		
	}
	
	@Override
	public void openInventory()
	{
		if(!currentItem.hasTagCompound())
		{
			currentItem.setTagCompound(new NBTTagCompound());
			currentItem.getTagCompound().setTag("Items", new NBTTagList());
		}
		NBTTagList tags = (NBTTagList)currentItem.getTagCompound().getTag("Items");
		for(int i = 0; i<tags.tagCount(); ++i)
		{
			NBTTagCompound tagCompound = tags.getCompoundTagAt(i);
			int slot = tagCompound.getByte("Slot");
			if(slot>=0 && slot<items.length)
			{
				items[slot] = ItemStack.loadItemStackFromNBT(tagCompound);
			}
		}
	}
	
	@Override
	public void closeInventory()
	{
		NBTTagList tagList = new NBTTagList();
		for(int i = 0; i<items.length; ++i)
		{
			if(items[i] != null)
			{
				NBTTagCompound compound = new NBTTagCompound();
				compound.setByte("Slot", (byte)i);
				items[i].writeToNBT(compound);
				tagList.appendTag(compound);
			}
		}
		ItemStack result = new ItemStack(currentItem.getItem(), 1);
		result.setTagCompound(new NBTTagCompound());
		result.getTagCompound().setTag("Items", tagList);
		
		inventory.mainInventory[inventory.currentItem] = result;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player) {
		return true;
	}

	@Override
	public boolean isItemValidForSlot(int slotIndex, ItemStack itemstack) {
		if(itemstack != null)
		{
			
			Item item = itemstack.getItem();
			if(item instanceof ItemBlock)
			{
				Block block = ((ItemBlock)item).field_150939_a;
				if(block instanceof LOTRBlockCraftingTable)
				{
					return true;
				}
			}
			/*
			if(itemstack.isItemEqual(new ItemStack(LOTRMod.hobbitTable)) || itemstack.isItemEqual(new ItemStack(LOTRMod.rangerTable)) || itemstack.isItemEqual(new ItemStack(LOTRMod.blueDwarvenTable)) || itemstack.isItemEqual(new ItemStack(LOTRMod.highElvenTable)) || itemstack.isItemEqual(new ItemStack(LOTRMod.gundabadTable)) || itemstack.isItemEqual(new ItemStack(LOTRMod.angmarTable)) ||
					itemstack.isItemEqual(new ItemStack(LOTRMod.woodElvenTable)) || itemstack.isItemEqual(new ItemStack(LOTRMod.dolGuldurTable)) || itemstack.isItemEqual(new ItemStack(LOTRMod.daleTable)) || itemstack.isItemEqual(new ItemStack(LOTRMod.dwarvenTable)) || itemstack.isItemEqual(new ItemStack(LOTRMod.elvenTable)) || itemstack.isItemEqual(new ItemStack(LOTRMod.dunlendingTable)) ||
					itemstack.isItemEqual(new ItemStack(LOTRMod.urukTable)) || itemstack.isItemEqual(new ItemStack(LOTRMod.rohirricTable)) || itemstack.isItemEqual(new ItemStack(LOTRMod.gondorianTable)) || itemstack.isItemEqual(new ItemStack(LOTRMod.dolAmrothTable)) || itemstack.isItemEqual(new ItemStack(LOTRMod.morgulTable)) || itemstack.isItemEqual(new ItemStack(LOTRMod.dorwinionTable)) ||
					itemstack.isItemEqual(new ItemStack(LOTRMod.rhunTable)) || itemstack.isItemEqual(new ItemStack(LOTRMod.nearHaradTable)) || itemstack.isItemEqual(new ItemStack(LOTRMod.moredainTable)) || itemstack.isItemEqual(new ItemStack(LOTRMod.tauredainTable)) || itemstack.isItemEqual(new ItemStack(LOTRMod.halfTrollTable)) || itemstack.isItemEqual(new ItemStack(LOTRMod.rivendellTable)) ||
					itemstack.isItemEqual(new ItemStack(LOTRMod.umbarTable)) || itemstack.isItemEqual(new ItemStack(LOTRMod.gulfTable)))
			{
				return true;
			}
			*/
		}
		return false;
	}
}

