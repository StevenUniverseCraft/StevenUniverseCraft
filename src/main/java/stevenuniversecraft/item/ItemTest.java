package stevenuniversecraft.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemTest extends Item
{
	private static final String name = "test_item";
	
	public ItemTest()
	{
		setUnlocalizedName(name);
		setCreativeTab(CreativeTabs.tabMisc);
		GameRegistry.registerItem(this, name);
	}
}
