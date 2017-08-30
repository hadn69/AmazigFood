package amazigJj;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid="cherry")
@Mod.EventBusSubscriber
public class amazigfood{

    public static final Item CHERRY = new ItemCherry();

    @SubscribeEvent
    public static void onItemRegistry(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(CHERRY);
    }

    @SubscribeEvent @SideOnly(Side.CLIENT)
    public static void onModelRegistry(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(CHERRY, 0, new ModelResourceLocation(CHERRY.getRegistryName(), "inventory"));
    }

    public static class ItemCherry extends ItemFood {

        public ItemCherry() {
            super(1, 1.0f, false);
            setRegistryName("cherry");
            setUnlocalizedName("cherry.cherry");
            setCreativeTab(CreativeTabs.FOOD);
        }

    }
}
