package com.AdamsPetsMod.adamsmod.core.init;

import com.AdamsPetsMod.adamsmod.AdamsMod;
import com.AdamsPetsMod.adamsmod.common.EmptyDogBed.EmptyDogBed;

import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	
	
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			AdamsMod.MOD_ID);

	public static final RegistryObject<Block> EMPTY_DOG_BED = BLOCKS.register("empty_dog_bed",
			() -> new EmptyDogBed(SlabBlock.Properties.of(Material.WOOL, MaterialColor.WOOL).noCollission().instabreak()
					.sound(SoundType.WOOL)));

}
