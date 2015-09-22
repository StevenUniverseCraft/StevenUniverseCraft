package stevenuniversecraft.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;
import stevenuniversecraft.entity.EntityBlaster;
import stevenuniversecraft.entity.EntityWaterHand;
import stevenuniversecraft.render.RenderBlaster;
import stevenuniversecraft.render.RenderWaterHand;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerRenderers()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityBlaster.class, new RenderBlaster());
		RenderingRegistry.registerEntityRenderingHandler(EntityWaterHand.class, new RenderWaterHand());
	}
}
