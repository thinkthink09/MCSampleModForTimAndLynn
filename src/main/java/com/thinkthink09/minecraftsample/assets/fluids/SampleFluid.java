package com.thinkthink09.minecraftsample.assets.fluids;

import com.thinkthink09.minecraftsample.SampleMod;
import com.thinkthink09.minecraftsample.registries.FluidRegistry;

import net.minecraft.block.BlockState;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.fluids.FluidAttributes;

public class SampleFluid extends FlowingFluid {
    @Override
    public Fluid getFlowingFluid() {
        return FluidRegistry.FLOWING_SAMPLE_FLUID.get();
    }

    @Override
    public Fluid getStillFluid() {
        return FluidRegistry.STILL_SAMPLE_FLUID.get();
    }

    @Override
    protected boolean canSourcesMultiply() {
        return true;
    }

    @Override
    protected void beforeReplacingBlock(IWorld world, BlockPos blockPos, BlockState blockState) {

    }

    @Override
    protected int getSlopeFindDistance(IWorldReader worldReader) {
        return 4;
    }

    @Override
    protected int getLevelDecreasePerBlock(IWorldReader worldReader) {
        return 3;
    }

    @Override
    public Item getFilledBucket() {
        return FluidRegistry.SAMPLE_FLUID_BUCKET.get();
    }

    @Override
    protected boolean canDisplace(IFluidState fluidState, IBlockReader blockReader, BlockPos blockPos, Fluid fluid,
            Direction direction) {
        return direction == Direction.DOWN;
        // return direction == Direction.DOWN && !fluid.isIn(FluidList.Tags.OIL);
    }

    @Override
    public int getTickRate(IWorldReader worldReader) {
        return 5;
    }

    @Override
    protected float getExplosionResistance() {
        return 100.0f;
    }

    @Override
    protected BlockState getBlockState(IFluidState state) {
        return FluidRegistry.SAMPLE_FLUID_BLOCK.get().getDefaultState().with(FlowingFluidBlock.LEVEL,
                Integer.valueOf(getLevelFromState(state)));
    }

    @Override
    public boolean isEquivalentTo(Fluid fluid) {
        return fluid == FluidRegistry.FLOWING_SAMPLE_FLUID.get() || fluid == FluidRegistry.STILL_SAMPLE_FLUID.get();
    }

    @Override
    public FluidAttributes createAttributes() {
        return FluidAttributes
                .builder(new ResourceLocation(SampleMod.MOD_ID, "block/still_sample_fluid"),
                        new ResourceLocation(SampleMod.MOD_ID, "block/flowing_sample_fluid"))
                .translationKey("block." + SampleMod.MOD_ID + ".sample_fluid").build(this);
    }

    @Override
    public boolean isSource(IFluidState state) {
        return false;
    }

    @Override
    public int getLevel(IFluidState state) {
        return 0;
    }

    public static class FlowingSampleFluid extends SampleFluid {
        @Override
        protected void fillStateContainer(StateContainer.Builder<Fluid, IFluidState> builder) {
            super.fillStateContainer(builder);
            builder.add(LEVEL_1_8);
        }

        @Override
        public boolean isSource(IFluidState state) {
            return false;
        }

        @Override
        public int getLevel(IFluidState state) {
            return state.get(SampleFluid.LEVEL_1_8);
        }

    }

    public static class StillSampleFluid extends SampleFluid {
        @Override
        public boolean isSource(IFluidState state) {
            return true;
        }

        @Override
        public int getLevel(IFluidState state) {
            return 8;
        }

    }
}