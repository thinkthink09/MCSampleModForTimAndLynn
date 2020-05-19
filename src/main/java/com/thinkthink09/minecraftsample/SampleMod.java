package com.thinkthink09.minecraftsample;

import com.thinkthink09.minecraftsample.registries.BlockRegistry;
import com.thinkthink09.minecraftsample.registries.FluidRegistry;
import com.thinkthink09.minecraftsample.registries.ItemRegistry;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("samplemod1")
public class SampleMod {
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "samplemod1";

    public SampleMod() {
        ItemRegistry.init();
        BlockRegistry.init();
        FluidRegistry.init();
        MinecraftForge.EVENT_BUS.register(this);
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        LOGGER.info("Server started");
    }
}
