package exc3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Playable playable = new Player();
        Recordable recordable = new Player();

        Scanner str = new Scanner(System.in);

        System.out.print("Введите Play для запуска проигрывания: ");
        String format = str.next();
        if (format.equals("Play")) playable.play();
        {
            do {

                if (format.equals("Play")) {

                    System.out.print("Введите Record для начала записи, Pause, или Stop для завершения проигрывания: ");

                    String format1 = str.next();
                    if ((format1.equals("Pause") || format1.equals("Stop") || format1.equals("Record")) == false) break;

                    if (format.equals("Play") && (format1.equals("Record"))) {

                        playable.play();
                        recordable.record();

                    }

                    if (format1.equals("Pause")) {
                        recordable.pause();
                        // playable.pause();

                    } else if (format1.equals("Stop")) {
                        recordable.stop();
                        // playable.stop();
                        format = format1;
                        break;
                    }

                } else break;
            }
            while (true);
        }

        if (format.equals("Stop")) System.out.println("Воспроизведение завершено");
        else System.out.println("Finish");
    }

}
