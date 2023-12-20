package minihax

import cc.polyfrost.oneconfig.utils.commands.annotations.Command
import cc.polyfrost.oneconfig.utils.commands.annotations.Main
import net.minecraft.client.Minecraft
import net.minecraft.util.ChatComponentText

@Command(value = "examplecommand")
class ExampleCommand {

    @Main
    private fun main() {
        Minecraft.getMinecraft().thePlayer.addChatMessage(ChatComponentText("§c${Minihax.config.exampleText}"))
    }
}