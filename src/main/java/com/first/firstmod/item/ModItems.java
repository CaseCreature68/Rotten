package com.first.firstmod.item;

import com.first.firstmod.FirstMod;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MOD_ID);

    public static final RegistryObject<Item> ROTTEN_PORKCHOP = ITEMS.register("rotten_porkchop",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod((float) 0.8).effect(
                    () -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.8F).build())));

    public static final RegistryObject<Item> ROTTEN_BEEF = ITEMS.register("rotten_beef",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod((float) 0.8).effect(
                    () -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.8F).build())));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}