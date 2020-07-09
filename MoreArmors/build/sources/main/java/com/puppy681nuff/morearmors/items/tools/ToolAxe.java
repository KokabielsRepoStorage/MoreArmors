package com.puppy681nuff.morearmors.items.tools;

import com.puppy681nuff.morearmors.Main;
import com.puppy681nuff.morearmors.init.ModItems;
import com.puppy681nuff.morearmors.util.IHasModel;

import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IHasModel {
	public ToolAxe(String name, ToolMaterial material)
	{
		super(material, 8.0F, -3.2F);
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
