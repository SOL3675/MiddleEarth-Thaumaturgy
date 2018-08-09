package sol3675.middleearththaumaturgy.helper;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class LotrItems {
	
	public static Item get(String name) {
		
		return GameRegistry.findItem("lotr", name);
		
	}

}
