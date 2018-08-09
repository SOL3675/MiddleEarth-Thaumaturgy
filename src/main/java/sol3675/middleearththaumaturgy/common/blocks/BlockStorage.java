package sol3675.middleearththaumaturgy.common.blocks;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import sol3675.middleearththaumaturgy.MiddleEarthThaumaturgy;
import sol3675.middleearththaumaturgy.references.LibMisc;

public class BlockStorage extends Block{
	
	public static final String[] BLOCKNAMES = {
			"guldurilBlackUruk",
			"ithildinBlueDwarven",
			"ithildinDwarven",
			"edhelmirElven",
			"daedelosGalvorn",
			"staredMithril",
			"daedelosMorgul",
			"durnaurOrc",
			"guldurilUruk",
			"brightenGildediron"
	};
	
	public static final IIcon[] TEXTURES = new IIcon[BLOCKNAMES.length];
	public static final int[] LIGHT = {4,4,4,5,4,15,0,7,4,10};
	public static final float[] HARDNESS = {5,5,5,5,5,30,5,5,5,5};
	public static final float[] RESISTANCE = {6,6,6,6,6,120,6,6,6,6};
	
	public BlockStorage() {
		
		super(Material.iron);
		setHardness(5.0F);
		setResistance(10.0F);
		setStepSound(soundTypeMetal);
		setCreativeTab(MiddleEarthThaumaturgy.tabMiddleEarthThaumaturgy);
		setBlockName(LibMisc.MODID + ":" + "storage");
		
		setHarvestLevel("pickaxe", 2);
		setHarvestLevel("pickaxe", 1, 0);
		setHarvestLevel("pickaxe", 1, 1);
		setHarvestLevel("pickaxe", 3, 6);
		setHarvestLevel("pickaxe", 3, 12);
	}
	
	@Override
	public void getSubBlocks(Item item, CreativeTabs tab, List list) {
		
		for (int i = 0; i < BLOCKNAMES.length; ++i) {
			list.add(new ItemStack(item, 1, i));
		}
		
	}
	
	@Override
	public int getLightValue(IBlockAccess world, int x, int y, int z) {
		return LIGHT[world.getBlockMetadata(x, y, z)];
	}
	
	@Override
	public float getBlockHardness(World world, int x, int y, int z) {
		return HARDNESS[world.getBlockMetadata(x, y, z)];
	}
	
	@Override
	public float getExplosionResistance(Entity entity, World world, int x, int y, int z, double explosionX, double explosionY, double explosionZ) {
		return RESISTANCE[world.getBlockMetadata(x, y, z)];
	}
	
	@Override
	public int damageDropped(int i) {
		return i;
	}
	
	@Override
	public boolean canCreatureSpawn(EnumCreatureType type, IBlockAccess world, int x, int y, int z) {

		return false;
	}
	
	@Override
	public boolean canProvidePower() {

		return true;
	}

	@Override
	public boolean isBeaconBase(IBlockAccess worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ) {

		return true;
	}
	
	@Override
	public boolean isNormalCube(IBlockAccess world, int x, int y, int z) {

		return true;
	}
	
	@Override
	public IIcon getIcon(int side, int metadata) {
		return TEXTURES[metadata];
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister ir) {
		
		for (int i = 0; i < BLOCKNAMES.length; ++i) {
			TEXTURES[i] = ir.registerIcon(LibMisc.MODFULLID + ":Block_" + BLOCKNAMES[i]);
		}
		
	}

}
