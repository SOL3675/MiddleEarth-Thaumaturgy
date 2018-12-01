package sol3675.middleearththaumaturgy.common.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import sol3675.middleearththaumaturgy.common.items.wands.FactionWandUpdate;
import sol3675.middleearththaumaturgy.common.items.wands.FactionWandUpdateTT;
import sol3675.middleearththaumaturgy.common.items.wands.ItemTTWandCores;
import sol3675.middleearththaumaturgy.references.LibMisc;
import sol3675.middleearththaumaturgy.references.WandType;
import thaumcraft.api.wands.WandRod;

public class ItemTTCompat {

	public static Item wandCoreTT;
	
	public static WandRod[] WAND_ROD_TT;

	public static void addItemTTCompat()
	{
		wandCoreTT = new ItemTTWandCores().setUnlocalizedName("wandCoreTT");
		GameRegistry.registerItem(wandCoreTT, "WandCoresTT");
		
		WAND_ROD_TT = new WandRod[WandType.types.length];
		
		for(int i = 0; i < WandType.types.length; ++i)
		{
			WAND_ROD_TT[i] = new WandRod(WandType.types[i] + "_TT", 1000, new ItemStack(wandCoreTT, 1, i), 12, new FactionWandUpdateTT(WandType.faction[i]), new ResourceLocation(LibMisc.MODFULLID, "textures/models/wand_rod_tt_" + WandType.typesName[i] + ".png"));
			WAND_ROD_TT[i].setGlowing(true);
		}

	}

}
