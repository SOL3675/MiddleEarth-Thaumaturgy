package sol3675.middleearththaumaturgy.references;

import lotr.common.fac.LOTRFaction;
import sol3675.middleearththaumaturgy.aspect.MiddleEarthAspects;
import thaumcraft.api.aspects.Aspect;

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
			"HALF_TROLL"
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
				LOTRFaction.DWARF,
				LOTRFaction.GALADHRIM,
				LOTRFaction.DUNLAND,
				LOTRFaction.URUK_HAI,
				LOTRFaction.FANGORN,
				LOTRFaction.ROHAN,
				LOTRFaction.MORDOR,
				LOTRFaction.DORWINION,
				LOTRFaction.RHUN,
				LOTRFaction.NEAR_HARAD,
				LOTRFaction.MOREDAIN,
				LOTRFaction.TAUREDAIN,
				LOTRFaction.HALF_TROLL
		};
	
	private static final String F = "FREEPEOPLE";
	private static final String S = "SAURON";
	
	public static final String[] category =
		{F, F, F, F, F, S, S, F, S, F, F, F, S, S, F, F, S, F, S, S, S, F, S};
	
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
			"half_troll"
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
				MiddleEarthAspects.HALFTROLLS
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
				0x8c7f5b
		};
}
