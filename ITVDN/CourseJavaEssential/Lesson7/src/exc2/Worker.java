package exc2;

public class Worker {
    private String name;
    private String jobTitle;
    private int yearOfEmployment;

    public Worker() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;

    }

    public int getYearOfEmployment() {
        return yearOfEmployment;
    }

    public void setYearOfEmployment(int yearOfEmployment) {
        this.yearOfEmployment = yearOfEmployment;

    }

    @Override
    public String toString() {
        return "Сотрудник: " + getName() + ";  Должность: " + getJobTitle() + ";  Год принятия на работу:  " + getYearOfEmployment();
    }

}
