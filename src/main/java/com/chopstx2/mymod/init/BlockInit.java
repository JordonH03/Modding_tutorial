package com.chopstx2.mymod.init;

import com.chopstx2.mymod.MyMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    // Initialize block register
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MyMod.MOD_ID);

    // Register the block
    public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block", () -> new Block(AbstractBlock.Properties
            .of(Material.CAKE, MaterialColor.COLOR_PURPLE) // Craft with cake and purple dye
            .strength(3.0f,3.0f) // First float is hardness to break, second float is resistance to explosion – currently set to iron ore
            .harvestTool(ToolType.PICKAXE) // The type of tool that will break it the fastest
            .harvestLevel(3) // The level of tool needed. 3 is Iron
            .sound(SoundType.HONEY_BLOCK) // The sound block makes upon breaking
            )
    );
}
