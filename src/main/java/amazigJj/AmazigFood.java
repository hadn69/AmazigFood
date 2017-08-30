package amazigJj;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(   modid=AmazigFood.MOD_ID,
        name = AmazigFood.MOD_NAME,
        version = AmazigFood.VERSION,
        acceptedMinecraftVersions = AmazigFood.MC_VERSIONS)
@Mod.EventBusSubscriber
public class AmazigFood {

    public static final String MOD_ID = "cherry", MOD_NAME = "Cherry";
    public static final String VERSION = "1.0.0", MC_VERSIONS = "[1.12,1.13)";

    public static final Item CHERRY = new ItemFood(1, 0.1f, false)
            .setRegistryName(AmazigFood.MOD_ID + ":cherry")
            .setUnlocalizedName(AmazigFood.MOD_ID + ".cherry");

    @SubscribeEvent
    public static void onItemRegistry(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(CHERRY);
    }

    @SubscribeEvent @SideOnly(Side.CLIENT)
    public static void onModelRegistry(ModelRegistryEvent event) {
        ResourceLocation name = CHERRY.getRegistryName();
        ModelResourceLocation mrl = new ModelResourceLocation(name, "inventory");
        ModelLoader.setCustomModelResourceLocation(CHERRY, 0, mrl);
    }

}
