package sol3675.middleearththaumaturgy.common.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import lotr.common.LOTRMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import sol3675.middleearththaumaturgy.MiddleEarthResearch;
import sol3675.middleearththaumaturgy.MiddleEarthThaumaturgy;
import sol3675.middleearththaumaturgy.common.items.MiddleEarthThaumaturgyItems;
import sol3675.middleearththaumaturgy.references.LibMisc;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import tuhljin.automagy.blocks.IInventariumSlotUpgrade;
import tuhljin.automagy.blocks.ModBlocks;

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
	
	public static void addRecipeAutomagy()
	{
		MiddleEarthResearch.recipes.put("BookshelfInventarium", 
				ThaumcraftApi.addArcaneCraftingRecipe(
					"BOOKSHELFINVENTARIUM",
					new ItemStack(MiddleEarthThaumaturgyBlocks.bookshelfInventarium),
					(new AspectList()).add(Aspect.ORDER, 200).add(Aspect.EARTH, 350).add(Aspect.AIR, 200),
					new Object[] {"MMM", "BDB", "MMM",
						Character.valueOf('M'), new ItemStack(MiddleEarthThaumaturgyItems.materials, 1, 5),
						Character.valueOf('B'), new ItemStack(ModBlocks.enchantedBookshelf, 1, 0),
						Character.valueOf('D'), new ItemStack(LOTRMod.diamond)
					}
				)
			);
	}

}
