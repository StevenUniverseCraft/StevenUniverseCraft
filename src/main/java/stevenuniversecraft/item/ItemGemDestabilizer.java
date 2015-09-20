package stevenuniversecraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ItemGemDestabilizer extends ItemSUCraft
{
	public ItemGemDestabilizer()
	{
		super("gem_destabilizer");
		setMaxDamage(1000);
		maxStackSize = 1;
		setCreativeTab(CreativeTabs.tabCombat);
	}

	@Override
	public int getItemEnchantability()
	{
		return 0;
	}

	@Override
	public int getMaxItemUseDuration(ItemStack stack)
	{
		return 1;
	}
}