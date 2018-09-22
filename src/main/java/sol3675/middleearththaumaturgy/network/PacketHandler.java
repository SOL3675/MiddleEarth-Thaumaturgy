package sol3675.middleearththaumaturgy.network;

import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;
import sol3675.middleearththaumaturgy.references.LibMisc;

public class PacketHandler {
	
	public static final SimpleNetworkWrapper INSTANCE = new SimpleNetworkWrapper(LibMisc.MODID);
	
	public static void init()
	{
		int id = 0;
		
	}

}
