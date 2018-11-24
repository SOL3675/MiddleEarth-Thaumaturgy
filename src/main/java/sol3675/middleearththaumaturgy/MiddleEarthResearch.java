package sol3675.middleearththaumaturgy;

import java.util.HashMap;

import cpw.mods.fml.common.Loader;
import lotr.common.LOTRMod;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import sol3675.middleearththaumaturgy.MiddleEarthResearchItem;
import sol3675.middleearththaumaturgy.aspect.MiddleEarthAspects;
import sol3675.middleearththaumaturgy.common.blocks.MiddleEarthThaumaturgyBlocks;
import sol3675.middleearththaumaturgy.common.items.MiddleEarthThaumaturgyItems;
import sol3675.middleearththaumaturgy.config.MeetCfg;
import sol3675.middleearththaumaturgy.references.LibMisc;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.CrucibleRecipe;
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

		addBasicMaterials();
		addJars();
		addCommon();
		addFreePeople();
		addSauron();

		if(Loader.isModLoaded("Automagy") && MeetCfg.automagy)
		{
			(new MiddleEarthResearchItem(
					"BOOKSHELFINVENTARIUM",
					"MIDDLEEARTH",
					(new AspectList()).add(Aspect.ORDER, 5).add(MiddleEarthAspects.IMMORTAL, 1).add(Aspect.EARTH, 11),
					-1,-4, 3,
					new ItemStack(MiddleEarthThaumaturgyBlocks.bookshelfInventarium, 1, 0))
					)
			.setPages(new ResearchPage[] {
					new ResearchPage("middleearththaumaturgy.research_page.BOOKSHELFINVENTARIUM.1"),
					new ResearchPage((IArcaneRecipe) recipes.get("BookshelfInventarium"))
					}
			).setParents(new String[] {"ENCHANTEDPAPER"}).registerResearchItem();
		}

	}

	private static void addBasicMaterials() {
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

		(new MiddleEarthResearchItem
			(
				"CAP_blackuruksteel",
				"SAURON",
				(new AspectList()).add(MiddleEarthAspects.MORDOR, 3),
				-12, -7, 0,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCap, 1, 7)
			)
		)
		.setPages(new ResearchPage[]
		{
			new ResearchPage(LibMisc.MODFULLID + ".research_page." + "CAP_blackuruksteel.1"),
			new ResearchPage(LibMisc.MODFULLID + ".research_page." + "CAP_blackuruksteel.2")
		})
		.setSecondary()
		.setParents(new String[] {"GULDURILBLACKURUK"}).registerResearchItem();


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

		(new MiddleEarthResearchItem
				(
					"CAP_bluedwarvensteel",
					"FREEPEOPLE",
					(new AspectList()).add(MiddleEarthAspects.BLUEMOUNTAINS, 3),
					-12, -7, 0,
					new ItemStack(MiddleEarthThaumaturgyItems.wandCap, 1, 6)
				)
			)
			.setPages(new ResearchPage[]
			{
				new ResearchPage(LibMisc.MODFULLID + ".research_page." + "CAP_bluedwarvensteel.1"),
				new ResearchPage(LibMisc.MODFULLID + ".research_page." + "CAP_bluedwarvensteel.2")
			})
		.setSecondary()
		.setParents(new String[] {"ITHILDINBLUEDWARVEN"}).registerResearchItem();

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

		(new MiddleEarthResearchItem
				(
					"CAP_dwarvensteel",
					"FREEPEOPLE",
					(new AspectList()).add(MiddleEarthAspects.IRONHILLS, 3),
					-11, -7, 0,
					new ItemStack(MiddleEarthThaumaturgyItems.wandCap, 1, 2)
				)
			)
			.setPages(new ResearchPage[]
			{
				new ResearchPage(LibMisc.MODFULLID + ".research_page." + "CAP_dwarvensteel.1"),
				new ResearchPage(LibMisc.MODFULLID + ".research_page." + "CAP_dwarvensteel.2")
			})
			.setSecondary()
		.setParents(new String[] {"ITHILDINDWARVEN"}).registerResearchItem();

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

		(new MiddleEarthResearchItem
				(
					"CAP_elvensteel",
					"FREEPEOPLE",
					(new AspectList()).add(MiddleEarthAspects.ELVES, 3),
					-10, -7, 0,
					new ItemStack(MiddleEarthThaumaturgyItems.wandCap, 1, 8)
				)
			)
			.setPages(new ResearchPage[]
			{
				new ResearchPage(LibMisc.MODFULLID + ".research_page." + "CAP_elvensteel.1"),
				new ResearchPage(LibMisc.MODFULLID + ".research_page." + "CAP_elvensteel.2")
			})
			.setSecondary()
		.setParents(new String[] {"EDHELMIRELVEN"}).registerResearchItem();

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

		(new MiddleEarthResearchItem
				(
					"CAP_galvorn",
					"FREEPEOPLE",
					(new AspectList()).add(MiddleEarthAspects.ELVES, 3).add(MiddleEarthAspects.DWARVES, 3),
					-9, -7, 0,
					new ItemStack(MiddleEarthThaumaturgyItems.wandCap, 1, 3)
				)
			)
			.setPages(new ResearchPage[]
			{
				new ResearchPage(LibMisc.MODFULLID + ".research_page." + "CAP_galvorn.1"),
				new ResearchPage(LibMisc.MODFULLID + ".research_page." + "CAP_galvorn.2")
			})
			.setSecondary()
		.setParents(new String[] {"DAEDELOSGALVORN"}).registerResearchItem();

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
				"CAP_mithril",
				"MIDDLEEARTH",
				(new AspectList()).add(Aspect.CRYSTAL, 5).add(Aspect.MAGIC, 1).add(Aspect.METAL, 11),
				-12,-7, 3,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCap, 1, 0))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.CAP_mithril.1"),
				new ResearchPage((InfusionRecipe) recipes.get("CapMithril"))
				}
		)
		.setSecondary()
		.setParents(new String[] {"STAREDMITHRIL"}).registerResearchItem();

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

		(new MiddleEarthResearchItem
				(
					"CAP_morgulsteel",
					"SAURON",
					(new AspectList()).add(MiddleEarthAspects.MORDOR, 3).add(MiddleEarthAspects.NAZGULS, 3),
					-11, -7, 0,
					new ItemStack(MiddleEarthThaumaturgyItems.wandCap, 1, 5)
				)
			)
			.setPages(new ResearchPage[]
			{
				new ResearchPage(LibMisc.MODFULLID + ".research_page." + "CAP_morgulsteel.1"),
				new ResearchPage(LibMisc.MODFULLID + ".research_page." + "CAP_morgulsteel.2")
			})
			.setSecondary()
		.setParents(new String[] {"DAEDELOSMORGUL"}).registerResearchItem();

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

		(new MiddleEarthResearchItem
				(
					"CAP_orcsteel",
					"SAURON",
					(new AspectList()).add(MiddleEarthAspects.ORCS, 3),
					-10, -7, 0,
					new ItemStack(MiddleEarthThaumaturgyItems.wandCap, 1, 1)
				)
			)
			.setPages(new ResearchPage[]
			{
				new ResearchPage(LibMisc.MODFULLID + ".research_page." + "CAP_orcsteel.1"),
				new ResearchPage(LibMisc.MODFULLID + ".research_page." + "CAP_orcsteel.2")
			})
			.setSecondary()
		.setParents(new String[] {"DURNAURORC"}).registerResearchItem();

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

		(new MiddleEarthResearchItem
				(
					"CAP_uruksteel",
					"SAURON",
					(new AspectList()).add(MiddleEarthAspects.ISENGARD, 3),
					-9, -7, 0,
					new ItemStack(MiddleEarthThaumaturgyItems.wandCap, 1, 4)
				)
			)
			.setPages(new ResearchPage[]
			{
				new ResearchPage(LibMisc.MODFULLID + ".research_page." + "CAP_uruksteel.1"),
				new ResearchPage(LibMisc.MODFULLID + ".research_page." + "CAP_uruksteel.2")
			})
			.setSecondary()
		.setParents(new String[] {"GULDURILURUK"}).registerResearchItem();

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

		(new MiddleEarthResearchItem
				(
					"CAP_gildediron",
					"MIDDLEEARTH",
					(new AspectList()).add(MiddleEarthAspects.RHUDEL, 3),
					-11, -7, 0,
					new ItemStack(MiddleEarthThaumaturgyItems.wandCap, 1, 9)
				)
			)
			.setPages(new ResearchPage[]
			{
				new ResearchPage(LibMisc.MODFULLID + ".research_page." + "CAP_gildediron.1"),
				new ResearchPage(LibMisc.MODFULLID + ".research_page." + "CAP_gildediron.2")
			})
			.setSecondary()
		.setParents(new String[] {"BRIGHTENGILDEDIRON"}).registerResearchItem();
	}

	private static void addJars() {

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

	private static void addCommon() {

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
				"HANDHELDCRAFTER",
				"MIDDLEEARTH",
				(new AspectList()).add(Aspect.CRAFT, 5).add(MiddleEarthAspects.MEN, 1).add(MiddleEarthAspects.ELVES, 11).add(MiddleEarthAspects.DWARVES, 3).add(MiddleEarthAspects.ORCS, 8),
				-8,-1, 3,
				new ItemStack(MiddleEarthThaumaturgyItems.factionCrafter, 1, 0))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.HANDHELDCRAFTER.1"),
				new ResearchPage((InfusionRecipe) recipes.get("HandheldCrafter"))
				}
		).setParents(new String[] {"INFUSION"}).registerResearchItem();

		(new MiddleEarthResearchItem(
				"GEMTRANSMETT",
				"MIDDLEEARTH",
				(new AspectList()).add(Aspect.CRYSTAL, 8).add(MiddleEarthAspects.IMMORTAL, 2).add(Aspect.EXCHANGE, 8),
				-5,-1, 2,
				new ItemStack(LOTRMod.diamond))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.GEMTRANSMETT.1"),
				new ResearchPage((CrucibleRecipe) recipes.get("GemTransTopaz")),
				new ResearchPage((CrucibleRecipe) recipes.get("GemTransAmethyst")),
				new ResearchPage((CrucibleRecipe) recipes.get("GemTransSapphire")),
				new ResearchPage((CrucibleRecipe) recipes.get("GemTransRuby")),
				new ResearchPage((CrucibleRecipe) recipes.get("GemTransAmber")),
				new ResearchPage((CrucibleRecipe) recipes.get("GemTransDiamond")),
				new ResearchPage((CrucibleRecipe) recipes.get("GemTransPearl")),
				new ResearchPage((CrucibleRecipe) recipes.get("GemTransCoral")),
				new ResearchPage((CrucibleRecipe) recipes.get("GemTransOpal")),
				new ResearchPage((CrucibleRecipe) recipes.get("GemTransEmerald"))
				}
		).setSecondary()
		.setParents(new String[] {"ALCHEMICALDUPLICATION"}).registerResearchItem();

		(new MiddleEarthResearchItem(
				"EDHELMIRTRANS",
				"FREEPEOPLE",
				(new AspectList()).add(Aspect.CRYSTAL, 4).add(MiddleEarthAspects.ELVES, 2).add(Aspect.LIGHT, 2),
				-7,-4, 2,
				new ItemStack(LOTRMod.quenditeCrystal))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.EDHELMIRTRANS.1"),
				new ResearchPage((CrucibleRecipe) recipes.get("EdhelmirTrans"))
				}
		).setSecondary()
		.setParents(new String[] {"ALCHEMICALDUPLICATION"}).registerResearchItem();

		(new MiddleEarthResearchItem(
				"GULDURILTRANS",
				"SAURON",
				(new AspectList()).add(Aspect.CRYSTAL, 4).add(MiddleEarthAspects.ORCS, 2).add(MiddleEarthAspects.NAZGULS, 2),
				-7,-4, 2,
				new ItemStack(LOTRMod.guldurilCrystal))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.GULDURILTRANS.1"),
				new ResearchPage((CrucibleRecipe) recipes.get("GuldurilTrans"))
				}
		).setSecondary()
		.setParents(new String[] {"ALCHEMICALDUPLICATION"}).registerResearchItem();

	}

	private static void addFreePeople() {

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
				"STAFF_GONDOR",
				"FREEPEOPLE",
				(new AspectList()).add(MiddleEarthAspects.GONDOR, 5).add(Aspect.AURA, 2).add(MiddleEarthAspects.MEN, 3),
				-1, -3, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.staffCore, 1, 0))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.STAFF_GONDOR.1"),
				new ResearchPage((IArcaneRecipe) recipes.get("StaffGONDOR"))
				}
		).setSecondary()
		.setParents(new String[] {"ROD_GONDOR"}).setConcealed().registerResearchItem();

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
				"STAFF_HOBBIT",
				"FREEPEOPLE",
				(new AspectList()).add(MiddleEarthAspects.SHIRE, 5).add(Aspect.AURA, 2).add(MiddleEarthAspects.HOBBITS, 3),
				0, -4, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.staffCore, 1, 1))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.STAFF_HOBBIT.1"),
				new ResearchPage((IArcaneRecipe) recipes.get("StaffHOBBIT"))
				}
		).setSecondary()
		.setParents(new String[] {"ROD_HOBBIT"}).setConcealed().registerResearchItem();

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
				"STAFF_RANGER_NORTH",
				"FREEPEOPLE",
				(new AspectList()).add(MiddleEarthAspects.DUNEDAIN, 5).add(Aspect.AURA, 2).add(MiddleEarthAspects.MEN, 3),
				1, -5, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.staffCore, 1, 2))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.STAFF_RANGER_NORTH.1"),
				new ResearchPage((IArcaneRecipe) recipes.get("StaffRANGER_NORTH"))
				}
		).setSecondary()
		.setParents(new String[] {"ROD_RANGER_NORTH"}).setConcealed().registerResearchItem();

		(new MiddleEarthResearchItem(
				"ROD_BLUE_MOUNTAINS",
				"FREEPEOPLE",
				(new AspectList()).add(MiddleEarthAspects.BLUEMOUNTAINS, 5).add(Aspect.MAGIC, 1),
				2, -2, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 3))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.ROD_BLUE_MOUNTAINS.1"),
				new ResearchPage((InfusionRecipe) recipes.get("RodBLUE_MOUNTAINS"))
				}
		).setParents(new String[] {"ROD_silverwood"}).setConcealed().registerResearchItem();

		(new MiddleEarthResearchItem(
				"STAFF_BLUE_MOUNTAINS",
				"FREEPEOPLE",
				(new AspectList()).add(MiddleEarthAspects.BLUEMOUNTAINS, 5).add(Aspect.AURA, 2).add(MiddleEarthAspects.DWARVES, 3),
				2, -4, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.staffCore, 1, 3))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.STAFF_BLUE_MOUNTAINS.1"),
				new ResearchPage((IArcaneRecipe) recipes.get("StaffBLUE_MOUNTAINS"))
				}
		).setSecondary()
		.setParents(new String[] {"ROD_BLUE_MOUNTAINS"}).setConcealed().registerResearchItem();

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
				"STAFF_HIGH_ELF",
				"FREEPEOPLE",
				(new AspectList()).add(MiddleEarthAspects.LINDON, 5).add(Aspect.AURA, 2).add(MiddleEarthAspects.ELVES, 3),
				3, -3, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.staffCore, 1, 4))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.STAFF_HIGH_ELF.1"),
				new ResearchPage((IArcaneRecipe) recipes.get("StaffHIGH_ELF"))
				}
		).setSecondary()
		.setParents(new String[] {"ROD_HIGH_ELF"}).setConcealed().registerResearchItem();

		(new MiddleEarthResearchItem(
				"ROD_WOOD_ELF",
				"FREEPEOPLE",
				(new AspectList()).add(MiddleEarthAspects.WOODLAND, 5).add(Aspect.MAGIC, 1),
				2, 0, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 7))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.ROD_WOOD_ELF.1"),
				new ResearchPage((InfusionRecipe) recipes.get("RodWOOD_ELF"))
				}
		).setParents(new String[] {"ROD_silverwood"}).setConcealed().registerResearchItem();

		(new MiddleEarthResearchItem(
				"STAFF_WOOD_ELF",
				"FREEPEOPLE",
				(new AspectList()).add(MiddleEarthAspects.WOODLAND, 5).add(Aspect.AURA, 2).add(MiddleEarthAspects.ELVES, 3),
				2, 2, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.staffCore, 1, 7))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.STAFF_WOOD_ELF.1"),
				new ResearchPage((IArcaneRecipe) recipes.get("StaffWOOD_ELF"))
				}
		).setSecondary()
		.setParents(new String[] {"ROD_WOOD_ELF"}).setConcealed().registerResearchItem();

		(new MiddleEarthResearchItem(
				"ROD_DALE",
				"FREEPEOPLE",
				(new AspectList()).add(MiddleEarthAspects.DALE, 5).add(Aspect.MAGIC, 1),
				1, 1, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 9))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.ROD_DALE.1"),
				new ResearchPage((InfusionRecipe) recipes.get("RodDALE"))
				}
		).setParents(new String[] {"ROD_silverwood"}).setConcealed().registerResearchItem();

		(new MiddleEarthResearchItem(
				"STAFF_DALE",
				"FREEPEOPLE",
				(new AspectList()).add(MiddleEarthAspects.DALE, 5).add(Aspect.AURA, 2).add(MiddleEarthAspects.MEN, 3),
				1, 3, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.staffCore, 1, 9))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.STAFF_DALE.1"),
				new ResearchPage((IArcaneRecipe) recipes.get("StaffDALE"))
				}
		).setSecondary()
		.setParents(new String[] {"ROD_DALE"}).setConcealed().registerResearchItem();

		(new MiddleEarthResearchItem(
				"ROD_DWARF",
				"FREEPEOPLE",
				(new AspectList()).add(MiddleEarthAspects.IRONHILLS, 5).add(Aspect.MAGIC, 1),
				0, 0, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 10))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.ROD_DWARF.1"),
				new ResearchPage((InfusionRecipe) recipes.get("RodDWARF"))
				}
		).setParents(new String[] {"ROD_silverwood"}).setConcealed().registerResearchItem();

		(new MiddleEarthResearchItem(
				"STAFF_DWARF",
				"FREEPEOPLE",
				(new AspectList()).add(MiddleEarthAspects.IRONHILLS, 5).add(Aspect.AURA, 2).add(MiddleEarthAspects.DWARVES, 3),
				0, 2, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.staffCore, 1, 10))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.STAFF_DWARF.1"),
				new ResearchPage((IArcaneRecipe) recipes.get("StaffDWARF"))
				}
		).setSecondary()
		.setParents(new String[] {"ROD_DWARF"}).setConcealed().registerResearchItem();

		(new MiddleEarthResearchItem(
				"ROD_GALADHRIM",
				"FREEPEOPLE",
				(new AspectList()).add(MiddleEarthAspects.LOTHLORIEN, 5).add(Aspect.MAGIC, 1),
				-2, -2, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 11))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.ROD_GALADHRIM.1"),
				new ResearchPage((InfusionRecipe) recipes.get("RodGALADHRIM"))
				}
		).setParents(new String[] {"ROD_silverwood"}).setConcealed().registerResearchItem();

		(new MiddleEarthResearchItem(
				"STAFF_GALADHRIM",
				"FREEPEOPLE",
				(new AspectList()).add(MiddleEarthAspects.LOTHLORIEN, 5).add(Aspect.AURA, 2).add(MiddleEarthAspects.ELVES, 3),
				-2, -4, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.staffCore, 1, 11))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.STAFF_GALADHRIM.1"),
				new ResearchPage((IArcaneRecipe) recipes.get("StaffGALADHRIM"))
				}
		).setSecondary()
		.setParents(new String[] {"ROD_GALADHRIM"}).setConcealed().registerResearchItem();

		(new MiddleEarthResearchItem(
				"ROD_FANGORN",
				"FREEPEOPLE",
				(new AspectList()).add(MiddleEarthAspects.FANGORN, 5).add(Aspect.MAGIC, 1),
				-2, 0, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 14))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.ROD_FANGORN.1"),
				new ResearchPage((InfusionRecipe) recipes.get("RodFANGORN"))
				}
		).setParents(new String[] {"ROD_silverwood"}).setConcealed().registerResearchItem();

		(new MiddleEarthResearchItem(
				"STAFF_FANGORN",
				"FREEPEOPLE",
				(new AspectList()).add(MiddleEarthAspects.FANGORN, 5).add(Aspect.AURA, 2).add(MiddleEarthAspects.ENTS, 3),
				-2, 2, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.staffCore, 1, 14))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.STAFF_FANGORN.1"),
				new ResearchPage((IArcaneRecipe) recipes.get("StaffFANGORN"))
				}
		).setSecondary()
		.setParents(new String[] {"ROD_FANGORN"}).setConcealed().registerResearchItem();

		(new MiddleEarthResearchItem(
				"ROD_ROHAN",
				"FREEPEOPLE",
				(new AspectList()).add(MiddleEarthAspects.ROHAN, 5).add(Aspect.MAGIC, 1),
				-3, -3, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 15))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.ROD_ROHAN.1"),
				new ResearchPage((InfusionRecipe) recipes.get("RodROHAN"))
				}
		).setParents(new String[] {"ROD_silverwood"}).setConcealed().registerResearchItem();

		(new MiddleEarthResearchItem(
				"STAFF_ROHAN",
				"FREEPEOPLE",
				(new AspectList()).add(MiddleEarthAspects.ROHAN, 5).add(Aspect.AURA, 2).add(MiddleEarthAspects.MEN, 3),
				-3, -5, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.staffCore, 1, 15))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.STAFF_ROHAN.1"),
				new ResearchPage((IArcaneRecipe) recipes.get("StaffROHAN"))
				}
		).setSecondary()
		.setParents(new String[] {"ROD_ROHAN"}).setConcealed().registerResearchItem();

		(new MiddleEarthResearchItem(
				"ROD_DORWINION",
				"FREEPEOPLE",
				(new AspectList()).add(MiddleEarthAspects.DORWINION, 5).add(Aspect.MAGIC, 1),
				-3, 1, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 17))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.ROD_DORWINION.1"),
				new ResearchPage((InfusionRecipe) recipes.get("RodDORWINION"))
				}
		).setParents(new String[] {"ROD_silverwood"}).setConcealed().registerResearchItem();

		(new MiddleEarthResearchItem(
				"STAFF_DORWINION",
				"FREEPEOPLE",
				(new AspectList()).add(MiddleEarthAspects.DORWINION, 5).add(Aspect.AURA, 2).add(MiddleEarthAspects.MEN, 3),
				-3, 3, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.staffCore, 1, 17))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.STAFF_DORWINION.1"),
				new ResearchPage((IArcaneRecipe) recipes.get("StaffDORWINION"))
				}
		).setSecondary()
		.setParents(new String[] {"ROD_DORWINION"}).setConcealed().registerResearchItem();

		(new MiddleEarthResearchItem(
				"ROD_TAUREDAIN",
				"FREEPEOPLE",
				(new AspectList()).add(MiddleEarthAspects.TAUREDAIN, 5).add(Aspect.MAGIC, 1),
				-4, -2, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 21))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.ROD_TAUREDAIN.1"),
				new ResearchPage((InfusionRecipe) recipes.get("RodTAUREDAIN"))
				}
		).setParents(new String[] {"ROD_silverwood"}).setConcealed().registerResearchItem();

		(new MiddleEarthResearchItem(
				"STAFF_TAUREDAIN",
				"FREEPEOPLE",
				(new AspectList()).add(MiddleEarthAspects.TAUREDAIN, 5).add(Aspect.AURA, 2).add(MiddleEarthAspects.MEN, 3),
				-4, -4, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.staffCore, 1, 21))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.STAFF_TAUREDAIN.1"),
				new ResearchPage((IArcaneRecipe) recipes.get("StaffTAUREDAIN"))
				}
		).setSecondary()
		.setParents(new String[] {"ROD_TAUREDAIN"}).setConcealed().registerResearchItem();
	}

	private static void addSauron()
	{
		(new MiddleEarthResearchItem(
				"ROD_GUNDABAD",
				"SAURON",
				(new AspectList()).add(MiddleEarthAspects.GUNDABAD, 5).add(Aspect.MAGIC, 1),
				-1, -1, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 5))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.ROD_GUNDABAD.1"),
				new ResearchPage((InfusionRecipe) recipes.get("RodGUNDABAD"))
				}
		).setParents(new String[] {"ROD_silverwood"}).setConcealed().registerResearchItem();

		(new MiddleEarthResearchItem(
				"STAFF_GUNDABAD",
				"SAURON",
				(new AspectList()).add(MiddleEarthAspects.GUNDABAD, 5).add(Aspect.AURA, 2).add(MiddleEarthAspects.ORCS, 3),
				-1, -3, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.staffCore, 1, 5))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.STAFF_GUNDABAD.1"),
				new ResearchPage((IArcaneRecipe) recipes.get("StaffGUNDABAD"))
				}
		).setSecondary()
		.setParents(new String[] {"ROD_GUNDABAD"}).setConcealed().registerResearchItem();

		(new MiddleEarthResearchItem(
				"ROD_ANGMAR",
				"SAURON",
				(new AspectList()).add(MiddleEarthAspects.ANGMAR, 5).add(Aspect.MAGIC, 1),
				0, -2, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 6))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.ROD_ANGMAR.1"),
				new ResearchPage((InfusionRecipe) recipes.get("RodANGMAR"))
				}
		).setParents(new String[] {"ROD_silverwood"}).setConcealed().registerResearchItem();

		(new MiddleEarthResearchItem(
				"STAFF_ANGMAR",
				"SAURON",
				(new AspectList()).add(MiddleEarthAspects.ANGMAR, 5).add(Aspect.AURA, 2).add(MiddleEarthAspects.ORCS, 3),
				0, -4, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.staffCore, 1, 6))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.STAFF_ANGMAR.1"),
				new ResearchPage((IArcaneRecipe) recipes.get("StaffANGMAR"))
				}
		).setSecondary()
		.setParents(new String[] {"ROD_ANGMAR"}).setConcealed().registerResearchItem();

		(new MiddleEarthResearchItem(
				"ROD_DOL_GULDUR",
				"SAURON",
				(new AspectList()).add(MiddleEarthAspects.DOLGULDUR, 5).add(Aspect.MAGIC, 1),
				1, -3, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 8))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.ROD_DOL_GULDUR.1"),
				new ResearchPage((InfusionRecipe) recipes.get("RodDOL_GULDUR"))
				}
		).setParents(new String[] {"ROD_silverwood"}).setConcealed().registerResearchItem();

		(new MiddleEarthResearchItem(
				"STAFF_DOL_GULDUR",
				"SAURON",
				(new AspectList()).add(MiddleEarthAspects.DOLGULDUR, 5).add(Aspect.AURA, 2).add(MiddleEarthAspects.ORCS, 3),
				1, -5, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.staffCore, 1, 8))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.STAFF_DOL_GULDUR.1"),
				new ResearchPage((IArcaneRecipe) recipes.get("StaffDOL_GULDUR"))
				}
		).setSecondary()
		.setParents(new String[] {"ROD_DOL_GULDUR"}).setConcealed().registerResearchItem();

		(new MiddleEarthResearchItem(
				"ROD_DUNLAND",
				"SAURON",
				(new AspectList()).add(MiddleEarthAspects.DUNLAND, 5).add(Aspect.MAGIC, 1),
				2, -2, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 12))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.ROD_DUNLAND.1"),
				new ResearchPage((InfusionRecipe) recipes.get("RodDUNLAND"))
				}
		).setParents(new String[] {"ROD_silverwood"}).setConcealed().registerResearchItem();

		(new MiddleEarthResearchItem(
				"STAFF_DUNLAND",
				"SAURON",
				(new AspectList()).add(MiddleEarthAspects.DUNLAND, 5).add(Aspect.AURA, 2).add(MiddleEarthAspects.MEN, 3),
				2, -4, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.staffCore, 1, 12))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.STAFF_DUNLAND.1"),
				new ResearchPage((IArcaneRecipe) recipes.get("StaffDUNLAND"))
				}
		).setSecondary()
		.setParents(new String[] {"ROD_DUNLAND"}).setConcealed().registerResearchItem();

		(new MiddleEarthResearchItem(
				"ROD_URUK_HAI",
				"SAURON",
				(new AspectList()).add(MiddleEarthAspects.ISENGARD, 5).add(Aspect.MAGIC, 1),
				3, -1, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 13))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.ROD_URUK_HAI.1"),
				new ResearchPage((InfusionRecipe) recipes.get("RodURUK_HAI"))
				}
		).setParents(new String[] {"ROD_silverwood"}).setConcealed().registerResearchItem();

		(new MiddleEarthResearchItem(
				"STAFF_URUK_HAI",
				"SAURON",
				(new AspectList()).add(MiddleEarthAspects.ISENGARD, 5).add(Aspect.AURA, 2).add(MiddleEarthAspects.URUKS, 3),
				3, -3, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.staffCore, 1, 13))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.STAFF_URUK_HAI.1"),
				new ResearchPage((IArcaneRecipe) recipes.get("StaffURUK_HAI"))
				}
		).setSecondary()
		.setParents(new String[] {"ROD_URUK_HAI"}).setConcealed().registerResearchItem();

		(new MiddleEarthResearchItem(
				"ROD_MORDOR",
				"SAURON",
				(new AspectList()).add(MiddleEarthAspects.MORDOR, 5).add(Aspect.MAGIC, 1),
				2, 0, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 16))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.ROD_MORDOR.1"),
				new ResearchPage((InfusionRecipe) recipes.get("RodMORDOR"))
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
				new ResearchPage("middleearththaumaturgy.research_page.ROD_RHUN.1"),
				new ResearchPage((InfusionRecipe) recipes.get("RodRHUN"))
				}
		).setParents(new String[] {"ROD_silverwood"}).setConcealed().registerResearchItem();

		(new MiddleEarthResearchItem(
				"STAFF_RHUN",
				"SAURON",
				(new AspectList()).add(MiddleEarthAspects.RHUDEL, 5).add(Aspect.AURA, 2).add(MiddleEarthAspects.MEN, 3),
				1, 3, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.staffCore, 1, 18))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.STAFF_RHUN.1"),
				new ResearchPage((IArcaneRecipe) recipes.get("StaffRHUN"))
				}
		).setSecondary()
		.setParents(new String[] {"ROD_RHUN"}).setConcealed().registerResearchItem();

		(new MiddleEarthResearchItem(
				"ROD_NEAR_HARAD",
				"SAURON",
				(new AspectList()).add(MiddleEarthAspects.NEARHARAD, 5).add(Aspect.MAGIC, 1),
				0, 0, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 19))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.ROD_NEAR_HARAD.1"),
				new ResearchPage((InfusionRecipe) recipes.get("RodNEAR_HARAD"))
				}
		).setParents(new String[] {"ROD_silverwood"}).setConcealed().registerResearchItem();

		(new MiddleEarthResearchItem(
				"STAFF_NEAR_HARAD",
				"SAURON",
				(new AspectList()).add(MiddleEarthAspects.NEARHARAD, 5).add(Aspect.AURA, 2).add(MiddleEarthAspects.MEN, 3),
				0, 2, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.staffCore, 1, 19))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.STAFF_NEAR_HARAD.1"),
				new ResearchPage((IArcaneRecipe) recipes.get("StaffNEAR_HARAD"))
				}
		).setSecondary()
		.setParents(new String[] {"ROD_NEAR_HARAD"}).setConcealed().registerResearchItem();

		(new MiddleEarthResearchItem(
				"ROD_MOREDAIN",
				"SAURON",
				(new AspectList()).add(MiddleEarthAspects.MOREDAIN, 5).add(Aspect.MAGIC, 1),
				-3, -1, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 20))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.ROD_MOREDAIN.1"),
				new ResearchPage((InfusionRecipe) recipes.get("RodMOREDAIN"))
				}
		).setParents(new String[] {"ROD_silverwood"}).setConcealed().registerResearchItem();

		(new MiddleEarthResearchItem(
				"STAFF_MOREDAIN",
				"SAURON",
				(new AspectList()).add(MiddleEarthAspects.MOREDAIN, 5).add(Aspect.AURA, 2).add(MiddleEarthAspects.MEN, 3),
				-3, 1, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.staffCore, 1, 20))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.STAFF_MOREDAIN.1"),
				new ResearchPage((IArcaneRecipe) recipes.get("StaffMOREDAIN"))
				}
		).setSecondary()
		.setParents(new String[] {"ROD_MOREDAIN"}).setConcealed().registerResearchItem();

		(new MiddleEarthResearchItem(
				"ROD_HALF_TROLL",
				"SAURON",
				(new AspectList()).add(MiddleEarthAspects.HALFTROLLS, 5).add(Aspect.MAGIC, 1),
				5, -1, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.wandCore, 1, 22))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.ROD_HALF_TROLL.1"),
				new ResearchPage((InfusionRecipe) recipes.get("RodHALF_TROLL"))
				}
		).setParents(new String[] {"ROD_silverwood"}).setConcealed().registerResearchItem();

		(new MiddleEarthResearchItem(
				"STAFF_HALF_TROLL",
				"SAURON",
				(new AspectList()).add(MiddleEarthAspects.HALFTROLLS, 5).add(Aspect.AURA, 2).add(MiddleEarthAspects.TROLLS, 3),
				5, -3, 2,
				new ItemStack(MiddleEarthThaumaturgyItems.staffCore, 1, 22))
				)
		.setPages(new ResearchPage[] {
				new ResearchPage("middleearththaumaturgy.research_page.STAFF_HALF_TROLL.1"),
				new ResearchPage((IArcaneRecipe) recipes.get("StaffHALF_TROLL"))
				}
		).setSecondary()
		.setParents(new String[] {"ROD_HALF_TROLL"}).setConcealed().registerResearchItem();
	}

}
