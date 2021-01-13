package tennis_soundboard


import java.io.File
import javax.sound.sampled.AudioSystem

class SoundHandler {
    fun playSound(soundFile: String) {
        val f = File("./res/audio/$soundFile.wav")
        val audioIn = AudioSystem.getAudioInputStream(f.toURI().toURL())
        val clip = AudioSystem.getClip()
        clip.open(audioIn)
        clip.start()
    }
}