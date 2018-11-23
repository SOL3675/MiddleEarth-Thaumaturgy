package sol3675.middleearththaumaturgy.common.tileentities;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.ForgeDirection;
import sol3675.middleearththaumaturgy.config.MeetCfg;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.IAspectSource;
import thaumcraft.api.aspects.IEssentiaTransport;
import thaumcraft.common.tiles.TileJarFillable;

public class TileExtralargeEssentiaJar extends TileJarFillable implements IAspectSource, IEssentiaTransport{
	
	public int max = MeetCfg.extralargeJarCapacity;
	
	public TileExtralargeEssentiaJar() {
		this.maxAmount = this.max;
	}
	
	@Override
	public void readCustomNBT(NBTTagCompound nbt)
	{
		this.aspect = Aspect.getAspect(nbt.getString("Aspect"));
		this.aspectFilter = Aspect.getAspect(nbt.getString("AspectFilter"));
		this.amount = nbt.getInteger("Amount");
		this.facing = nbt.getByte("facing");
	}
	
	@Override
	public void writeCustomNBT(NBTTagCompound nbt)
	{
		if(this.aspect != null)
		{
			nbt.setString("Aspect", this.aspect.getTag());
		}
		if(this.aspectFilter != null)
		{
			nbt.setString("AspectFilter", this.aspectFilter.getTag());
		}
		nbt.setInteger("Amount", this.amount);
		nbt.setByte("facing", (byte)this.facing);
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
