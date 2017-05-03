package amazigJj.AmazigFood;

public class Reference {
	
	public static final String MOD_ID = "amazigfood";
	public static final String NAME = "AmazigFood";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSION = "[1.11.2]";
	
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
