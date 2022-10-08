package me.foksha.veinclient.commands;

import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;

import java.util.Arrays;

public class ExampleCommand extends Command {
    MinecraftClient client = MinecraftClient.getInstance();
    public ExampleCommand() {
        super("Echo", "Says what we say", "echo", "say");
    }

    @Override
    public void execute(String[] args) {
    client.player.sendMessage(Text.of("Your arguments: " + Arrays.toString(args)));
    }
}
