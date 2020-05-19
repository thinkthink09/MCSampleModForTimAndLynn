package com.thinkthink09.minecraftsample.assets.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class SampleBlock extends Block {

    public SampleBlock() {
        super(Block.Properties.create(Material.IRON, MaterialColor.SNOW).hardnessAndResistance(35.0f, 1200.0f)
                .harvestLevel(3).harvestTool(ToolType.PICKAXE).lightValue(14));
    }

}