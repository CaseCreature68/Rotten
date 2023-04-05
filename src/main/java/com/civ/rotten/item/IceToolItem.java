package com.civ.rotten.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Vanishable;

public class IceToolItem extends DiggerItem implements Vanishable {
    public IceToolItem(float f, float f2, Tier tier, Properties properties) {
        super(f, f2, tier, BlockTags.ICE, properties);
    }
}
