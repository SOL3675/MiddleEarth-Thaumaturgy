package sol3675.middleearththaumaturgy.common.tileentities;

import net.minecraftforge.common.util.ForgeDirection;
import sol3675.middleearththaumaturgy.config.MeetCfg;
import thaumcraft.api.aspects.IAspectSource;
import thaumcraft.api.aspects.IEssentiaTransport;
import thaumcraft.common.tiles.TileJarFillable;

public class TileCompressedEssentiaJars extends TileJarFillable implements IAspectSource, IEssentiaTransport{
	
	public int max = MeetCfg.compressedJarCapacity;
	
	public TileCompressedEssentiaJars() {
		this.maxAmount = this.max;
	}
	
	@Override
	public int getMinimumSuction() {
	  return this.aspectFilter != null ? 56 + (amount/50) : 48 + (amount/50);
	}

	@Override
	public int getSuctionAmount(ForgeDirection loc) {
		if (this.amount < this.maxAmount){
			if (this.aspectFilter != null) {
				return 56 + (amount/50);
			}
			return 48 + (amount/50);
		}
		return 0;
	}

}
