package com.civ.rotten.item;

import com.civ.rotten.Rotten;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Rotten.MOD_ID);

    public static final RegistryObject<Item> ROTTEN_PORKCHOP = ITEMS.register("rotten_porkchop",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod((float) 0.8).effect(
                    () -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.8F).build())));

    public static final RegistryObject<Item> ROTTEN_BEEF = ITEMS.register("rotten_beef",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod((float) 0.8).effect(
                    () -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.8F).build())));

    public static final RegistryObject<Item> ROTTEN_MUTTON = ITEMS.register("rotten_mutton",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod((float) 0.8).effect(
                    () -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.8F).build())));
    public static final RegistryObject<Item> ROTTEN_CHICKEN = ITEMS.register("rotten_chicken",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod((float) 0.8).effect(
                    () -> new MobEffectInstance(MobEffects.HUNGER, 1200, 0), 0.8F).build())));

    public static final RegistryObject<Item> ROTTEN_SALMON = ITEMS.register("rotten_salmon",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod((float) 0.8).effect(
                    () -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.8F).build())));

    public static final RegistryObject<Item> ROTTEN_TURTLE_MEAT = ITEMS.register("rotten_turtle_meat",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod((float) 0.8).effect(
                    () -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.8F).build())));

    public static final RegistryObject<Item> ROTTEN_COD = ITEMS.register("rotten_cod",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod((float) 0.8).effect(
                    () -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.8F).build())));

    public static final RegistryObject<Item> ROTTEN_RABBIT = ITEMS.register("rotten_rabbit",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod((float) 0.8).effect(
                    () -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.8F).build())));

    public static final RegistryObject<Item> EXPIRED_RABBIT_STEW = ITEMS.register("expired_rabbit_stew",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod((float) 0.8).effect(
                    () -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.8F).build())));

    public static final RegistryObject<Item> ROTTEN_APPLE = ITEMS.register("rotten_apple",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod((float) 0.8).effect(
                    () -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.8F).build())));

    public static final RegistryObject<Item> ICE_HOOK = ITEMS.register("ice_hook",
            () -> new IceHook(2.0f, 2.8f, Tiers.WOOD, new Item.Properties().durability(200)));

    public static final RegistryObject<Item> FISH_BONE = ITEMS.register("fish_bone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ICE_SHARD = ITEMS.register("ice_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TURTLE_MEAT = ITEMS.register("raw_turtle_meat",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod((float) 0.8).effect(
                    () -> new MobEffectInstance(MobEffects.WATER_BREATHING, 200, 0), 0.8F).build())));

    public static final RegistryObject<Item> COOKED_TURTLE_MEAT = ITEMS.register("cooked_turtle_meat",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod((float) 0.8).effect(
                    () -> new MobEffectInstance(MobEffects.WATER_BREATHING, 400, 0), 0.8F).build())));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
