package exc3;

public class Player implements Playable, Recordable {

    public void play() {
        System.out.println("Play is started");
    }

    public void pause() {
        System.out.println("Playing and Recording on Pause");
    }


    public void stop() {
        System.out.println("Stop playing and recording");
    }

    public void record() {
        System.out.println("recording is starting");
    }
}
