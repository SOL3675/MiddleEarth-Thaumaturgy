package sol3675.middleearththaumaturgy.recipes;

import cpw.mods.fml.common.Loader;
import lotr.common.LOTRMod;
import net.minecraft.init.Blocks;
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
		
		addBasicMaterialsRecipe();
		addJarsRecipe();
		addWandRods();
		addCommonRecipe();
		addTransmutaionRecipes();
		
	}
	
	private static void addBasicMaterialsRecipe() {
		
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
	
	private static void addJarsRecipe() {
		
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
	
	private static void addCommonRecipe() {
		
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
		
		MiddleEarthResearch.recipes.put("HandheldCrafter", 
				ThaumcraftApi.addInfusionCraftingRecipe(
						"HANDHELDCRAFTER", 
						new ItemStack(MiddleEarthThaumaturgyItems.factionCrafter, 1, 0),
						1,
						(new AspectList().add(Aspect.CRAFT, 16)),
						new ItemStack(Blocks.crafting_table),
						new ItemStack[]
								{
								new ItemStack(LOTRMod.hobbitTable), new ItemStack(LOTRMod.rangerTable), new ItemStack(LOTRMod.blueDwarvenTable), new ItemStack(LOTRMod.highElvenTable), new ItemStack(LOTRMod.gundabadTable),
								new ItemStack(LOTRMod.angmarTable), new ItemStack(LOTRMod.woodElvenTable), new ItemStack(LOTRMod.dolGuldurTable), new ItemStack(LOTRMod.daleTable), new ItemStack(LOTRMod.dwarvenTable),
								new ItemStack(LOTRMod.elvenTable), new ItemStack(LOTRMod.dunlendingTable), new ItemStack(LOTRMod.urukTable), new ItemStack(LOTRMod.rohirricTable), new ItemStack(LOTRMod.gondorianTable),
								new ItemStack(LOTRMod.dolAmrothTable), new ItemStack(LOTRMod.morgulTable), new ItemStack(LOTRMod.dorwinionTable), new ItemStack(LOTRMod.rhunTable), new ItemStack(LOTRMod.nearHaradTable),
								new ItemStack(LOTRMod.moredainTable), new ItemStack(LOTRMod.tauredainTable), new ItemStack(LOTRMod.halfTrollTable), new ItemStack(LOTRMod.rivendellTable), new ItemStack(LOTRMod.umbarTable),
								new ItemStack(LOTRMod.gulfTable)
								}
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
	
	private static void addWandRods()
	{
		MiddleEarthResearch.recipes.put("RodGONDOR", 
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_GONDOR", 
						new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 0),
						6,
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
						6,
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
						6,
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
						6,
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
						6,
						(new AspectList().add(Aspect.MAGIC, 8).add(MiddleEarthAspects.LINDON, 24)),
						new ItemStack(ConfigItems.itemWandRod, 1, 2),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 10), new ItemStack(LOTRMod.quenditeCrystal, 1, 0), new ItemStack(LOTRMod.quenditeCrystal, 1, 0)}
						)
				)
		;
		
		MiddleEarthResearch.recipes.put("RodGUNDABAD", 
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_GUNDABAD", 
						new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 5),
						6,
						(new AspectList().add(Aspect.MAGIC, 8).add(MiddleEarthAspects.GUNDABAD, 24)),
						new ItemStack(ConfigItems.itemWandRod, 1, 2),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 14), new ItemStack(LOTRMod.gundabadUrukBow, 1, 0), new ItemStack(LOTRMod.nauriteGem, 1, 0)}
						)
				)
		;
		
		MiddleEarthResearch.recipes.put("RodANGMAR", 
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_ANGMAR", 
						new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 6),
						6,
						(new AspectList().add(Aspect.MAGIC, 8).add(MiddleEarthAspects.ANGMAR, 24)),
						new ItemStack(ConfigItems.itemWandRod, 1, 2),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 8), new ItemStack(LOTRMod.guldurilCrystal, 1, 0), new ItemStack(LOTRMod.amethyst, 1, 0)}
						)
				)
		;
		
		MiddleEarthResearch.recipes.put("RodWOOD_ELF", 
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_WOOD_ELF", 
						new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 7),
						6,
						(new AspectList().add(Aspect.MAGIC, 8).add(MiddleEarthAspects.WOODLAND, 24)),
						new ItemStack(ConfigItems.itemWandRod, 1, 2),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 4), new ItemStack(LOTRMod.topaz, 1, 0), new ItemStack(LOTRMod.leaves, 1, 3)}
						)
				)
		;
		
		MiddleEarthResearch.recipes.put("RodDOL_GULDUR", 
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_DOL_GULDUR", 
						new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 8),
						6,
						(new AspectList().add(Aspect.MAGIC, 8).add(MiddleEarthAspects.DOLGULDUR, 24)),
						new ItemStack(ConfigItems.itemWandRod, 1, 2),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 13), new ItemStack(LOTRMod.nauriteGem, 1, 0), new ItemStack(LOTRMod.brick2, 1, 8)}
						)
				)
		;
		
		MiddleEarthResearch.recipes.put("RodDALE", 
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_DALE", 
						new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 9),
						6,
						(new AspectList().add(Aspect.MAGIC, 8).add(MiddleEarthAspects.DALE, 24)),
						new ItemStack(ConfigItems.itemWandRod, 1, 2),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 19), new ItemStack(LOTRMod.daleCracker), new ItemStack(LOTRMod.ruby, 1, 0)}
						)
				)
		;
		
		MiddleEarthResearch.recipes.put("RodDWARF", 
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_DWARF", 
						new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 10),
						6,
						(new AspectList().add(Aspect.MAGIC, 8).add(MiddleEarthAspects.IRONHILLS, 24)),
						new ItemStack(ConfigItems.itemWandRod, 1, 2),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 7), new ItemStack(LOTRMod.brick, 1, 6), new ItemStack(LOTRMod.dwarfSteel, 1, 0)}
						)
				)
		;
		
		MiddleEarthResearch.recipes.put("RodGALADHRIM", 
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_GALADHRIM", 
						new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 11),
						6,
						(new AspectList().add(Aspect.MAGIC, 8).add(MiddleEarthAspects.LOTHLORIEN, 24)),
						new ItemStack(ConfigItems.itemWandRod, 1, 2),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 3), new ItemStack(LOTRMod.wood, 1, 1), new ItemStack(LOTRMod.quenditeCrystal, 1, 0)}
						)
				)
		;
		
		MiddleEarthResearch.recipes.put("RodDUNLAND", 
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_DUNLAND", 
						new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 12),
						6,
						(new AspectList().add(Aspect.MAGIC, 8).add(MiddleEarthAspects.DUNLAND, 24)),
						new ItemStack(ConfigItems.itemWandRod, 1, 2),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 5), new ItemStack(LOTRMod.dunlendingTrident, 1, 0), new ItemStack(LOTRMod.sapphire, 1, 0)}
						)
				)
		;
		
		MiddleEarthResearch.recipes.put("RodURUK_HAI", 
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_URUK_HAI", 
						new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 13),
						6,
						(new AspectList().add(Aspect.MAGIC, 8).add(MiddleEarthAspects.ISENGARD, 24)),
						new ItemStack(ConfigItems.itemWandRod, 1, 2),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 6), new ItemStack(LOTRMod.urukSteel, 1, 0), new ItemStack(LOTRMod.pearl, 1, 0)}
						)
				)
		;
		
		MiddleEarthResearch.recipes.put("RodFANGORN", 
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_FANGORN", 
						new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 14),
						6,
						(new AspectList().add(Aspect.MAGIC, 8).add(MiddleEarthAspects.FANGORN, 24)),
						new ItemStack(ConfigItems.itemWandRod, 1, 2),
						new ItemStack[] {new ItemStack(LOTRMod.fangornPlant, 1, 0), new ItemStack(LOTRMod.fangornPlant, 1, 2), new ItemStack(LOTRMod.fangornPlant, 1, 3)}
						)
				)
		;
		
		MiddleEarthResearch.recipes.put("RodROHAN", 
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_ROHAN", 
						new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 15),
						6,
						(new AspectList().add(Aspect.MAGIC, 8).add(MiddleEarthAspects.ROHAN, 24)),
						new ItemStack(ConfigItems.itemWandRod, 1, 2),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 1), new ItemStack(LOTRMod.rock, 1, 2), new ItemStack(LOTRMod.opal, 1, 0)}
						)
				)
		;
		
		MiddleEarthResearch.recipes.put("RodMORDOR", 
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_MORDOR", 
						new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 16),
						6,
						(new AspectList().add(Aspect.MAGIC, 8).add(MiddleEarthAspects.MORDOR, 24)),
						new ItemStack(ConfigItems.itemWandRod, 1, 2),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 2), new ItemStack(LOTRMod.rock, 1, 0), new ItemStack(LOTRMod.guldurilCrystal, 1, 0)}
						)
				)
		;
		
		MiddleEarthResearch.recipes.put("RodDORWINION", 
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_DORWINION", 
						new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 17),
						6,
						(new AspectList().add(Aspect.MAGIC, 8).add(MiddleEarthAspects.DORWINION, 24)),
						new ItemStack(ConfigItems.itemWandRod, 1, 2),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 20), new ItemStack(LOTRMod.brick5, 1, 2), new ItemStack(LOTRMod.mugRedWine)}
						)
				)
		;
		
		MiddleEarthResearch.recipes.put("RodRHUN", 
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_RHUN", 
						new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 18),
						6,
						(new AspectList().add(Aspect.MAGIC, 8).add(MiddleEarthAspects.RHUDEL, 24)),
						new ItemStack(ConfigItems.itemWandRod, 1, 2),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 35), new ItemStack(LOTRMod.brick5, 1, 11), new ItemStack(LOTRMod.ruby, 1, 0)}
						)
				)
		;
		
		MiddleEarthResearch.recipes.put("RodNEAR_HARAD", 
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_NEAR_HARAD", 
						new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 19),
						6,
						(new AspectList().add(Aspect.MAGIC, 8).add(MiddleEarthAspects.NEARHARAD, 24)),
						new ItemStack(ConfigItems.itemWandRod, 1, 2),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 9), new ItemStack(LOTRMod.brick, 1, 15), new ItemStack(LOTRMod.amethyst, 1, 0)}
						)
				)
		;
		
		MiddleEarthResearch.recipes.put("RodMOREDAIN", 
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_MOREDAIN", 
						new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 20),
						6,
						(new AspectList().add(Aspect.MAGIC, 8).add(MiddleEarthAspects.MOREDAIN, 24)),
						new ItemStack(ConfigItems.itemWandRod, 1, 2),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 17), new ItemStack(LOTRMod.brick3, 1, 10), new ItemStack(LOTRMod.lionFur, 1, 0)}
						)
				)
		;
		
		MiddleEarthResearch.recipes.put("RodTAUREDAIN", 
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_TAUREDAIN", 
						new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 21),
						6,
						(new AspectList().add(Aspect.MAGIC, 8).add(MiddleEarthAspects.TAUREDAIN, 24)),
						new ItemStack(ConfigItems.itemWandRod, 1, 2),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 18), new ItemStack(LOTRMod.brick4, 1, 0), new ItemStack(LOTRMod.mugTauredainCocoa)}
						)
				)
		;
		
		MiddleEarthResearch.recipes.put("RodHALF_TROLL", 
				ThaumcraftApi.addInfusionCraftingRecipe(
						"ROD_HALF_TROLL", 
						new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 22),
						6,
						(new AspectList().add(Aspect.MAGIC, 8).add(MiddleEarthAspects.HALFTROLLS, 24)),
						new ItemStack(ConfigItems.itemWandRod, 1, 2),
						new ItemStack[] {new ItemStack(LOTRMod.banner, 1, 15), new ItemStack(LOTRMod.hammerHalfTroll, 1, 0), new ItemStack(LOTRMod.topaz, 1, 0)}
						)
				)
		;
	}
	
	private static void addTransmutaionRecipes()
	{
		MiddleEarthResearch.recipes.put("GemTransTopaz",
			ThaumcraftApi.addCrucibleRecipe("GEMTRANSMETT",
            new ItemStack(LOTRMod.topaz, 2, 0), new ItemStack(LOTRMod.topaz), (new AspectList()).merge(Aspect.CRYSTAL, 10).merge(Aspect.FIRE, 10))
		);
		
		MiddleEarthResearch.recipes.put("GemTransAmethyst",
			ThaumcraftApi.addCrucibleRecipe("GEMTRANSMETT",
	        new ItemStack(LOTRMod.amethyst, 2, 0), new ItemStack(LOTRMod.amethyst), (new AspectList()).merge(Aspect.CRYSTAL, 10).merge(Aspect.AURA, 10))
		);
		
		MiddleEarthResearch.recipes.put("GemTransSapphire",
			ThaumcraftApi.addCrucibleRecipe("GEMTRANSMETT",
	        new ItemStack(LOTRMod.sapphire, 2, 0), new ItemStack(LOTRMod.sapphire), (new AspectList()).merge(Aspect.CRYSTAL, 10).merge(Aspect.HEAL, 10))
		);
		
		MiddleEarthResearch.recipes.put("GemTransRuby",
			ThaumcraftApi.addCrucibleRecipe("GEMTRANSMETT",
			new ItemStack(LOTRMod.ruby, 2, 0), new ItemStack(LOTRMod.ruby), (new AspectList()).merge(Aspect.CRYSTAL, 10).merge(Aspect.ENERGY, 10))
		);
		
		MiddleEarthResearch.recipes.put("GemTransAmber",
			ThaumcraftApi.addCrucibleRecipe("GEMTRANSMETT",
			new ItemStack(LOTRMod.amber, 2, 0), new ItemStack(LOTRMod.amber), (new AspectList()).merge(Aspect.CRYSTAL, 5).merge(Aspect.TRAP, 5))
		);
		
		MiddleEarthResearch.recipes.put("GemTransDiamond",
			ThaumcraftApi.addCrucibleRecipe("GEMTRANSMETT",
			new ItemStack(LOTRMod.diamond, 2, 0), new ItemStack(LOTRMod.diamond), (new AspectList()).merge(Aspect.CRYSTAL, 10).merge(Aspect.GREED, 10))
		);
		
		MiddleEarthResearch.recipes.put("GemTransPearl",
			ThaumcraftApi.addCrucibleRecipe("GEMTRANSMETT",
			new ItemStack(LOTRMod.pearl, 2, 0), new ItemStack(LOTRMod.pearl), (new AspectList()).merge(Aspect.CRYSTAL, 5).merge(Aspect.EXCHANGE, 5))
		);
		
		MiddleEarthResearch.recipes.put("GemTransCoral",
			ThaumcraftApi.addCrucibleRecipe("GEMTRANSMETT",
			new ItemStack(LOTRMod.coral, 2, 0), new ItemStack(LOTRMod.coral), (new AspectList()).merge(Aspect.CRYSTAL, 5).merge(Aspect.WATER, 5))
		);
		
		MiddleEarthResearch.recipes.put("GemTransOpal",
			ThaumcraftApi.addCrucibleRecipe("GEMTRANSMETT",
			new ItemStack(LOTRMod.opal, 2, 0), new ItemStack(LOTRMod.opal), (new AspectList()).merge(Aspect.CRYSTAL, 10).merge(MiddleEarthAspects.IMMORTAL, 10))
		);
		
		MiddleEarthResearch.recipes.put("GemTransEmerald",
			ThaumcraftApi.addCrucibleRecipe("GEMTRANSMETT",
			new ItemStack(LOTRMod.emerald, 2, 0), new ItemStack(LOTRMod.emerald), (new AspectList()).merge(Aspect.CRYSTAL, 10).merge(Aspect.GREED, 10))
		);
		
		MiddleEarthResearch.recipes.put("EdhelmirTrans",
			ThaumcraftApi.addCrucibleRecipe("EDHELMIRTRANS",
			new ItemStack(LOTRMod.quenditeCrystal, 2, 0), new ItemStack(LOTRMod.quenditeCrystal), (new AspectList()).merge(Aspect.CRYSTAL, 8).merge(MiddleEarthAspects.ELVES, 6))
		);
		
		MiddleEarthResearch.recipes.put("GuldurilTrans",
			ThaumcraftApi.addCrucibleRecipe("GULDURILTRANS",
			new ItemStack(LOTRMod.guldurilCrystal, 2, 0), new ItemStack(LOTRMod.guldurilCrystal), (new AspectList()).merge(MiddleEarthAspects.ORCS, 2).merge(MiddleEarthAspects.NAZGULS, 2))
		);
	}

}
