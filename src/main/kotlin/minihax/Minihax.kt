package minihax

import cc.polyfrost.oneconfig.utils.commands.CommandManager
import kotlinx.coroutines.CoroutineScope
import minihax.features.LavaESP
import net.minecraft.client.Minecraft
import net.minecraft.client.gui.GuiScreen
import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import kotlin.coroutines.EmptyCoroutineContext

@Mod(modid = "minihax", name = "MiniHAX", version = "%%VERSION%%")
class Minihax {

    companion object {
        val MODID: String =  "minihax"
        lateinit var config: minihaxConfig
        const val CHAT_PREFIX = "§b§l<§fMiniHax§b§l>§r"
        val mc: Minecraft = Minecraft.getMinecraft()
        var display: GuiScreen? = null

        val scope = CoroutineScope(EmptyCoroutineContext)
    }

    @Mod.EventHandler
    fun onInit(event: FMLInitializationEvent) {
        config = minihaxConfig()
        CommandManager.register(ExampleCommand())
        println("Sup world")
        listOf(
                this,
                LavaESP
        ).forEach(MinecraftForge.EVENT_BUS::register)

    }
}