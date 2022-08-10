package fifthexpackage;

public class Address {

    private int index;
    private String country;
    private String street;
    private int house;
    private int apartment;

//public  Address(){ } *-----Variant 2

    public Address(int index, String country, String street, int house, int apartment) {
        this.index = index;
        this.country = country;
        this.street = street;
        this.house = house;
        this.apartment = apartment;
    }


    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public void viewAddress() {
        System.out.println("Address: " + index + ", " + country + ", " + street + " street " + house + "," + apartment);

    }

}
