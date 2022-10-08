package me.foksha.veinclient.modules;

import me.foksha.veinclient.commands.Command;
import me.foksha.veinclient.commands.CommandRegistry;
import me.foksha.veinclient.commands.ExampleCommand;
import net.minecraft.util.Util;

import java.util.ArrayList;
import java.util.List;

public class ModuleRegistry {
    private static final List<Module> modules = Util.make(new ArrayList<>(), ModuleRegistry::initModules);

    private static void initModules(List<Module> modules) {
        modules.add(new FreezeModule());
        modules.add(new NoRenderModule());
        modules.add(new ESPModule());
        modules.add(new ClientInfoModule());
        // ..
    }

    public static List<Module> getModules() {
        return modules;
    }
}
