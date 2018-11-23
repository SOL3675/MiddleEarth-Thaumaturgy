package sol3675.middleearththaumaturgy.common.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import sol3675.middleearththaumaturgy.common.items.wands.FactionWandUpdate;
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
		
		WAND_ROD_GONDOR_TT = new WandRod("GONDOR_TT", 1000, new ItemStack(wandCoreTT, 1, 0), 12, new ResourceLocation(LibMisc.MODFULLID,"textures/models/wand_rod_gondor.png"));
	}
	
}
