package me.foksha.veinclient;

import me.foksha.veinclient.render.EventHandler;
import me.x150.renderer.event.Events;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.MinecraftClient;

import java.io.File;

public class Vein implements ModInitializer {

    public static String PREFIX = ".";
    public static MinecraftClient client = MinecraftClient.getInstance();
    public static final File BASE = new File(MinecraftClient.getInstance().runDirectory, "vein");



    @Override
    public void onInitialize() {

        Events.registerEventHandlerClass(new EventHandler());

    }
}
