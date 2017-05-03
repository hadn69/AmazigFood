package amazigJj.AmazigFood;

import amazigJj.AmazigFood.init.ModBlocks;
import amazigJj.AmazigFood.init.ModItems;
import amazigJj.AmazigFood.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSION)
public class AmazigFood {
	
	@Instance
	public static AmazigFood instance;
	
	@SidedProxy(clientSide = "amazigJj.AmazigFood.proxy.ClientProxy", serverSide ="amazigJj.AmazigFood.proxy.ServerProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		System.out.println("Amazig Stuff shall Happen: PreInit");
		
		ModItems.init();
		ModItems.register();
		ModBlocks.init();
		ModBlocks.register();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		System.out.println("Amazig Stuff shall Happen: Init");
		
		proxy.init();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		System.out.println("Amazig Stuff shall Happen: PostInit");
		
	}
	

}