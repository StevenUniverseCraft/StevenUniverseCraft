package stevenuniversecraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import stevenuniversecraft.init.*;

@Mod(name = StevenUniverseCraft.NAME, modid = StevenUniverseCraft.MODID, version = StevenUniverseCraft.VERSION)
public class StevenUniverseCraft
{
	public static final String NAME = "Steven Universe Craft";
	public static final String MODID = "StevenUniverseCraft";
	public static final String VERSION = "1.7.10-A1"; //Alpha 1
	
	@Mod.Instance(StevenUniverseCraft.MODID)
	public static StevenUniverseCraft instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		SUCraftItems.init();
		SUCraftBlocks.init();
	}
}
