package sol3675.middleearththaumaturgy.common.items.focis;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import sol3675.middleearththaumaturgy.MiddleEarthThaumaturgy;
import sol3675.middleearththaumaturgy.references.LibMisc;
import thaumcraft.api.wands.ItemFocusBasic;

public abstract class ItemMETTFocus extends ItemFocusBasic
{
	private String name;
	
	public ItemMETTFocus(String name)
	{
		super();
		setMaxDamage(0);
		setNoRepair();
		setMaxStackSize(1);
		this.name = name;
		this.setCreativeTab(MiddleEarthThaumaturgy.tabMiddleEarthThaumaturgy);
	}
	
	protected String getName()
	{
		return this.name;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister register)
	{
		register.registerIcon(LibMisc.MODFULLID + ":focus_" + getName());
	}
}
