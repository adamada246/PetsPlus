package com.AdamsPetsMod.adamsmod.core.init;

import com.AdamsPetsMod.adamsmod.AdamsMod;
import com.AdamsPetsMod.adamsmod.core.itemgroup.adamsmodItemGroup;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AdamsMod.MOD_ID);

	public static final RegistryObject<Item> TREAT = ITEMS.register("treat",
			() -> new Item(new Item.Properties().tab(adamsmodItemGroup.PETS_MOD)
					.food(new Food.Builder().effect(() -> new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 20, 1), 1.0f)
							.effect(() -> new EffectInstance(Effects.POISON, 15, 1), 0.25f).nutrition(1).fast()
							.saturationMod(0.1F).meat().build())));
}
