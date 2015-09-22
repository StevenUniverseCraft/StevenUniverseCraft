package stevenuniversecraft.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBullet extends ModelBase
{
	public ModelRenderer bullet = new ModelRenderer(this, 0, 0);
	
	public ModelBullet()
	{
		bullet.addBox(0, 0, 0, 1, 1, 1);
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		bullet.render(f5);
	}
}
