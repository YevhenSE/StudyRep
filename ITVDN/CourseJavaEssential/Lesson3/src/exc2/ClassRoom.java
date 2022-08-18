package exc2;

import java.util.Scanner;

public class ClassRoom {
    public static void main(String[] args) {

        Scanner numberOfObject = new Scanner(System.in);

        System.out.print("Введите количество учеников в классе");
        int numberOfPupil = numberOfObject.nextInt();

        Pupil[] pupils = new Pupil[numberOfPupil];
        Integer[] sum = new Integer[numberOfPupil];

        for (int i = 0; i < pupils.length; i++) {
            pupils[i] = new Pupil();
        }
        Scanner str = new Scanner(System.in);
        for (int i = 0; i < pupils.length; i++) {
            System.out.print("Введите имя " + (i + 1) + "-го ученика ");
            pupils[i].setName(str.nextLine());
        }

        Scanner grade = new Scanner(System.in);
        for (int i = 0; i < pupils.length; i++) {
            System.out.print("Введите оценку чтения для " + pupils[i].getName() + ": ");
            pupils[i].setRead(grade.nextInt());
            System.out.print("Введите оценку по письму для " + pupils[i].getName() + ": ");
            pupils[i].setWrite(grade.nextInt());
            System.out.print("Введите оценку успеваемости" + pupils[i].getName() + ": ");
            pupils[i].setStudy(grade.nextInt());
            System.out.print("Введите  оценку отдыха " + pupils[i].getName() + ": ");
            pupils[i].setRelax(grade.nextInt());
            sum[i] = (pupils[i].getRead() + pupils[i].getWrite() + pupils[i].getStudy() + pupils[i].getRelax()) / 4;
        }
        System.out.println("");

        Pupil[] badPupil = new BadPupil[numberOfPupil];
        Pupil[] goodPupil = new GoodPupil[numberOfPupil];
        Pupil[] excellentPupil = new ExcellentPupil[numberOfPupil];

        for (int i = 0; i < pupils.length; i++) {

            badPupil[i] = new BadPupil();
            goodPupil[i] = new GoodPupil();
            excellentPupil[i] = new ExcellentPupil();

            if (sum[i] < 3) {

                System.out.println("средние показатели ученика " + pupils[i].getName() + "  плохие");
                badPupil[i].read();
                badPupil[i].study();
                badPupil[i].write();
                badPupil[i].relax();
                System.out.println("");
            } else if (sum[i] == 4) {
                System.out.println("средние показатели ученика " + pupils[i].getName() + " хорошие : ");
                goodPupil[i].read();
                goodPupil[i].study();
                goodPupil[i].write();
                goodPupil[i].relax();
                System.out.println("");
            } else if (sum[i] > 4) {
                System.out.println("средние показатели ученика " + pupils[i].getName() + " замечательные: ");
                excellentPupil[i].read();
                excellentPupil[i].study();
                excellentPupil[i].write();
                excellentPupil[i].relax();
                System.out.println("");
            }
        }

    }

}




