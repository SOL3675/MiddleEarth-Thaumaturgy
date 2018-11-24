package sol3675.middleearththaumaturgy.proxy;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import sol3675.middleearththaumaturgy.MiddleEarthResearch;
import sol3675.middleearththaumaturgy.MiddleEarthThaumaturgy;
import sol3675.middleearththaumaturgy.aspect.LotrAspectRegister;
import sol3675.middleearththaumaturgy.aspect.MiddleEarthAspects;
import sol3675.middleearththaumaturgy.common.blocks.BlockBookshelfInventarium;
import sol3675.middleearththaumaturgy.common.blocks.MiddleEarthThaumaturgyBlocks;
import sol3675.middleearththaumaturgy.common.items.MiddleEarthThaumaturgyItems;
import sol3675.middleearththaumaturgy.common.items.tgstuff.ItemTitle;
import sol3675.middleearththaumaturgy.common.tileentities.MiddleEarthThaumaturgyTileentities;
import sol3675.middleearththaumaturgy.config.MeetCfg;
import sol3675.middleearththaumaturgy.gui.GuiHandler;
import sol3675.middleearththaumaturgy.network.PacketHandler;
import sol3675.middleearththaumaturgy.recipes.GeneralRecipes;
import sol3675.middleearththaumaturgy.recipes.Recipes;
import sol3675.middleearththaumaturgy.register.TTCompatRegister;

public class CommonProxy{
	
	public void initRenderers() {
		
	}
	
	public void preInit(FMLPreInitializationEvent event) {
		MeetCfg.configurate(event.getSuggestedConfigurationFile());
		MiddleEarthAspects.initAspects();
		MiddleEarthThaumaturgyItems.addItems();
		if(Loader.isModLoaded("TravellersGear") && MeetCfg.travellersgear) {
			ItemTitle.addTitleItems();
		}
		if(Loader.isModLoaded("ThaumicTinkerer") && MeetCfg.thaumictinkerer)
		{
			TTCompatRegister.TTpreInit();
		}
		MiddleEarthThaumaturgyBlocks.addBlocks();
		MiddleEarthThaumaturgyTileentities.addTileentities();
		PacketHandler.init();
	}
	
	public void init(FMLInitializationEvent event) {
		
		GeneralRecipes.addGeneralRecipes();
		NetworkRegistry.INSTANCE.registerGuiHandler(MiddleEarthThaumaturgy.instance, new GuiHandler());
		
	}
	
	public void postInit(FMLPostInitializationEvent event) {
		Recipes.addRecipes();
		if(Loader.isModLoaded("Automagy") && MeetCfg.automagy)
		{
			BlockBookshelfInventarium.addRecipeAutomagy();
		}
		MiddleEarthResearch.addResearch();
		LotrAspectRegister.setAspectLotr();
		
	}

}
