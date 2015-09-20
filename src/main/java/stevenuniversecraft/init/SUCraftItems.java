package stevenuniversecraft.init;

import net.minecraft.item.Item;
import stevenuniversecraft.item.ItemFireGauntlet;

public class SUCraftItems
{
	public static Item fire_gauntlet;
	
	public static void init()
	{
		fire_gauntlet = new ItemFireGauntlet();
	}
}
