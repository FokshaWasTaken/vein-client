package me.foksha.veinclient.render;

import me.foksha.veinclient.modules.Module;
import me.foksha.veinclient.modules.ModuleRegistry;
import me.x150.renderer.event.EventListener;
import me.x150.renderer.event.EventType;
import me.x150.renderer.event.Shift;
import me.x150.renderer.event.events.RenderEvent;
import me.x150.renderer.renderer.MSAAFramebuffer;
import me.x150.renderer.renderer.Renderer3d;
import me.x150.renderer.renderer.color.Color;
import me.x150.renderer.renderer.font.TTFFontRenderer;

import java.awt.*;

public class EventHandler {
    @EventListener(value = EventType.WORLD_RENDER, shift = Shift.POST)
    void handleWorldRender(RenderEvent event) {
        MSAAFramebuffer.use(MSAAFramebuffer.MAX_SAMPLES, () -> {
        for (Module module : ModuleRegistry.getModules()) {
            if (module.isEnabled()) {
                module.onWorldRender(event.getStack());
            }
        }
        });
    }

    @EventListener(value = EventType.HUD_RENDER, shift = Shift.POST)
    void handleHudRender(RenderEvent event) {
        MSAAFramebuffer.use(MSAAFramebuffer.MAX_SAMPLES, () -> {
        for (Module module : ModuleRegistry.getModules()) {
            if (module.isEnabled()) {
                module.onHudRender();
            }
        }
        });

    }


}
