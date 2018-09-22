package sol3675.middleearththaumaturgy.common.items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import lotr.common.LOTRAlignmentValues;
import lotr.common.LOTRFaction;
import lotr.common.LOTRLevelData;
import lotr.common.LOTRMod;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import sol3675.middleearththaumaturgy.MiddleEarthThaumaturgy;
import sol3675.middleearththaumaturgy.references.FactionIDs;
import sol3675.middleearththaumaturgy.references.GuiIDs;
import sol3675.middleearththaumaturgy.references.LibMisc;

public class ItemHandheldFactionCrafter extends Item{

	@SideOnly(Side.CLIENT)
	public IIcon[] icons;

	private static final int HOBBIT = 44;
	private static final int RANGER = 28;
	private static final int BLUE_MOUNTAINS = 27;
	private static final int LINDON = 26;
	private static final int GUNDABAD = 31;
	private static final int ANGMAR = 23;
	private static final int WOOD_ELF = 12;
	private static final int DOL_GULDUR = 30;
	private static final int DALISH = 42;
	private static final int DWARVEN = 4;
	private static final int GALADHRIM = 2;
	private static final int DUNLENDING = 18;
	private static final int URUK = 8;
	private static final int ROHIRRIC = 14;
	private static final int GONDORIAN = 13;
	private static final int DOL_AMROTH = 36;
	private static final int MORGUL = 1;
	private static final int DORWINION = 43;
	private static final int RHUNIC = 49;
	private static final int HARADRIC = 25;
	private static final int MOREDAIN = 37;
	private static final int TAUREDAIN = 39;
	private static final int HALF_TROLL = 34;
	private static final int RIVENDELL = 51;
	private static final int UMBARIC = 56;
	private static final int GULFEN = 57;


	public ItemHandheldFactionCrafter() {
		this.setMaxStackSize(1);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		this.setCreativeTab(MiddleEarthThaumaturgy.tabMiddleEarthThaumaturgy);
		this.setUnlocalizedName("HandheldCrafter");
		this.setTextureName(LibMisc.MODFULLID + ":handheldCrafter");
	}

	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		if(!world.isRemote && player.isSneaking())
		{
			player.openGui(MiddleEarthThaumaturgy.instance, GuiIDs.HANDHELDCRAFTING, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
		}
		else if(!world.isRemote && stack.hasTagCompound()) {
			
			NBTTagList tags = (NBTTagList)stack.getTagCompound().getTag("Items");
			ItemStack firstItem = ItemStack.loadItemStackFromNBT(tags.getCompoundTagAt(0));
			
			if(firstItem == null)
			{
				//player.addChatComponentMessage(new ChatComponentTranslation("mett.chat." + "nocrafter"));
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.hobbitTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.HOBBIT)>0)
				{
					player.openGui(LOTRMod.instance, HOBBIT, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.HOBBIT);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.rangerTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.RANGER_NORTH)>0)
				{
					player.openGui(LOTRMod.instance, RANGER, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.RANGER_NORTH);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.blueDwarvenTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.BLUE_MOUNTAINS)>0)
				{
					player.openGui(LOTRMod.instance, BLUE_MOUNTAINS, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.BLUE_MOUNTAINS);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.highElvenTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.HIGH_ELF)>0)
				{
					player.openGui(LOTRMod.instance, LINDON, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.HIGH_ELF);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.gundabadTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.GUNDABAD)>0)
				{
					player.openGui(LOTRMod.instance, GUNDABAD, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.GUNDABAD);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.angmarTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.ANGMAR)>0)
				{
					player.openGui(LOTRMod.instance, ANGMAR, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.ANGMAR);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.woodElvenTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.WOOD_ELF)>0)
				{
					player.openGui(LOTRMod.instance, WOOD_ELF, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.WOOD_ELF);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.dolGuldurTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.DOL_GULDUR)>0)
				{
					player.openGui(LOTRMod.instance, DOL_GULDUR, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.DOL_GULDUR);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.daleTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.DALE)>0)
				{
					player.openGui(LOTRMod.instance, DALISH, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.DALE);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.dwarvenTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.DWARF)>0)
				{
					player.openGui(LOTRMod.instance, DWARVEN, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.DWARF);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.elvenTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.GALADHRIM)>0)
				{
					player.openGui(LOTRMod.instance, GALADHRIM, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.GALADHRIM);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.dunlendingTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.DUNLAND)>0)
				{
					player.openGui(LOTRMod.instance, DUNLENDING, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.DUNLAND);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.urukTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.URUK_HAI)>0)
				{
					player.openGui(LOTRMod.instance, URUK, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.URUK_HAI);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.rohirricTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.ROHAN)>0)
				{
					player.openGui(LOTRMod.instance, ROHIRRIC, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.ROHAN);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.gondorianTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.GONDOR)>0)
				{
					player.openGui(LOTRMod.instance, GONDORIAN, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.GONDOR);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.dolAmrothTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.GONDOR)>0)
				{
					player.openGui(LOTRMod.instance, DOL_AMROTH, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.GONDOR);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.morgulTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.MORDOR)>0)
				{
					player.openGui(LOTRMod.instance, MORGUL, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.MORDOR);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.dorwinionTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.DORWINION)>0)
				{
					player.openGui(LOTRMod.instance, DORWINION, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.DORWINION);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.rhunTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.RHUN)>0)
				{
					player.openGui(LOTRMod.instance, RHUNIC, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.RHUN);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.nearHaradTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.NEAR_HARAD)>0)
				{
					player.openGui(LOTRMod.instance, HARADRIC, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.NEAR_HARAD);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.moredainTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.MOREDAIN)>0)
				{
					player.openGui(LOTRMod.instance, MOREDAIN, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.MOREDAIN);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.tauredainTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.TAUREDAIN)>0)
				{
					player.openGui(LOTRMod.instance, TAUREDAIN, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.TAUREDAIN);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.halfTrollTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.HALF_TROLL)>0)
				{
					player.openGui(LOTRMod.instance, HALF_TROLL, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.HALF_TROLL);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.rivendellTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.HIGH_ELF)>0)
				{
					player.openGui(LOTRMod.instance, RIVENDELL, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.HIGH_ELF);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.umbarTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.NEAR_HARAD)>0)
				{
					player.openGui(LOTRMod.instance, UMBARIC, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.NEAR_HARAD);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.gulfTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.NEAR_HARAD)>0)
				{
					player.openGui(LOTRMod.instance, GULFEN, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.NEAR_HARAD);
				}
			}
		}
		else
		{
			//player.addChatComponentMessage(new ChatComponentTranslation("mett.chat." + "nocrafter"));
		}
		return stack;
	}

}
