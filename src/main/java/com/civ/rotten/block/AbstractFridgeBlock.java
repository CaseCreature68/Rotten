package com.civ.rotten.block;

import com.civ.rotten.block.entity.AbstractFridgeBlockEntity;
import net.minecraft.world.Container;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Optional;

public abstract class AbstractFridgeBlock extends BaseEntityBlock implements SimpleWaterloggedBlock {

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    protected static final VoxelShape AABB = Block.box(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
    public static final DoubleBlockCombiner.Combiner<AbstractFridgeBlockEntity, Optional<Container>> CHEST_COMBINER = new DoubleBlockCombiner.Combiner<>() {
        @Override
        public Optional<Container> acceptDouble(AbstractFridgeBlockEntity p_52843_, AbstractFridgeBlockEntity p_52844_) {
            return Optional.empty();
        }

        @Override
        public Optional<Container> acceptSingle(AbstractFridgeBlockEntity p_52842_) {
            return Optional.empty();
        }

        @Override
        public Optional<Container> acceptNone() {
            return Optional.empty();
        }
    };

    protected AbstractFridgeBlock(Properties properties) {
        super(properties);
    }
}