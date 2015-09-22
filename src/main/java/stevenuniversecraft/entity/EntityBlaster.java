package stevenuniversecraft.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityBlaster extends EntityThrowable
{
	public EntityBlaster(World world)
	{
		super(world);
	}
	
	public EntityBlaster(World world, EntityLivingBase entity)
	{
		super(world, entity);
	}
	
	public EntityBlaster(World world, double x, double y, double z)
	{
		super(world, x, y, z);
	}
	
	private void explode()
	{
		int bx = (int)posX;
		int by = (int)posY;
		int bz = (int)posZ;
		worldObj.createExplosion(this, posX, posY, posZ, 0.75F, true);
		/*
		for (int x = bx - 4; x <= bx + 4; x++)
		{
			for (int y = by - 4; y <= by + 4; y++)
			{
				for (int z = bz - 4; z <= bz + 4; z++)
				{
					Block block = worldObj.getBlock(x, y, z);
					if (block.equals(Blocks.redstone_wire) || block instanceof BlockRedstoneDiode)
					{
						block.dropBlockAsItem(worldObj, x, y, z, worldObj.getBlockMetadata(x, y, z), 0);
						worldObj.setBlockToAir(x, y, z);
					}
				}
			}
		}
		*/
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
			worldObj.spawnParticle("fireworksSpark", posX, posY, posZ, x, y, z);
		}
	}
	
	@Override
	protected float getGravityVelocity()
    {
        return 0.005F;
    }


	@Override
	public void onImpact(MovingObjectPosition mop)
	{
		explode();
	}
}
