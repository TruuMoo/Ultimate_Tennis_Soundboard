package tennis_soundboard;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


public class SoundHandler {
    
    public void playSound(String sound) {
        try {
            File file = new File(("src/tennis_soundboard/audio/" + sound + ".wav"));
            URL url = null;
            if (file.canRead()) {
                url = file.toURI().toURL();
            } else {
                System.out.println("Could not read file.");
                System.out.println(file.getAbsoluteFile());
            }
            System.out.println(url);
            AudioClip clip = Applet.newAudioClip(url);
            clip.play();
            System.out.println("playing file: " + sound + ".wav");
        } catch (MalformedURLException e) {
            System.out.println("ERROR");
        }
    }
}
