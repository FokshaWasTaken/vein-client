package me.foksha.veinclient.modules;

import com.mojang.blaze3d.systems.RenderSystem;
import me.x150.renderer.renderer.Renderer2d;
import me.x150.renderer.renderer.Renderer3d;
import me.x150.renderer.renderer.color.Color;
import me.x150.renderer.renderer.font.TTFFontRenderer;
import me.x150.renderer.renderer.util.BlurMaskFramebuffer;
import net.minecraft.client.gui.DrawableHelper;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

import java.awt.*;

public class ClientInfoModule extends Module {
    public ClientInfoModule() {
        super("ClientInfo", "Shows the Client icon, version etc..", ModuleType.MISC);
    }

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {

    }

    @Override
    public void onTick() {

    }

    @Override
    public void onWorldRender(MatrixStack stack) {

    }

    @Override
    public void onHudRender() {

        Renderer2d.renderRoundedQuad(Renderer3d.getEmptyMatrixStack(), Color.BLACK, 5, 5, 100, 100, 5, 20);
        Renderer2d.renderTexture(Renderer3d.getEmptyMatrixStack(), new Identifier("vein-client", "vein-client/icon/icon.png"), 100, 100, 20, 20);


        BlurMaskFramebuffer.useAndDraw(() -> {
            //                                                                     X    Y    Radius Samples
            Renderer2d.renderCircle(Renderer3d.getEmptyMatrixStack(), Color.WHITE, 100, 100, 20,    40);
            // Blur radius
        }, 16);


    }
}
