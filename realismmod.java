package com.yourname.realismmod;

import com.mojang.realmsclient.gui.screen.RealmsMainScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.EventBus;
import net.minecraftforge.event.IEventBus;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.registries.DeferredRegister;

@Mod(modid = RealismMod.MODID, name = "Realism Mod", version = "1.0.0")
public class RealismMod {
    // Define a mod id in a common place for easy referencing
    public static final String MODID = "realismmod";

    // Create an instance of the Deferred Register to hold Item and Block Registries
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Item.class, MODID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Block.class, MODID);

    public RealismMod() {
        IEventBus modEventBus = MinecraftForge.EVENT_BUS;

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register the Deferred Register to the event bus so all objects are registered
        modEventBus.addListener(this::onServerStarting);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Some common setup code
    }

    private void onServerStarting(final ServerStartingEvent event) {
        // Some server setup code
    }

    // You can use SubscribeEvent and let the Event Bus discover your methods to call
    @SubscribeEvent
    public static void onItemRegister(RegisterItemsEvent event) {
        event.getRegistry().registerAll(
            new ItemGroundStick().setRegistryName("realismmod", "ground_stick"),
            new ItemGroundRock().setRegistryName("realismmod", "ground_rock")
        );
    }
}
