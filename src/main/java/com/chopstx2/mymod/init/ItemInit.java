package com.chopstx2.mymod.init;

import com.chopstx2.mymod.MyMod;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    // Initialize the item register
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MyMod.MOD_ID);

    // Register the item
    public  static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () -> new Item(new Item.Properties()
            .tab(ItemGroup.TAB_MISC))); // Denotes the tab item will appear in creative mode: Miscellaneous

    public static final RegistryObject<SpecialItem> SPECIAL_ITEM = ITEMS.register("special_item", () -> new SpecialItem(new Item.Properties().tab(ItemGroup.TAB_MISC)));

    // Block items
    public static final RegistryObject<BlockItem> EXAMPLE_BLOCK = ITEMS.register("example_block",
            () -> new BlockItem(BlockInit.EXAMPLE_BLOCK.get(), // Gets the block item from the RegistryObject
            new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS))); // Place the block item in Building Blocks tab


}
