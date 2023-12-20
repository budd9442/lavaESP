package minihax

import cc.polyfrost.oneconfig.config.Config
import cc.polyfrost.oneconfig.config.annotations.Slider
import cc.polyfrost.oneconfig.config.annotations.Switch
import cc.polyfrost.oneconfig.config.annotations.Text
import cc.polyfrost.oneconfig.config.data.Mod
import cc.polyfrost.oneconfig.config.data.ModType
import cc.polyfrost.oneconfig.config.data.OptionSize



class minihaxConfig : Config(Mod("minihax", ModType.UTIL_QOL), "minihax.json") {

    init {
        initialize()
    }




    @Switch(name = "Force Skyblock", size = OptionSize.DUAL)
    var forceSkyblock: Boolean = false // default value

    @Switch(name = "Lava ESP", size = OptionSize.DUAL)
    val lavaESP: Boolean = false

    @Switch(name = "Hide ESP on nearby lava", size = OptionSize.DUAL)
    var lavaHideNear = true

    @Switch(name = "Hide ESP on catching a flaming worm", size = OptionSize.DUAL)
    var lavaHideOnCatch = true
    @Slider(
            name = "Lava ESP scan interval",
            min = 500f,
            max = 2000f        // min and max values for the slider
            // if you like, you can use step to set a step value for the slider,
            // giving it little steps that the slider snaps to.

    )
    val lavaESPScanTime: Int = 750

    @Slider(
            name = "Lava ESP scan radius",
            min = 10f,
            max = 200f        // min and max values for the slider
            // if you like, you can use step to set a step value for the slider,
            // giving it little steps that the slider snaps to.

    )
    var lavaESPRadius:Int = 50




    @Slider(
            name = "ESP Box outline width",
            min = 1f,
            max = 10f,

            // min and max values for the slider
            // if you like, you can use step to set a step value for the slider,
            // giving it little steps that the slider snaps to.

    )
    var espBoxOutlineWidth = 1f

    @Slider(
            name = "ESP box opacity",
            min = 0f,
            max = 1f,

            // min and max values for the slider
            // if you like, you can use step to set a step value for the slider,
            // giving it little steps that the slider snaps to.

    )
    var espBoxOpacity = 0.3f

    @Text(name = "Just some example text")
    var exampleText = "Hello World!"
}