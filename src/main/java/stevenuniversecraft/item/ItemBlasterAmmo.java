package stevenuniversecraft.item;

import net.minecraft.creativetab.CreativeTabs;

public class ItemBlasterAmmo extends ItemSUCraft
{
	public ItemBlasterAmmo()
	{
		super("blaster_ammo");
		setMaxStackSize(16);
		setCreativeTab(CreativeTabs.tabCombat);
	}
}
