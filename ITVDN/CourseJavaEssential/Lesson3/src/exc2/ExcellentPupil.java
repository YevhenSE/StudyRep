package exc2;

public class ExcellentPupil extends Pupil {

    @Override
    public void study() {
        System.out.print("успеваемость замечательная, ");
    }

    public void read() {
        System.out.print("читает замечательно, ");
    }

    public void write() {
        System.out.print("пишет замечательно, ");
    }

    public void relax() {
        System.out.println("умеет отдыхать замечательно.");
    }
}
