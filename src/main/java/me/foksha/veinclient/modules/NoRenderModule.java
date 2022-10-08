package me.foksha.veinclient.modules;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class NoRenderModule extends Module {
    public NoRenderModule() {
        super("NoRender", "Doesn't render some stuff", ModuleType.COMBAT);
    }

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {

    }

    @Override
    public void onTick() {

        if (MinecraftClient.getInstance().player.hasStatusEffect(StatusEffects.DARKNESS)) {
            MinecraftClient.getInstance().player.removeStatusEffectInternal(StatusEffects.DARKNESS);
        }
    }

    @Override
    public void onWorldRender(MatrixStack stack) {

    }

    @Override
    public void onHudRender() {

    }
}
