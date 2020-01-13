package sol3675.middleearththaumaturgy.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public abstract class CraftTablesGuiContainer extends GuiContainer
{
	private static ResourceLocation craftingTexture = new ResourceLocation("textures/gui/container/crafting_table.png");
	private String unlocalizedName;
	
	public CraftTablesGuiContainer(CraftTablesContainer container, String un)
	{
		super(container);
		this.unlocalizedName = un;
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int i, int j)
	{
		String title = StatCollector.translateToLocal("container.crafting." + this.unlocalizedName);
		this.fontRendererObj.drawString(title, 28, 6, 4210752);
		this.fontRendererObj.drawString(StatCollector.translateToLocal("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j)
	{
		org.lwjgl.opengl.GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.getTextureManager().bindTexture(craftingTexture);
		drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
	}
	
	public static class Hobbit extends CraftTablesGuiContainer
	{
		public Hobbit(InventoryPlayer inventory, World world, int i, int j, int k)
		{
			super(new CraftTablesContainer.Hobbit(inventory, world, i, j, k), "hobbit");
		}
	}
	
	public static class Ranger extends CraftTablesGuiContainer
	{
		public Ranger(InventoryPlayer inventory, World world, int i, int j, int k)
		{
			super(new CraftTablesContainer.Ranger(inventory, world, i, j, k), "ranger");
		}
	}
	
	public static class BlueMountains extends CraftTablesGuiContainer
	{
		public BlueMountains(InventoryPlayer inventory, World world, int i, int j, int k)
		{
			super(new CraftTablesContainer.BlueMountains(inventory, world, i, j, k), "blue_mountains");
		}
	}
	
	public static class Lindon extends CraftTablesGuiContainer
	{
		public Lindon(InventoryPlayer inventory, World world, int i, int j, int k)
		{
			super(new CraftTablesContainer.Lindon(inventory, world, i, j, k), "lindon");
		}
	}
	
	public static class Gundabad extends CraftTablesGuiContainer
	{
		public Gundabad(InventoryPlayer inventory, World world, int i, int j, int k)
		{
			super(new CraftTablesContainer.Gundabad(inventory, world, i, j, k), "gundabad");
		}
	}
	
	public static class Angmar extends CraftTablesGuiContainer
	{
		public Angmar(InventoryPlayer inventory, World world, int i, int j, int k)
		{
			super(new CraftTablesContainer.Angmar(inventory, world, i, j, k), "angmar");
		}
	}
	
	public static class WoodElf extends CraftTablesGuiContainer
	{
		public WoodElf(InventoryPlayer inventory, World world, int i, int j, int k)
		{
			super(new CraftTablesContainer.WoodElf(inventory, world, i, j, k), "wood_elf");
		}
	}
	
	public static class DolGuldur extends CraftTablesGuiContainer
	{
		public DolGuldur(InventoryPlayer inventory, World world, int i, int j, int k)
		{
			super(new CraftTablesContainer.DolGuldur(inventory, world, i, j, k), "dol_guldur");
		}
	}
	
	public static class Dale extends CraftTablesGuiContainer
	{
		public Dale(InventoryPlayer inventory, World world, int i, int j, int k)
		{
			super(new CraftTablesContainer.Dale(inventory, world, i, j, k), "dale");
		}
	}
	
	public static class Dwarven extends CraftTablesGuiContainer
	{
		public Dwarven(InventoryPlayer inventory, World world, int i, int j, int k)
		{
			super(new CraftTablesContainer.Dwarven(inventory, world, i, j, k), "dwarven");
		}
	}
	
	public static class Galadhrim extends CraftTablesGuiContainer
	{
		public Galadhrim(InventoryPlayer inventory, World world, int i, int j, int k)
		{
			super(new CraftTablesContainer.Galadhrim(inventory, world, i, j, k), "galadhrim");
		}
	}
	
	public static class Dunlending extends CraftTablesGuiContainer
	{
		public Dunlending(InventoryPlayer inventory, World world, int i, int j, int k)
		{
			super(new CraftTablesContainer.Dunlending(inventory, world, i, j, k), "dunlending");
		}
	}
	
	public static class Uruk extends CraftTablesGuiContainer
	{
		public Uruk(InventoryPlayer inventory, World world, int i, int j, int k)
		{
			super(new CraftTablesContainer.Uruk(inventory, world, i, j, k), "uruk");
		}
	}
	
	public static class Rohirric extends CraftTablesGuiContainer
	{
		public Rohirric(InventoryPlayer inventory, World world, int i, int j, int k)
		{
			super(new CraftTablesContainer.Rohirric(inventory, world, i, j, k), "rohirric");
		}
	}
	
	public static class Gondorian extends CraftTablesGuiContainer
	{
		public Gondorian(InventoryPlayer inventory, World world, int i, int j, int k)
		{
			super(new CraftTablesContainer.Gondorian(inventory, world, i, j, k), "gondorian");
		}
	}
	
	public static class DolAmroth extends CraftTablesGuiContainer
	{
		public DolAmroth(InventoryPlayer inventory, World world, int i, int j, int k)
		{
			super(new CraftTablesContainer.DolAmroth(inventory, world, i, j, k), "dol_amroth");
		}
	}
	
	public static class Morgul extends CraftTablesGuiContainer
	{
		public Morgul(InventoryPlayer inventory, World world, int i, int j, int k)
		{
			super(new CraftTablesContainer.Morgul(inventory, world, i, j, k), "morgul");
		}
	}
	
	public static class Dorwinion extends CraftTablesGuiContainer
	{
		public Dorwinion(InventoryPlayer inventory, World world, int i, int j, int k)
		{
			super(new CraftTablesContainer.Dorwinion(inventory, world, i, j, k), "dorwinion");
		}
	}
	
	public static class Rhunic extends CraftTablesGuiContainer
	{
		public Rhunic(InventoryPlayer inventory, World world, int i, int j, int k)
		{
			super(new CraftTablesContainer.Rhunic(inventory, world, i, j, k), "rhun");
		}
	}
	
	public static class Haradric extends CraftTablesGuiContainer
	{
		public Haradric(InventoryPlayer inventory, World world, int i, int j, int k)
		{
			super(new CraftTablesContainer.Haradric(inventory, world, i, j, k), "haradric");
		}
	}
	
	public static class Moredain extends CraftTablesGuiContainer
	{
		public Moredain(InventoryPlayer inventory, World world, int i, int j, int k)
		{
			super(new CraftTablesContainer.Moredain(inventory, world, i, j, k), "moredain");
		}
	}
	
	public static class Tauredain extends CraftTablesGuiContainer
	{
		public Tauredain(InventoryPlayer inventory, World world, int i, int j, int k)
		{
			super(new CraftTablesContainer.Tauredain(inventory, world, i, j, k), "tauredain");
		}
	}
	
	public static class HalfTroll extends CraftTablesGuiContainer
	{
		public HalfTroll(InventoryPlayer inventory, World world, int i, int j, int k)
		{
			super(new CraftTablesContainer.HalfTroll(inventory, world, i, j, k), "half-troll");
		}
	}
	
	public static class Rivendell extends CraftTablesGuiContainer
	{
		public Rivendell(InventoryPlayer inventory, World world, int i, int j, int k)
		{
			super(new CraftTablesContainer.Rivendell(inventory, world, i, j, k), "rivendell");
		}
	}
	
	public static class Umbaric extends CraftTablesGuiContainer
	{
		public Umbaric(InventoryPlayer inventory, World world, int i, int j, int k)
		{
			super(new CraftTablesContainer.Umbaric(inventory, world, i, j, k), "umbar");
		}
	}
	
	public static class Gulfen extends CraftTablesGuiContainer
	{
		public Gulfen(InventoryPlayer inventory, World world, int i, int j, int k)
		{
			super(new CraftTablesContainer.Gulfen(inventory, world, i, j, k), "gulf");
		}
	}
}
