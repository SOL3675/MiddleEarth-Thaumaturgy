package sol3675.middleearththaumaturgy.common.items.wands;

import java.util.List;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.wands.WandCap;

public class MiddleEarthWandCap extends WandCap{
	
	public MiddleEarthWandCap(String tag, float discount, ItemStack item, int craftCost, ResourceLocation skin) {
		super(tag, discount, item, craftCost);
		setTexture(skin);
	}
	
	public MiddleEarthWandCap(String tag, float discount, List<Aspect> specialAspects, float discountSpecial, ItemStack item, int craftCost, ResourceLocation skin) {
		super(tag, discount, specialAspects, discountSpecial, item, craftCost);
        setTexture(skin);
	}

}
