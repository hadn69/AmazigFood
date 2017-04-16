package amazigJj.AmazigFood.items;

import amazigJj.AmazigFood.AmazigFood;
import net.minecraft.item.ItemFood;

public class ItemCherry extends ItemFood {
	public ItemCherry() {
		super(2, 0.2F, false);
		setUnlocalizedName(AmazigFood.AmazigFoodItems.Cherry.getUnlocalizedName());
		setRegistryName(AmazigFood.AmazigFoodItems.Cherry.getRegistryName());
	}
}
