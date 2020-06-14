package sol3675.middleearththaumaturgy.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import lotr.common.LOTRMod;
import net.minecraft.item.ItemStack;
import sol3675.middleearththaumaturgy.MiddleEarthResearch;
import sol3675.middleearththaumaturgy.aspect.MiddleEarthAspects;
import sol3675.middleearththaumaturgy.common.items.ItemTTCompat;
import sol3675.middleearththaumaturgy.common.items.MiddleEarthThaumaturgyItems;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.common.config.ConfigItems;

public class RecipesTTCompat {

	public static void addTTCompatRecipes()
	{
		addWandRecipes();
		addStaffRecipes();
	}

	private static void addWandRecipes()
	{
		MiddleEarthResearch.recipes.put("RodGONDOR_TT",
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_GONDOR_TT",
						new ItemStack(ItemTTCompat.wandCoreTT, 1, 0),
						9,
						(new AspectList().add(Aspect.MAGIC, 64).add(MiddleEarthAspects.GONDOR, 128)),
						new ItemStack(GameRegistry.findItem("ThaumicTinkerer", "kamiResource"), 1, 5),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 0), new ItemStack(LOTRMod.rock, 1, 1), new ItemStack(LOTRMod.diamond, 1, 0)}
						)
				)
		;

		MiddleEarthResearch.recipes.put("RodHOBBIT_TT",
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_HOBBIT_TT",
						new ItemStack(ItemTTCompat.wandCoreTT, 1, 1),
						9,
						(new AspectList().add(Aspect.MAGIC, 64).add(MiddleEarthAspects.SHIRE, 128)),
						new ItemStack(GameRegistry.findItem("ThaumicTinkerer", "kamiResource"), 1, 5),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 21), new ItemStack(LOTRMod.wood, 1, 0), new ItemStack(LOTRMod.amber, 1, 0)}
						)
				)
		;

		MiddleEarthResearch.recipes.put("RodRANGER_NORTH_TT",
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_RANGER_NORTH_TT",
						new ItemStack(ItemTTCompat.wandCoreTT, 1, 2),
						9,
						(new AspectList().add(Aspect.MAGIC, 64).add(MiddleEarthAspects.DUNEDAIN, 128)),
						new ItemStack(GameRegistry.findItem("ThaumicTinkerer", "kamiResource"), 1, 5),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 12), new ItemStack(LOTRMod.rangerBow, 1, 0), new ItemStack(LOTRMod.emerald, 1, 0)}
						)
				)
		;

		MiddleEarthResearch.recipes.put("RodBLUE_MOUNTAINS_TT",
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_BLUE_MOUNTAINS_TT",
						new ItemStack(ItemTTCompat.wandCoreTT, 1, 3),
						9,
						(new AspectList().add(Aspect.MAGIC, 64).add(MiddleEarthAspects.BLUEMOUNTAINS, 128)),
						new ItemStack(GameRegistry.findItem("ThaumicTinkerer", "kamiResource"), 1, 5),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 11), new ItemStack(LOTRMod.rock, 1, 3), new ItemStack(LOTRMod.opal, 1, 0)}
						)
				)
		;

		MiddleEarthResearch.recipes.put("RodHIGH_ELF_TT",
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_HIGH_ELF_TT",
						new ItemStack(ItemTTCompat.wandCoreTT, 1, 4),
						9,
						(new AspectList().add(Aspect.MAGIC, 64).add(MiddleEarthAspects.LINDON, 128)),
						new ItemStack(GameRegistry.findItem("ThaumicTinkerer", "kamiResource"), 1, 5),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 10), new ItemStack(LOTRMod.quenditeCrystal, 1, 0), new ItemStack(LOTRMod.quenditeCrystal, 1, 0)}
						)
				)
		;

		MiddleEarthResearch.recipes.put("RodGUNDABAD_TT",
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_GUNDABAD_TT",
						new ItemStack(ItemTTCompat.wandCoreTT, 1, 5),
						9,
						(new AspectList().add(Aspect.MAGIC, 64).add(MiddleEarthAspects.GUNDABAD, 128)),
						new ItemStack(GameRegistry.findItem("ThaumicTinkerer", "kamiResource"), 1, 5),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 14), new ItemStack(LOTRMod.gundabadUrukBow, 1, 0), new ItemStack(LOTRMod.nauriteGem, 1, 0)}
						)
				)
		;

		MiddleEarthResearch.recipes.put("RodANGMAR_TT",
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_ANGMAR_TT",
						new ItemStack(ItemTTCompat.wandCoreTT, 1, 6),
						9,
						(new AspectList().add(Aspect.MAGIC, 64).add(MiddleEarthAspects.ANGMAR, 128)),
						new ItemStack(GameRegistry.findItem("ThaumicTinkerer", "kamiResource"), 1, 5),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 8), new ItemStack(LOTRMod.guldurilCrystal, 1, 0), new ItemStack(LOTRMod.amethyst, 1, 0)}
						)
				)
		;

		MiddleEarthResearch.recipes.put("RodWOOD_ELF_TT",
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_WOOD_ELF_TT",
						new ItemStack(ItemTTCompat.wandCoreTT, 1, 7),
						9,
						(new AspectList().add(Aspect.MAGIC, 64).add(MiddleEarthAspects.WOODLAND, 128)),
						new ItemStack(GameRegistry.findItem("ThaumicTinkerer", "kamiResource"), 1, 5),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 4), new ItemStack(LOTRMod.topaz, 1, 0), new ItemStack(LOTRMod.leaves, 1, 3)}
						)
				)
		;

		MiddleEarthResearch.recipes.put("RodDOL_GULDUR_TT",
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_DOL_GULDUR_TT",
						new ItemStack(ItemTTCompat.wandCoreTT, 1, 8),
						9,
						(new AspectList().add(Aspect.MAGIC, 64).add(MiddleEarthAspects.DOLGULDUR, 128)),
						new ItemStack(GameRegistry.findItem("ThaumicTinkerer", "kamiResource"), 1, 5),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 13), new ItemStack(LOTRMod.nauriteGem, 1, 0), new ItemStack(LOTRMod.brick2, 1, 8)}
						)
				)
		;

		MiddleEarthResearch.recipes.put("RodDALE_TT",
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_DALE_TT",
						new ItemStack(ItemTTCompat.wandCoreTT, 1, 9),
						9,
						(new AspectList().add(Aspect.MAGIC, 64).add(MiddleEarthAspects.DALE, 128)),
						new ItemStack(GameRegistry.findItem("ThaumicTinkerer", "kamiResource"), 1, 5),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 19), new ItemStack(LOTRMod.daleCracker), new ItemStack(LOTRMod.ruby, 1, 0)}
						)
				)
		;

		MiddleEarthResearch.recipes.put("RodDWARF_TT",
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_DWARF_TT",
						new ItemStack(ItemTTCompat.wandCoreTT, 1, 10),
						9,
						(new AspectList().add(Aspect.MAGIC, 64).add(MiddleEarthAspects.IRONHILLS, 128)),
						new ItemStack(GameRegistry.findItem("ThaumicTinkerer", "kamiResource"), 1, 5),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 7), new ItemStack(LOTRMod.brick, 1, 6), new ItemStack(LOTRMod.dwarfSteel, 1, 0)}
						)
				)
		;

		MiddleEarthResearch.recipes.put("RodGALADHRIM_TT",
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_GALADHRIM_TT",
						new ItemStack(ItemTTCompat.wandCoreTT, 1, 11),
						9,
						(new AspectList().add(Aspect.MAGIC, 64).add(MiddleEarthAspects.LOTHLORIEN, 128)),
						new ItemStack(GameRegistry.findItem("ThaumicTinkerer", "kamiResource"), 1, 5),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 3), new ItemStack(LOTRMod.wood, 1, 1), new ItemStack(LOTRMod.quenditeCrystal, 1, 0)}
						)
				)
		;

		MiddleEarthResearch.recipes.put("RodDUNLAND_TT",
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_DUNLAND_TT",
						new ItemStack(ItemTTCompat.wandCoreTT, 1, 12),
						9,
						(new AspectList().add(Aspect.MAGIC, 64).add(MiddleEarthAspects.DUNLAND, 128)),
						new ItemStack(GameRegistry.findItem("ThaumicTinkerer", "kamiResource"), 1, 5),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 5), new ItemStack(LOTRMod.dunlendingTrident, 1, 0), new ItemStack(LOTRMod.sapphire, 1, 0)}
						)
				)
		;

		MiddleEarthResearch.recipes.put("RodURUK_HAI_TT",
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_URUK_HAI_TT",
						new ItemStack(ItemTTCompat.wandCoreTT, 1, 13),
						9,
						(new AspectList().add(Aspect.MAGIC, 64).add(MiddleEarthAspects.ISENGARD, 128)),
						new ItemStack(GameRegistry.findItem("ThaumicTinkerer", "kamiResource"), 1, 5),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 6), new ItemStack(LOTRMod.urukSteel, 1, 0), new ItemStack(LOTRMod.pearl, 1, 0)}
						)
				)
		;

		MiddleEarthResearch.recipes.put("RodFANGORN_TT",
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_FANGORN_TT",
						new ItemStack(ItemTTCompat.wandCoreTT, 1, 14),
						9,
						(new AspectList().add(Aspect.MAGIC, 64).add(MiddleEarthAspects.FANGORN, 128)),
						new ItemStack(GameRegistry.findItem("ThaumicTinkerer", "kamiResource"), 1, 5),
						new ItemStack[] {new ItemStack(LOTRMod.fangornPlant, 1, 0), new ItemStack(LOTRMod.fangornPlant, 1, 2), new ItemStack(LOTRMod.fangornPlant, 1, 3)}
						)
				)
		;

		MiddleEarthResearch.recipes.put("RodROHAN_TT",
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_ROHAN_TT",
						new ItemStack(ItemTTCompat.wandCoreTT, 1, 15),
						9,
						(new AspectList().add(Aspect.MAGIC, 64).add(MiddleEarthAspects.ROHAN, 128)),
						new ItemStack(GameRegistry.findItem("ThaumicTinkerer", "kamiResource"), 1, 5),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 1), new ItemStack(LOTRMod.rock, 1, 2), new ItemStack(LOTRMod.opal, 1, 0)}
						)
				)
		;

		MiddleEarthResearch.recipes.put("RodMORDOR_TT",
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_MORDOR_TT",
						new ItemStack(ItemTTCompat.wandCoreTT, 1, 16),
						9,
						(new AspectList().add(Aspect.MAGIC, 64).add(MiddleEarthAspects.MORDOR, 128)),
						new ItemStack(GameRegistry.findItem("ThaumicTinkerer", "kamiResource"), 1, 5),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 2), new ItemStack(LOTRMod.rock, 1, 0), new ItemStack(LOTRMod.guldurilCrystal, 1, 0)}
						)
				)
		;

		MiddleEarthResearch.recipes.put("RodDORWINION_TT",
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_DORWINION_TT",
						new ItemStack(ItemTTCompat.wandCoreTT, 1, 17),
						9,
						(new AspectList().add(Aspect.MAGIC, 64).add(MiddleEarthAspects.DORWINION, 128)),
						new ItemStack(GameRegistry.findItem("ThaumicTinkerer", "kamiResource"), 1, 5),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 20), new ItemStack(LOTRMod.brick5, 1, 2), new ItemStack(LOTRMod.mugRedWine)}
						)
				)
		;

		MiddleEarthResearch.recipes.put("RodRHUN_TT",
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_RHUN_TT",
						new ItemStack(ItemTTCompat.wandCoreTT, 1, 18),
						9,
						(new AspectList().add(Aspect.MAGIC, 8).add(MiddleEarthAspects.RHUDEL, 128)),
						new ItemStack(GameRegistry.findItem("ThaumicTinkerer", "kamiResource"), 1, 5),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 35), new ItemStack(LOTRMod.brick5, 1, 11), new ItemStack(LOTRMod.ruby, 1, 0)}
						)
				)
		;

		MiddleEarthResearch.recipes.put("RodNEAR_HARAD_TT",
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_NEAR_HARAD_TT",
						new ItemStack(ItemTTCompat.wandCoreTT, 1, 19),
						9,
						(new AspectList().add(Aspect.MAGIC, 64).add(MiddleEarthAspects.NEARHARAD, 128)),
						new ItemStack(GameRegistry.findItem("ThaumicTinkerer", "kamiResource"), 1, 5),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 9), new ItemStack(LOTRMod.brick, 1, 15), new ItemStack(LOTRMod.amethyst, 1, 0)}
						)
				)
		;

		MiddleEarthResearch.recipes.put("RodMOREDAIN_TT",
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_MOREDAIN_TT",
						new ItemStack(ItemTTCompat.wandCoreTT, 1, 20),
						9,
						(new AspectList().add(Aspect.MAGIC, 64).add(MiddleEarthAspects.MOREDAIN, 128)),
						new ItemStack(GameRegistry.findItem("ThaumicTinkerer", "kamiResource"), 1, 5),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 17), new ItemStack(LOTRMod.brick3, 1, 10), new ItemStack(LOTRMod.lionFur, 1, 0)}
						)
				)
		;

		MiddleEarthResearch.recipes.put("RodTAUREDAIN_TT",
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_TAUREDAIN_TT",
						new ItemStack(ItemTTCompat.wandCoreTT, 1, 21),
						9,
						(new AspectList().add(Aspect.MAGIC, 64).add(MiddleEarthAspects.TAUREDAIN, 128)),
						new ItemStack(GameRegistry.findItem("ThaumicTinkerer", "kamiResource"), 1, 5),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 18), new ItemStack(LOTRMod.brick4, 1, 0), new ItemStack(LOTRMod.mugTauredainCocoa)}
						)
				)
		;

		MiddleEarthResearch.recipes.put("RodHALF_TROLL_TT",
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_HALF_TROLL_TT",
						new ItemStack(ItemTTCompat.wandCoreTT, 1, 22),
						9,
						(new AspectList().add(Aspect.MAGIC, 64).add(MiddleEarthAspects.HALFTROLLS, 128)),
						new ItemStack(GameRegistry.findItem("ThaumicTinkerer", "kamiResource"), 1, 5),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 15), new ItemStack(LOTRMod.hammerHalfTroll, 1, 0), new ItemStack(LOTRMod.topaz, 1, 0)}
						)
				)
		;
		
		MiddleEarthResearch.recipes.put("RodBREE_TT",
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_BREE_TT",
						new ItemStack(ItemTTCompat.wandCoreTT, 1, 23),
						9,
						(new AspectList().add(Aspect.MAGIC, 64).add(MiddleEarthAspects.BREE, 128)),
						new ItemStack(GameRegistry.findItem("ThaumicTinkerer", "kamiResource"), 1, 5),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 41), new ItemStack(LOTRMod.cobblebrick), new ItemStack(LOTRMod.amber)}
						)
				)
		;
	}

	private static void addStaffRecipes()
	{

	}

}
