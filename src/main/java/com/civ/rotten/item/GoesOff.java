package com.civ.rotten.item;

import net.minecraft.client.renderer.texture.Tickable;
import net.minecraft.world.item.ItemStack;

import java.util.Properties;

public class GoesOff extends Properties implements Tickable {

    public int ticksPassed;
    public int ticks;

    public Properties goesOff(int seconds, ItemStack convertsTo) {
        ticks = seconds * 20;
        ticksPassed = 0;

        this.tick();
        return this;
    }

    @Override
    public void tick() {
        ticksPassed++;
        if (ticksPassed >= ticks) {

        }
    }
}
