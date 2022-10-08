package me.foksha.veinclient.mixin;

import me.foksha.veinclient.Vein;
import me.foksha.veinclient.commands.Command;
import me.foksha.veinclient.commands.CommandRegistry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.lang.reflect.Array;
import java.util.Arrays;

@Mixin(ChatScreen.class)
public class ChatScreenMixin {

    @Redirect(method = "sendMessage", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/network/ClientPlayerEntity;sendChatMessage(Ljava/lang/String;Lnet/minecraft/text/Text;)V"))

    void vein_redirectSendChatMessage(ClientPlayerEntity instance, String message, Text preview) {

        String trimmedMessage = message.substring(Vein.PREFIX.length());
        if (trimmedMessage.isEmpty() || trimmedMessage.isBlank()) return;
        String[] messageSplit = trimmedMessage.trim().split(" +");
        String command = messageSplit[0];
        String[] args = Arrays.copyOfRange(messageSplit, 1, messageSplit.length);

        Command toRun = CommandRegistry.getByAlias(command);

        if (toRun == null) {
            MinecraftClient.getInstance().player.sendMessage(Text.of("Command not found."));
        } else {
            toRun.execute(args);
        }

    }

}
