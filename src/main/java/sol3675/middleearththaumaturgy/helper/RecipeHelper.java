package sol3675.middleearththaumaturgy.helper;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class RecipeHelper {
	
	public static void addStorageRecipe(ItemStack result, ItemStack compornents) {
		compornents = cloneStack(compornents, 1);
		GameRegistry.addShapelessRecipe(result, compornents, compornents, compornents, compornents, compornents, compornents, compornents, compornents, compornents);
		GameRegistry.addShapelessRecipe(cloneStack(compornents, 9), cloneStack(result, 1));
	}
	
	public static ItemStack cloneStack(ItemStack stack, int stackSize) {

		if (stack == null) {
			return null;
		}
		ItemStack retStack = stack.copy();
		retStack.stackSize = stackSize;

		return retStack;
	}

}
