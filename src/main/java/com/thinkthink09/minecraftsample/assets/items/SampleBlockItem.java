package com.thinkthink09.minecraftsample.assets.items;

import com.thinkthink09.minecraftsample.assets.itemGroups.SampleItemGroup;
import com.thinkthink09.minecraftsample.registries.BlockRegistry;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class SampleBlockItem extends BlockItem {

    public SampleBlockItem() {
        super(BlockRegistry.SAMPLE_BLOCK.get(), new Item.Properties().group(SampleItemGroup.get()));
    }

}