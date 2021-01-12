package tennis_soundboard

import java.applet.Applet
import java.io.File
import java.net.MalformedURLException
import java.net.URL

class SoundHandler {
    fun playSound(sound: String) {
        try {

            val file = File("src/tennis_soundboard/audio/$sound.wav")
            var url: URL? = null

            if (file.canRead()) {
                url = file.toURI().toURL()
            } else {
                println("Could not read file.")
                println(file.absoluteFile)
            }

            println(url)
            val clip = Applet.newAudioClip(url)
            clip.play()

            println("playing file: $sound.wav")
        } catch (e: MalformedURLException) {
            println("ERROR")
            // print if, for some reason, the sound cannot play.
        }
    }
}