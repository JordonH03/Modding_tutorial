package com.chopstx2.mymod.init;

import com.sun.swing.internal.plaf.metal.resources.metal;
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.util.InputMappings;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.lwjgl.glfw.GLFW;

import javax.annotation.Nullable;
import java.util.List;

public class SpecialItem extends Item {
    // Constructor for Items
    public SpecialItem (Properties properties) {
        super(properties);
    }

    // Adds tooltip when hovering over an inventory item
    @Override // Overrides the method in Item class
    @OnlyIn(Dist.CLIENT) // The following code will only exist in the client
    public void appendHoverText(ItemStack p_77624_1_, @Nullable World p_77624_2_, List<ITextComponent> p_77624_3_, ITooltipFlag p_77624_4_) {
        super.appendHoverText(p_77624_1_, p_77624_2_, p_77624_3_, p_77624_4_);
        p_77624_3_.add(new TranslationTextComponent("tooltip.special_item.test_tooltip"));
        p_77624_3_.add(new StringTextComponent("This " + "\u00A7E" + "is " + "\u00A77" + "a tooltip"));
    }

    // On right click
    @Override
    public ActionResult<ItemStack> use(World p_77659_1_, PlayerEntity p_77659_2_, Hand p_77659_3_) {
        p_77659_2_.addEffect(new EffectInstance(Effects.GLOWING, 200, 5)); // Give player glowing V effect for 200 ticks
        return super.use(p_77659_1_, p_77659_2_, p_77659_3_);
    }
}
