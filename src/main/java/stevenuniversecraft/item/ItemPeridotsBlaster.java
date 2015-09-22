package stevenuniversecraft.item;

import org.lwjgl.input.Keyboard;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import stevenuniversecraft.entity.EntityBlaster;
import stevenuniversecraft.init.SUCraftItems;

public class ItemPeridotsBlaster extends ItemSUCraft
{
	public ItemPeridotsBlaster()
	{
		super("peridots_blaster");
		setCreativeTab(CreativeTabs.tabCombat);
		setMaxStackSize(1);
		setMaxDamage(0);
	}
	
	@Override
	public void onUpdate(ItemStack stack, World world, Entity entity, int i, boolean b)
	{
		if (entity instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer)entity;
			if (player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() == this)
			{
				if (Keyboard.isKeyDown(Keyboard.KEY_SPACE))
				{
					if (player.motionY <= 5)
					{
						player.motionY += 0.15F;
					}
					if (player.motionY <= 0.5F)
					{
						player.motionY += 0.1F;
					}
				}
			}
		}
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
	{
		if (player.capabilities.isCreativeMode)
		{
			player.swingItem();
		//	world.playSoundAtEntity(player, StevenUniverseCraft.MODID + ":", 0.5F, 1.0F);
			if (!world.isRemote)
			{
				world.spawnEntityInWorld(new EntityBlaster(world, player));
			}
		}
		if (player.inventory.consumeInventoryItem(SUCraftItems.blaster_ammo))
		{
			player.swingItem();
		//	world.playSoundAtEntity(player, StevenUniverseCraft.MODID + ":", 0.5F, 1.0F);
			if (!world.isRemote)
			{
				world.spawnEntityInWorld(new EntityBlaster(world, player));
			}
			
		}
		return stack;
	}
}
