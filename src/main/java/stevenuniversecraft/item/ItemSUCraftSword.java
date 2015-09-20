package stevenuniversecraft.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemSword;
import stevenuniversecraft.StevenUniverseCraft;

public class ItemSUCraftSword extends ItemSword
{
	private String name = "sucraft_unnamed";
	
	public ItemSUCraftSword(String name, ToolMaterial material)
	{
		super(material);
		this.name = name;
		setUnlocalizedName(this.name);
		setTextureName(StevenUniverseCraft.MODID + ":" + this.name);
		GameRegistry.registerItem(this, this.name);
	}
}
