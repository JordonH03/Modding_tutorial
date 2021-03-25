package com.chopstx2.mymod.init;

import com.chopstx2.mymod.MyMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    // Initialize the register
    public static final DeferredRegister<Item> ITEM = DeferredRegister.create(ForgeRegistries.ITEMS, MyMod.MOD_ID);

    // Register the item
    public  static final RegistryObject<Item> EXAMPLE_ITEM = ITEM.register("example_item", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));


}
