package com.puppy681nuff.morearmors.items.armor;

import com.puppy681nuff.morearmors.Main;



import com.puppy681nuff.morearmors.init.ModItems;
import com.puppy681nuff.morearmors.util.IHasModel;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ArmorBase extends ItemArmor implements IHasModel{

	public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.morearmors);
		setMaxStackSize(1);
		ModItems.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() {
	  Main.proxy.registerItemRederer(this, 0, "inventory");
	}
	
	@Override
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default)
	{
		return super.getArmorModel(entityLiving, itemStack, armorSlot, _default);
		
	}

}
