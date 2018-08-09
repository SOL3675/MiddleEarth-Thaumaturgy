package sol3675.middleearththaumaturgy.helper;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class WorldHelper {
	
	public static void spawnEntityItem(World w, double x, double y, double z, ItemStack items){
		if ((items != null) && (items.stackSize > 0)) {
			float rx = w.rand.nextFloat() * 0.8F + 0.1F;
			float ry = w.rand.nextFloat() * 0.8F + 0.1F;
			float rz = w.rand.nextFloat() * 0.8F + 0.1F;

			EntityItem entityItem = new EntityItem(w, x + rx, y + ry, z + rz, new ItemStack(items.getItem(), items.stackSize, items.getItemDamage()));

			if (items.hasTagCompound()) {
				entityItem.getEntityItem().setTagCompound((NBTTagCompound)items.getTagCompound().copy());
			}

			float factor = 0.05F;
			entityItem.motionX = (w.rand.nextGaussian() * factor);
			entityItem.motionY = (w.rand.nextGaussian() * factor + 0.2000000029802322D);
			entityItem.motionZ = (w.rand.nextGaussian() * factor);
			w.spawnEntityInWorld(entityItem);
		}
	}

}
