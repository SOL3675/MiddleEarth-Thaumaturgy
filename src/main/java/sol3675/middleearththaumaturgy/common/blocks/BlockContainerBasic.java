package sol3675.middleearththaumaturgy.common.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import sol3675.middleearththaumaturgy.MiddleEarthThaumaturgy;

public abstract class BlockContainerBasic extends BlockContainer{
	
	public BlockContainerBasic() {
		super(Material.iron);
		setCreativeTab(MiddleEarthThaumaturgy.tabMiddleEarthThaumaturgy);
		setHardness(2F);
	}

}
