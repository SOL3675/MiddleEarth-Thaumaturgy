package sol3675.middleearththaumaturgy.common.tileentities;

import net.minecraftforge.common.util.ForgeDirection;
import sol3675.middleearththaumaturgy.config.MeetCfg;
import thaumcraft.api.aspects.IAspectSource;
import thaumcraft.api.aspects.IEssentiaTransport;
import thaumcraft.common.tiles.TileJarFillable;

public class TileExtralargeEssentiaJar extends TileJarFillable implements IAspectSource, IEssentiaTransport{
	
	public int max = MeetCfg.extralargeJarCapacity;
	
	public TileExtralargeEssentiaJar() {
		this.maxAmount = this.max;
	}
	
	@Override
	public int getMinimumSuction() {
	  return this.aspectFilter != null ? 64 : 56;
	}

	@Override
	public int getSuctionAmount(ForgeDirection loc) {
		if (this.amount < this.maxAmount){
			return this.aspectFilter != null ? 64 : 56;
		}
		return 0;
	}

}
