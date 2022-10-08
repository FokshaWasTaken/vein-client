package me.foksha.veinclient.modules;

import net.minecraft.client.util.math.MatrixStack;

public abstract class Module {

    public final String name, description;

    public final ModuleType type;

    protected boolean enabled = false;



    public Module(String name, String description, ModuleType type) {
        this.name = name;
        this.description = description;
        this.type = type;
    }

    public final boolean isEnabled() { return enabled;}



    public final void setEnabled(boolean enabled) {
        if (this.enabled == enabled) {
            return;
        }
        this.enabled = enabled;
        if (this.enabled) {
            onEnable();
        } else {
            onDisable();
        }
    }

    /** Called when the module is enabled */
    public abstract void onEnable();

    public abstract void onDisable();

    public abstract void onTick();

    public abstract void onWorldRender(MatrixStack stack);

    public abstract void onHudRender();
}
