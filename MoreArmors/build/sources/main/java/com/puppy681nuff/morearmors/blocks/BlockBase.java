package com.puppy681nuff.morearmors.blocks;

import com.puppy681nuff.morearmors.Main;
import com.puppy681nuff.morearmors.init.ModBlocks;
import com.puppy681nuff.morearmors.init.ModItems;
import com.puppy681nuff.morearmors.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel{
	public BlockBase(String name, Material material){
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRederer(Item.getItemFromBlock(this), 0, "normal");
	}
}
