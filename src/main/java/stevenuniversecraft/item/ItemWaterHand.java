package stevenuniversecraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import stevenuniversecraft.entity.EntityWaterHand;
import stevenuniversecraft.init.SUCraftItems;

public class ItemWaterHand extends ItemSUCraft
{
	public ItemWaterHand()
	{
		super("water_hand");
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabCombat);
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
				world.spawnEntityInWorld(new EntityWaterHand(world, player));
			}
		}
		if (player.inventory.consumeInventoryItem(SUCraftItems.water_hand_ammo))
		{
			player.swingItem();
		//	world.playSoundAtEntity(player, StevenUniverseCraft.MODID + ":", 0.5F, 1.0F);
			if (!world.isRemote)
			{
				world.spawnEntityInWorld(new EntityWaterHand(world, player));
			}
			
		}
		return stack;
	}
}
