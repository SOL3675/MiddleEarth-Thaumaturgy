package sol3675.middleearththaumaturgy.common.items.baubles;

import baubles.api.BaubleType;
import net.minecraft.item.ItemStack;

public class ItemRing extends ItemBaubles{
	public ItemRing()
	{
	}
	
	@Override
	public BaubleType getBaubleType(ItemStack itemstack)
	{
		return BaubleType.RING;
	}
}
