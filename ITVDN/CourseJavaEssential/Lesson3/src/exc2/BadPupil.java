package exc2;

public class BadPupil extends Pupil {


    public BadPupil() {
    }

    @Override
    public void study() {

        System.out.print("успеваемость ужасная, ");
    }

    @Override
    public void read() {
        System.out.print("читает плохо, ");
    }

    @Override
    public void write() {
        System.out.print("пишет плохо, ");
    }

    @Override
    public void relax() {
        System.out.println("умеет отдыхать плохо ");
    }

}
