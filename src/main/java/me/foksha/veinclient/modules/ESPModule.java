package me.foksha.veinclient.modules;

import me.foksha.veinclient.Vein;
import me.x150.renderer.renderer.Renderer3d;
import me.x150.renderer.renderer.color.Color;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.text.Text;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Matrix4f;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ESPModule extends Module {
    public ESPModule() {
        super("ESP", "It's in the name.", ModuleType.RENDER);
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

        Vec3d pos = Vein.client.player.getPos();
        ClientWorld world = MinecraftClient.getInstance().world;
        Entity playerEntity = Vein.client.player;



        // draw a box around all entities ONLY if they're in a 10 block radius
        for (Entity entity : world.getEntities()) {
            if (entity.distanceTo(playerEntity) < 10) {
                System.out.println("Entity: " + entity.getName().toString());
                Renderer3d.renderLine(pos, entity.getPos(), Color.RED);
            }
        }


    }

    @Override
    public void onHudRender() {

    }
}
