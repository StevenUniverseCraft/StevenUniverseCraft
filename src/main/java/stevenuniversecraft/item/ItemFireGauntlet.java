package stevenuniversecraft.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import stevenuniversecraft.StevenUniverseCraft;

public class ItemFireGauntlet extends ItemSword
{
	private static final String name = "fire_gauntlet";
	
	public ItemFireGauntlet()
	{
		super(ToolMaterial.EMERALD); //TODO temporary
		setUnlocalizedName(name);
		setTextureName(StevenUniverseCraft.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabCombat);
		GameRegistry.registerItem(this, name);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
	{
		stack.damageItem(10, player);
		if (!world.isRemote)
		{
			Vec3 look = player.getLookVec();
			
			EntityLargeFireball fireball = new EntityLargeFireball(world, player, 1, 1, 1);
			fireball.setPosition(player.posX + look.xCoord * 5, player.posY + look.yCoord * 5, player.posZ + look.zCoord * 5);
			fireball.accelerationX = look.xCoord * 0.1;
			fireball.accelerationY = look.yCoord * 0.1;
			fireball.accelerationZ = look.zCoord * 0.1;
			world.spawnEntityInWorld(fireball);
		}
		return stack;
	}
}
