package stevenuniversecraft.init;

import net.minecraft.item.Item;
import stevenuniversecraft.item.ItemGemDestabilizer;
import stevenuniversecraft.item.ItemFireGauntlet;
import stevenuniversecraft.item.ItemPearlsSpear;
import stevenuniversecraft.item.ItemRosesSword;

public class SUCraftItems
{
	public static Item fire_gauntlet;
	public static Item pearls_spear;
	public static Item gem_destabilizer;
	public static Item roses_sword;
	
	public static void init()
	{
		fire_gauntlet = new ItemFireGauntlet();
		pearls_spear = new ItemPearlsSpear();
		gem_destabilizer = new ItemGemDestabilizer();
		roses_sword = new ItemRosesSword();
	}
}
