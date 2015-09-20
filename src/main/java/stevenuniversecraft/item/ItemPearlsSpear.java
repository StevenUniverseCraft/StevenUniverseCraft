package stevenuniversecraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ItemPearlsSpear extends ItemSUCraftSword
{
	public ItemPearlsSpear()
	{
		super("pearls_spear", ToolMaterial.EMERALD); //TODO temporary
		setCreativeTab(CreativeTabs.tabCombat);
		setMaxDamage(20);
		maxStackSize = 1;
	}

	@Override
	public int getItemEnchantability()
	{
		return 0;
	}

	@Override
	public int getMaxItemUseDuration(ItemStack stack)
	{
		return 0;
	}
}
