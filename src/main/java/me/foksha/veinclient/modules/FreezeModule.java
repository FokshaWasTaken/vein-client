package me.foksha.veinclient.modules;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.math.MatrixStack;

public class FreezeModule extends Module {
    public FreezeModule() {
        super("Freeze", "Freezes the player", ModuleType.MISC);
    }

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {

    }

    @Override
    public void onTick() {
        MinecraftClient.getInstance().player.setVelocity(0, 0, 0);
    }

    @Override
    public void onWorldRender(MatrixStack stack) {

    }

    @Override
    public void onHudRender() {

    }
}
