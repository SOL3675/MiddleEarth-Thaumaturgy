package sol3675.middleearththaumaturgy.gui;

import baubles.common.network.PacketHandler;
import lotr.common.LOTRAlignmentValues;
import lotr.common.LOTRFaction;
import lotr.common.LOTRLevelData;
import lotr.common.LOTRMod;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import sol3675.middleearththaumaturgy.MiddleEarthThaumaturgy;
import sol3675.middleearththaumaturgy.common.items.ItemHandheldFactionCrafter;
import sol3675.middleearththaumaturgy.references.GuiIDs;
import sol3675.middleearththaumaturgy.references.LibMisc;

public class HandheldCrafterGuiContainer extends GuiContainer{
	private static final ResourceLocation BACKGROUND = new ResourceLocation(LibMisc.MODFULLID, "textures/gui/crafter.png");

	public HandheldCrafterGuiContainer(InventoryPlayer inventoryplayer)
	{
		super(new HandheldCrafterContainer(inventoryplayer));
		this.ySize = 222;
	}

	@Override
	public void initGui()
	{
		super.initGui();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int x, int foo)
	{
		this.fontRendererObj.drawString(StatCollector.translateToLocal("container.crafter"), 8, 6, 0);
		this.fontRendererObj.drawString(StatCollector.translateToLocal("inventory"), 8, this.ySize - 96 + 2, 0);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTick, int mouseX, int mouseZ) {
		this.mc.renderEngine.bindTexture(BACKGROUND);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
	}

}
