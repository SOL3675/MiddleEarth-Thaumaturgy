package sol3675.middleearththaumaturgy.common.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import sol3675.middleearththaumaturgy.MiddleEarthThaumaturgy;
import sol3675.middleearththaumaturgy.references.LibMisc;
import tuhljin.automagy.blocks.IInventariumSlotUpgrade;

public class BlockBookshelfInventarium extends Block implements IInventariumSlotUpgrade{
	
	@SideOnly(Side.CLIENT)
	private IIcon sides;
	@SideOnly(Side.CLIENT)
	private IIcon ends;

	protected BlockBookshelfInventarium() {
		super(Material.wood);
		setHardness(1.0F);
		setResistance(1.0F);
		setStepSound(soundTypeWood);
		setCreativeTab(MiddleEarthThaumaturgy.tabMiddleEarthThaumaturgy);
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
	public boolean isNormalCube(IBlockAccess world, int x, int y, int z) {

		return true;
	}
	
	@Override
	public float getEnchantPowerBonus(World world, int x, int y, int z)
	{
		return 15;
	}

	@Override
	public int getInventariumSlotAllowance(IBlockAccess blockaccess, int x, int y, int z) {
		return 1048576;
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister register)
	{
		sides = register.registerIcon(LibMisc.MODFULLID + ":bookshelfInventarium");
		ends = register.registerIcon(LibMisc.MODFULLID + ":Block_staredMithril");
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int side, int metadata)
	{
		if(side == 0 || side == 1)
		{
			return ends;
		}
		else {
			return sides;
		}
	}

}
