package JAVA.Seminars.OOP.Seminar2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<SoundSource> soundSource = new ArrayList<>();
        
        soundSource.add(new Cat());
        soundSource.add(new Dog());
        soundSource.add(new Elephant());
        soundSource.add(new Radio());

        ZooNoise zooNoises = new ZooNoise(soundSource);
        zooNoises.speakAll();

    }

}
