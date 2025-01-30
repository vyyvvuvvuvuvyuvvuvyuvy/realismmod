package com.yourname.realismmod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
    public static final Item GROUND_STICK = new ItemGroundStick();
    public static final Item GROUND_ROCK = new ItemGroundRock();

    public static void registerItems() {
        GameRegistry.registerItem(GROUND_STICK, "ground_stick");
        GameRegistry.registerItem(GROUND_ROCK, "ground_rock");
    }
}
