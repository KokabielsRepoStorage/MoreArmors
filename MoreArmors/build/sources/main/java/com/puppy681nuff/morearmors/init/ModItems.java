package com.puppy681nuff.morearmors.init;

import java.util.ArrayList;
import java.util.List;

import com.puppy681nuff.morearmors.items.ItemBase;
import com.puppy681nuff.morearmors.items.armor.ArmorBase;
import com.puppy681nuff.morearmors.items.food.DirtApple;
import com.puppy681nuff.morearmors.items.food.FoodBase;
import com.puppy681nuff.morearmors.items.food.FoodEffectBase;
import com.puppy681nuff.morearmors.items.tools.ToolAxe;
import com.puppy681nuff.morearmors.items.tools.ToolHoe;
import com.puppy681nuff.morearmors.items.tools.ToolPickaxe;
import com.puppy681nuff.morearmors.items.tools.ToolSpade;
import com.puppy681nuff.morearmors.items.tools.ToolSword;
import com.puppy681nuff.morearmors.util.Reference;

import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

@SuppressWarnings("unused")
public class ModItems {
	
	//Materials
	public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 2, 1561, 6.0F, 2.0F, 10);
	public static final ToolMaterial MATERIAL_DIRT = EnumHelper.addToolMaterial("material_dirt", 0, 16, 1.0f, 0.0f, 10);
	public static final ToolMaterial MATERIAL_EMERALD = EnumHelper.addToolMaterial("material_emerald", 3, 1561, 8.0F, 3.0f, 10);
	public static final ToolMaterial MATERIAL_DIAMOND = EnumHelper.addToolMaterial("material_diamond",3, 1561, 8.0F, 3.0F, 10);
	public static final ToolMaterial MATERIAL_GOLD = EnumHelper.addToolMaterial("material_gold",0, 32, 12.0F, 0.0F, 22);
	public static final ToolMaterial MATERIAL_IRON = EnumHelper.addToolMaterial("material_iron",2, 250, 6.0F, 2.0F, 14);
	public static final ToolMaterial MATERIAL_STONE = EnumHelper.addToolMaterial("material_stone",1, 131, 4.0F, 1.0F, 5);
	public static final ToolMaterial MATERIAL_WOOD = EnumHelper.addToolMaterial("material_wood",0, 59, 2.0F, 0.0F, 15);
	public static final ToolMaterial MATERIAL_DARK = EnumHelper.addToolMaterial("material_dark", 3, 15610, 8.0f, 30000.0f, 10);
	public static final ToolMaterial MATERIAL_LIGHT = EnumHelper.addToolMaterial("material_light", 5, 150000000, 8.0f, 10.0f, 10);
	
	//Armor Materials
	public static final ArmorMaterial ARMOR_MATERIAL_RUBY =  EnumHelper.addArmorMaterial("armor_material_ruby", Reference.MOD_ID + ":ruby", 14, new int[] {3, 8, 5, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 14);
	public static final ArmorMaterial ARMOR_MATERIAL_DIRT = EnumHelper.addArmorMaterial("armor_material_dirt", Reference.MOD_ID+ ":dirt", 3, new int[] {1, 2, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3);
	public static final ArmorMaterial ARMOR_MATERIAL_EMERALD = EnumHelper.addArmorMaterial("armor_material_emerald", Reference.MOD_ID+ ":emerald", 3, new int[] {4, 8, 6, 5}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 15);
	
	public static final List<Item> ITEMS = new ArrayList<Item>();

	public static final Item RUBY = new ItemBase("ruby");
	public static final Item DIRT_STICK = new ItemBase("dirt_stick");
	public static final Item DIRT_INGOT = new ItemBase("dirt_ingot");
	
	//Swords
	public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);
	public static final ItemSword DIRT_SWORD = new ToolSword("dirt_sword", MATERIAL_DIRT);
	public static final ItemSword EMERALD_SWORD = new ToolSword("emerald_sword", MATERIAL_EMERALD);
	public static final ItemSword DIAMOND_TRIDENT = new ToolSword("diamond_trident", MATERIAL_DIAMOND);
	public static final ItemSword GOLD_TRIDENT = new ToolSword("gold_trident", MATERIAL_GOLD);
	public static final ItemSword IRON_TRIDENT = new ToolSword("iron_trident", MATERIAL_IRON);
	public static final ItemSword STONE_TRIDENT = new ToolSword("stone_trident", MATERIAL_STONE);
	public static final ItemSword WOOD_TRIDENT = new ToolSword("wood_trident", MATERIAL_WOOD);
	public static final ItemSword WOOD_SPEAR = new ToolSword("wood_spear", MATERIAL_WOOD);
	public static final ItemSword STONE_SPEAR = new ToolSword("stone_spear", MATERIAL_STONE);
	public static final ItemSword IRON_SPEAR = new ToolSword("iron_spear", MATERIAL_IRON);
	public static final ItemSword GOLD_SPEAR = new ToolSword("gold_spear", MATERIAL_GOLD);
	public static final ItemSword DIAMOND_SPEAR = new ToolSword("diamond_spear", MATERIAL_DIAMOND);
	public static final ItemSword DIAMOND_SCYTHE = new ToolSword("diamond_scythe", MATERIAL_DIAMOND);
	public static final ItemSword WOOD_SCYTHE = new ToolSword("wood_scythe", MATERIAL_WOOD);
	public static final ItemSword STONE_SCYTHE = new ToolSword("stone_scythe", MATERIAL_STONE);
	public static final ItemSword IRON_SCYTHE = new ToolSword("iron_scythe", MATERIAL_IRON);
	public static final ItemSword GOLD_SCYTHE = new ToolSword("gold_scythe", MATERIAL_GOLD);
	public static final ItemSword RAPIER_DIAMOND = new ToolSword("rapier_diamond", MATERIAL_DIAMOND);
	public static final ItemSword RAPIER_GOLD = new ToolSword("rapier_gold", MATERIAL_GOLD);
	public static final ItemSword RAPIER_IRON = new ToolSword("rapier_iron", MATERIAL_IRON);
	public static final ItemSword RAPIER_STONE = new ToolSword("rapier_stone", MATERIAL_STONE);
	public static final ItemSword RAPIER_WOOD = new ToolSword("rapier_wood", MATERIAL_WOOD);
	public static final ItemSword LONGSWORD_DIAMOND = new ToolSword("longsword_diamond", MATERIAL_DIAMOND);
	public static final ItemSword LONGSWORD_GOLD = new ToolSword("longsword_gold", MATERIAL_GOLD);
	public static final ItemSword LONGSWORD_IRON = new ToolSword("longsword_iron", MATERIAL_IRON);
	public static final ItemSword LONGSWORD_STONE = new ToolSword("longsword_stone", MATERIAL_STONE);
	public static final ItemSword LONGSWORD_WOOD = new ToolSword("longsword_wood", MATERIAL_WOOD);
	public static final ItemSword SCYTHE_DARK = new ToolSword ("scythe_dark", MATERIAL_DARK);
	public static final ItemSword KATANA_DIAMOND = new ToolSword("katana_diamond", MATERIAL_DIAMOND);
	public static final ItemSword KATANA_GOLD = new ToolSword("katana_gold", MATERIAL_GOLD);
	public static final ItemSword KATANA_IRON = new ToolSword("katana_iron", MATERIAL_IRON);
	public static final ItemSword KATANA_STONE = new ToolSword("katana_stone", MATERIAL_STONE);
	public static final ItemSword KATANA_WOOD = new ToolSword("katana_wood", MATERIAL_WOOD);
	public static final ItemSword DAGGER_DIAMOND = new ToolSword("dagger_diamond", MATERIAL_DIAMOND);
	public static final ItemSword DAGGER_GOLD = new ToolSword("dagger_gold", MATERIAL_GOLD);
	public static final ItemSword DAGGER_IRON = new ToolSword("dagger_iron", MATERIAL_IRON);
	public static final ItemSword DAGGER_STONE = new ToolSword("dagger_stone", MATERIAL_STONE);
	public static final ItemSword DAGGER_WOOD = new ToolSword("dagger_wood", MATERIAL_WOOD);
	public static final ItemSword ECLIPSE_BLADE_BLUE = new ToolSword("eclipse_blade_blue", MATERIAL_LIGHT);
	public static final ItemSword ECLIPSE_BLADE_TAN = new ToolSword("eclipse_blade_tan", MATERIAL_LIGHT);
	
	
	//Shovels
	public static final ItemSpade RUBY_SHOVEL = new ToolSpade("ruby_shovel", MATERIAL_RUBY);
	public static final ItemSpade DIRT_SHOVEL = new ToolSpade("dirt_shovel", MATERIAL_DIRT);
	public static final ItemSpade EMERALD_SHOVEL = new ToolSpade("emerald_shovel", MATERIAL_EMERALD);
	
	//Pickaxe
	public static final ItemPickaxe RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", MATERIAL_RUBY);
	public static final ItemPickaxe DIRT_PICKAXE = new ToolPickaxe("dirt_pickaxe", MATERIAL_DIRT);
	public static final ItemPickaxe EMERALD_PICKAXE = new ToolPickaxe("emerald_pickaxe", MATERIAL_EMERALD);
	
	//Axe
	public static final ItemAxe RUBY_AXE = new ToolAxe("ruby_axe", MATERIAL_RUBY);
	public static final ItemAxe DIRT_AXE = new ToolAxe("dirt_axe", MATERIAL_DIRT);
	public static final ItemAxe EMERALD_AXE = new ToolAxe("emerald_axe", MATERIAL_EMERALD);
	public static final ItemAxe BATTLE_AXE_DIAMOND = new ToolAxe("battle_axe_diamond", MATERIAL_DIAMOND);
	public static final ItemAxe BATTLE_AXE_GOLD = new ToolAxe("battle_axe_gold", MATERIAL_GOLD);
	public static final ItemAxe BATTLE_AXE_IRON = new ToolAxe("battle_axe_iron", MATERIAL_IRON);
	public static final ItemAxe BATTLE_AXE_STONE = new ToolAxe("battle_axe_stone", MATERIAL_STONE);
	public static final ItemAxe BATTLE_AXE_WOOD = new ToolAxe("battle_axe_wood", MATERIAL_WOOD);
	
	//hoe
	public static final ItemHoe RUBY_HOE = new ToolHoe("ruby_hoe", MATERIAL_RUBY);
	public static final ItemHoe DIRT_HOE = new ToolHoe("dirt_hoe", MATERIAL_DIRT);
	public static final ItemHoe EMERALD_HOE = new ToolHoe("emerald_hoe", MATERIAL_EMERALD);
	
	//Helmets
	public static final Item RUBY_HELMET = new ArmorBase("ruby_helmet", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.HEAD);
	public static final Item DIRT_HELMET = new ArmorBase("dirt_helmet", ARMOR_MATERIAL_DIRT, 1 , EntityEquipmentSlot.HEAD);
	public static final Item EMERALD_HELMET = new ArmorBase("emerald_helmet", ARMOR_MATERIAL_EMERALD, 1, EntityEquipmentSlot.HEAD);
	
	//chestplates
	public static final Item RUBY_CHESTPLATE = new ArmorBase("ruby_chestplate", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.CHEST);
	public static final Item DIRT_CHESTPLATE = new ArmorBase("dirt_chestplate", ARMOR_MATERIAL_DIRT, 1, EntityEquipmentSlot.CHEST);
	public static final Item EMERALD_CHESTPLATE = new ArmorBase("emerald_chestplate", ARMOR_MATERIAL_EMERALD, 1, EntityEquipmentSlot.CHEST);
	
	//leggings
	public static final Item RUBY_LEGGINGS = new ArmorBase("ruby_leggings", ARMOR_MATERIAL_RUBY, 2, EntityEquipmentSlot.LEGS);
	public static final Item DIRT_LEGGINGS = new ArmorBase("dirt_leggings", ARMOR_MATERIAL_DIRT, 2, EntityEquipmentSlot.LEGS);
	public static final Item EMERALD_LEGGINGS = new ArmorBase("emerald_leggings", ARMOR_MATERIAL_EMERALD, 2, EntityEquipmentSlot.LEGS);
	
	//Boots
	public static final Item RUBY_BOOTS = new ArmorBase("ruby_boots", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.FEET);
	public static final Item DIRT_BOOTS = new ArmorBase("dirt_boots", ARMOR_MATERIAL_DIRT, 1, EntityEquipmentSlot.FEET);
	public static final Item EMERALD_BOOTS = new ArmorBase("emerald_boots", ARMOR_MATERIAL_EMERALD, 1, EntityEquipmentSlot.FEET);
	
	
	//Food
	//public static final Item EVIL_APPLE = new FoodBase("evil_apple", 4, 2.4f, false);
	public static final Item EVIL_APPLE = new FoodEffectBase("evil_apple", 4, 2.4f, false, new PotionEffect((MobEffects.POISON), (60*20), 1, false, true));
	public static final Item GOLDEN_STEAK = new FoodEffectBase("golden_steak", 10, 5.0f, false, new PotionEffect((MobEffects.ABSORPTION),(60 * 20), 1, false, true));
	public static final Item DIRT_APPLE = new DirtApple("dirt_apple", 90, 10.5f, false);
}
