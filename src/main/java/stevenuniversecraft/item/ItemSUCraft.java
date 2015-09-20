package stevenuniversecraft.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import stevenuniversecraft.StevenUniverseCraft;

public class ItemSUCraft extends Item
{
	private String name = "sucraft_unnamed";
	
	public ItemSUCraft(String name)
	{
		this.name = name;
		setUnlocalizedName(this.name);
		setTextureName(StevenUniverseCraft.MODID + ":" + this.name);
		GameRegistry.registerItem(this, this.name);
	}
}
