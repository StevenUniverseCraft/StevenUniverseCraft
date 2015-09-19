package stevenuniversecraft.init;

import net.minecraft.item.Item;
import stevenuniversecraft.item.ItemFireGauntlet;
import stevenuniversecraft.item.ItemTest;

public class SUCraftItems
{
	public static Item test;
	public static Item fire_gauntlet;
	
	public static void init()
	{
		test = new ItemTest();
		fire_gauntlet = new ItemFireGauntlet();
	}
}
