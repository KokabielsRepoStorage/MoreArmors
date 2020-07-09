package com.puppy681nuff.morearmors.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RubyBlock extends BlockBase {

	public RubyBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(4.0f);
		setResistance(5f);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(3f);
		
	}
	
}
