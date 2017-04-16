package amazigJj.AmazigFood.blocks;

import amazigJj.AmazigFood.AmazigFood;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockLogCherry extends Block {
	public BlockLogCherry() {
		super(Material.WOOD);
		setUnlocalizedName(AmazigFood.AmazigFoodBlocks.CherryLog.getUnlocalizedName());
		setRegistryName(AmazigFood.AmazigFoodBlocks.CherryLog.getUnlocalizedName());
		
		this.setHardness(2.0F);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
}