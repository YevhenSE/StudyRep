package exc2;

 class Vehicle {

    public void print(){
        System.out.println("From main Class Vehicle");
    };

  public class Wheel{

        public void print(){
            System.out.println("From nested class Wheel");
        };
    };
    public class Door{
        public void print(){
            System.out.println("From nested class Door");
        };
    };

}
