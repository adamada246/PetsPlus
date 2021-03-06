package com.AdamsPetsMod.adamsmod.common.EmptyDogBed;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.state.properties.BlockStateProperties;

public class EmptyDogBed extends Block {

	public EmptyDogBed(Properties Properties) {
		super(Properties);
		
	}
	

	@Override
	public BlockState getStateForPlacement(BlockItemUseContext context) {
		return defaultBlockState().setValue( BlockStateProperties.HORIZONTAL_FACING , context
                .getHorizontalDirection().getOpposite() );
	}
	
	@Override
	protected void createBlockStateDefinition(Builder<Block, BlockState> builder) {
		builder.add(BlockStateProperties.HORIZONTAL_FACING);
	}
	
	
}
