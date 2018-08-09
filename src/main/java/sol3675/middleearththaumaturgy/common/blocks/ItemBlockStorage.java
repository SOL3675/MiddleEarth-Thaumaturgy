package sol3675.middleearththaumaturgy.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import sol3675.middleearththaumaturgy.references.LibMisc;

public class ItemBlockStorage extends ItemBlock{
	
	public ItemBlockStorage(Block block) {
		
		super(block);
		setHasSubtypes(true);
		setMaxDamage(0);
		
	}
	
	@Override
	public String getUnlocalizedName(ItemStack item) {
		
		return "tile." + LibMisc.MODFULLID + ".storage" + BlockStorage.BLOCKNAMES[item.getItemDamage()];
		
	}
	
	@Override
	public int getMetadata(int i) {

		return i;
	}

}
