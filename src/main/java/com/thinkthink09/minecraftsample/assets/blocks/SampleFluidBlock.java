package com.thinkthink09.minecraftsample.assets.blocks;

import com.thinkthink09.minecraftsample.assets.fluids.SampleFluid;

import net.minecraft.block.Block;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;

public class SampleFluidBlock extends FlowingFluidBlock {

    public SampleFluidBlock() {
        super(SampleFluid.StillSampleFluid::new,
                Block.Properties.create(Material.WATER).doesNotBlockMovement().noDrops());
    }

}