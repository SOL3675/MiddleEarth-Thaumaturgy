package sol3675.middleearththaumaturgy.common.items;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import sol3675.middleearththaumaturgy.MiddleEarthThaumaturgy;
import sol3675.middleearththaumaturgy.common.items.baubles.ItemRingWarpward;
import sol3675.middleearththaumaturgy.common.items.wands.FactionWandUpdate;
import sol3675.middleearththaumaturgy.common.items.wands.ItemStaffCores;
import sol3675.middleearththaumaturgy.common.items.wands.ItemWandCaps;
import sol3675.middleearththaumaturgy.common.items.wands.ItemWandCores;
import sol3675.middleearththaumaturgy.common.items.wands.MiddleEarthWandCap;
import sol3675.middleearththaumaturgy.references.LibMisc;
import thaumcraft.api.wands.StaffRod;
import thaumcraft.api.wands.WandCap;
import thaumcraft.api.wands.WandRod;

public class MiddleEarthThaumaturgyItems {

	public static Item iconMiddleEarthThaumaturgy;

	public static Item materials;
	public static Item nuggets;

	public static Item factionCrafter;

	public static Item wandCore;
	public static Item staffCore;
	public static Item wandCap;

	public static WandRod WAND_ROD_GONDOR;
	public static WandRod WAND_ROD_HOBBIT;
	public static WandRod WAND_ROD_RANGER_NORTH;
	public static WandRod WAND_ROD_BLUE_MOUNTAINS;
	public static WandRod WAND_ROD_HIGH_ELF;
	public static WandRod WAND_ROD_GUNDABAD;
	public static WandRod WAND_ROD_ANGMAR;
	public static WandRod WAND_ROD_WOOD_ELF;
	public static WandRod WAND_ROD_DOL_GULDUR;
	public static WandRod WAND_ROD_DALE;
	public static WandRod WAND_ROD_DWARF;
	public static WandRod WAND_ROD_GALADHRIM;
	public static WandRod WAND_ROD_DUNLAND;
	public static WandRod WAND_ROD_URUK_HAI;
	public static WandRod WAND_ROD_FANGORN;
	public static WandRod WAND_ROD_ROHAN;
	public static WandRod WAND_ROD_MORDOR;
	public static WandRod WAND_ROD_DORWINION;
	public static WandRod WAND_ROD_RHUN;
	public static WandRod WAND_ROD_NEAR_HARAD;
	public static WandRod WAND_ROD_MOREDAIN;
	public static WandRod WAND_ROD_TAUREDAIN;
	public static WandRod WAND_ROD_HALF_TROLL;

	public static StaffRod STAFF_ROD_GONDOR;
	public static StaffRod STAFF_ROD_HOBBIT;
	public static StaffRod STAFF_ROD_RANGER_NORTH;
	public static StaffRod STAFF_ROD_BLUE_MOUNTAINS;
	public static StaffRod STAFF_ROD_HIGH_ELF;
	public static StaffRod STAFF_ROD_GUNDABAD;
	public static StaffRod STAFF_ROD_ANGMAR;
	public static StaffRod STAFF_ROD_WOOD_ELF;
	public static StaffRod STAFF_ROD_DOL_GULDUR;
	public static StaffRod STAFF_ROD_DALE;
	public static StaffRod STAFF_ROD_DWARF;
	public static StaffRod STAFF_ROD_GALADHRIM;
	public static StaffRod STAFF_ROD_DUNLAND;
	public static StaffRod STAFF_ROD_URUK_HAI;
	public static StaffRod STAFF_ROD_FANGORN;
	public static StaffRod STAFF_ROD_ROHAN;
	public static StaffRod STAFF_ROD_MORDOR;
	public static StaffRod STAFF_ROD_DORWINION;
	public static StaffRod STAFF_ROD_RHUN;
	public static StaffRod STAFF_ROD_NEAR_HARAD;
	public static StaffRod STAFF_ROD_MOREDAIN;
	public static StaffRod STAFF_ROD_TAUREDAIN;
	public static StaffRod STAFF_ROD_HALF_TROLL;

	public static WandCap WAND_CAP_MITHRIL;
	public static WandCap WAND_CAP_ORCSTEEL;
	public static WandCap WAND_CAP_DWARVENSTEEL;
	public static WandCap WAND_CAP_GALVORN;
	public static WandCap WAND_CAP_URUKSTEEL;
	public static WandCap WAND_CAP_MORGULSTEEL;
	public static WandCap WAND_CAP_BLUEDWARVENSTEEL;
	public static WandCap WAND_CAP_BLACKURUKSTEEL;
	public static WandCap WAND_CAP_ELVENSTEEL;
	public static WandCap WAND_CAP_GILDEDIRON;

	public static ItemRingWarpward ringWarpward;

	public static void addItems() {

		iconMiddleEarthThaumaturgy = new Item().setUnlocalizedName("iconMiddleEarthThaumaturgy").setTextureName(LibMisc.MODFULLID + ":iconMiddleEarthThaumaturgy");
		GameRegistry.registerItem(iconMiddleEarthThaumaturgy, "iconMiddleEarthThaumaturgy");

		materials = new ItemMaterial().setUnlocalizedName("Materials");
		GameRegistry.registerItem(materials, "Materials");
		nuggets = new ItemMaterialNugget().setUnlocalizedName("MaterialNuggets");
		GameRegistry.registerItem(nuggets, "MaterialNuggets");

		factionCrafter = new ItemHandheldFactionCrafter();
		GameRegistry.registerItem(factionCrafter, "HandheldFactionCrafter");

		wandCore = new ItemWandCores().setUnlocalizedName("WandCores");
		GameRegistry.registerItem(wandCore, "WandCores");
		staffCore = new ItemStaffCores().setUnlocalizedName("StaffCores");
		GameRegistry.registerItem(staffCore, "StaffCores");
		wandCap = new ItemWandCaps().setUnlocalizedName("WandCaps");
		GameRegistry.registerItem(wandCap, "WandCaps");

		WAND_ROD_GONDOR = new WandRod("GONDOR", 100, new ItemStack(wandCore, 1, 0), 12, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_gondor.png"));
		WAND_ROD_HOBBIT = new WandRod("HOBBIT", 100, new ItemStack(wandCore, 1, 1), 12, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_hobbit.png"));
		WAND_ROD_RANGER_NORTH = new WandRod("RANGER_NORTH", 100, new ItemStack(wandCore, 1, 2), 12, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_ranger_north.png"));
		WAND_ROD_BLUE_MOUNTAINS = new WandRod("BLUE_MOUNTAINS", 100, new ItemStack(wandCore, 1, 3), 12, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_blue_mountains.png"));
		WAND_ROD_HIGH_ELF = new WandRod("HIGH_ELF", 100, new ItemStack(wandCore, 1, 4), 12, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_high_elf.png"));
		WAND_ROD_GUNDABAD = new WandRod("GUNDABAD", 100, new ItemStack(wandCore, 1, 5), 12, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_gundabad.png"));
		WAND_ROD_ANGMAR = new WandRod("ANGMAR", 100, new ItemStack(wandCore, 1, 6), 12, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_angmar.png"));
		WAND_ROD_WOOD_ELF = new WandRod("WOOD_ELF", 100, new ItemStack(wandCore, 1, 7), 12, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_wood_elf.png"));
		WAND_ROD_DOL_GULDUR = new WandRod("DOL_GULDUR", 100, new ItemStack(wandCore, 1, 8), 12, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_dol_guldur.png"));
		WAND_ROD_DALE = new WandRod("DALE", 100, new ItemStack(wandCore, 1, 9), 12, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_dale.png"));
		WAND_ROD_DWARF = new WandRod("DWARF", 100, new ItemStack(wandCore, 1, 10), 12, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_dwarf.png"));
		WAND_ROD_GALADHRIM = new WandRod("GALADHRIM", 100, new ItemStack(wandCore, 1, 11), 12, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_galadhrim.png"));
		WAND_ROD_DUNLAND = new WandRod("DUNLAND", 100, new ItemStack(wandCore, 1, 12), 12, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_dunland.png"));
		WAND_ROD_URUK_HAI = new WandRod("URUK_HAI", 100, new ItemStack(wandCore, 1, 13), 12, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_uruk_hai.png"));
		WAND_ROD_FANGORN = new WandRod("FANGORN", 100, new ItemStack(wandCore, 1, 14), 12, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_fangorn.png"));
		WAND_ROD_ROHAN = new WandRod("ROHAN", 100, new ItemStack(wandCore, 1, 15), 12, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_rohan.png"));
		WAND_ROD_MORDOR = new WandRod("MORDOR", 100, new ItemStack(wandCore, 1, 16), 12, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_mordor.png"));
		WAND_ROD_DORWINION = new WandRod("DORWINION", 100, new ItemStack(wandCore, 1, 17), 12, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_dorwinion.png"));
		WAND_ROD_RHUN = new WandRod("RHUN", 100, new ItemStack(wandCore, 1, 18), 12, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_rhun.png"));
		WAND_ROD_NEAR_HARAD = new WandRod("NEAR_HARAD", 100, new ItemStack(wandCore, 1, 19), 12, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_near_harad.png"));
		WAND_ROD_MOREDAIN = new WandRod("MOREDAIN", 100, new ItemStack(wandCore, 1, 20), 12, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_moredain.png"));
		WAND_ROD_TAUREDAIN = new WandRod("TAUREDAIN", 100, new ItemStack(wandCore, 1, 21), 12, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_tauredain.png"));
		WAND_ROD_HALF_TROLL = new WandRod("HALF_TROLL", 100, new ItemStack(wandCore, 1, 22), 12, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_half_troll.png"));

		STAFF_ROD_GONDOR = new StaffRod("GONDOR", 250, new ItemStack(staffCore, 1, 0), 15, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_gondor.png"));
		STAFF_ROD_HOBBIT = new StaffRod("HOBBIT", 250, new ItemStack(staffCore, 1, 1), 15, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_hobbit.png"));
		STAFF_ROD_RANGER_NORTH = new StaffRod("RANGER_NORTH", 250, new ItemStack(staffCore, 1, 2), 15, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_ranger_north.png"));
		STAFF_ROD_BLUE_MOUNTAINS = new StaffRod("BLUE_MOUNTAINS", 250, new ItemStack(staffCore, 1, 3), 15, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_blue_mountains.png"));
		STAFF_ROD_HIGH_ELF = new StaffRod("HIGH_ELF", 250, new ItemStack(staffCore, 1, 4), 15, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_high_elf.png"));
		STAFF_ROD_GUNDABAD = new StaffRod("GUNDABAD", 250, new ItemStack(staffCore, 1, 5), 15, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_gundabad.png"));
		STAFF_ROD_ANGMAR = new StaffRod("ANGMAR", 250, new ItemStack(staffCore, 1, 6), 15, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_angmar.png"));
		STAFF_ROD_WOOD_ELF = new StaffRod("WOOD_ELF", 250, new ItemStack(staffCore, 1, 7), 15, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_wood_elf.png"));
		STAFF_ROD_DOL_GULDUR = new StaffRod("DOL_GULDUR", 250, new ItemStack(staffCore, 1, 8), 15, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_dol_guldur.png"));
		STAFF_ROD_DALE = new StaffRod("DALE", 250, new ItemStack(staffCore, 1, 9), 15, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_dale.png"));
		STAFF_ROD_DWARF = new StaffRod("DWARF", 250, new ItemStack(staffCore, 1, 10), 15, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_dwarf.png"));
		STAFF_ROD_GALADHRIM = new StaffRod("GALADHRIM", 250, new ItemStack(staffCore, 1, 11), 15, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_galadhrim.png"));
		STAFF_ROD_DUNLAND = new StaffRod("DUNLAND", 250, new ItemStack(staffCore, 1, 15), 15, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_dunland.png"));
		STAFF_ROD_URUK_HAI = new StaffRod("URUK_HAI", 250, new ItemStack(staffCore, 1, 13), 15, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_uruk_hai.png"));
		STAFF_ROD_FANGORN = new StaffRod("FANGORN", 250, new ItemStack(staffCore, 1, 14), 15, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_fangorn.png"));
		STAFF_ROD_ROHAN = new StaffRod("ROHAN", 250, new ItemStack(staffCore, 1, 15), 15, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_rohan.png"));
		STAFF_ROD_MORDOR = new StaffRod("MORDOR", 250, new ItemStack(staffCore, 1, 16), 15, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_mordor.png"));
		STAFF_ROD_DORWINION = new StaffRod("DORWINION", 250, new ItemStack(staffCore, 1, 17), 15, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_dorwinion.png"));
		STAFF_ROD_RHUN = new StaffRod("RHUN", 250, new ItemStack(staffCore, 1, 18), 15, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_rhun.png"));
		STAFF_ROD_NEAR_HARAD = new StaffRod("NEAR_HARAD", 250, new ItemStack(staffCore, 1, 19), 15, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_near_harad.png"));
		STAFF_ROD_MOREDAIN = new StaffRod("MOREDAIN", 250, new ItemStack(staffCore, 1, 20), 15, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_moredain.png"));
		STAFF_ROD_TAUREDAIN = new StaffRod("TAUREDAIN", 250, new ItemStack(staffCore, 1, 21), 15, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_tauredain.png"));
		STAFF_ROD_HALF_TROLL = new StaffRod("HALF_TROLL", 250, new ItemStack(staffCore, 1, 22), 15, new FactionWandUpdate(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_half_troll.png"));

		WAND_CAP_MITHRIL = new MiddleEarthWandCap("mithril", 0.65F, new ItemStack(wandCap, 1, 0), 6, new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_cap_mithril.png"));
		WAND_CAP_ORCSTEEL = new MiddleEarthWandCap("orcsteel", 0.95F, new ItemStack(wandCap, 1, 1), 4, new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_cap_orcsteel.png"));
		WAND_CAP_DWARVENSTEEL = new MiddleEarthWandCap("dwarvensteel", 0.95F, new ItemStack(wandCap, 1, 2), 4, new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_cap_dwarvensteel.png"));
		WAND_CAP_GALVORN = new MiddleEarthWandCap("galvorn", 0.8F, new ItemStack(wandCap, 1, 3), 5, new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_cap_galvorn.png"));
		WAND_CAP_URUKSTEEL = new MiddleEarthWandCap("uruksteel", 0.95F, new ItemStack(wandCap, 1, 4), 4, new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_cap_uruksteel.png"));
		WAND_CAP_MORGULSTEEL = new MiddleEarthWandCap("morgulsteel", 0.8F, new ItemStack(wandCap, 1, 5), 5, new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_cap_morgulsteel.png"));
		WAND_CAP_BLUEDWARVENSTEEL = new MiddleEarthWandCap("bluedwarvensteel", 0.95F, new ItemStack(wandCap, 1, 6), 4, new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_cap_bluedwarvensteel.png"));
		WAND_CAP_BLACKURUKSTEEL = new MiddleEarthWandCap("blackuruksteel", 0.9F, new ItemStack(wandCap, 1, 7), 4, new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_cap_blackuruksteel.png"));
		WAND_CAP_ELVENSTEEL = new MiddleEarthWandCap("elvensteel", 0.9F, new ItemStack(wandCap, 1, 8), 4, new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_cap_elvensteel.png"));
		WAND_CAP_GILDEDIRON = new MiddleEarthWandCap("gildediron", 0.95F, new ItemStack(wandCap, 1, 9), 4, new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_cap_gildediron.png"));

		ringWarpward = new ItemRingWarpward();
		GameRegistry.registerItem(ringWarpward, "ItemRingWarpward");
	}

}
