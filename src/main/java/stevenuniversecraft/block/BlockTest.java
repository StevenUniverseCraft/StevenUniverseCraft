package stevenuniversecraft.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTest extends Block
{
	private static final String name = "test_block";
	
	public BlockTest()
	{
		super(Material.piston);
		setBlockName(name);
		setCreativeTab(CreativeTabs.tabMisc);
		GameRegistry.registerBlock(this, name);
	}
}
