package com.puppy681nuff.morearmors.items;

import com.puppy681nuff.morearmors.Main;
import com.puppy681nuff.morearmors.init.ModItems;
import com.puppy681nuff.morearmors.util.IHasModel;

import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{
	
	public ItemBase(String name)
	{
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
