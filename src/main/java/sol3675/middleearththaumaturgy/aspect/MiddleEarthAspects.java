package sol3675.middleearththaumaturgy.aspect;

import net.minecraft.util.ResourceLocation;
import thaumcraft.api.aspects.Aspect;

public class MiddleEarthAspects {

	public static Aspect IMMORTAL;
	public static Aspect MEN;
	public static Aspect ELVES;
	public static Aspect DWARVES;
	public static Aspect ORCS;
	public static Aspect HOBBITS;
	public static Aspect URUKS;
	public static Aspect TROLLS;
	public static Aspect ENTS;
	public static Aspect HUORNS;
	public static Aspect WARGS;
	public static Aspect BALROGS;
	public static Aspect WIZARDS;
	public static Aspect NAZGULS;
	
	public static Aspect SHIRE;
	public static Aspect DUNEDAIN;
	public static Aspect BLUEMOUNTAINS;
	public static Aspect LINDON;
	public static Aspect GUNDABAD;
	public static Aspect ANGMAR;
	public static Aspect WOODLAND;
	public static Aspect DOLGULDUR;
	public static Aspect DALE;
	public static Aspect IRONHILLS;
	public static Aspect LOTHLORIEN;
	public static Aspect DUNLAND;
	public static Aspect ISENGARD;
	public static Aspect FANGORN;
	public static Aspect ROHAN;
	public static Aspect GONDOR;
	public static Aspect MORDOR;
	public static Aspect DORWINION;
	public static Aspect RHUDEL;
	public static Aspect NEARHARAD;
	public static Aspect MOREDAIN;
	public static Aspect TAUREDAIN;
	public static Aspect HALFTROLLS;
	public static Aspect UTUMNO;
	public static Aspect BREE;
	

	public static void initAspects() {

		IMMORTAL = new Aspect("alfirin", 0x4bf4f4, new Aspect[] { Aspect.EXCHANGE, Aspect.MAGIC }, new ResourceLocation("middleearththaumaturgy", "textures/aspects/alfirin.png"),1);
		MEN = new Aspect("abonnen", 0xf2d18e, new Aspect[] { Aspect.MAN, Aspect.GREED }, new ResourceLocation("middleearththaumaturgy","textures/aspects/abonnen.png"),1);
		ELVES = new Aspect("edhel", 0xeac0e5, new Aspect[] { Aspect.MAN, IMMORTAL }, new ResourceLocation("middleearththaumaturgy","textures/aspects/edhel.png"),1);
		DWARVES = new Aspect("nauglin", 0xafb9c9, new Aspect[] { Aspect.MAN, Aspect.MINE }, new ResourceLocation("middleearththaumaturgy","textures/aspects/nauglin.png"),1);
		ORCS = new Aspect("orchoth", 0x47775a, new Aspect[] { ELVES, Aspect.UNDEAD }, new ResourceLocation("middleearththaumaturgy","textures/aspects/orchoth.png"),771);
		HOBBITS = new Aspect("perian", 0xed6136, new Aspect[] { Aspect.MAN, Aspect.SENSES }, new ResourceLocation("middleearththaumaturgy","textures/aspects/perian.png"),1);
		URUKS = new Aspect("mornogol", 0x726e6d, new Aspect[] { ORCS, MEN }, new ResourceLocation("middleearththaumaturgy","textures/aspects/mornogol.png"),771);
		TROLLS = new Aspect("torog", 0x492b22, new Aspect[] { ORCS, Aspect.DARKNESS }, new ResourceLocation("middleearththaumaturgy","textures/aspects/torog.png"),771);
		ENTS = new Aspect("onodrim", 0x17661c, new Aspect[] { Aspect.TREE, Aspect.MOTION}, new ResourceLocation("middleearththaumaturgy","textures/aspects/onodrim.png"),1);
		HUORNS = new Aspect("uhorm", 0xba8723, new Aspect[] { Aspect.TREE, Aspect.BEAST}, new ResourceLocation("middleearththaumaturgy","textures/aspects/uhorm.png"),1);
		WARGS = new Aspect("draugol", 0x605341, new Aspect[] { Aspect.BEAST, Aspect.WEAPON }, new ResourceLocation("middleearththaumaturgy","textures/aspects/draugol.png"),771);
		BALROGS = new Aspect("valaraukar", 0xaa0606, new Aspect[] { IMMORTAL, Aspect.ELDRITCH }, new ResourceLocation("middleearththaumaturgy","textures/aspects/valaraukar.png"),771);
		WIZARDS = new Aspect("ithryn", 0xdddddd, new Aspect[] { IMMORTAL, Aspect.MAGIC }, new ResourceLocation("middleearththaumaturgy", "textures/aspects/ithryn.png"),1);
		
		SHIRE = new Aspect("shire", 0x51ff57, new Aspect[] { HOBBITS, Aspect.HARVEST }, new ResourceLocation("middleearththaumaturgy", "textures/aspects/shire.png"),1);
		DUNEDAIN = new Aspect("dunedain", 0x2b4f2c, new Aspect[] { MEN, Aspect.TRAVEL }, new ResourceLocation("middleearththaumaturgy", "textures/aspects/dunedain.png"),1);
		BLUEMOUNTAINS = new Aspect("eredluin", 0x4794cc, new Aspect[] { DWARVES, Aspect.COLD }, new ResourceLocation("middleearththaumaturgy", "textures/aspects/eredluin.png"),1);
		LINDON = new Aspect("lindon", 0xadf4f4, new Aspect[] { ELVES, Aspect.WATER }, new ResourceLocation("middleearththaumaturgy", "textures/aspects/lindon.png"),1);
		GUNDABAD = new Aspect("gundabad", 0xa87443, new Aspect[] { ORCS, Aspect.POISON }, new ResourceLocation("middleearththaumaturgy", "textures/aspects/gundabad.png"),1);
		ANGMAR = new Aspect("angmar", 0x729176, new Aspect[] { ORCS, Aspect.TAINT }, new ResourceLocation("middleearththaumaturgy", "textures/aspects/angmar.png"),1);
		WOODLAND = new Aspect("druardh", 0x1ca52c, new Aspect[] { ELVES, Aspect.TREE }, new ResourceLocation("middleearththaumaturgy", "textures/aspects/druardh.png"),1);
		DOLGULDUR = new Aspect("dolguldur", 0x12122d, new Aspect[] { ORCS, Aspect.SOUL }, new ResourceLocation("middleearththaumaturgy", "textures/aspects/dolguldur.png"),1);
		DALE = new Aspect("dale", 0xdb9655, new Aspect[] { MEN, Aspect.EXCHANGE }, new ResourceLocation("middleearththaumaturgy", "textures/aspects/dale.png"),1);
		IRONHILLS = new Aspect("angdol", 0x3f5887, new Aspect[] { DWARVES, Aspect.MINE }, new ResourceLocation("middleearththaumaturgy", "textures/aspects/angdol.png"),1);
		LOTHLORIEN = new Aspect("lothlorien", 0xf2e479, new Aspect[] { ELVES, Aspect.AURA }, new ResourceLocation("middleearththaumaturgy", "textures/aspects/lothlorien.png"),1);
		DUNLAND = new Aspect("dunland", 0xaf9f99, new Aspect[] { MEN, Aspect.ENTROPY }, new ResourceLocation("middleearththaumaturgy", "textures/aspects/dunland.png"),1);
		ISENGARD = new Aspect("isengard", 0x353434, new Aspect[] { URUKS, Aspect.MAGIC }, new ResourceLocation("middleearththaumaturgy", "textures/aspects/isengard.png"),1);
		FANGORN = new Aspect("fangorn", 0x7dea59, new Aspect[] { ENTS, Aspect.TREE }, new ResourceLocation("middleearththaumaturgy", "textures/aspects/fangorn.png"),1);
		ROHAN = new Aspect("rohan", 0xbc7709, new Aspect[] { MEN, Aspect.BEAST }, new ResourceLocation("middleearththaumaturgy", "textures/aspects/rohan.png"),1);
		GONDOR = new Aspect("gondor", 0xe8e6e3, new Aspect[] { MEN, Aspect.ORDER }, new ResourceLocation("middleearththaumaturgy", "textures/aspects/gondor.png"),1);
		MORDOR = new Aspect("mordor", 0x2b1501, new Aspect[] { ORCS, Aspect.WEAPON }, new ResourceLocation("middleearththaumaturgy", "textures/aspects/mordor.png"),1);
		DORWINION = new Aspect("dorwinion", 0x751d63, new Aspect[] { MEN, ELVES }, new ResourceLocation("middleearththaumaturgy", "textures/aspects/dorwinion.png"),1);
		RHUDEL = new Aspect("rhudel", 0xceab5f, new Aspect[] { MEN, Aspect.HUNGER }, new ResourceLocation("middleearththaumaturgy", "textures/aspects/rhudel.png"),1);
		NEARHARAD = new Aspect("harad", 0xed310b, new Aspect[] { MEN, Aspect.FIRE }, new ResourceLocation("middleearththaumaturgy", "textures/aspects/harad.png"),1);
		MOREDAIN = new Aspect("morwaith", 0xe0b869, new Aspect[] { MEN, Aspect.POISON }, new ResourceLocation("middleearththaumaturgy", "textures/aspects/moredain.png"),1);
		TAUREDAIN = new Aspect("taurethrim", 0x1d6038, new Aspect[] { MEN, Aspect.TREE }, new ResourceLocation("middleearththaumaturgy", "textures/aspects/tauredain.png"),1);
		HALFTROLLS = new Aspect("pertorog", 0x8c7f5b, new Aspect[] { MEN, TROLLS }, new ResourceLocation("middleearththaumaturgy", "textures/aspects/pertorog.png"),1);
		UTUMNO = new Aspect("utumno", 0x2d0404, new Aspect[] { BALROGS, Aspect.ELDRITCH }, new ResourceLocation("middleearththaumaturgy", "textures/aspects/utumno.png"),1);
		
		NAZGULS = new Aspect("nazgul", 0x073513, new Aspect[] { ANGMAR, Aspect.SOUL }, new ResourceLocation("middleearththaumaturgy", "textures/aspects/nazgul.png"),1);
		
		BREE = new Aspect("bree", 0x2b681c, new Aspect[] {MEN, HOBBITS}, new ResourceLocation("middleearththaumaturgy", "textures/aspects/bree.png"), 1);

	}
}
