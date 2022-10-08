package me.foksha.veinclient.commands;

import net.minecraft.util.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommandRegistry {

    private static final List<Command> commands = Util.make(new ArrayList<>(), CommandRegistry::initCommands);

    private static void initCommands(List<Command> commands) {
        commands.add(new ExampleCommand());
        commands.add(new ToggleCommand());
        // ..
    }

    public static List<Command> getCommands() {
        return commands;
    }

    public static Command getByAlias(String command) {
        for (Command command1 : getCommands()) {
            if (Arrays.stream(command1.triggers).anyMatch(s -> s.equalsIgnoreCase(command))) {
                return command1;
            }
        }
        return null;
    }


}
