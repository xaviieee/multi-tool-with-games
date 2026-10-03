package sounds;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class SoundManager {
    private Clip clip;

    public void loadsound(String filepath) {
        try {
            File file = new File(filepath);
            AudioInputStream stream = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(stream);
        } catch (Exception e) {
            System.err.println("Error loading sound file: " + e.getMessage());
        }
    }

    public void play() {
        if (clip != null) {
            clip.setFramePosition(0);
            clip.start();
        }
    }
    public void stop() {
        if (clip != null) {
            clip.stop();
            clip.setFramePosition(0);
        }
    }
}
