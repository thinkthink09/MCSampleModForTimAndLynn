package com.thinkthink09.minecraftsample.registries;

import com.thinkthink09.minecraftsample.SampleMod;
import com.thinkthink09.minecraftsample.assets.blocks.SampleFluidBlock;
import com.thinkthink09.minecraftsample.assets.fluids.SampleFluid;
import com.thinkthink09.minecraftsample.assets.items.SampleFluidBucket;

import net.minecraft.block.Block;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FluidRegistry {

        public static final DeferredRegister<Fluid> FLUIDS = new DeferredRegister<>(ForgeRegistries.FLUIDS,
                        SampleMod.MOD_ID);

        public static void init() {
                FLUIDS.register(FMLJavaModLoadingContext.get().getModEventBus());
        }

        // fluid registry
        public static final RegistryObject<Fluid> STILL_SAMPLE_FLUID = FLUIDS.register("still_sample_fluid",
                        SampleFluid.FlowingSampleFluid::new);
        public static final RegistryObject<Fluid> FLOWING_SAMPLE_FLUID = FLUIDS.register("flowing_sample_fluid",
                        SampleFluid.StillSampleFluid::new);
        public static final RegistryObject<Block> SAMPLE_FLUID_BLOCK = BlockRegistry.BLOCKS.register("sample_fluid",
                        SampleFluidBlock::new);
        public static final RegistryObject<Item> SAMPLE_FLUID_BUCKET = ItemRegistry.ITEMS
                        .register("sample_fluid_bucket", SampleFluidBucket::new);

}