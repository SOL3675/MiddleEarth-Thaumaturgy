package sol3675.middleearththaumaturgy.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import sol3675.middleearththaumaturgy.client.TileCompressedEssentialJarsRenderer;
import sol3675.middleearththaumaturgy.common.tileentities.TileCompressedEssentiaJars;
import sol3675.middleearththaumaturgy.references.RenderIDs;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void initRenderers() {
		ClientRegistry.bindTileEntitySpecialRenderer(TileCompressedEssentiaJars.class, new TileCompressedEssentialJarsRenderer());
		RenderIDs.idEssentiaContainer = RenderingRegistry.getNextAvailableRenderId(); 
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
	}

	@Override
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
	}

}
