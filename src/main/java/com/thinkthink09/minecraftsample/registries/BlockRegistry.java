package com.thinkthink09.minecraftsample.registries;

import com.thinkthink09.minecraftsample.SampleMod;
import com.thinkthink09.minecraftsample.assets.items.SampleBlockItem;
import com.thinkthink09.minecraftsample.assets.blocks.SampleBlock;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS,
            SampleMod.MOD_ID);

    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // block registry
    public static final RegistryObject<Block> SAMPLE_BLOCK = BLOCKS.register("sample_block", SampleBlock::new);
    public static final RegistryObject<Item> SAMPLE_BLOCK_ITEM = ItemRegistry.ITEMS.register("sample_block",
            SampleBlockItem::new);

}