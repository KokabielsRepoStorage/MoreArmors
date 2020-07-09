package com.puppy681nuff.morearmors.items.food;

import com.puppy681nuff.morearmors.Main;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class DirtApple extends FoodBase{
	public DirtApple(String name, int amount, float saturation, boolean isAnimalFood) {
		super(name, amount, saturation, isAnimalFood);
		setCreativeTab(Main.morearmors);
		setAlwaysEdible();
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player){
	        if (!worldIn.isRemote){
	            //Effect 1
	            player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 99999, 254));
	            //Effect 2
	            player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 99999, 255));
	            //Effect 3
	            player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 99999, 255));
	            //Effect 4
	            player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 99999, 255));
	            //Effect 5
	            player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 99999, 255));
	            //Effect 6
	            player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 99999, 1));
	            //Effect 7
	            player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, (5 * 60), 255));
	            //Effect 8
	            player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 99999, 1));
	            //Effect 9
	            player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 99999, 255));
	            
	        }
	    }
}
