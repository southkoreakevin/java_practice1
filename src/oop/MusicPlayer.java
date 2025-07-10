package oop;

public class MusicPlayer {

    int volumn = 0;
    boolean isOn = false;

    void on() {
        isOn = true;
        System.out.println("music player start");
    }

    void off() {
        isOn = false;
        System.out.println("music player off");
    }

    void volumnUp() {
        volumn++;
        System.out.println("music player volumn : " + volumn);
    }

    void volumnDown() {
        volumn--;
        System.out.println("music player volumn : " + volumn);
    }

    void showStatus() {
        System.out.println("music player status ckeck");
        if (isOn) {
            System.out.println("music player On Volumn : " + volumn);
        } else {
            System.out.println("music player Off");
        }
    }

}
