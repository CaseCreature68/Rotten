package com.civ.rotten;

import com.civ.rotten.item.ModCreativeModeTabs;
import com.civ.rotten.block.ModBlocks;
import com.civ.rotten.item.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;

@Mod(Rotten.MOD_ID)
public class Rotten
{
    public static final String MOD_ID = "rotten";
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

    public Rotten()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("HELLO FROM COMMON SETUP");
        LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event)
    {
        if (event.getTab() == ModCreativeModeTabs.ROTTEN_FOODS) {
            //Items
            event.accept(ModItems.ROTTEN_PORKCHOP);
            event.accept(ModItems.ROTTEN_BEEF);
            event.accept(ModItems.ROTTEN_MUTTON);
            event.accept(ModItems.ROTTEN_CHICKEN);
            event.accept(ModItems.ROTTEN_SALMON);
            event.accept(ModItems.ROTTEN_COD);
            event.accept(ModItems.ROTTEN_RABBIT);
            event.accept(ModItems.EXPIRED_RABBIT_STEW);
            event.accept(ModItems.FISH_BONE);
            event.accept(ModItems.ICE_HOOK);

            //Blocks
            event.accept(ModBlocks.PILE_OF_ROTTEN_PORKCHOP);
            event.accept(ModBlocks.PILE_OF_ROTTEN_BEEF);
            event.accept(ModBlocks.PILE_OF_ROTTEN_MUTTON);
            event.accept(ModBlocks.PILE_OF_ROTTEN_CHICKEN);
            event.accept(ModBlocks.PILE_OF_ROTTEN_SALMON);
            event.accept(ModBlocks.PILE_OF_ROTTEN_COD);
            event.accept(ModBlocks.PILE_OF_ROTTEN_RABBIT);
            event.accept(ModBlocks.FRIDGE);
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        LOGGER.info("HELLO from server starting");
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
