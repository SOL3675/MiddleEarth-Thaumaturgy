package sol3675.middleearththaumaturgy.gui;

import lotr.common.LOTRAlignmentValues;
import lotr.common.LOTRFaction;
import lotr.common.LOTRLevelData;
import lotr.common.LOTRMod;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import sol3675.middleearththaumaturgy.references.LibMisc;

public class HandheldCrafterGuiContainer extends GuiContainer{
	private static final ResourceLocation BACKGROUND = new ResourceLocation(LibMisc.MODFULLID, "textures/gui/crafter_background.png");
	private EntityPlayer GuiOpener;
	private World world;
	private int xCoord, yCoord, zCoord;

	public HandheldCrafterGuiContainer(EntityPlayer _player, World _world, int x, int y, int z)
	{
		super(new MeetContainer(x, y, z));
		GuiOpener = _player;
		world = _world;
		xCoord = x;
		yCoord = y;
		zCoord = z;
	}

	@Override
	public void initGui()
	{
		super.initGui();
		this.buttonList.add(new GuiButton(0, this.guiLeft + 10, 50 + 20, 64, 16, "Hobbit"));
		this.buttonList.add(new GuiButton(1, this.guiLeft + 82, 50 + 20, 64, 16, "Ranger"));
		this.buttonList.add(new GuiButton(2, this.guiLeft + 10, 50 + 38, 64, 16, "Blue Mountains"));
		this.buttonList.add(new GuiButton(3, this.guiLeft + 82, 50 + 38, 64, 16, "Lindon"));
		this.buttonList.add(new GuiButton(4, this.guiLeft + 10, 50 + 56, 64, 16, "Gundabad"));
		this.buttonList.add(new GuiButton(5, this.guiLeft + 82, 50 + 56, 64, 16, "Angmar"));
		this.buttonList.add(new GuiButton(6, this.guiLeft + 10, 50 + 74, 64, 16, "Wood-Elven"));
		this.buttonList.add(new GuiButton(7, this.guiLeft + 82, 50 + 74, 64, 16, "Dol Guldur"));
		this.buttonList.add(new GuiButton(8, this.guiLeft + 10, 50 + 92, 64, 16, "Dalish"));
		this.buttonList.add(new GuiButton(9, this.guiLeft + 82, 50 + 92, 64, 16, "Dwarven"));
		this.buttonList.add(new GuiButton(10, this.guiLeft + 10, 50 + 110, 64, 16, "Galadhrim"));
		this.buttonList.add(new GuiButton(11, this.guiLeft + 82, 50 + 110, 64, 16, "Dunlending"));
		this.buttonList.add(new GuiButton(12, this.guiLeft + 10, 50 + 128, 64, 16, "Uruk"));
		this.buttonList.add(new GuiButton(13, this.guiLeft + 82, 50 + 128, 64, 16, "Rohirric"));
		this.buttonList.add(new GuiButton(14, this.guiLeft + 10, 50 + 146, 64, 16, "Gondorian"));
		this.buttonList.add(new GuiButton(15, this.guiLeft + 82, 50 + 146, 64, 16, "Dol Amroth"));
		this.buttonList.add(new GuiButton(16, this.guiLeft + 10, 50 + 164, 64, 16, "Morgul"));
		this.buttonList.add(new GuiButton(17, this.guiLeft + 82, 50 + 164, 64, 16, "Dorwinion"));
		this.buttonList.add(new GuiButton(18, this.guiLeft + 10, 50 + 182, 64, 16, "Rhunic"));
		this.buttonList.add(new GuiButton(19, this.guiLeft + 82, 50 + 182, 64, 16, "Haradric"));
		this.buttonList.add(new GuiButton(20, this.guiLeft + 10, 50 + 200, 64, 16, "Moredain"));
		this.buttonList.add(new GuiButton(21, this.guiLeft + 82, 50 + 200, 64, 16, "Tauredain"));
		this.buttonList.add(new GuiButton(22, this.guiLeft + 10, 50 + 218, 64, 16, "Half-troll"));
		this.buttonList.add(new GuiButton(23, this.guiLeft + 82, 50 + 218, 64, 16, "Rivendell"));
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int x, int foo)
	{
		this.fontRendererObj.drawString("Choose Faction Crafter", 8, -44, 0);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTick, int mouseX, int mouseZ) {
		this.mc.renderEngine.bindTexture(BACKGROUND);
		this.drawTexturedModalRect(this.guiLeft, 50, 0, 0, xSize, 256);
	}

	@Override
	protected void actionPerformed(GuiButton button)
	{
		if(button.id == 0)
		{
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.HOBBIT)>0) {
				GuiOpener.openGui(LOTRMod.instance, 44, world, xCoord, yCoord, zCoord);
			}
			else {
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.HOBBIT);
			}
		}
		if(button.id == 1)
		{
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.RANGER_NORTH)>0) {
				GuiOpener.openGui(LOTRMod.instance, 28, world, xCoord, yCoord, zCoord);
			}
			else {
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.RANGER_NORTH);
			}
		}
		if(button.id == 2)
		{
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.BLUE_MOUNTAINS)>0) {
				GuiOpener.openGui(LOTRMod.instance, 27, world, xCoord, yCoord, zCoord);
			}
			else {
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.BLUE_MOUNTAINS);
			}
		}
		if(button.id == 3)
		{
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.HIGH_ELF)>0) {
				GuiOpener.openGui(LOTRMod.instance, 26, world, xCoord, yCoord, zCoord);
			}
			else {
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.HIGH_ELF);
			}
		}
		if(button.id == 4)
		{
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.GUNDABAD)>0) {
				GuiOpener.openGui(LOTRMod.instance, 31, world, xCoord, yCoord, zCoord);
			}
			else {
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.GUNDABAD);
			}
		}
		if(button.id == 5)
		{
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.ANGMAR)>0) {
				GuiOpener.openGui(LOTRMod.instance, 23, world, xCoord, yCoord, zCoord);
			}
			else {
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.ANGMAR);
			}
		}
		if(button.id == 6)
		{
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.WOOD_ELF)>0) {
				GuiOpener.openGui(LOTRMod.instance, 12, world, xCoord, yCoord, zCoord);
			}
			else {
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.WOOD_ELF);
			}
		}
		if(button.id == 7)
		{
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.DOL_GULDUR)>0) {
				GuiOpener.openGui(LOTRMod.instance, 30, world, xCoord, yCoord, zCoord);
			}
			else {
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.DOL_GULDUR);
			}
		}
		if(button.id == 8)
		{
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.DALE)>0) {
				GuiOpener.openGui(LOTRMod.instance, 42, world, xCoord, yCoord, zCoord);
			}
			else {
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.DALE);
			}
		}
		if(button.id == 9)
		{
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.DWARF)>0) {
				GuiOpener.openGui(LOTRMod.instance, 4, world, xCoord, yCoord, zCoord);
			}
			else {
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.DWARF);
			}
		}
		if(button.id == 10)
		{
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.GALADHRIM)>0) {
				GuiOpener.openGui(LOTRMod.instance, 2, world, xCoord, yCoord, zCoord);
			}
			else {
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.GALADHRIM);
			}
		}
		if(button.id == 11)
		{
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.DUNLAND)>0) {
				GuiOpener.openGui(LOTRMod.instance, 18, world, xCoord, yCoord, zCoord);
			}
			else {
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.DUNLAND);
			}
		}
		if(button.id == 12)
		{
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.URUK_HAI)>0) {
				GuiOpener.openGui(LOTRMod.instance, 8, world, xCoord, yCoord, zCoord);
			}
			else {
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.URUK_HAI);
			}
		}
		if(button.id == 13)
		{
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.ROHAN)>0) {
				GuiOpener.openGui(LOTRMod.instance, 14, world, xCoord, yCoord, zCoord);
			}
			else {
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.ROHAN);
			}
		}
		if(button.id == 14)
		{
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.GONDOR)>0) {
				GuiOpener.openGui(LOTRMod.instance, 13, world, xCoord, yCoord, zCoord);
			}
			else {
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.GONDOR);
			}
		}
		if(button.id == 15)
		{
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.GONDOR)>0) {
				GuiOpener.openGui(LOTRMod.instance, 36, world, xCoord, yCoord, zCoord);
			}
			else {
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.GONDOR);
			}
		}
		if(button.id == 16)
		{
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.MORDOR)>0) {
				GuiOpener.openGui(LOTRMod.instance, 1, world, xCoord, yCoord, zCoord);
			}
			else {
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.MORDOR);
			}
		}
		if(button.id == 17)
		{
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.DORWINION)>0) {
				GuiOpener.openGui(LOTRMod.instance, 43, world, xCoord, yCoord, zCoord);
			}
			else {
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.DORWINION);
			}
		}
		if(button.id == 18)
		{
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.RHUN)>0) {
				GuiOpener.openGui(LOTRMod.instance, 49, world, xCoord, yCoord, zCoord);
			}
			else {
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.RHUN);
			}
		}
		if(button.id == 19)
		{
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.NEAR_HARAD)>0) {
				GuiOpener.openGui(LOTRMod.instance, 25, world, xCoord, yCoord, zCoord);
			}
			else {
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.NEAR_HARAD);
			}
		}
		if(button.id == 20)
		{
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.MOREDAIN)>0) {
				GuiOpener.openGui(LOTRMod.instance, 37, world, xCoord, yCoord, zCoord);
			}
			else {
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.MOREDAIN);
			}
		}
		if(button.id == 21)
		{
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.TAUREDAIN)>0) {
				GuiOpener.openGui(LOTRMod.instance, 39, world, xCoord, yCoord, zCoord);
			}
			else {
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.TAUREDAIN);
			}
		}
		if(button.id == 22)
		{
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.HALF_TROLL)>0) {
				GuiOpener.openGui(LOTRMod.instance, 34, world, xCoord, yCoord, zCoord);
			}
			else {
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.HALF_TROLL);
			}
		}
		if(button.id == 23)
		{
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.HIGH_ELF)>0) {
				GuiOpener.openGui(LOTRMod.instance, 51, world, xCoord, yCoord, zCoord);
			}
			else {
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.HIGH_ELF);
			}
		}
	}
}
