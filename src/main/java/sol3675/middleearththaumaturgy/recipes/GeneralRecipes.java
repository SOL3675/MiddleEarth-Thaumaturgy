package sol3675.middleearththaumaturgy.recipes;

import java.util.List;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import lotr.common.LOTRMod;
import lotr.common.recipe.LOTRRecipes;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import sol3675.middleearththaumaturgy.common.blocks.BlockStorage;
import sol3675.middleearththaumaturgy.common.blocks.MiddleEarthThaumaturgyBlocks;
import sol3675.middleearththaumaturgy.common.items.ItemMaterialNugget;
import sol3675.middleearththaumaturgy.common.items.MiddleEarthThaumaturgyItems;
import sol3675.middleearththaumaturgy.config.MeetCfg;
import sol3675.middleearththaumaturgy.helper.LotrItems;
import sol3675.middleearththaumaturgy.helper.RecipeHelper;

public class GeneralRecipes {
	
	private static List[] commonOrcRecipes = {LOTRRecipes.morgulRecipes, LOTRRecipes.urukRecipes, LOTRRecipes.angmarRecipes, LOTRRecipes.dolGuldurRecipes, LOTRRecipes.gundabadRecipes};
	private static List[] commonMorgulRecipes = {LOTRRecipes.morgulRecipes, LOTRRecipes.angmarRecipes, LOTRRecipes.dolGuldurRecipes};
	private static List[] commonElfRecipes = {LOTRRecipes.elvenRecipes, LOTRRecipes.woodElvenRecipes, LOTRRecipes.highElvenRecipes, LOTRRecipes.rivendellRecipes};
	private static final String[] ORENAME = {
		"GuldurilBlackUruk",
		"IthildinBlueDwarven",
		"IthildinDwarven",
		"EdhelmirElven",
		"DaedelosGalvorn",
		"StaredMithril",
		"DaedelosMorgul",
		"DurnaurOrc",
		"GuldurilUruk",
		"BrightenGildediron"
	};
	
	public static void addGeneralRecipes() {
		
		registerOres();
		
		addGeneralLotrRecipes();
		addLotrRecipes();
		
		addStorageRecipes();
		
		if(MeetCfg.easyFactionCrafter == true)
		{
			addEasyFactionCrafter();
		}
		
	}
	
	private static void registerOres()
	{
		for(int i = 0; i < ORENAME.length; ++i)
		{
			OreDictionary.registerOre("ingot" + ORENAME[i], new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, i));
			OreDictionary.registerOre("nugget" + ORENAME[i], new ItemStack(MiddleEarthThaumaturgyItems.nuggets, 1, i));
			OreDictionary.registerOre("block" + ORENAME[i], new ItemStack(MiddleEarthThaumaturgyBlocks.blockStorage, 1, i));
		}
	}
	
	private static void addGeneralLotrRecipes() {
		
		GameRegistry.addRecipe(new ItemStack(MiddleEarthThaumaturgyItems.materials, 2, 10), new Object[] {" S ", "SXS", " S ", 'S', LotrItems.get("item.guldurilCrystal"), 'X', Items.slime_ball});
		GameRegistry.addRecipe(new ItemStack(MiddleEarthThaumaturgyItems.materials, 2, 10), new Object[] {" S ", "SXS", " S ", 'S', LotrItems.get("item.quenditeCrystal"), 'X', Items.slime_ball});
		GameRegistry.addRecipe(new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, 11), new Object[] {" S ", "SXS", " S ", 'S', LotrItems.get("item.emerald"), 'X', new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, 10)});
		
	}
	
	private static void addStorageRecipes() {
		
		for(int i = 0; i<BlockStorage.BLOCKNAMES.length; ++i) {
			RecipeHelper.addStorageRecipe(new ItemStack(MiddleEarthThaumaturgyBlocks.blockStorage,1 ,i), new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, i));
		}
		
		for(int i = 0; i<ItemMaterialNugget.NUGGETNAMES.length; ++i) {
			RecipeHelper.addStorageRecipe(new ItemStack(MiddleEarthThaumaturgyItems.materials,1 ,i), new ItemStack(MiddleEarthThaumaturgyItems.nuggets, 1, i));
		}
		
	}
	
	private static void addLotrRecipes()
	{
		addRecipeTo(commonOrcRecipes,
			new ShapedOreRecipe(
				new ItemStack(MiddleEarthThaumaturgyItems.wandCap, 1, 1),
				new Object[] {
					"XXX",
					"X X",
					Character.valueOf('X'), "nuggetDurnaurOrc"
				}
			)
		);
		
		LOTRRecipes.dwarvenRecipes.add(
			new ShapedOreRecipe
			(
				new ItemStack(MiddleEarthThaumaturgyItems.wandCap, 1, 2),
				new Object[] {
					"XXX",
					"X X",
					Character.valueOf('X'), "nuggetIthildinDwarven"
				}
			)
		);
		
		addRecipeTo(commonElfRecipes,
			new ShapedOreRecipe(
				new ItemStack(MiddleEarthThaumaturgyItems.wandCap, 1, 3),
				new Object[] {
					"XXX",
					"X X",
					Character.valueOf('X'), "nuggetDaedelosGalvorn"
				}
			)
		);
		
		LOTRRecipes.urukRecipes.add(
			new ShapedOreRecipe
			(
				new ItemStack(MiddleEarthThaumaturgyItems.wandCap, 1, 4),
				new Object[] {
					"XXX",
					"X X",
					Character.valueOf('X'), "nuggetGuldurilUruk"
				}
			)
		);
		
		addRecipeTo(commonMorgulRecipes,
			new ShapedOreRecipe(
				new ItemStack(MiddleEarthThaumaturgyItems.wandCap, 1, 5),
				new Object[] {
					"XXX",
					"X X",
					Character.valueOf('X'), "nuggetDaedelosMorgul"
				}
			)
		);
		
		LOTRRecipes.blueMountainsRecipes.add(
			new ShapedOreRecipe
			(
				new ItemStack(MiddleEarthThaumaturgyItems.wandCap, 1, 6),
				new Object[] {
					"XXX",
					"X X",
					Character.valueOf('X'), "nuggetIthildinBlueDwarven"
				}
			)
		);
		
		addRecipeTo(commonMorgulRecipes,
			new ShapedOreRecipe(
				new ItemStack(MiddleEarthThaumaturgyItems.wandCap, 1, 7),
				new Object[] {
					"XXX",
					"X X",
					Character.valueOf('X'), "nuggetGuldurilBlackUruk"
				}
			)
		);
		
		addRecipeTo(commonElfRecipes,
			new ShapedOreRecipe(
				new ItemStack(MiddleEarthThaumaturgyItems.wandCap, 1, 8),
				new Object[] {
					"XXX",
					"X X",
					Character.valueOf('X'), "nuggetEdhelmirElven"
				}
			)
		);
		
		LOTRRecipes.rhunRecipes.add(
			new ShapedOreRecipe
			(
				new ItemStack(MiddleEarthThaumaturgyItems.wandCap, 1, 9),
				new Object[] {
					"XXX",
					"X X",
					Character.valueOf('X'), "nuggetBrightenGildediron"
				}
			)
		);
		
	}
	
	private static void addEasyFactionCrafter()
	{
		GameRegistry.addRecipe(new ItemStack(MiddleEarthThaumaturgyItems.factionCrafter, 1, 0), new Object[] {"SSS", "SXS", "SSS", 'S', Blocks.crafting_table, 'X', LOTRMod.goldRing});
	}
	
	private static void addRecipeTo(List[] rList, IRecipe recipe)
	{
		for(List list : rList)
		{
			list.add(recipe);
		}
	}

}
