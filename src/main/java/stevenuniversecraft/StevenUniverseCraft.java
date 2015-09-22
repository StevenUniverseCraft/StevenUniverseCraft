package stevenuniversecraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import stevenuniversecraft.entity.EntityBlaster;
import stevenuniversecraft.init.SUCraftBlocks;
import stevenuniversecraft.init.SUCraftItems;
import stevenuniversecraft.proxy.CommonProxy;

@Mod(name = StevenUniverseCraft.NAME, modid = StevenUniverseCraft.MODID, version = StevenUniverseCraft.VERSION)
public class StevenUniverseCraft
{
	public static final String NAME = "Steven Universe Craft";
	public static final String MODID = "StevenUniverseCraft";
	public static final String VERSION = "1.7.10-A1"; //Alpha 1
	
	@Mod.Instance(StevenUniverseCraft.MODID)
	public static StevenUniverseCraft instance;
	
	@SidedProxy(clientSide = "stevenuniversecraft.proxy.ClientProxy", serverSide = "stevenuniversecraft.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		SUCraftItems.init();
		SUCraftBlocks.init();
		EntityRegistry.registerModEntity(EntityBlaster.class, "blaster", 0, this, 64, 10, true);
		
		proxy.registerRenderers();
	}
}
