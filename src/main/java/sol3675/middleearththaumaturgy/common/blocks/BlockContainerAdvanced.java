package sol3675.middleearththaumaturgy.common.blocks;

import java.util.ArrayList;

import org.lwjgl.input.Keyboard;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidTankInfo;
import net.minecraftforge.fluids.IFluidHandler;
import sol3675.middleearththaumaturgy.common.tileentities.IRedstoneSensitive;
import sol3675.middleearththaumaturgy.common.tileentities.IRedstoneSensitive.RedstoneSet;

public abstract class BlockContainerAdvanced extends BlockContainerRedstone{
	
	public TileEntity dummy;

	public BlockContainerAdvanced() {
		super();
		dummy = createNewTileEntity(null, 0);
	}

	NBTTagCompound comp = new NBTTagCompound();
	
	@Override
	public void breakBlock(World w, int x, int y, int z, Block b, int meta) {
		TileEntity tile = w.getTileEntity(x, y, z);
		comp = new NBTTagCompound();
		if(tile != null) {
			tile.writeToNBT(comp);
			w.removeTileEntity(x, y, z);
		}
	}

	@Override
	public ArrayList<ItemStack> getDrops(World w, int x, int y, int z, int metadata, int fortune) {
		ItemStack drop = new ItemStack(this, 1, metadata);
		drop.stackTagCompound = (NBTTagCompound)comp.copy();
		ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		drops.add(drop);
		return drops;
	}
	
	@Override
	public void onBlockPlacedBy(World w, int x, int y, int z, EntityLivingBase player,	ItemStack items) {
		if(items != null && items.hasTagCompound()) {
			items.stackTagCompound.setInteger("x", x);
			items.stackTagCompound.setInteger("y", y);
			items.stackTagCompound.setInteger("z", z);
			if(w.getTileEntity(x, y, z)!=null){
				w.getTileEntity(x, y, z).readFromNBT(items.stackTagCompound);
			}
		}
	}
	
	@Override
	public boolean onBlockActivated(World w, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
		TileEntity te = w.getTileEntity(x, y, z);
		ItemStack items = player.inventory.mainInventory[player.inventory.currentItem];
		return super.onBlockActivated(w, x, y, z, player, side, hitX, hitY, hitZ);
	}
	
	public void getNBTInfo(NBTTagCompound comp, ArrayList<String> l, int meta){
		dummy.readFromNBT(comp);
		if(dummy instanceof thaumcraft.api.aspects.IAspectContainer){
			if(Keyboard.isKeyDown(Keyboard.KEY_A)){
				thaumcraft.api.aspects.AspectList al = ((thaumcraft.api.aspects.IAspectContainer)dummy).getAspects();
				for(thaumcraft.api.aspects.Aspect as: al.getAspects()){
					if(al.getAmount(as)>0){
						l.add(as.getName() + ":" + al.getAmount(as));
					}
				}
			}else{
				l.add(EnumChatFormatting.WHITE.toString() + EnumChatFormatting.ITALIC + StatCollector.translateToLocal("info.meet:a"));
			}
		}
		if(dummy instanceof IRedstoneSensitive){
			RedstoneSet set = RedstoneSet.load(comp);
			l.add("Redstone Setting: " + set.toString());
		}
		if(dummy instanceof IFluidHandler){
			FluidTankInfo[] infoTanks = ((IFluidHandler)dummy).getTankInfo(null);
			for(FluidTankInfo info:infoTanks) {
				if(info.fluid != null) {
					l.add(info.fluid.getLocalizedName() + ": " + info.fluid.amount + "/" + info.capacity);
				}
			}
		}
	}
	
}
