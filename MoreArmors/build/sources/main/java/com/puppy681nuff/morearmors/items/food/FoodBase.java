package com.puppy681nuff.morearmors.items.food;

import com.puppy681nuff.morearmors.Main;
import com.puppy681nuff.morearmors.init.ModItems;
import com.puppy681nuff.morearmors.util.IHasModel;

import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel{
	public FoodBase(String name, int amount, float saturation, boolean isAnimalFood){
		super(amount, saturation, isAnimalFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.morearmors);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRederer(this, 0, "inventory");
		
	}
	
	
}
