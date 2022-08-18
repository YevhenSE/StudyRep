package exc2;

public class GoodPupil extends Pupil {

    public GoodPupil() {
    }

    @Override
    public void study() {
        System.out.print(" успеваемость хорошая, ");
    }

    @Override
    public void read() {
        System.out.print("читает хорошо, ");
    }

    @Override
    public void write() {
        System.out.print("пишет хорошо, ");
    }

    @Override
    public void relax() {
        System.out.println("умеет отдыхать хорошо");
    }

}
