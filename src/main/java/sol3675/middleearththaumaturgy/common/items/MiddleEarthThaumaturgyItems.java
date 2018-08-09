package sol3675.middleearththaumaturgy.common.items;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import sol3675.middleearththaumaturgy.MiddleEarthThaumaturgy;
import sol3675.middleearththaumaturgy.common.items.baubles.ItemRingWarpward;
import sol3675.middleearththaumaturgy.common.items.tgstuff.ItemTitle;
import sol3675.middleearththaumaturgy.common.items.wands.GondorWandUpdate;
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
		
		WAND_ROD_GONDOR = new WandRod("gondor", 100, new ItemStack(wandCore, 1, 0), 12, new GondorWandUpdate(), new ResourceLocation("middleearththaumaturgy","textures/models/wand_rod_gondor.png"));
		WAND_CAP_MITHRIL = new MiddleEarthWandCap("mithril", 0.8F, new ItemStack(wandCap, 1, 0), 6, new ResourceLocation("middleearththaumaturgy","textures/models/wand_cap_mithril.png"));
		
		titles = new ItemTitle();
		titles.setUnlocalizedName(LibMisc.MODID.toLowerCase() + ':' + "titleItem");
		GameRegistry.registerItem(titles, "titleItem");
		
		ringWarpward = new ItemRingWarpward();
		GameRegistry.registerItem(ringWarpward, "ItemRingWarpward");
	}

}
