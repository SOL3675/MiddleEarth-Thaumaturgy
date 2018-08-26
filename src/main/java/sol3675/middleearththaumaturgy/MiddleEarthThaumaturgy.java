package sol3675.middleearththaumaturgy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import sol3675.middleearththaumaturgy.proxy.CommonProxy;
import sol3675.middleearththaumaturgy.references.LibMisc;

@Mod(modid = LibMisc.MODID, name = LibMisc.MODNAME, version = LibMisc.VERSION, dependencies = LibMisc.DEPENDENCIES)

public class MiddleEarthThaumaturgy {
	
	public static final CreativeTabs tabMiddleEarthThaumaturgy = new CreativeTabMiddleEarthThaumaturgy("MiddleEarthThaumaturgy");
	
	@SidedProxy(clientSide="sol3675.middleearththaumaturgy.proxy.ClientProxy", serverSide="sol3675.middleearththaumaturgy.proxy.ServerProxy")
	public static CommonProxy proxy;
	
	
	@Instance
	public static MiddleEarthThaumaturgy instance = new MiddleEarthThaumaturgy();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
		
	}

}
