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
import sol3675.middleearththaumaturgy.references.WandType;
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

	public static WandRod[] WAND_ROD;

	public static StaffRod[] STAFF_ROD;

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
		
		WAND_ROD = new WandRod[WandType.types.length];
		STAFF_ROD = new StaffRod[WandType.types.length];
		for(int i = 0; i < WandType.types.length; ++i)
		{
			WAND_ROD[i] = new WandRod(WandType.types[i], 100, new ItemStack(wandCore, 1, i), 12, new FactionWandUpdate(WandType.faction[i]), new ResourceLocation(LibMisc.MODFULLID, "textures/models/wand_rod_" + WandType.typesName[i] + ".png"));
		}
		
		for(int i = 0; i < WandType.types.length; ++i)
		{
			STAFF_ROD[i] = new StaffRod(WandType.types[i], 250, new ItemStack(staffCore, 1, i), 15, new FactionWandUpdate(WandType.faction[i]), new ResourceLocation(LibMisc.MODFULLID, "textures/models/wand_rod_" + WandType.typesName[i] + ".png"));
		}
		
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
