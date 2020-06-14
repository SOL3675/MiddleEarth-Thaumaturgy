package sol3675.middleearththaumaturgy.common.items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import lotr.common.fac.LOTRAlignmentValues;
import lotr.common.fac.LOTRFaction;
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
import sol3675.middleearththaumaturgy.config.MeetCfg;
import sol3675.middleearththaumaturgy.references.FactionIDs;
import sol3675.middleearththaumaturgy.references.GuiIDs;
import sol3675.middleearththaumaturgy.references.LibMisc;

public class ItemHandheldFactionCrafter extends Item{

	@SideOnly(Side.CLIENT)
	public IIcon[] icons;

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
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.HOBBIT)>=1.0F || MeetCfg.cheatFactionRecipe)
				{
					player.openGui(MiddleEarthThaumaturgy.instance, GuiIDs.HOBBIT, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.HOBBIT);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.rangerTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.RANGER_NORTH)>=1.0F || MeetCfg.cheatFactionRecipe)
				{
					player.openGui(MiddleEarthThaumaturgy.instance, GuiIDs.RANGER, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.RANGER_NORTH);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.blueDwarvenTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.BLUE_MOUNTAINS)>=1.0F || MeetCfg.cheatFactionRecipe)
				{
					player.openGui(MiddleEarthThaumaturgy.instance, GuiIDs.BLUE_MOUNTAINS, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.BLUE_MOUNTAINS);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.highElvenTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.HIGH_ELF)>=1.0F || MeetCfg.cheatFactionRecipe)
				{
					player.openGui(MiddleEarthThaumaturgy.instance, GuiIDs.LINDON, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.HIGH_ELF);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.gundabadTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.GUNDABAD)>=1.0F || MeetCfg.cheatFactionRecipe)
				{
					player.openGui(MiddleEarthThaumaturgy.instance, GuiIDs.GUNDABAD, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.GUNDABAD);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.angmarTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.ANGMAR)>=1.0F || MeetCfg.cheatFactionRecipe)
				{
					player.openGui(MiddleEarthThaumaturgy.instance, GuiIDs.ANGMAR, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.ANGMAR);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.woodElvenTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.WOOD_ELF)>=1.0F || MeetCfg.cheatFactionRecipe)
				{
					player.openGui(MiddleEarthThaumaturgy.instance, GuiIDs.WOOD_ELF, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.WOOD_ELF);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.dolGuldurTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.DOL_GULDUR)>=1.0F || MeetCfg.cheatFactionRecipe)
				{
					player.openGui(MiddleEarthThaumaturgy.instance, GuiIDs.DOL_GULDUR, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.DOL_GULDUR);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.daleTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.DALE)>=1.0F || MeetCfg.cheatFactionRecipe)
				{
					player.openGui(MiddleEarthThaumaturgy.instance, GuiIDs.DALISH, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.DALE);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.dwarvenTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.DURINS_FOLK)>=1.0F || MeetCfg.cheatFactionRecipe)
				{
					player.openGui(MiddleEarthThaumaturgy.instance, GuiIDs.DWARVEN, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.DURINS_FOLK);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.elvenTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.LOTHLORIEN)>=1.0F || MeetCfg.cheatFactionRecipe)
				{
					player.openGui(MiddleEarthThaumaturgy.instance, GuiIDs.GALADHRIM, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.LOTHLORIEN);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.dunlendingTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.DUNLAND)>=1.0F || MeetCfg.cheatFactionRecipe)
				{
					player.openGui(MiddleEarthThaumaturgy.instance, GuiIDs.DUNLENDING, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.DUNLAND);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.urukTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.ISENGARD)>=1.0F || MeetCfg.cheatFactionRecipe)
				{
					player.openGui(MiddleEarthThaumaturgy.instance, GuiIDs.URUK, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.ISENGARD);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.rohirricTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.ROHAN)>=1.0F || MeetCfg.cheatFactionRecipe)
				{
					player.openGui(MiddleEarthThaumaturgy.instance, GuiIDs.ROHIRRIC, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.ROHAN);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.gondorianTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.GONDOR)>=1.0F || MeetCfg.cheatFactionRecipe)
				{
					player.openGui(MiddleEarthThaumaturgy.instance, GuiIDs.GONDORIAN, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.GONDOR);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.dolAmrothTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.GONDOR)>=1.0F || MeetCfg.cheatFactionRecipe)
				{
					player.openGui(MiddleEarthThaumaturgy.instance, GuiIDs.DOL_AMROTH, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.GONDOR);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.morgulTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.MORDOR)>=1.0F || MeetCfg.cheatFactionRecipe)
				{
					player.openGui(MiddleEarthThaumaturgy.instance, GuiIDs.MORGUL, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.MORDOR);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.dorwinionTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.DORWINION)>=1.0F || MeetCfg.cheatFactionRecipe)
				{
					player.openGui(MiddleEarthThaumaturgy.instance, GuiIDs.DORWINION, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.DORWINION);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.rhunTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.RHUDEL)>=1.0F || MeetCfg.cheatFactionRecipe)
				{
					player.openGui(MiddleEarthThaumaturgy.instance, GuiIDs.RHUNIC, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.RHUDEL);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.nearHaradTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.NEAR_HARAD)>=1.0F || MeetCfg.cheatFactionRecipe)
				{
					player.openGui(MiddleEarthThaumaturgy.instance, GuiIDs.HARADRIC, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.NEAR_HARAD);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.moredainTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.MORWAITH)>=1.0F || MeetCfg.cheatFactionRecipe)
				{
					player.openGui(MiddleEarthThaumaturgy.instance, GuiIDs.MOREDAIN, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.MORWAITH);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.tauredainTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.TAURETHRIM)>=1.0F || MeetCfg.cheatFactionRecipe)
				{
					player.openGui(MiddleEarthThaumaturgy.instance, GuiIDs.TAUREDAIN, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.TAURETHRIM);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.halfTrollTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.HALF_TROLL)>=1.0F || MeetCfg.cheatFactionRecipe)
				{
					player.openGui(MiddleEarthThaumaturgy.instance, GuiIDs.HALF_TROLL, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.HALF_TROLL);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.rivendellTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.HIGH_ELF)>=1.0F || MeetCfg.cheatFactionRecipe)
				{
					player.openGui(MiddleEarthThaumaturgy.instance, GuiIDs.RIVENDELL, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.HIGH_ELF);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.umbarTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.NEAR_HARAD)>=1.0F || MeetCfg.cheatFactionRecipe)
				{
					player.openGui(MiddleEarthThaumaturgy.instance, GuiIDs.UMBARIC, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.NEAR_HARAD);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.gulfTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.NEAR_HARAD)>=1.0F || MeetCfg.cheatFactionRecipe)
				{
					player.openGui(MiddleEarthThaumaturgy.instance, GuiIDs.GULFEN, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.NEAR_HARAD);
				}
			}
			else if(firstItem.isItemEqual(new ItemStack(LOTRMod.breeTable)))
			{
				if(LOTRLevelData.getData(player).getAlignment(LOTRFaction.BREE)>= 1.0F || MeetCfg.cheatFactionRecipe)
				{
					player.openGui(MiddleEarthThaumaturgy.instance, GuiIDs.BREE, world, MathHelper.ceiling_double_int(player.posX), MathHelper.ceiling_double_int(player.posY), MathHelper.ceiling_double_int(player.posZ));
				}
				else
				{
					LOTRAlignmentValues.notifyAlignmentNotHighEnough(player, 1, LOTRFaction.BREE);
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
