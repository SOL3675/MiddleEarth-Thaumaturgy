package sol3675.middleearththaumaturgy.recipes;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import sol3675.middleearththaumaturgy.common.blocks.BlockStorage;
import sol3675.middleearththaumaturgy.common.blocks.MiddleEarthThaumaturgyBlocks;
import sol3675.middleearththaumaturgy.common.items.ItemMaterialNugget;
import sol3675.middleearththaumaturgy.common.items.MiddleEarthThaumaturgyItems;
import sol3675.middleearththaumaturgy.helper.LotrItems;
import sol3675.middleearththaumaturgy.helper.RecipeHelper;

public class GeneralRecipes {
	
	public static void addGeneralRecipes() {
		
		if(Loader.isModLoaded("lotr") == true) {
			addGeneralLotrRecipes();
		}
		
		addStorageRecipes();
		
	}
	
	public static void addGeneralLotrRecipes() {
		
		GameRegistry.addRecipe(new ItemStack(MiddleEarthThaumaturgyItems.materials, 2, 10), new Object[] {" S ", "SXS", " S ", 'S', LotrItems.get("item.guldurilCrystal"), 'X', Items.slime_ball});
		GameRegistry.addRecipe(new ItemStack(MiddleEarthThaumaturgyItems.materials, 2, 10), new Object[] {" S ", "SXS", " S ", 'S', LotrItems.get("item.quenditeCrystal"), 'X', Items.slime_ball});
		GameRegistry.addRecipe(new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, 11), new Object[] {" S ", "SXS", " S ", 'S', LotrItems.get("item.emerald"), 'X', new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, 10)});
		
	}
	
	public static void addStorageRecipes() {
		
		for(int i = 0; i<BlockStorage.BLOCKNAMES.length; ++i) {
			RecipeHelper.addStorageRecipe(new ItemStack(MiddleEarthThaumaturgyBlocks.blockStorage,1 ,i), new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, i));
		}
		
		for(int i = 0; i<ItemMaterialNugget.NUGGETNAMES.length; ++i) {
			RecipeHelper.addStorageRecipe(new ItemStack(MiddleEarthThaumaturgyItems.materials,1 ,i), new ItemStack(MiddleEarthThaumaturgyItems.nuggets, 1, i));
		}
		
	}

}
