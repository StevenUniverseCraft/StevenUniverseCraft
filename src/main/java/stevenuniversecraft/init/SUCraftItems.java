package stevenuniversecraft.init;

import net.minecraft.item.Item;
import stevenuniversecraft.item.*;

public class SUCraftItems
{
	public static Item fire_gauntlet;
	public static Item pearls_spear;
	public static Item gem_destabilizer;
	public static Item roses_sword;
	public static Item blaster;
	public static Item blaster_ammo;
	public static Item water_hand;
	public static Item water_hand_ammo;
	
	public static void init()
	{
		fire_gauntlet = new ItemFireGauntlet();
		pearls_spear = new ItemPearlsSpear();
		gem_destabilizer = new ItemGemDestabilizer();
		roses_sword = new ItemRosesSword();
		blaster = new ItemBlaster();
		blaster_ammo = new ItemBlasterAmmo();
		water_hand = new ItemWaterHand();
		water_hand_ammo = new ItemWaterHandAmmo();
	}
}
