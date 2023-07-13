package JAVA.Seminars.OOP.Seminar2;

import java.util.ArrayList;

public class ZooNoise {
    private ArrayList<SoundSource> soundSource;

    public ZooNoise(ArrayList<SoundSource> soundSource) {
        this.soundSource = soundSource;
    }

    void speakAll () {
        for (SoundSource source : soundSource) {
            source.speak();
        }
    }

}
