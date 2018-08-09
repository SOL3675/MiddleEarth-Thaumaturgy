package sol3675.middleearththaumaturgy.helper;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class LotrBlocks {
	
public static Block get(String name) {
		
		return GameRegistry.findBlock("lotr", name);
		
	}

}
