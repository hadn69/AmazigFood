package amazigJj.AmazigFood.init;

import amazigJj.AmazigFood.items.ItemCherry;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item cherry;
	
	public static void init(){
		cherry = new ItemCherry();
	}
	
	public static void register(){
		GameRegistry.register(cherry);
	}
	
	public static void registerRenders() {
		registerRender(cherry);
	}
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
