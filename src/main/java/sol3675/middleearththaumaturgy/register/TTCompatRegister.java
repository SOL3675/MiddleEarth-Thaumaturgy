package sol3675.middleearththaumaturgy.register;

import sol3675.middleearththaumaturgy.common.items.ItemTTCompat;
import sol3675.middleearththaumaturgy.recipes.RecipesTTCompat;

public class TTCompatRegister {
	public static void TTpreInit()
	{
		ItemTTCompat.addItemTTCompat();
	}
	
	public static void TTpostInit()
	{
		RecipesTTCompat.addTTCompatRecipes();
	}
}
