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

@Mod(modid = AmazigFood.MOD_ID, name = AmazigFood.NAME, version = AmazigFood.VERSION, acceptedMinecraftVersions = AmazigFood.ACCEPTED_VERSION)
public class AmazigFood {
	
	public static final String MOD_ID = "amazigfood";
	public static final String NAME = "AmazigFood";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSION = "[1.11.2]";
	
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
	
	public static enum AmazigFoodItems {
		Cherry("cherry", "itemcherry");
		
		private String unlocalizedName;
		private String registryName;
		
		AmazigFoodItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
	
		
		public String getUnlocalizedName(){
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
		
	}
	public static enum AmazigFoodBlocks {
		CherryLog("cherrylog","blocklogcherry"),
		CherryLeaves("cherryLeaves","blockleavescherry"),
		CherrySapling("cherrysapling","blocksaplingcherry");
		
		private String unlocalizedName;
		private String registryName;
		
		AmazigFoodBlocks(String unlocalizedName, String registryName){
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName(){
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
}