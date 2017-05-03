package amazigJj.AmazigFood.items;

import amazigJj.AmazigFood.Reference;
import net.minecraft.item.ItemFood;

public class ItemCherry extends ItemFood {
	public ItemCherry() {
		super(2, 0.2F, false);
		setUnlocalizedName(Reference.AmazigFoodItems.Cherry.getUnlocalizedName());
		setRegistryName(Reference.AmazigFoodItems.Cherry.getRegistryName());
	}
}
