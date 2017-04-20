package amazigJj.AmazigFood.init;

import amazigJj.AmazigFood.blocks.*;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block logCherry;
	public static Block leavesCherry;
	public static Block saplingCherry;
	
	public static void init(){
		logCherry = new BlockLogCherry();
		leavesCherry = new BlockLeavesCherry();
		saplingCherry = new BlockSaplingCherry();
	}
	
	public static void register(){
		GameRegistry.register(logCherry);
		GameRegistry.register(leavesCherry);
		GameRegistry.register(saplingCherry);
	}
	
	public static void registerRenders() {
		registerRender(logCherry);
		registerRender(leavesCherry);
		registerRender(saplingCherry);
	}
	
	private static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
