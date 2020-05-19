package com.thinkthink09.minecraftsample.assets.items;

import com.thinkthink09.minecraftsample.assets.itemGroups.SampleItemGroup;
import com.thinkthink09.minecraftsample.registries.FluidRegistry;

import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;

public class SampleFluidBucket extends BucketItem {

    public SampleFluidBucket() {
        super(FluidRegistry.STILL_SAMPLE_FLUID::get,
                new Item.Properties().group(SampleItemGroup.get()).maxStackSize(1));
    }

}