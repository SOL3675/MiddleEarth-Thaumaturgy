package sol3675.middleearththaumaturgy.gui;

import lotr.common.LOTRAlignmentValues;
import lotr.common.LOTRFaction;
import lotr.common.LOTRLevelData;
import lotr.common.LOTRMod;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import sol3675.middleearththaumaturgy.MiddleEarthThaumaturgy;
import sol3675.middleearththaumaturgy.common.items.ItemHandheldFactionCrafter;
import sol3675.middleearththaumaturgy.references.GuiIDs;
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
		this.buttonList.add(new GuiButton(24, this.guiLeft + 10, 50 + 236, 64, 16, "Umbaric"));
		this.buttonList.add(new GuiButton(25, this.guiLeft + 82, 50 + 236, 64, 16, "Gulfen"));
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
		switch(button.id) {
		case 0:
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.HOBBIT)>0) {
				GuiOpener.getCurrentEquippedItem().setItemDamage(ItemHandheldFactionCrafter.TAG_HOBBIT);
				GuiOpener.closeScreen();
				GuiOpener.addChatComponentMessage(new ChatComponentTranslation("chat.mett.setFaction" + "chat.mett.hobbit"));
			}
			else {
				GuiOpener.closeScreen();
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.HOBBIT);
			}
			break;
		case 1:
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.RANGER_NORTH)>0) {
				GuiOpener.getCurrentEquippedItem().setItemDamage(ItemHandheldFactionCrafter.TAG_RANGER);
				GuiOpener.closeScreen();
				GuiOpener.addChatComponentMessage(new ChatComponentTranslation("chat.mett.setFaction" + "chat.mett.ranger"));
			}
			else {
				GuiOpener.closeScreen();
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.RANGER_NORTH);
			}
			break;
		case 2:
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.BLUE_MOUNTAINS)>0) {
				GuiOpener.getCurrentEquippedItem().setItemDamage(ItemHandheldFactionCrafter.TAG_BLUE_MOUNTAINS);
				GuiOpener.closeScreen();
				GuiOpener.addChatComponentMessage(new ChatComponentTranslation("chat.mett.setFaction" + "chat.mett.blue_mountains"));
			}
			else {
				GuiOpener.closeScreen();
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.BLUE_MOUNTAINS);
			}
			break;
		case 3:
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.HIGH_ELF)>0) {
				GuiOpener.getCurrentEquippedItem().setItemDamage(ItemHandheldFactionCrafter.TAG_LINDON);
				GuiOpener.closeScreen();
				GuiOpener.addChatComponentMessage(new ChatComponentTranslation("chat.mett.setFaction" + "chat.mett.lindon"));
			}
			else {
				GuiOpener.closeScreen();
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.HIGH_ELF);
			}
			break;
		case 4:
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.GUNDABAD)>0) {
				GuiOpener.getCurrentEquippedItem().setItemDamage(ItemHandheldFactionCrafter.TAG_GUNDABAD);
				GuiOpener.closeScreen();
				GuiOpener.addChatComponentMessage(new ChatComponentTranslation("chat.mett.setFaction" + "chat.mett.gundabad"));
			}
			else {
				GuiOpener.closeScreen();
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.GUNDABAD);
			}
			break;
		case 5:
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.ANGMAR)>0) {
				GuiOpener.getCurrentEquippedItem().setItemDamage(ItemHandheldFactionCrafter.TAG_ANGMAR);
				GuiOpener.closeScreen();
				GuiOpener.addChatComponentMessage(new ChatComponentTranslation("chat.mett.setFaction" + "chat.mett.angmar"));
			}
			else {
				GuiOpener.closeScreen();
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.ANGMAR);
			}
			break;
		case 6:
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.WOOD_ELF)>0) {
				GuiOpener.getCurrentEquippedItem().setItemDamage(ItemHandheldFactionCrafter.TAG_WOOD_ELF);
				GuiOpener.closeScreen();
				GuiOpener.addChatComponentMessage(new ChatComponentTranslation("chat.mett.setFaction" + "chat.mett.wood_elf"));
			}
			else {
				GuiOpener.closeScreen();
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.WOOD_ELF);
			}
			break;
		case 7:
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.DOL_GULDUR)>0) {
				GuiOpener.getCurrentEquippedItem().setItemDamage(ItemHandheldFactionCrafter.TAG_DOL_GULDUR);
				GuiOpener.closeScreen();
				GuiOpener.addChatComponentMessage(new ChatComponentTranslation("chat.mett.setFaction" + "chat.mett.dol_guldur"));
			}
			else {
				GuiOpener.closeScreen();
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.DOL_GULDUR);
			}
			break;
		case 8:
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.DALE)>0) {
				GuiOpener.getCurrentEquippedItem().setItemDamage(ItemHandheldFactionCrafter.TAG_DALISH);
				GuiOpener.closeScreen();
				GuiOpener.addChatComponentMessage(new ChatComponentTranslation("chat.mett.setFaction" + "chat.mett.dalish"));
			}
			else {
				GuiOpener.closeScreen();
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.DALE);
			}
			break;
		case 9:
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.DWARF)>0) {
				GuiOpener.getCurrentEquippedItem().setItemDamage(ItemHandheldFactionCrafter.TAG_DWARVEN);
				GuiOpener.closeScreen();
				GuiOpener.addChatComponentMessage(new ChatComponentTranslation("chat.mett.setFaction" + "chat.mett.dwarven"));
			}
			else {
				GuiOpener.closeScreen();
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.DWARF);
			}
			break;
		case 10:
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.GALADHRIM)>0) {
				GuiOpener.getCurrentEquippedItem().setItemDamage(ItemHandheldFactionCrafter.TAG_GALADHRIM);
				GuiOpener.closeScreen();
				GuiOpener.addChatComponentMessage(new ChatComponentTranslation("chat.mett.setFaction" + "chat.mett.galadhrim"));
			}
			else {
				GuiOpener.closeScreen();
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.GALADHRIM);
			}
			break;
		case 11:
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.DUNLAND)>0) {
				GuiOpener.getCurrentEquippedItem().setItemDamage(ItemHandheldFactionCrafter.TAG_DUNLENDING);
				GuiOpener.closeScreen();
				GuiOpener.addChatComponentMessage(new ChatComponentTranslation("chat.mett.setFaction" + "chat.mett.dunlending"));
			}
			else {
				GuiOpener.closeScreen();
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.DUNLAND);
			}
			break;
		case 12:
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.URUK_HAI)>0) {
				GuiOpener.getCurrentEquippedItem().setItemDamage(ItemHandheldFactionCrafter.TAG_URUK);
				GuiOpener.closeScreen();
				GuiOpener.addChatComponentMessage(new ChatComponentTranslation("chat.mett.setFaction" + "chat.mett.uruk"));
			}
			else {
				GuiOpener.closeScreen();
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.URUK_HAI);
			}
			break;
		case 13:
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.ROHAN)>0) {
				GuiOpener.getCurrentEquippedItem().setItemDamage(ItemHandheldFactionCrafter.TAG_ROHIRRIC);
				GuiOpener.closeScreen();
				GuiOpener.addChatComponentMessage(new ChatComponentTranslation("chat.mett.setFaction" + "chat.mett.rohirric"));
			}
			else {
				GuiOpener.closeScreen();
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.ROHAN);
			}
			break;
		case 14:
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.GONDOR)>0) {
				GuiOpener.getCurrentEquippedItem().setItemDamage(ItemHandheldFactionCrafter.TAG_GONDORIAN);
				GuiOpener.closeScreen();
				GuiOpener.addChatComponentMessage(new ChatComponentTranslation("chat.mett.setFaction" + "chat.mett.gondorian"));
			}
			else {
				GuiOpener.closeScreen();
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.GONDOR);
			}
			break;
		case 15:
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.GONDOR)>0) {
				GuiOpener.getCurrentEquippedItem().setItemDamage(ItemHandheldFactionCrafter.TAG_DOL_AMROTH);
				GuiOpener.closeScreen();
				GuiOpener.addChatComponentMessage(new ChatComponentTranslation("chat.mett.setFaction" + "chat.mett.dol_amroth"));
			}
			else {
				GuiOpener.closeScreen();
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.GONDOR);
			}
			break;
		case 16:
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.MORDOR)>0) {
				GuiOpener.getCurrentEquippedItem().setItemDamage(ItemHandheldFactionCrafter.TAG_MORGUL);
				GuiOpener.closeScreen();
				GuiOpener.addChatComponentMessage(new ChatComponentTranslation("chat.mett.setFaction" + "chat.mett.morgul"));
			}
			else {
				GuiOpener.closeScreen();
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.MORDOR);
			}
			break;
		case 17:
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.DORWINION)>0) {
				GuiOpener.getCurrentEquippedItem().setItemDamage(ItemHandheldFactionCrafter.TAG_DORWINION);
				GuiOpener.closeScreen();
				GuiOpener.addChatComponentMessage(new ChatComponentTranslation("chat.mett.setFaction" + "chat.mett.dorwinion"));
			}
			else {
				GuiOpener.closeScreen();
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.DORWINION);
			}
			break;
		case 18:
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.RHUN)>0) {
				GuiOpener.getCurrentEquippedItem().setItemDamage(ItemHandheldFactionCrafter.TAG_RHUNIC);
				GuiOpener.closeScreen();
				GuiOpener.addChatComponentMessage(new ChatComponentTranslation("chat.mett.setFaction" + "chat.mett.rhunic"));
			}
			else {
				GuiOpener.closeScreen();
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.RHUN);
			}
			break;
		case 19:
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.NEAR_HARAD)>0) {
				GuiOpener.getCurrentEquippedItem().setItemDamage(ItemHandheldFactionCrafter.TAG_HARADRIC);
				GuiOpener.closeScreen();
				GuiOpener.addChatComponentMessage(new ChatComponentTranslation("chat.mett.setFaction" + "chat.mett.haradric"));
			}
			else {
				GuiOpener.closeScreen();
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.NEAR_HARAD);
			}
			break;
		case 20:
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.MOREDAIN)>0) {
				GuiOpener.getCurrentEquippedItem().setItemDamage(ItemHandheldFactionCrafter.TAG_MOREDAIN);
				GuiOpener.closeScreen();
				GuiOpener.addChatComponentMessage(new ChatComponentTranslation("chat.mett.setFaction" + "chat.mett.moredain"));
			}
			else {
				GuiOpener.closeScreen();
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.MOREDAIN);
			}
			break;
		case 21:
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.TAUREDAIN)>0) {
				GuiOpener.getCurrentEquippedItem().setItemDamage(ItemHandheldFactionCrafter.TAG_TAUREDAIN);
				GuiOpener.closeScreen();
				GuiOpener.addChatComponentMessage(new ChatComponentTranslation("chat.mett.setFaction" + "chat.mett.tauredain"));
			}
			else {
				GuiOpener.closeScreen();
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.TAUREDAIN);
			}
			break;
		case 22:
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.HALF_TROLL)>0) {
				GuiOpener.getCurrentEquippedItem().setItemDamage(ItemHandheldFactionCrafter.TAG_HALF_TROLL);
				GuiOpener.closeScreen();
				GuiOpener.addChatComponentMessage(new ChatComponentTranslation("chat.mett.setFaction" + "chat.mett.half_troll"));
			}
			else {
				GuiOpener.closeScreen();
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.HALF_TROLL);
			}
			break;
		case 23:
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.HIGH_ELF)>0) {
				GuiOpener.getCurrentEquippedItem().setItemDamage(ItemHandheldFactionCrafter.TAG_RIVENDELL);
				GuiOpener.closeScreen();
				GuiOpener.addChatComponentMessage(new ChatComponentTranslation("chat.mett.setFaction" + "chat.mett.rivendell"));
			}
			else {
				GuiOpener.closeScreen();
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.HIGH_ELF);
			}
			break;
		case 24:
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.NEAR_HARAD)>0) {
				GuiOpener.getCurrentEquippedItem().setItemDamage(ItemHandheldFactionCrafter.TAG_UMBARIC);
				GuiOpener.closeScreen();
				GuiOpener.addChatComponentMessage(new ChatComponentTranslation("chat.mett.setFaction" + "chat.mett.umbaric"));
			}
			else {
				GuiOpener.closeScreen();
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.NEAR_HARAD);
			}
			break;
		case 25:
			if(LOTRLevelData.getData(GuiOpener).getAlignment(LOTRFaction.NEAR_HARAD)>0) {
				GuiOpener.getCurrentEquippedItem().setItemDamage(ItemHandheldFactionCrafter.TAG_GULFEN);
				GuiOpener.closeScreen();
				GuiOpener.addChatComponentMessage(new ChatComponentTranslation("chat.mett.setFaction" + "chat.mett.gulfen"));
			}
			else {
				GuiOpener.closeScreen();
				LOTRAlignmentValues.notifyAlignmentNotHighEnough(GuiOpener, 1, LOTRFaction.NEAR_HARAD);
			}
			break;
		default:
			GuiOpener.closeScreen();
			GuiOpener.addChatComponentMessage(new ChatComponentTranslation("chat.mett.setFaction.error"));
		}
	}
}
