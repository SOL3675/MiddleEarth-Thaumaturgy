package sol3675.middleearththaumaturgy.recipes;

import cpw.mods.fml.common.Loader;
import lotr.common.LOTRMod;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import sol3675.middleearththaumaturgy.MiddleEarthResearch;
import sol3675.middleearththaumaturgy.aspect.MiddleEarthAspects;
import sol3675.middleearththaumaturgy.common.blocks.MiddleEarthThaumaturgyBlocks;
import sol3675.middleearththaumaturgy.common.items.MiddleEarthThaumaturgyItems;
import sol3675.middleearththaumaturgy.helper.LotrItems;
import thaumcraft.api.ItemApi;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.common.config.ConfigBlocks;
import thaumcraft.common.config.ConfigItems;

public class Recipes {
	
	public static void addRecipes() {
		
		if(Loader.isModLoaded("lotr") == true) {
			addBasicMaterialsRecipe();
			addJarsRecipe();
			addWandRods();
		}
		
		addCommonRecipe();
		
		
		
	}
	
	public static void addBasicMaterialsRecipe() {
		
		MiddleEarthResearch.recipes.put("GuldurilBlackUruk", 
				ThaumcraftApi.addInfusionCraftingRecipe(
						"GULDURILBLACKURUK", 
						new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, 0),
						5,
						(new AspectList().add(MiddleEarthAspects.URUKS, 16).add(MiddleEarthAspects.MORDOR, 16).add(Aspect.MAGIC, 8)),
						new ItemStack(LotrItems.get("item.blackUrukSteel")),
						new ItemStack[] {new ItemStack(LotrItems.get("item.guldurilCrystal")), new ItemStack(LotrItems.get("item.guldurilCrystal")), new ItemStack(LotrItems.get("item.guldurilCrystal"))}
						)
				)
		;
		
		MiddleEarthResearch.recipes.put("IthildinBlueDwarven", 
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ITHILDINBLUEDWARVEN", 
						new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, 1),
						5,
						(new AspectList().add(MiddleEarthAspects.DWARVES, 16).add(MiddleEarthAspects.BLUEMOUNTAINS, 16).add(Aspect.MAGIC, 8)),
						new ItemStack(LotrItems.get("item.blueDwarfSteel")),
						new ItemStack[] {new ItemStack(LotrItems.get("item.ithildin")), new ItemStack(LotrItems.get("item.ithildin")), new ItemStack(LotrItems.get("item.ithildin"))}
						)
				)
		;
		
		MiddleEarthResearch.recipes.put("IthildinDwarven", 
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ITHILDINDWARVEN", 
						new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, 2),
						5,
						(new AspectList().add(MiddleEarthAspects.DWARVES, 16).add(MiddleEarthAspects.IRONHILLS, 16).add(Aspect.MAGIC, 8)),
						new ItemStack(LotrItems.get("item.dwarfSteel")),
						new ItemStack[] {new ItemStack(LotrItems.get("item.ithildin")), new ItemStack(LotrItems.get("item.ithildin")), new ItemStack(LotrItems.get("item.ithildin"))}
						)
				)
		;
		
		MiddleEarthResearch.recipes.put("EdhelmirElven", 
				ThaumcraftApi.addInfusionCraftingRecipe(
						"EDHELMIRELVEN", 
						new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, 3),
						5,
						(new AspectList().add(MiddleEarthAspects.ELVES, 32).add(Aspect.MAGIC, 8)),
						new ItemStack(LotrItems.get("item.elfSteel")),
						new ItemStack[] {new ItemStack(LotrItems.get("item.quenditeCrystal")), new ItemStack(LotrItems.get("item.quenditeCrystal")), new ItemStack(LotrItems.get("item.quenditeCrystal"))}
						)
				)
		;
		
		MiddleEarthResearch.recipes.put("DaedelosGalvorn", 
				ThaumcraftApi.addInfusionCraftingRecipe(
						"DAEDELOSGALVORN", 
						new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, 4),
						5,
						(new AspectList().add(MiddleEarthAspects.ELVES, 16).add(MiddleEarthAspects.DWARVES, 16).add(Aspect.MAGIC, 8)),
						new ItemStack(LotrItems.get("item.galvorn")),
						new ItemStack[] {new ItemStack(LotrItems.get("item.chilling")), new ItemStack(LotrItems.get("item.chilling")), new ItemStack(LotrItems.get("item.chilling"))}
						)
				)
		;
		
		MiddleEarthResearch.recipes.put("StaredMithril", 
				ThaumcraftApi.addInfusionCraftingRecipe(
						"STAREDMITHRIL", 
						new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, 5),
						5,
						(new AspectList().add(MiddleEarthAspects.IMMORTAL, 64).add(MiddleEarthAspects.DWARVES, 16).add(MiddleEarthAspects.UTUMNO, 16).add(Aspect.AURA, 32)),
						new ItemStack(LotrItems.get("item.mithril")),
						new ItemStack[] {new ItemStack(Items.nether_star), new ItemStack(Items.nether_star), new ItemStack(Items.nether_star), new ItemStack(Items.nether_star), new ItemStack(Items.nether_star), new ItemStack(Items.nether_star), new ItemStack(Items.nether_star), new ItemStack(Items.nether_star), new ItemStack(Items.nether_star)}
						)
				)
		;
		
		MiddleEarthResearch.recipes.put("DaedelosMorgul", 
				ThaumcraftApi.addInfusionCraftingRecipe(
						"DAEDELOSMORGUL", 
						new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, 6),
						5,
						(new AspectList().add(MiddleEarthAspects.ORCS, 16).add(MiddleEarthAspects.MORDOR, 16).add(Aspect.MAGIC, 8)),
						new ItemStack(LotrItems.get("item.morgulSteel")),
						new ItemStack[] {new ItemStack(LotrItems.get("item.chilling")), new ItemStack(LotrItems.get("item.chilling")), new ItemStack(LotrItems.get("item.chilling"))}
						)
				)
		;
		
		MiddleEarthResearch.recipes.put("DurnaurOrc", 
				ThaumcraftApi.addInfusionCraftingRecipe(
						"DURNAURORC", 
						new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, 7),
						5,
						(new AspectList().add(MiddleEarthAspects.ORCS, 16).add(MiddleEarthAspects.MORDOR, 16).add(Aspect.MAGIC, 8)),
						new ItemStack(LotrItems.get("item.orcSteel")),
						new ItemStack[] {new ItemStack(LotrItems.get("item.naurite")), new ItemStack(LotrItems.get("item.naurite")), new ItemStack(LotrItems.get("item.naurite"))}
						)
				)
		;
		
		MiddleEarthResearch.recipes.put("GuldurilUruk", 
				ThaumcraftApi.addInfusionCraftingRecipe(
						"GULDURILURUK", 
						new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, 8),
						5,
						(new AspectList().add(MiddleEarthAspects.URUKS, 16).add(MiddleEarthAspects.ISENGARD, 16).add(Aspect.MAGIC, 8)),
						new ItemStack(LotrItems.get("item.urukSteel")),
						new ItemStack[] {new ItemStack(LotrItems.get("item.guldurilCrystal")), new ItemStack(LotrItems.get("item.guldurilCrystal")), new ItemStack(LotrItems.get("item.guldurilCrystal"))}
						)
				)
		;
		
		MiddleEarthResearch.recipes.put("BrightenGildediron", 
				ThaumcraftApi.addInfusionCraftingRecipe(
						"BRIGHTENGILDEDIRON", 
						new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, 9),
						5,
						(new AspectList().add(MiddleEarthAspects.RHUDEL, 16).add(Aspect.GREED, 16).add(Aspect.MAGIC, 8)),
						new ItemStack(LotrItems.get("item.gildedIron")),
						new ItemStack[] {new ItemStack(LotrItems.get("item.diamond")), new ItemStack(LotrItems.get("item.diamond")), new ItemStack(LotrItems.get("item.diamond"))}
						)
				)
		;
		
	}
	
	public static void addJarsRecipe() {
		
		MiddleEarthResearch.recipes.put("CompJar", 
				ThaumcraftApi.addArcaneCraftingRecipe(
						"COMP_JAR", 
						new ItemStack(MiddleEarthThaumaturgyBlocks.compressedEssentiaJar),
						(new AspectList().add(Aspect.AIR, 20).add(Aspect.FIRE, 20).add(Aspect.WATER, 20)),
						new Object[]{"SSS", "SXS", "SSS", Character.valueOf('S'), new ItemStack(ConfigBlocks.blockJar), Character.valueOf('X'), new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, 10)}
						)
				)
		;
		
		MiddleEarthResearch.recipes.put("X2CompJar", 
				ThaumcraftApi.addArcaneCraftingRecipe(
						"X2COMP_JAR", 
						new ItemStack(MiddleEarthThaumaturgyBlocks.x2compressedEssentiaJar),
						(new AspectList().add(Aspect.AIR, 80).add(Aspect.FIRE, 80).add(Aspect.WATER, 80).add(Aspect.EARTH, 80).add(Aspect.ORDER, 80).add(Aspect.ENTROPY, 80)),
						new Object[]{"SSS", "SXS", "SSS", Character.valueOf('S'), new ItemStack(MiddleEarthThaumaturgyBlocks.compressedEssentiaJar), Character.valueOf('X'), new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, 11)}
						)
				)
		;
		MiddleEarthResearch.recipes.put("ExtremeJarCap", 
				ThaumcraftApi.addInfusionCraftingRecipe(
						"EXTREMEJARCAP", 
						new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, 12),
						5,
						(new AspectList().add(MiddleEarthAspects.UTUMNO, 16).add(MiddleEarthAspects.IMMORTAL, 32).add(MiddleEarthAspects.DWARVES, 16)),
						new ItemStack(MiddleEarthThaumaturgyBlocks.blockStorage,1 ,5),
						new ItemStack[] {new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, 0), new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, 1), new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, 2), new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, 3), new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, 4), new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, 5), new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, 6), new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, 7), new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, 8), new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, 9)}
						)
				)
		;
		MiddleEarthResearch.recipes.put("ExtremeJar", 
				ThaumcraftApi.addArcaneCraftingRecipe(
						"EXTREMEJARCAP", 
						new ItemStack(MiddleEarthThaumaturgyBlocks.extralargeEssentiaJar),
						(new AspectList().add(Aspect.AIR, 300).add(Aspect.FIRE, 300).add(Aspect.WATER, 300).add(Aspect.EARTH, 300).add(Aspect.ORDER, 300).add(Aspect.ENTROPY, 300)),
						new Object[]{"SXS", "S S", "SSS", Character.valueOf('S'), new ItemStack(ConfigBlocks.blockCosmeticOpaque, 1, 2), Character.valueOf('X'), new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, 12)}
						)
				)
		;
		
	}
	
	public static void addCommonRecipe() {
		
		MiddleEarthResearch.recipes.put("RingWarpward", 
				ThaumcraftApi.addInfusionCraftingRecipe(
						"RING_warpward", 
						new ItemStack(MiddleEarthThaumaturgyItems.ringWarpward, 1, 0),
						8,
						(new AspectList().add(Aspect.AURA, 64).add(Aspect.TAINT, 64).add(MiddleEarthAspects.WIZARDS, 64).add(MiddleEarthAspects.IMMORTAL, 64)),
						new ItemStack(LotrItems.get("item.goldRing"), 1, 4),
						new ItemStack[] {new ItemStack(MiddleEarthThaumaturgyItems.nuggets, 1, 5), new ItemStack(MiddleEarthThaumaturgyItems.nuggets, 1, 5), new ItemStack(MiddleEarthThaumaturgyItems.nuggets, 1, 5)}
						)
				)
		;
		
		MiddleEarthResearch.recipes.put("CapMithril", 
				ThaumcraftApi.addInfusionCraftingRecipe(
						"CAP_mithril", 
						new ItemStack(MiddleEarthThaumaturgyItems.wandCap, 1, 0),
						8,
						(new AspectList().add(Aspect.AURA, 64).add(Aspect.GREED, 32).add(Aspect.MAGIC, 32).add(MiddleEarthAspects.IMMORTAL, 32)),
						new ItemStack(ConfigItems.itemWandCap, 1, 4),
						new ItemStack[] {new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, 5), new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, 5), new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, 5)}
						)
				)
		;
		
	}
	
	public static void addWandRods()
	{
		MiddleEarthResearch.recipes.put("RodGONDOR", 
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_GONDOR", 
						new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 0),
						8,
						(new AspectList().add(Aspect.MAGIC, 8).add(MiddleEarthAspects.GONDOR, 24)),
						new ItemStack(ConfigItems.itemWandRod, 1, 2),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 0), new ItemStack(LOTRMod.rock, 1, 1), new ItemStack(LOTRMod.diamond, 1, 0)}
						)
				)
		;
		
		MiddleEarthResearch.recipes.put("RodHOBBIT", 
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_HOBBIT", 
						new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 1),
						8,
						(new AspectList().add(Aspect.MAGIC, 8).add(MiddleEarthAspects.SHIRE, 24)),
						new ItemStack(ConfigItems.itemWandRod, 1, 2),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 21), new ItemStack(LOTRMod.wood, 1, 0), new ItemStack(LOTRMod.amber, 1, 0)}
						)
				)
		;
		
		MiddleEarthResearch.recipes.put("RodRANGER_NORTH", 
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_RANGER_NORTH", 
						new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 2),
						8,
						(new AspectList().add(Aspect.MAGIC, 8).add(MiddleEarthAspects.DUNEDAIN, 24)),
						new ItemStack(ConfigItems.itemWandRod, 1, 2),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 12), new ItemStack(LOTRMod.rangerBow, 1, 0), new ItemStack(LOTRMod.emerald, 1, 0)}
						)
				)
		;
		
		MiddleEarthResearch.recipes.put("RodBLUE_MOUNTAINS", 
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_BLUE_MOUNTAINS", 
						new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 3),
						8,
						(new AspectList().add(Aspect.MAGIC, 8).add(MiddleEarthAspects.BLUEMOUNTAINS, 24)),
						new ItemStack(ConfigItems.itemWandRod, 1, 2),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 11), new ItemStack(LOTRMod.rock, 1, 3), new ItemStack(LOTRMod.opal, 1, 0)}
						)
				)
		;
		
		MiddleEarthResearch.recipes.put("RodHIGH_ELF", 
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_HIGH_ELF", 
						new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 4),
						8,
						(new AspectList().add(Aspect.MAGIC, 8).add(MiddleEarthAspects.LINDON, 24)),
						new ItemStack(ConfigItems.itemWandRod, 1, 2),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 10), new ItemStack(LOTRMod.quenditeCrystal, 1, 0), new ItemStack(LOTRMod.quenditeCrystal, 1, 0)}
						)
				)
		;
	}

}
