package me.foksha.veinclient.modules;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ShieldDisabler extends Module{
    public ShieldDisabler() {
        super("ShieldDisabler", "Automatically disables ", ModuleType.COMBAT);
    }

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {

    }

    @Override
    public void onTick() {
        ClientWorld world = MinecraftClient.getInstance().world;


        PlayerEntity currentPlayer = MinecraftClient.getInstance().player;
        PlayerEntity player = world.getClosestPlayer(currentPlayer, 200);


    }

    @Override
    public void onWorldRender(MatrixStack stack) {

    }

    @Override
    public void onHudRender() {

    }
}
