package amazigJj.AmazigFood.blocks;

import java.util.Random;

import com.teamwizardry.librarianlib.features.base.block.BlockModLeaves;

import amazigJj.AmazigFood.init.ModBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockLeavesCherry extends BlockModLeaves {
	public BlockLeavesCherry() {
		super("cherryLeaves");
	}
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(ModBlocks.saplingCherry);
	}
	@Override
	public Item func_180660_a(IBlockState arg0, Random arg1, int arg2) {
		
		return null;
	}

}