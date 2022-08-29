package exc5;

import java.util.Objects;

public class Animal {

    private String name = "Василий";
    private int age = 22;
    private boolean tail = false;


    public Animal() {
    }

    public Animal(String name, int age, boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return tail == animal.tail;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tail);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tail=" + tail +
                '}';
    }


}
