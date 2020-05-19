package com.thinkthink09.minecraftsample.assets.items;

import com.thinkthink09.minecraftsample.assets.itemGroups.SampleItemGroup;

import net.minecraft.item.Item;

public class SampleItem extends Item {

    public SampleItem() {
        super(new Item.Properties().group(SampleItemGroup.get()));
    }

}