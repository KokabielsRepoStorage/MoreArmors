package com.puppy681nuff.morearmors.init;

import java.util.ArrayList;
import java.util.List;

import com.puppy681nuff.morearmors.blocks.DirtOre;
import com.puppy681nuff.morearmors.blocks.RubyBlock;
import com.puppy681nuff.morearmors.blocks.RubyOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static final List<Block> BLOCKS =  new ArrayList<Block>();
	
	public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);
	public static final Block RUBY_ORE = new RubyOre("ruby_ore", Material.ROCK);
	public static final Block DIRT_ORE = new DirtOre("dirt_ore", Material.ROCK);
	
}
