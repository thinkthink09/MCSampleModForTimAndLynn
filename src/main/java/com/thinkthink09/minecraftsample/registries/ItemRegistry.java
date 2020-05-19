package com.thinkthink09.minecraftsample.registries;

import com.thinkthink09.minecraftsample.SampleMod;
import com.thinkthink09.minecraftsample.assets.items.SampleItem;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, SampleMod.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // item registry
    public static final RegistryObject<Item> SAMPLE_ITEM = ITEMS.register("sample_item", SampleItem::new);

}