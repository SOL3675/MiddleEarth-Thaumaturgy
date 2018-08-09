package sol3675.middleearththaumaturgy.common.items.baubles;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import baubles.common.container.InventoryBaubles;
import baubles.common.lib.PlayerHandler;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import sol3675.middleearththaumaturgy.MiddleEarthThaumaturgy;

public class ItemBaubles extends Item implements IBauble{
	public ItemBaubles()
	{
		super();
		this.setMaxStackSize(1);
		this.setCreativeTab(MiddleEarthThaumaturgy.tabMiddleEarthThaumaturgy);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
	{
		InventoryBaubles baubles = PlayerHandler.getPlayerBaubles(player);
		for(int i = 0; i < baubles.getSizeInventory(); ++i)
		{
			if(baubles.isItemValidForSlot(i, itemstack))
			{
				ItemStack stackInSlot = baubles.getStackInSlot(i);
				if(stackInSlot == null || ((IBauble)stackInSlot.getItem()).canUnequip(stackInSlot, player))
				{
					if(!world.isRemote)
					{
						baubles.setInventorySlotContents(i, itemstack.copy());
						if(!player.capabilities.isCreativeMode)
						{
							player.inventory.setInventorySlotContents(player.inventory.currentItem, null);
						}
					}
					onEquipped(itemstack, player);
					if(stackInSlot != null)
					{
						((IBauble)stackInSlot.getItem()).onUnequipped(stackInSlot, player);
						return stackInSlot.copy();
					}
					break;
				}
			}
		}
		return itemstack;
	}


	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
		if(player.ticksExisted == 1) onEquippedOrLoadedIntoWorld(itemstack, player);
	}

	@Override
	public void onEquipped(ItemStack itemstack, EntityLivingBase player) {
		if(!player.worldObj.isRemote)
		{
			player.worldObj.playSoundAtEntity(player, "random.orb", 0.1F, 1.3f);
		}
	}

	@Override
	public void onUnequipped(ItemStack itemstack, EntityLivingBase player) {
		
	}

	@Override
	public boolean canEquip(ItemStack itemstack, EntityLivingBase player) {
		return true;
	}

	@Override
	public boolean canUnequip(ItemStack itemstack, EntityLivingBase player) {
		return true;
	}
	
	public void onEquippedOrLoadedIntoWorld(ItemStack stack, EntityLivingBase player) {
	}

	@Override
	public BaubleType getBaubleType(ItemStack itemstack) {
		return null;
	}

}
