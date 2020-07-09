package com.puppy681nuff.morearmors.tabs;

import com.puppy681nuff.morearmors.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MoreArmors extends CreativeTabs{
	public MoreArmors(String label) {
		super("morearmors");
		this.setBackgroundImageName("morearmors.png");
		
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.DIRT_STICK);
	}
}
