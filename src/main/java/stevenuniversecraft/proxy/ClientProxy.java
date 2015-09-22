package stevenuniversecraft.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;
import stevenuniversecraft.entity.EntityBlaster;
import stevenuniversecraft.render.RenderBlaster;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerRenderers()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityBlaster.class, new RenderBlaster());
	}
}
