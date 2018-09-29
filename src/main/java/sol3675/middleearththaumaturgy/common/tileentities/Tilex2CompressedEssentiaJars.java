package sol3675.middleearththaumaturgy.common.tileentities;

import net.minecraftforge.common.util.ForgeDirection;
import sol3675.middleearththaumaturgy.config.MeetCfg;
import thaumcraft.api.aspects.IAspectSource;
import thaumcraft.api.aspects.IEssentiaTransport;
import thaumcraft.common.tiles.TileJarFillable;

public class Tilex2CompressedEssentiaJars extends TileJarFillable implements IAspectSource, IEssentiaTransport{
	
	public int max = MeetCfg.x2compressedJarCapacity;
	
	public Tilex2CompressedEssentiaJars() {
		this.maxAmount = this.max;
	}
	
	@Override
	public int getMinimumSuction() {
	  return this.aspectFilter != null ? 56 + (amount * 8 / this.max) : 48 + (amount * 8 / this.max);
	}

	@Override
	public int getSuctionAmount(ForgeDirection loc) {
		if (this.amount < this.maxAmount){
			if (this.aspectFilter != null) {
				return 56 + (amount * 8 / this.max);
			}
			return 48 + (amount * 8 / this.max);
		}
		return 0;
	}

}
