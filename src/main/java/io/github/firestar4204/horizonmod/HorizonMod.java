package io.github.firestar4204.horizonmod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;

public class HorizonMod implements ModInitializer {
    
    public static final Logger HORIZONMOD = LogManager.getLogger("horizonmod");

    public static final Item FOCUS = new Item(new Item.Settings().group(HorizonMod.ITEMS));

    public static final ItemGroup ITEMS = FabricItemGroupBuilder.create(
        new Identifier("horizonmod", "items"))
        .icon(() -> new ItemStack(HorizonMod.FOCUS))
        .build();

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("horizonmod", "focus"), FOCUS);
        
        HORIZONMOD.info("HorizonMod initialized.");
    }
}