package sol3675.middleearththaumaturgy.common.items.baubles;

import lotr.common.coremod.LOTRReplacedMethods.Potions;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import sol3675.middleearththaumaturgy.config.MeetCfg;
import sol3675.middleearththaumaturgy.references.LibMisc;
import thaumcraft.api.IVisDiscountGear;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.common.config.Config;

public class ItemRingWarpward extends ItemRing implements IVisDiscountGear{
	
	public ItemRingWarpward()
	{
		this.setUnlocalizedName("ItemRingWarpward");
		this.setTextureName(LibMisc.MODFULLID + ":ItemRingWarpward");
	}
	
	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase entity)
	{
		entity.addPotionEffect(new PotionEffect(Config.potionWarpWardID, 200, 0));
	}
	
	@Override
	public void onUnequipped(ItemStack itemstack, EntityLivingBase player)
	{
		player.removePotionEffect(Config.potionWarpWardID);
	}

	@Override
	public int getVisDiscount(ItemStack stack, EntityPlayer player, Aspect aspect) {
		return 5;
	}
}
