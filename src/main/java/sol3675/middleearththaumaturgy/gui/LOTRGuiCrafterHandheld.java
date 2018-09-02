package sol3675.middleearththaumaturgy.gui;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public abstract class LOTRGuiCrafterHandheld extends GuiContainer
{
	private static ResourceLocation craftingTexture = new ResourceLocation("textures/gui/container/crafting_table.png");
	private String unlocalizedName;
	
	public LOTRGuiCrafterHandheld(LOTRContainerCrafterHandheld container, String name)
	{
		super(container);
		this.unlocalizedName = name;
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int i, int j)
	{
		String title = StatCollector.translateToLocal("container.meet.lotrcrafterhandheld" + this.unlocalizedName);
		this.fontRendererObj.drawString(title, 28, 6, 4210752);
		this.fontRendererObj.drawString(StatCollector.translateToLocal("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_)
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.getTextureManager().bindTexture(craftingTexture);
		this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, xSize, ySize);
	}
	
	public static class Morgul extends LOTRGuiCrafterHandheld
	{
		public Morgul(InventoryPlayer inv, World world, int x, int y, int z)
		{
			super(new LOTRContainerCrafterHandheld.Morgul(inv, world, x, y, z), "morgul");
		}
	}
}
