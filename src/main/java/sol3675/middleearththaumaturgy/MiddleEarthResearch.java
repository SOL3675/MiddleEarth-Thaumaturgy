package sol3675.middleearththaumaturgy;

import java.util.HashMap;

import cpw.mods.fml.common.Loader;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import sol3675.middleearththaumaturgy.MiddleEarthResearchItem;
import sol3675.middleearththaumaturgy.aspect.MiddleEarthAspects;
import sol3675.middleearththaumaturgy.common.blocks.MiddleEarthThaumaturgyBlocks;
import sol3675.middleearththaumaturgy.common.items.MiddleEarthThaumaturgyItems;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.IArcaneRecipe;
import thaumcraft.api.crafting.InfusionRecipe;
import thaumcraft.api.research.ResearchCategories;
import thaumcraft.api.research.ResearchPage;

public class MiddleEarthResearch {

	
	public static HashMap recipes = new HashMap();


	public static void addResearch() {

		ResearchCategories.registerCategory("MIDDLEEARTH", new ResourceLocation("middleearththaumaturgy","textures/misc/middleearth.png"), new ResourceLocation("middleearththaumaturgy","textures/misc/map.png"));
		ResearchCategories.registerCategory("FREEPEOPLE", new ResourceLocation("middleearththaumaturgy","textures/misc/middleearth.png"), new ResourceLocation("middleearththaumaturgy","textures/misc/freepeople.png"));
		ResearchCategories.registerCategory("SAURON", new ResourceLocation("middleearththaumaturgy","textures/misc/middleearth.png"), new ResourceLocation("middleearththaumaturgy","textures/misc/sauron.png"));
		
		if(Loader.isModLoaded("lotr") == true) {
			addBasicMaterials();
			addJars();
		}

		addCommon();
		addFreePeople();
		addSauron();

	}
	
	public static void addBasicMaterials() {
		(new MiddleEarthResearchItem(
				"GULDURILBLACKURUK",
				"SAURON",
				(new AspectList()).add(MiddleEarthAspects.MORDOR, 5).add(Aspect.MAGIC, 1).add(Aspect.METAL, 11),
				-12,-8, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, 0))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.GULDURILBLACKURUK.1"),
				new ResearchPage((InfusionRecipe) recipes.get("GuldurilBlackUruk"))
				}
		).setParents(new String[] {"INFUSION"}).registerResearchItem();
		
		(new MiddleEarthResearchItem(
				"ITHILDINBLUEDWARVEN",
				"FREEPEOPLE",
				(new AspectList()).add(MiddleEarthAspects.DWARVES, 5).add(Aspect.MAGIC, 1).add(Aspect.METAL, 11),
				-12,-8, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, 1))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.ITHILDINBLUEDWARVEN.1"),
				new ResearchPage((InfusionRecipe) recipes.get("IthildinBlueDwarven"))
				}
		).setParents(new String[] {"INFUSION"}).registerResearchItem();
		
		(new MiddleEarthResearchItem(
				"ITHILDINDWARVEN",
				"FREEPEOPLE",
				(new AspectList()).add(MiddleEarthAspects.DWARVES, 5).add(Aspect.MAGIC, 1).add(Aspect.METAL, 11),
				-11,-8, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, 2))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.ITHILDINDWARVEN.1"),
				new ResearchPage((InfusionRecipe) recipes.get("IthildinDwarven"))
				}
		).setParents(new String[] {"INFUSION"}).registerResearchItem();
		
		(new MiddleEarthResearchItem(
				"EDHELMIRELVEN",
				"FREEPEOPLE",
				(new AspectList()).add(MiddleEarthAspects.ELVES, 5).add(Aspect.MAGIC, 1).add(Aspect.METAL, 11),
				-10,-8, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, 3))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.EDHELMIRELVEN.1"),
				new ResearchPage((InfusionRecipe) recipes.get("EdhelmirElven"))
				}
		).setParents(new String[] {"INFUSION"}).registerResearchItem();
		
		(new MiddleEarthResearchItem(
				"DAEDELOSGALVORN",
				"FREEPEOPLE",
				(new AspectList()).add(MiddleEarthAspects.ELVES, 5).add(MiddleEarthAspects.DWARVES, 1).add(Aspect.METAL, 11),
				-9,-8, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, 4))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.DAEDELOSGALVORN.1"),
				new ResearchPage((InfusionRecipe) recipes.get("DaedelosGalvorn"))
				}
		).setParents(new String[] {"INFUSION"}).registerResearchItem();
		
		(new MiddleEarthResearchItem(
				"STAREDMITHRIL",
				"MIDDLEEARTH",
				(new AspectList()).add(MiddleEarthAspects.IMMORTAL, 5).add(MiddleEarthAspects.DWARVES, 1).add(Aspect.METAL, 11),
				-12,-8, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, 5))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.STAREDMITHRIL.1"),
				new ResearchPage((InfusionRecipe) recipes.get("StaredMithril"))
				}
		).setParents(new String[] {"INFUSION"}).registerResearchItem();
		
		(new MiddleEarthResearchItem(
				"DAEDELOSMORGUL",
				"SAURON",
				(new AspectList()).add(MiddleEarthAspects.MORDOR, 5).add(Aspect.MAGIC, 1).add(Aspect.METAL, 11),
				-11,-8, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, 6))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.DAEDELOSMORGUL.1"),
				new ResearchPage((InfusionRecipe) recipes.get("DaedelosMorgul"))
				}
		).setParents(new String[] {"INFUSION"}).registerResearchItem();
		
		(new MiddleEarthResearchItem(
				"DURNAURORC",
				"SAURON",
				(new AspectList()).add(MiddleEarthAspects.ORCS, 5).add(Aspect.MAGIC, 1).add(Aspect.METAL, 11),
				-10,-8, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, 7))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.DURNAURORC.1"),
				new ResearchPage((InfusionRecipe) recipes.get("DurnaurOrc"))
				}
		).setParents(new String[] {"INFUSION"}).registerResearchItem();
		
		(new MiddleEarthResearchItem(
				"GULDURILURUK",
				"SAURON",
				(new AspectList()).add(MiddleEarthAspects.ISENGARD, 5).add(Aspect.MAGIC, 1).add(Aspect.METAL, 11),
				-9,-8, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, 8))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.GULDURILURUK.1"),
				new ResearchPage((InfusionRecipe) recipes.get("GuldurilUruk"))
				}
		).setParents(new String[] {"INFUSION"}).registerResearchItem();
		
		(new MiddleEarthResearchItem(
				"BRIGHTENGILDEDIRON",
				"MIDDLEEARTH",
				(new AspectList()).add(MiddleEarthAspects.RHUDEL, 5).add(Aspect.GREED, 1).add(Aspect.METAL, 11),
				-11,-8, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, 9))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.BRIGHTENGILDEDIRON.1"),
				new ResearchPage((InfusionRecipe) recipes.get("BrightenGildediron"))
				}
		).setParents(new String[] {"INFUSION"}).registerResearchItem();
	}
	
	public static void addJars() {
		
		(new MiddleEarthResearchItem(
				"COMP_JAR",
				"MIDDLEEARTH",
				(new AspectList()).add(MiddleEarthAspects.IMMORTAL, 5).add(Aspect.AIR, 1).add(Aspect.VOID, 11),
				-8,-3, 2,
				new ItemStack(MiddleEarthThaumaturgyBlocks.compressedEssentiaJar))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.COMP_JAR.1"),
				new ResearchPage((IArcaneRecipe) recipes.get("CompJar"))
				}
		).setParents(new String[] {"JARLABEL"}).registerResearchItem();
		
		(new MiddleEarthResearchItem(
				"X2COMP_JAR",
				"MIDDLEEARTH",
				(new AspectList()).add(MiddleEarthAspects.IMMORTAL, 5).add(MiddleEarthAspects.GONDOR, 1).add(MiddleEarthAspects.MORDOR, 11),
				-9,-4, 3,
				new ItemStack(MiddleEarthThaumaturgyBlocks.x2compressedEssentiaJar))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.X2COMP_JAR.1"),
				new ResearchPage((IArcaneRecipe) recipes.get("X2CompJar"))
				}
		).setParents(new String[] {"COMP_JAR"}).registerResearchItem();
		
		(new MiddleEarthResearchItem(
				"EXTREMEJARCAP",
				"MIDDLEEARTH",
				(new AspectList()).add(MiddleEarthAspects.IMMORTAL, 5).add(MiddleEarthAspects.GONDOR, 1).add(MiddleEarthAspects.MORDOR, 11),
				-10,-4, 3,
				new ItemStack(MiddleEarthThaumaturgyBlocks.extralargeEssentiaJar))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.EXTREMEJARCAP.1"),
				new ResearchPage((InfusionRecipe) recipes.get("ExtremeJarCap")),
				new ResearchPage((IArcaneRecipe) recipes.get("ExtremeJar"))
				}
		).setParents(new String[] {"X2COMP_JAR"}).registerResearchItem();
		
	}

	public static void addCommon() {

		(new MiddleEarthResearchItem(
				"RING_warpward",
				"MIDDLEEARTH",
				(new AspectList()).add(Aspect.TAINT, 5).add(MiddleEarthAspects.IMMORTAL, 1).add(MiddleEarthAspects.WIZARDS, 11),
				1,-2, 3,
				new ItemStack(MiddleEarthThaumaturgyItems.ringWarpward, 1, 0))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.RING_warpward.1"),
				new ResearchPage((InfusionRecipe) recipes.get("RingWarpward"))
				}
		).setParents(new String[] {"INFUSION"}).registerResearchItem();
		
		(new MiddleEarthResearchItem(
				"CAP_mithril",
				"MIDDLEEARTH",
				(new AspectList()).add(Aspect.CRYSTAL, 5).add(Aspect.MAGIC, 1).add(Aspect.METAL, 11),
				-1,-1, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCap, 1, 0))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.CAP_mithril.1"),
				new ResearchPage((InfusionRecipe) recipes.get("CapMithril"))
				}
		).setParents(new String[] {"CAP_gold"}).registerResearchItem();

	}

	public static void addFreePeople() {

		(new MiddleEarthResearchItem(
				"ROD_GONDOR",
				"FREEPEOPLE",
				(new AspectList()).add(MiddleEarthAspects.GONDOR, 5).add(Aspect.MAGIC, 1),
				-1, -1, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 0))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.ROD_GONDOR.1"),
				new ResearchPage((InfusionRecipe) recipes.get("RodGONDOR"))
				}
		).setParents(new String[] {"ROD_silverwood"}).setConcealed().registerResearchItem();
		
		(new MiddleEarthResearchItem(
				"ROD_HOBBIT",
				"FREEPEOPLE",
				(new AspectList()).add(MiddleEarthAspects.SHIRE, 5).add(Aspect.MAGIC, 1),
				0, -2, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 1))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.ROD_HOBBIT.1"),
				new ResearchPage((InfusionRecipe) recipes.get("RodHOBBIT"))
				}
		).setParents(new String[] {"ROD_silverwood"}).setConcealed().registerResearchItem();
		
		(new MiddleEarthResearchItem(
				"ROD_RANGER_NORTH",
				"FREEPEOPLE",
				(new AspectList()).add(MiddleEarthAspects.DUNEDAIN, 5).add(Aspect.MAGIC, 1),
				1, -3, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 2))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.ROD_RANGER_NORTH.1"),
				new ResearchPage((InfusionRecipe) recipes.get("RodRANGER_NORTH"))
				}
		).setParents(new String[] {"ROD_silverwood"}).setConcealed().registerResearchItem();
		
		(new MiddleEarthResearchItem(
				"ROD_BLUE_MOUNTAINS",
				"FREEPEOPLE",
				(new AspectList()).add(MiddleEarthAspects.BLUEMOUNTAINS, 5).add(Aspect.MAGIC, 1),
				2, -2, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 3))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.BLUE_MOUNTAINS.1"),
				new ResearchPage((InfusionRecipe) recipes.get("RodBLUE_MOUNTAINS"))
				}
		).setParents(new String[] {"ROD_silverwood"}).setConcealed().registerResearchItem();
		
		(new MiddleEarthResearchItem(
				"ROD_HIGH_ELF",
				"FREEPEOPLE",
				(new AspectList()).add(MiddleEarthAspects.LINDON, 5).add(Aspect.MAGIC, 1),
				3, -1, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 4))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.ROD_HIGH_ELF.1"),
				new ResearchPage((InfusionRecipe) recipes.get("RodHIGH_ELF"))
				}
		).setParents(new String[] {"ROD_silverwood"}).setConcealed().registerResearchItem();

		(new MiddleEarthResearchItem(
				"ROD_WOOD_ELF",
				"FREEPEOPLE",
				(new AspectList()).add(MiddleEarthAspects.WOODLAND, 5).add(Aspect.MAGIC, 1),
				2, 0, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 7))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.ROD_WOOD_ELF.1")
				}
		).setParents(new String[] {"ROD_silverwood"}).setConcealed().registerResearchItem();
		
		(new MiddleEarthResearchItem(
				"ROD_DALE",
				"FREEPEOPLE",
				(new AspectList()).add(MiddleEarthAspects.DALE, 5).add(Aspect.MAGIC, 1),
				1, 1, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 9))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.ROD_DALE.1")
				}
		).setParents(new String[] {"ROD_silverwood"}).setConcealed().registerResearchItem();
		
		(new MiddleEarthResearchItem(
				"ROD_DWARF",
				"FREEPEOPLE",
				(new AspectList()).add(MiddleEarthAspects.IRONHILLS, 5).add(Aspect.MAGIC, 1),
				0, 0, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 10))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.ROD_DWARF.1")
				}
		).setParents(new String[] {"ROD_silverwood"}).setConcealed().registerResearchItem();
		
		(new MiddleEarthResearchItem(
				"ROD_GALADHRIM",
				"FREEPEOPLE",
				(new AspectList()).add(MiddleEarthAspects.LOTHLORIEN, 5).add(Aspect.MAGIC, 1),
				-2, -2, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 11))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.ROD_GALADHRIM.1")
				}
		).setParents(new String[] {"ROD_silverwood"}).setConcealed().registerResearchItem();
		
		(new MiddleEarthResearchItem(
				"ROD_FANGORN",
				"FREEPEOPLE",
				(new AspectList()).add(MiddleEarthAspects.FANGORN, 5).add(Aspect.MAGIC, 1),
				-2, 0, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 14))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.ROD_FANGORN.1")
				}
		).setParents(new String[] {"ROD_silverwood"}).setConcealed().registerResearchItem();
		
		(new MiddleEarthResearchItem(
				"ROD_ROHAN",
				"FREEPEOPLE",
				(new AspectList()).add(MiddleEarthAspects.ROHAN, 5).add(Aspect.MAGIC, 1),
				-3, -3, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 15))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.ROD_ROHAN.1")
				}
		).setParents(new String[] {"ROD_silverwood"}).setConcealed().registerResearchItem();
		
		(new MiddleEarthResearchItem(
				"ROD_DORWINION",
				"FREEPEOPLE",
				(new AspectList()).add(MiddleEarthAspects.DORWINION, 5).add(Aspect.MAGIC, 1),
				-3, 1, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 17))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.ROD_DORWINION.1")
				}
		).setParents(new String[] {"ROD_silverwood"}).setConcealed().registerResearchItem();
		
		(new MiddleEarthResearchItem(
				"ROD_TAUREDAIN",
				"FREEPEOPLE",
				(new AspectList()).add(MiddleEarthAspects.TAUREDAIN, 5).add(Aspect.MAGIC, 1),
				-4, -2, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 21))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.ROD_TAUREDAIN.1")
				}
		).setParents(new String[] {"ROD_silverwood"}).setConcealed().registerResearchItem();
	}
	
	public static void addSauron()
	{
		(new MiddleEarthResearchItem(
				"ROD_GUNDABAD",
				"SAURON",
				(new AspectList()).add(MiddleEarthAspects.GUNDABAD, 5).add(Aspect.MAGIC, 1),
				-1, -1, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 5))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.ROD_GUNDABAD.1")
				}
		).setParents(new String[] {"ROD_silverwood"}).setConcealed().registerResearchItem();
		
		(new MiddleEarthResearchItem(
				"ROD_ANGMAR",
				"SAURON",
				(new AspectList()).add(MiddleEarthAspects.ANGMAR, 5).add(Aspect.MAGIC, 1),
				0, -2, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 6))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.ROD_ANGMAR.1")
				}
		).setParents(new String[] {"ROD_silverwood"}).setConcealed().registerResearchItem();
		
		(new MiddleEarthResearchItem(
				"ROD_DOL_GULDUR",
				"SAURON",
				(new AspectList()).add(MiddleEarthAspects.DOLGULDUR, 5).add(Aspect.MAGIC, 1),
				1, -3, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 8))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.ROD_DOL_GULDUR.1")
				}
		).setParents(new String[] {"ROD_silverwood"}).setConcealed().registerResearchItem();
		
		(new MiddleEarthResearchItem(
				"ROD_DUNLAND",
				"SAURON",
				(new AspectList()).add(MiddleEarthAspects.DUNLAND, 5).add(Aspect.MAGIC, 1),
				2, -2, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 12))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.ROD_DUNLAND.1")
				}
		).setParents(new String[] {"ROD_silverwood"}).setConcealed().registerResearchItem();
		
		(new MiddleEarthResearchItem(
				"ROD_URUK_HAI",
				"SAURON",
				(new AspectList()).add(MiddleEarthAspects.ISENGARD, 5).add(Aspect.MAGIC, 1),
				3, -1, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 13))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.ROD_URUK_HAI.1")
				}
		).setParents(new String[] {"ROD_silverwood"}).setConcealed().registerResearchItem();
		
		(new MiddleEarthResearchItem(
				"ROD_MORDOR",
				"SAURON",
				(new AspectList()).add(MiddleEarthAspects.MORDOR, 5).add(Aspect.MAGIC, 1),
				2, 0, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 16))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.ROD_MORDOR.1")
				}
		).setParents(new String[] {"ROD_silverwood"}).setConcealed().registerResearchItem();
		
		(new MiddleEarthResearchItem(
				"ROD_RHUN",
				"SAURON",
				(new AspectList()).add(MiddleEarthAspects.RHUDEL, 5).add(Aspect.MAGIC, 1),
				1, 1, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 18))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.ROD_RHUN.1")
				}
		).setParents(new String[] {"ROD_silverwood"}).setConcealed().registerResearchItem();
		
		(new MiddleEarthResearchItem(
				"ROD_NEAR_HARAD",
				"SAURON",
				(new AspectList()).add(MiddleEarthAspects.NEARHARAD, 5).add(Aspect.MAGIC, 1),
				0, 0, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 19))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.ROD_NEAR_HARAD.1")
				}
		).setParents(new String[] {"ROD_silverwood"}).setConcealed().registerResearchItem();
		
		(new MiddleEarthResearchItem(
				"ROD_MOREDAIN",
				"SAURON",
				(new AspectList()).add(MiddleEarthAspects.MOREDAIN, 5).add(Aspect.MAGIC, 1),
				-3, -1, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 20))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.ROD_MOREDAIN.1")
				}
		).setParents(new String[] {"ROD_silverwood"}).setConcealed().registerResearchItem();
		
		(new MiddleEarthResearchItem(
				"ROD_HALF_TROLL",
				"SAURON",
				(new AspectList()).add(MiddleEarthAspects.HALFTROLLS, 5).add(Aspect.MAGIC, 1),
				-3, -1, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 22))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.ROD_HALF_TROLL.1")
				}
		).setParents(new String[] {"ROD_silverwood"}).setConcealed().registerResearchItem();
	}

}
