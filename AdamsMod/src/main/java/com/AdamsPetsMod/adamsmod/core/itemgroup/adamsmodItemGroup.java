package com.AdamsPetsMod.adamsmod.core.itemgroup;

import com.AdamsPetsMod.adamsmod.core.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class adamsmodItemGroup extends ItemGroup {

	public static final adamsmodItemGroup PETS_MOD = new adamsmodItemGroup(ItemGroup.TABS.length,
			"pets_mod");

	public adamsmodItemGroup(int index, String label) {
		super(index, label);
	}

	@Override
	public ItemStack makeIcon() {
		return new ItemStack(ItemInit.TREAT.get());
	}

}
