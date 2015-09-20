package stevenuniversecraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ItemRosesSword extends ItemSUCraftSword
{
	public ItemRosesSword()
	{
		super("roses_sword", ToolMaterial.EMERALD);
		setMaxDamage(50);
		maxStackSize = 1;
		setCreativeTab(CreativeTabs.tabCombat);
	}

	@Override
	public int getItemEnchantability()
	{
		return 0;
	}

	@Override
	public int getMaxItemUseDuration(ItemStack par1ItemStack)
	{
		return 1;
	}
}