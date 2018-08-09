package sol3675.middleearththaumaturgy.common.tileentities;

import cpw.mods.fml.common.registry.GameRegistry;
import sol3675.middleearththaumaturgy.common.blocks.MiddleEarthThaumaturgyBlocks;

public class MiddleEarthThaumaturgyTileentities {
	
	public static void addTileentities() {
		
		GameRegistry.registerTileEntity(TileCompressedEssentiaJars.class, "CompressedEssentiaJar");
		GameRegistry.registerTileEntity(Tilex2CompressedEssentiaJars.class, "x2CompressedEssentiaJar");
		GameRegistry.registerTileEntity(TileExtralargeEssentiaJar.class, "ExtralargeEssentiaJar");
		
	}

}
