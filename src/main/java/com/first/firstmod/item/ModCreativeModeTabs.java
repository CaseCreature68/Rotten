package com.first.firstmod.item;

import com.first.firstmod.FirstMod;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FirstMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab ROTTEN_FOODS;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        ROTTEN_FOODS = event.registerCreativeModeTab(new ResourceLocation(FirstMod.MOD_ID, "currency_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.ROTTEN_PORKCHOP.get()))
                        .title(Component.translatable("creativemodetab.rotten_tab")));
    }
}
