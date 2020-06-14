package sol3675.middleearththaumaturgy.references;

import lotr.common.LOTRMod;
import lotr.common.fac.LOTRFaction;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import sol3675.middleearththaumaturgy.aspect.MiddleEarthAspects;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.common.config.ConfigBlocks;

public class WandType {
	public final static String[] types = 
		{
			"GONDOR",
			"HOBBIT",
			"RANGER_NORTH",
			"BLUE_MOUNTAINS",
			"HIGH_ELF",
			"GUNDABAD",
			"ANGMAR",
			"WOOD_ELF",
			"DOL_GULDUR",
			"DALE",
			"DWARF",
			"GALADHRIM",
			"DUNLAND",
			"URUK_HAI",
			"FANGORN",
			"ROHAN",
			"MORDOR",
			"DORWINION",
			"RHUN",
			"NEAR_HARAD",
			"MOREDAIN",
			"TAUREDAIN",
			"HALF_TROLL",
			"BREE"
		};
	
	public final static LOTRFaction[] faction =
		{
				LOTRFaction.GONDOR,
				LOTRFaction.HOBBIT,
				LOTRFaction.RANGER_NORTH,
				LOTRFaction.BLUE_MOUNTAINS,
				LOTRFaction.HIGH_ELF,
				LOTRFaction.GUNDABAD,
				LOTRFaction.ANGMAR,
				LOTRFaction.WOOD_ELF,
				LOTRFaction.DOL_GULDUR,
				LOTRFaction.DALE,
				LOTRFaction.DURINS_FOLK,
				LOTRFaction.LOTHLORIEN,
				LOTRFaction.DUNLAND,
				LOTRFaction.ISENGARD,
				LOTRFaction.FANGORN,
				LOTRFaction.ROHAN,
				LOTRFaction.MORDOR,
				LOTRFaction.DORWINION,
				LOTRFaction.RHUDEL,
				LOTRFaction.NEAR_HARAD,
				LOTRFaction.MORWAITH,
				LOTRFaction.TAURETHRIM,
				LOTRFaction.HALF_TROLL,
				LOTRFaction.BREE
		};
	
	private static final String F = "FREEPEOPLE";
	private static final String S = "SAURON";
	
	public static final String[] category =
		{F, F, F, F, F, S, S, F, S, F, F, F, S, S, F, F, S, F, S, S, S, F, S, F};
	
	public final static String[] typesName = 
		{
			"gondor",
			"hobbit",
			"ranger_north",
			"blue_mountains",
			"high_elf",
			"gundabad",
			"angmar",
			"wood_elf",
			"dol_guldur",
			"dale",
			"dwarf",
			"galadhrim",
			"dunland",
			"uruk_hai",
			"fangorn",
			"rohan",
			"mordor",
			"dorwinion",
			"rhun",
			"near_harad",
			"moredain",
			"tauredain",
			"half_troll",
			"bree"
		};
	
	public static final Aspect[] aspect =
		{
				MiddleEarthAspects.GONDOR,
				MiddleEarthAspects.HOBBITS,
				MiddleEarthAspects.DUNEDAIN,
				MiddleEarthAspects.BLUEMOUNTAINS,
				MiddleEarthAspects.LINDON,
				MiddleEarthAspects.GUNDABAD,
				MiddleEarthAspects.ANGMAR,
				MiddleEarthAspects.WOODLAND,
				MiddleEarthAspects.DOLGULDUR,
				MiddleEarthAspects.DALE,
				MiddleEarthAspects.DWARVES,
				MiddleEarthAspects.LOTHLORIEN,
				MiddleEarthAspects.DUNLAND,
				MiddleEarthAspects.ISENGARD,
				MiddleEarthAspects.FANGORN,
				MiddleEarthAspects.ROHAN,
				MiddleEarthAspects.MORDOR,
				MiddleEarthAspects.DORWINION,
				MiddleEarthAspects.RHUDEL,
				MiddleEarthAspects.NEARHARAD,
				MiddleEarthAspects.MOREDAIN,
				MiddleEarthAspects.TAUREDAIN,
				MiddleEarthAspects.HALFTROLLS,
				MiddleEarthAspects.BREE
		};
	
	public static ItemStack[][] inputStack =
		{
				{new ItemStack(LOTRMod.bodyGondor), new ItemStack(Items.bone), new ItemStack(Items.bone), new ItemStack(LOTRMod.banner, 1, 0)},
				{new ItemStack(LOTRMod.hobbitPancake), new ItemStack(LOTRMod.hobbitBone), new ItemStack(LOTRMod.hobbitBone), new ItemStack(LOTRMod.banner, 1, 21)},
				{new ItemStack(LOTRMod.bodyRanger), new ItemStack(Items.bone), new ItemStack(Items.bone), new ItemStack(LOTRMod.banner, 1, 12)},
				{new ItemStack(LOTRMod.bodyBlueDwarven), new ItemStack(LOTRMod.dwarfBone), new ItemStack(LOTRMod.dwarfBone), new ItemStack(LOTRMod.banner, 1, 11)},
				{new ItemStack(LOTRMod.bodyHighElven), new ItemStack(LOTRMod.elfBone), new ItemStack(LOTRMod.elfBone), new ItemStack(LOTRMod.banner, 1, 10)},
				{new ItemStack(LOTRMod.bodyGundabadUruk), new ItemStack(LOTRMod.orcBone), new ItemStack(LOTRMod.orcBone), new ItemStack(LOTRMod.banner, 1, 14)},
				{new ItemStack(LOTRMod.bodyAngmar), new ItemStack(LOTRMod.orcBone), new ItemStack(LOTRMod.orcBone), new ItemStack(LOTRMod.banner, 1, 8)},
				{new ItemStack(LOTRMod.bodyWoodElven), new ItemStack(LOTRMod.elfBone), new ItemStack(LOTRMod.elfBone), new ItemStack(LOTRMod.banner, 1, 4)},
				{new ItemStack(LOTRMod.bodyDolGuldur), new ItemStack(LOTRMod.orcBone), new ItemStack(LOTRMod.orcBone), new ItemStack(LOTRMod.banner, 1, 13)},
				{new ItemStack(LOTRMod.bodyDale), new ItemStack(Items.bone), new ItemStack(Items.bone), new ItemStack(LOTRMod.banner, 1, 19)},
				{new ItemStack(LOTRMod.bodyDwarven), new ItemStack(LOTRMod.dwarfBone), new ItemStack(LOTRMod.dwarfBone), new ItemStack(LOTRMod.banner, 1, 7)},
				{new ItemStack(LOTRMod.bodyElven), new ItemStack(LOTRMod.elfBone), new ItemStack(LOTRMod.elfBone), new ItemStack(LOTRMod.banner, 1, 3)},
				{new ItemStack(LOTRMod.bodyDunlending), new ItemStack(Items.bone), new ItemStack(Items.bone), new ItemStack(LOTRMod.banner, 1, 5)},
				{new ItemStack(LOTRMod.bodyUruk), new ItemStack(LOTRMod.orcBone), new ItemStack(LOTRMod.orcBone), new ItemStack(LOTRMod.banner, 1, 6)},
				{new ItemStack(LOTRMod.entDraught, 1, 2), new ItemStack(LOTRMod.fangornPlant, 1, 2), new ItemStack(LOTRMod.fangornPlant, 1, 2), new ItemStack(ConfigBlocks.blockWoodenDevice, 1, 8)},
				{new ItemStack(LOTRMod.bodyRohan), new ItemStack(Items.bone), new ItemStack(Items.bone), new ItemStack(LOTRMod.banner, 1, 1)},
				{new ItemStack(LOTRMod.bodyMorgul), new ItemStack(LOTRMod.orcBone), new ItemStack(LOTRMod.orcBone), new ItemStack(LOTRMod.banner, 1, 2)},
				{new ItemStack(LOTRMod.bodyDorwinion), new ItemStack(Items.bone), new ItemStack(LOTRMod.elfBone), new ItemStack(LOTRMod.banner, 1, 20)},
				{new ItemStack(LOTRMod.bodyRhun), new ItemStack(Items.bone), new ItemStack(Items.bone), new ItemStack(LOTRMod.banner, 1, 35)},
				{new ItemStack(LOTRMod.bodyNearHarad), new ItemStack(Items.bone), new ItemStack(Items.bone), new ItemStack(LOTRMod.banner, 1, 9)},
				{new ItemStack(LOTRMod.bodyMoredain), new ItemStack(Items.bone), new ItemStack(Items.bone), new ItemStack(LOTRMod.banner, 1, 17)},
				{new ItemStack(LOTRMod.bodyTauredain), new ItemStack(Items.bone), new ItemStack(Items.bone), new ItemStack(LOTRMod.banner, 1, 18)},
				{new ItemStack(LOTRMod.bodyHalfTroll), new ItemStack(LOTRMod.trollBone), new ItemStack(LOTRMod.trollBone), new ItemStack(LOTRMod.banner, 1, 15)},
				{new ItemStack(Items.leather_chestplate), new ItemStack(Items.bone), new ItemStack(Items.bone), new ItemStack(LOTRMod.banner, 1, 41)},
		};
	
	public static final int[] color =
		{
				0xe8e6e3,
				0x51ff57,
				0x2b4f2c,
				0x4794cc,
				0xadf4f4,
				0xa87443,
				0x729176,
				0x1ca52c,
				0x12122d,
				0xdb9655,
				0x3f5887,
				0xf2e479,
				0xaf9f99,
				0x353434,
				0x7dea59,
				0xbc7709,
				0x2b1501,
				0x751d63,
				0xceab5f,
				0xed310b,
				0xe0b869,
				0x1d6038,
				0x8c7f5b,
				0x2b681c
		};
}
