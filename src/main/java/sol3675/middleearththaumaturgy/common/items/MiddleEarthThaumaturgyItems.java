package sol3675.middleearththaumaturgy.common.items;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import sol3675.middleearththaumaturgy.MiddleEarthThaumaturgy;
import sol3675.middleearththaumaturgy.common.items.baubles.ItemRingWarpward;
import sol3675.middleearththaumaturgy.common.items.tgstuff.ItemTitle;
import sol3675.middleearththaumaturgy.common.items.wands.FactionWandUpdate;
import sol3675.middleearththaumaturgy.common.items.wands.ItemWandCaps;
import sol3675.middleearththaumaturgy.common.items.wands.ItemWandCores;
import sol3675.middleearththaumaturgy.common.items.wands.MiddleEarthWandCap;
import sol3675.middleearththaumaturgy.references.LibMisc;
import thaumcraft.api.wands.WandCap;
import thaumcraft.api.wands.WandRod;

public class MiddleEarthThaumaturgyItems {

	public static Item iconMiddleEarthThaumaturgy;

	public static Item materials;
	public static Item nuggets;

	//public static Item factionCrafter;

	public static Item wandCore;
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
	public static WandCap WAND_CAP_MITHRIL;

	public static ItemTitle titles;

	public static ItemRingWarpward ringWarpward;

	public static void addItems() {

		iconMiddleEarthThaumaturgy = new Item().setUnlocalizedName("iconMiddleEarthThaumaturgy").setTextureName("middleearththaumaturgy:iconMiddleEarthThaumaturgy");
		GameRegistry.registerItem(iconMiddleEarthThaumaturgy, "iconMiddleEarthThaumaturgy");

		materials = new ItemMaterial().setUnlocalizedName("Materials");
		GameRegistry.registerItem(materials, "Materials");
		nuggets = new ItemMaterialNugget().setUnlocalizedName("MaterialNuggets");
		GameRegistry.registerItem(nuggets, "MaterialNuggets");
		/*
		if(Loader.isModLoaded("lotr") == true)
		{
			factionCrafter = new ItemHandheldFactionCrafter().setUnlocalizedName("HandheldFactionCrafter");
			GameRegistry.registerItem(factionCrafter, "HandheldFactionCrafter");
		}
		*/
		wandCore = new ItemWandCores().setUnlocalizedName("WandCores");
		GameRegistry.registerItem(wandCore, "WandCores");
		wandCap = new ItemWandCaps().setUnlocalizedName("WandCaps");
		GameRegistry.registerItem(wandCap, "WandCaps");

		WAND_ROD_GONDOR = new WandRod("GONDOR", 100, new ItemStack(wandCore, 1, 0), 12, new FactionWandUpdate(), new ResourceLocation("middleearththaumaturgy","textures/models/wand_rod_gondor.png"));
		WAND_ROD_HOBBIT = new WandRod("HOBBIT", 100, new ItemStack(wandCore, 1, 1), 12, new FactionWandUpdate(), new ResourceLocation("middleearththaumaturgy","texture/models/wand_rod_hobbit.png"));
		WAND_ROD_RANGER_NORTH = new WandRod("RANGER_NORTH", 100, new ItemStack(wandCore, 1, 2), 12, new FactionWandUpdate(), new ResourceLocation("middleearththaumaturgy","texture/models/wand_rod_ranger_north.png"));
		WAND_ROD_BLUE_MOUNTAINS = new WandRod("BLUE_MOUNTAINS", 100, new ItemStack(wandCore, 1, 3), 12, new FactionWandUpdate(), new ResourceLocation("middleearththaumaturgy","texture/models/wand_rod_blue_mountains.png"));
		WAND_ROD_HIGH_ELF = new WandRod("HIGH_ELF", 100, new ItemStack(wandCore, 1, 4), 12, new FactionWandUpdate(), new ResourceLocation("middleearththaumaturgy","texture/models/wand_rod_high_elf.png"));
		WAND_ROD_GUNDABAD = new WandRod("GUNDABAD", 100, new ItemStack(wandCore, 1, 5), 12, new FactionWandUpdate(), new ResourceLocation("middleearththaumaturgy","texture/models/wand_rod_gundabad.png"));
		WAND_ROD_ANGMAR = new WandRod("ANGMAR", 100, new ItemStack(wandCore, 1, 6), 12, new FactionWandUpdate(), new ResourceLocation("middleearththaumaturgy","texture/models/wand_rod_angmar.png"));
		WAND_ROD_WOOD_ELF = new WandRod("WOOD_ELF", 100, new ItemStack(wandCore, 1, 7), 12, new FactionWandUpdate(), new ResourceLocation("middleearththaumaturgy","texture/models/wand_rod_wood_elf.png"));
		WAND_ROD_DOL_GULDUR = new WandRod("DOL_GULDUR", 100, new ItemStack(wandCore, 1, 8), 12, new FactionWandUpdate(), new ResourceLocation("middleearththaumaturgy","texture/models/wand_rod_dol_guldur.png"));
		WAND_ROD_DALE = new WandRod("DALE", 100, new ItemStack(wandCore, 1, 9), 12, new FactionWandUpdate(), new ResourceLocation("middleearththaumaturgy","texture/models/wand_rod_dale.png"));
		WAND_ROD_DWARF = new WandRod("DWARF", 100, new ItemStack(wandCore, 1, 10), 12, new FactionWandUpdate(), new ResourceLocation("middleearththaumaturgy","texture/models/wand_rod_dwarf.png"));
		WAND_ROD_GALADHRIM = new WandRod("GALADHRIM", 100, new ItemStack(wandCore, 1, 11), 12, new FactionWandUpdate(), new ResourceLocation("middleearththaumaturgy","texture/models/wand_rod_galadhrim.png"));
		WAND_ROD_DUNLAND = new WandRod("DUNLAND", 100, new ItemStack(wandCore, 1, 12), 12, new FactionWandUpdate(), new ResourceLocation("middleearththaumaturgy","texture/models/wand_rod_dunland.png"));
		WAND_ROD_URUK_HAI = new WandRod("URUK_HAI", 100, new ItemStack(wandCore, 1, 13), 12, new FactionWandUpdate(), new ResourceLocation("middleearththaumaturgy","texture/models/wand_rod_uruk_hai.png"));
		WAND_ROD_FANGORN = new WandRod("FANGORN", 100, new ItemStack(wandCore, 1, 14), 12, new FactionWandUpdate(), new ResourceLocation("middleearththaumaturgy","texture/models/wand_rod_fangorn.png"));
		WAND_ROD_ROHAN = new WandRod("ROHAN", 100, new ItemStack(wandCore, 1, 15), 12, new FactionWandUpdate(), new ResourceLocation("middleearththaumaturgy","texture/models/wand_rod_rohan.png"));
		WAND_ROD_MORDOR = new WandRod("MORDOR", 100, new ItemStack(wandCore, 1, 16), 12, new FactionWandUpdate(), new ResourceLocation("middleearththaumaturgy","texture/models/wand_rod_mordor.png"));
		WAND_ROD_DORWINION = new WandRod("DORWINION", 100, new ItemStack(wandCore, 1, 17), 12, new FactionWandUpdate(), new ResourceLocation("middleearththaumaturgy","texture/models/wand_rod_dorwinion.png"));
		WAND_ROD_RHUN = new WandRod("RHUN", 100, new ItemStack(wandCore, 1, 18), 12, new FactionWandUpdate(), new ResourceLocation("middleearththaumaturgy","texture/models/wand_rod_rhun.png"));
		WAND_ROD_NEAR_HARAD = new WandRod("NEAR_HARAD", 100, new ItemStack(wandCore, 1, 19), 12, new FactionWandUpdate(), new ResourceLocation("middleearththaumaturgy","texture/models/wand_rod_near_harad.png"));
		WAND_ROD_MOREDAIN = new WandRod("MOREDAIN", 100, new ItemStack(wandCore, 1, 20), 12, new FactionWandUpdate(), new ResourceLocation("middleearththaumaturgy","texture/models/wand_rod_moredain.png"));
		WAND_ROD_TAUREDAIN = new WandRod("TAUREDAIN", 100, new ItemStack(wandCore, 1, 21), 12, new FactionWandUpdate(), new ResourceLocation("middleearththaumaturgy","texture/models/wand_rod_tauredain.png"));
		WAND_ROD_HALF_TROLL = new WandRod("HALF_TROLL", 100, new ItemStack(wandCore, 1, 22), 12, new FactionWandUpdate(), new ResourceLocation("middleearththaumaturgy","texture/models/wand_rod_half_troll.png"));
		WAND_CAP_MITHRIL = new MiddleEarthWandCap("mithril", 0.8F, new ItemStack(wandCap, 1, 0), 6, new ResourceLocation("middleearththaumaturgy","textures/models/wand_cap_mithril.png"));

		titles = new ItemTitle();
		titles.setUnlocalizedName(LibMisc.MODID.toLowerCase() + ':' + "titleItem");
		GameRegistry.registerItem(titles, "titleItem");

		ringWarpward = new ItemRingWarpward();
		GameRegistry.registerItem(ringWarpward, "ItemRingWarpward");
	}

}
