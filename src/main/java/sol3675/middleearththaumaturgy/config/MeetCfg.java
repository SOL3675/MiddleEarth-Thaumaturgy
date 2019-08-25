package sol3675.middleearththaumaturgy.config;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class MeetCfg {
	
	public static int configVersion = 1;
	
	public static boolean compressedJars = true;
	public static boolean extralargeJar = true;
	
	public static int compressedJarCapacity = 512;
	public static int x2compressedJarCapacity = 4096;
	public static int extralargeJarCapacity = Integer.MAX_VALUE;
	
	public static boolean easyFactionCrafter = false;
	
	public static boolean focusCanSpawnBombardier = false;
	
	public static boolean automagy = true;
	public static boolean thaumictinkerer = true;
	public static boolean travellersgear = true;
	
	public static void configurate(File cfgfile) {
		
		Configuration cfg = new Configuration(cfgfile);
		
		try {
			
			cfg.load();
			
			compressedJars = cfg.get("general", "AvilableCompressedJars", compressedJars, "Disable to remove Compressed Jars").getBoolean(true);
			extralargeJar = cfg.get("general", "AvilableExtralargeJars", extralargeJar, "Disable to remove Extralarge Jars").getBoolean(true);
			
			compressedJarCapacity = cfg.get("general", "CompressedJarCapacity", compressedJarCapacity, "Capacity of Compressed Jar. Default: 512, Max: 32767").getInt(compressedJarCapacity);
			x2compressedJarCapacity = cfg.get("general", "x2CompressedJarCapacity", x2compressedJarCapacity, "Capacity of x2Compressed Jar. Default: 4096, Max: 32767").getInt(x2compressedJarCapacity);
			extralargeJarCapacity = cfg.get("general", "ExtralargeJarCapacity", extralargeJarCapacity, "Capacity of Extralarge Jar").getInt(extralargeJarCapacity);
			
			easyFactionCrafter = cfg.get("general", "AvailableEasyRecipeOfCrafter", easyFactionCrafter, "Enable to add easy way to craft HandheldFactionCrafter").getBoolean(false);
			
			focusCanSpawnBombardier = cfg.get("general", "SummonFocusCanSpawnBombardier", focusCanSpawnBombardier, "Set true if you want to summon bombardier").getBoolean(false);
			
			automagy = cfg.getBoolean("automagyCompat", "Compat", true, "Disable to force remove automagy compat");
			thaumictinkerer = cfg.getBoolean("thaumictinkererCompat", "Compat", true, "Disable to force remove thaumictinkerer compat");
			travellersgear = cfg.getBoolean("travellersgearCompat", "Compat", true, "Disable to force remove travellersgear compat");
		}
		catch (Exception e) {
			
		}
		finally {
			cfg.save();
		}
		
	}

}
