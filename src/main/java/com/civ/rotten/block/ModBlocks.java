package com.civ.rotten.block;

import com.civ.rotten.Rotten;
import com.civ.rotten.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Rotten.MOD_ID);

    public static final RegistryObject<Block> PILE_OF_ROTTEN_PORKCHOP = registerBlock("pile_of_rotten_porkchop",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT)
                    .strength(1f)));
    public static final RegistryObject<Block> PILE_OF_ROTTEN_BEEF = registerBlock("pile_of_rotten_beef",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT)
                    .strength(1f)));
    public static final RegistryObject<Block> PILE_OF_ROTTEN_MUTTON = registerBlock("pile_of_rotten_mutton",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT)
                    .strength(1f)));
    public static final RegistryObject<Block> PILE_OF_ROTTEN_CHICKEN = registerBlock("pile_of_rotten_chicken",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT)
                    .strength(1f)));
    public static final RegistryObject<Block> PILE_OF_ROTTEN_SALMON = registerBlock("pile_of_rotten_salmon",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT)
                    .strength(1f)));
    public static final RegistryObject<Block> PILE_OF_ROTTEN_COD = registerBlock("pile_of_rotten_cod",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT)
                    .strength(1f)));
    public static final RegistryObject<Block> PILE_OF_ROTTEN_RABBIT = registerBlock("pile_of_rotten_rabbit",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT)
                    .strength(1f)));

    public static final RegistryObject<Block> FRIDGE = registerBlock("fridge",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT)
                    .strength(1f)));
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private  static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
