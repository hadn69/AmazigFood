package amazigJj.AmazigFood.proxy;

import amazigJj.AmazigFood.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();		
	}

}
