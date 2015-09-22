package stevenuniversecraft.entity;

import java.util.List;
import java.util.Random;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityWaterHand extends EntityThrowable
{
	Random rand = new Random();
	
	public EntityWaterHand(World world)
	{
		super(world);
	}
	
	public EntityWaterHand(World world, EntityLivingBase entity)
	{
		super(world, entity);
	}

	public EntityWaterHand(World world, double x, double y, double z)
	{
		super(world, x, y, z);
	}
	
	private void explode()
	{
		AxisAlignedBB aabb = AxisAlignedBB.getBoundingBox(posX - 2.0F, posY - 2.0F, posZ - 2.0F, posX + 2.0F, posY + 2.0F, posZ + 2.0F);
		for (int i = 0; i < 200; i++)
		{
			worldObj.spawnParticle("splash", posX + ((float)(rand.nextInt(20) - 10) / 10.0F), posY + ((float)(rand.nextInt(20) - 10) / 10.0F), posZ + ((float)(rand.nextInt(20) - 10) / 10.0F), 0, 0, 0);
		}
		List<?> entities = worldObj.getEntitiesWithinAABB(EntityLiving.class, aabb);
		for (int i = 0; i < entities.size(); i++)
		{
			EntityLiving entity = (EntityLiving)entities.get(i);
			entity.addPotionEffect(new PotionEffect(2, 2400, 4));
			worldObj.spawnParticle("splash", posX, posY, posZ, 0, 0, 0);
		}
		setDead();
	}
	
	@Override
	public void onUpdate()
	{
		super.onUpdate();
		if (ticksExisted > 20)
		{
			explode();
		}
		
		for (int i = 0; i < 10; i++)
		{
			double x = (double)(rand.nextInt(10) - 5) / 100D;
			double y = (double)(rand.nextInt(10) - 5) / 100D;
			double z = (double)(rand.nextInt(10) - 5) / 100D;
			worldObj.spawnParticle("splash", posX, posY, posZ, x, y, z);
		}
	}
	
	@Override
	protected float getGravityVelocity()
    {
        return 0.005F;
    }

	@Override
	protected void onImpact(MovingObjectPosition mop)
	{
		explode();
	}

}
