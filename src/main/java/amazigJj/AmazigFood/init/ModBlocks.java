package amazigJj.AmazigFood.init;

import amazigJj.AmazigFood.blocks.BlockLogCherry;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block logCherry;
	
	public static void init(){
		logCherry = new BlockLogCherry();
	}
	
	public static void register(){
		registerBlock(logCherry);
	}
	
	public static void registerBlock(Block block){
		GameRegistry.register(logCherry);
		
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders() {
		registerRender(logCherry);
	}
	
	private static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
