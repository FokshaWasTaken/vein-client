package me.foksha.veinclient.commands;

import me.foksha.veinclient.modules.Module;
import me.foksha.veinclient.modules.ModuleRegistry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;

public class ToggleCommand extends Command {

    public ToggleCommand() {
        super("Toggle", "Toggles a module", "toggle", "enable", "disable");
    }

    @Override
    public void execute(String[] args) {
        if (args.length == 0) {
            MinecraftClient.getInstance().player.sendMessage(Text.of("Please specify a module to toggle"));
            return;
        }

        String moduleName = args[0];


        for (Module module : ModuleRegistry.getModules()) {
            if (module.name.equalsIgnoreCase(moduleName)) {
                    module.setEnabled(!module.isEnabled());
                    MinecraftClient.getInstance().player.sendMessage(Text.of("Toggled " + module.name + " to " + module.isEnabled()));
                    return;
                }
            MinecraftClient.getInstance().player.sendMessage(Text.of("Module " + moduleName + " not found"));
        }
    }
}
