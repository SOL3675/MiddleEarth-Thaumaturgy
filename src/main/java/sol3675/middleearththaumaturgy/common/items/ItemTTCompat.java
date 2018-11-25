package sol3675.middleearththaumaturgy.common.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import sol3675.middleearththaumaturgy.common.items.wands.FactionWandUpdate;
import sol3675.middleearththaumaturgy.common.items.wands.FactionWandUpdateTT;
import sol3675.middleearththaumaturgy.common.items.wands.ItemTTWandCores;
import sol3675.middleearththaumaturgy.references.LibMisc;
import thaumcraft.api.wands.WandRod;

public class ItemTTCompat {

	public static Item wandCoreTT;

	public static WandRod WAND_ROD_GONDOR_TT;
	public static WandRod WAND_ROD_HOBBIT_TT;
	public static WandRod WAND_ROD_RANGER_NORTH_TT;
	public static WandRod WAND_ROD_BLUE_MOUNTAINS_TT;
	public static WandRod WAND_ROD_HIGH_ELF_TT;
	public static WandRod WAND_ROD_GUNDABAD_TT;
	public static WandRod WAND_ROD_ANGMAR_TT;
	public static WandRod WAND_ROD_WOOD_ELF_TT;
	public static WandRod WAND_ROD_DOL_GULDUR_TT;
	public static WandRod WAND_ROD_DALE_TT;
	public static WandRod WAND_ROD_DWARF_TT;
	public static WandRod WAND_ROD_GALADHRIM_TT;
	public static WandRod WAND_ROD_DUNLAND_TT;
	public static WandRod WAND_ROD_URUK_HAI_TT;
	public static WandRod WAND_ROD_FANGORN_TT;
	public static WandRod WAND_ROD_ROHAN_TT;
	public static WandRod WAND_ROD_MORDOR_TT;
	public static WandRod WAND_ROD_DORWINION_TT;
	public static WandRod WAND_ROD_RHUN_TT;
	public static WandRod WAND_ROD_NEAR_HARAD_TT;
	public static WandRod WAND_ROD_MOREDAIN_TT;
	public static WandRod WAND_ROD_TAUREDAIN_TT;
	public static WandRod WAND_ROD_HALF_TROLL_TT;

	public static void addItemTTCompat()
	{
		wandCoreTT = new ItemTTWandCores().setUnlocalizedName("wandCoreTT");
		GameRegistry.registerItem(wandCoreTT, "WandCoresTT");

		WAND_ROD_GONDOR_TT = new WandRod("GONDOR_TT", 1000, new ItemStack(wandCoreTT, 1, 0), 12, new FactionWandUpdateTT(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_gondor.png"));
		WAND_ROD_HOBBIT_TT = new WandRod("HOBBIT_TT", 1000, new ItemStack(wandCoreTT, 1, 1), 12, new FactionWandUpdateTT(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_hobbit.png"));
		WAND_ROD_RANGER_NORTH_TT = new WandRod("RANGER_NORTH_TT", 1000, new ItemStack(wandCoreTT, 1, 2), 12, new FactionWandUpdateTT(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_ranger_north.png"));
		WAND_ROD_BLUE_MOUNTAINS_TT = new WandRod("BLUE_MOUNTAINS_TT", 1000, new ItemStack(wandCoreTT, 1, 3), 12, new FactionWandUpdateTT(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_blue_mountains.png"));
		WAND_ROD_HIGH_ELF_TT = new WandRod("HIGH_ELF_TT", 1000, new ItemStack(wandCoreTT, 1, 4), 12, new FactionWandUpdateTT(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_high_elf.png"));
		WAND_ROD_GUNDABAD_TT = new WandRod("GUNDABAD_TT", 1000, new ItemStack(wandCoreTT, 1, 5), 12, new FactionWandUpdateTT(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_gundabad.png"));
		WAND_ROD_ANGMAR_TT = new WandRod("ANGMAR_TT", 1000, new ItemStack(wandCoreTT, 1, 6), 12, new FactionWandUpdateTT(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_angmar.png"));
		WAND_ROD_WOOD_ELF_TT = new WandRod("WOOD_ELF_TT", 1000, new ItemStack(wandCoreTT, 1, 7), 12, new FactionWandUpdateTT(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_wood_elf.png"));
		WAND_ROD_DOL_GULDUR_TT = new WandRod("DOL_GULDUR_TT", 1000, new ItemStack(wandCoreTT, 1, 8), 12, new FactionWandUpdateTT(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_dol_guldur.png"));
		WAND_ROD_DALE_TT = new WandRod("DALE_TT", 1000, new ItemStack(wandCoreTT, 1, 9), 12, new FactionWandUpdateTT(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_dale.png"));
		WAND_ROD_DWARF_TT = new WandRod("DWARF_TT", 1000, new ItemStack(wandCoreTT, 1, 10), 12, new FactionWandUpdateTT(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_dwarf.png"));
		WAND_ROD_GALADHRIM_TT = new WandRod("GALADHRIM_TT", 1000, new ItemStack(wandCoreTT, 1, 11), 12, new FactionWandUpdateTT(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_galadhrim.png"));
		WAND_ROD_DUNLAND_TT = new WandRod("DUNLAND_TT", 1000, new ItemStack(wandCoreTT, 1, 12), 12, new FactionWandUpdateTT(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_dunland.png"));
		WAND_ROD_URUK_HAI_TT = new WandRod("URUK_HAI_TT", 1000, new ItemStack(wandCoreTT, 1, 13), 12, new FactionWandUpdateTT(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_uruk_hai.png"));
		WAND_ROD_FANGORN_TT = new WandRod("FANGORN_TT", 1000, new ItemStack(wandCoreTT, 1, 14), 12, new FactionWandUpdateTT(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_fangorn.png"));
		WAND_ROD_ROHAN_TT = new WandRod("ROHAN_TT", 1000, new ItemStack(wandCoreTT, 1, 15), 12, new FactionWandUpdateTT(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_rohan.png"));
		WAND_ROD_MORDOR_TT = new WandRod("MORDOR_TT", 1000, new ItemStack(wandCoreTT, 1, 16), 12, new FactionWandUpdateTT(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_mordor.png"));
		WAND_ROD_DORWINION_TT = new WandRod("DORWINION_TT", 1000, new ItemStack(wandCoreTT, 1, 17), 12, new FactionWandUpdateTT(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_dorwinion.png"));
		WAND_ROD_RHUN_TT = new WandRod("RHUN_TT", 1000, new ItemStack(wandCoreTT, 1, 18), 12, new FactionWandUpdateTT(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_rhun.png"));
		WAND_ROD_NEAR_HARAD_TT = new WandRod("NEAR_HARAD_TT", 1000, new ItemStack(wandCoreTT, 1, 19), 12, new FactionWandUpdateTT(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_near_harad.png"));
		WAND_ROD_MOREDAIN_TT = new WandRod("MOREDAIN_TT", 1000, new ItemStack(wandCoreTT, 1, 20), 12, new FactionWandUpdateTT(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_moredain.png"));
		WAND_ROD_TAUREDAIN_TT = new WandRod("TAUREDAIN_TT", 1000, new ItemStack(wandCoreTT, 1, 21), 12, new FactionWandUpdateTT(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_tauredain.png"));
		WAND_ROD_HALF_TROLL_TT = new WandRod("HALF_TROLL_TT", 1000, new ItemStack(wandCoreTT, 1, 22), 12, new FactionWandUpdateTT(), new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_half_troll.png"));
	}

}
