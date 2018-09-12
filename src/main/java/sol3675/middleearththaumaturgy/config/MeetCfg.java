package sol3675.middleearththaumaturgy.config;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class MeetCfg {
	
	//public static boolean compressedJars = true;
	//public static boolean extralargeJar = true;
	
	public static int compressedJarCapacity = 512;
	public static int x2compressedJarCapacity = 4096;
	public static int extralargeJarCapacity = Integer.MAX_VALUE;
	
	public static boolean easyFactionCrafter = false;
	
	
	public static void configurate(File cfgfile) {
		
		Configuration cfg = new Configuration(cfgfile);
		
		try {
			
			cfg.load();
			
			//compressedJars = cfg.get("general", "AvilableCompressedJars", compressedJars, "Disable to remove Compressed Jars").getBoolean(true);
			//extralargeJar = cfg.get("general", "AvilableExtralargeJars", extralargeJar, "Disable to remove Extralarge Jars").getBoolean(true);
			
			compressedJarCapacity = cfg.get("general", "CompressedJarCapacity", compressedJarCapacity, "Capacity of Compressed Jar").getInt(compressedJarCapacity);
			x2compressedJarCapacity = cfg.get("general", "x2CompressedJarCapacity", x2compressedJarCapacity, "Capacity of x2Compressed Jar").getInt(x2compressedJarCapacity);
			extralargeJarCapacity = cfg.get("general", "ExtralargeJarCapacity", extralargeJarCapacity, "Capacity of Extralarge Jar").getInt(extralargeJarCapacity);
			
			easyFactionCrafter = cfg.get("general", "AvailableEasyRecipeOfCrafter", easyFactionCrafter, "Enable to add easy way to craft HandheldFactionCrafter").getBoolean(false);
		}
		catch (Exception e) {
			
		}
		finally {
			cfg.save();
		}
		
	}

}
