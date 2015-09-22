package stevenuniversecraft.render;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import stevenuniversecraft.model.ModelBullet;

public class RenderWaterHand extends Render
{
	ModelBullet bullet = new ModelBullet();
	ResourceLocation texture = new ResourceLocation("textures/blocks/water_still.png");
	
	@Override
	public void doRender(Entity entity, double x, double y, double z, float yaw, float partialTick)
	{
		GL11.glPushMatrix();
        bindEntityTexture(entity);
        GL11.glTranslatef((float)x, (float)y, (float)z);
        GL11.glScalef(2.0F, 2.0F, 2.0F);
        GL11.glEnable(GL12.GL_RESCALE_NORMAL);
        bullet.bullet.render(0.0625F);
        GL11.glPopMatrix();
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity)
	{
		return texture;
	}
}
