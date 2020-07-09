package com.puppy681nuff.morearmors.blocks;

import java.util.Random;

import com.puppy681nuff.morearmors.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class DirtOre extends BlockBase{

	public DirtOre(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.GROUND);
		setHardness(5.0f);
		setResistance(15f);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(1f);
	}
	
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune){
		return ModItems.DIRT_INGOT;
	}
}
