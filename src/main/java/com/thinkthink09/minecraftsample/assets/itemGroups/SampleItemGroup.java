package com.thinkthink09.minecraftsample.assets.itemGroups;

import com.thinkthink09.minecraftsample.registries.ItemRegistry;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class SampleItemGroup {

    private static final ItemGroup itemGroup = new ItemGroup("sampleItemGroup") {

        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemRegistry.SAMPLE_ITEM.get());
        }
    };

    public static ItemGroup get() {
        return itemGroup;
    }

}