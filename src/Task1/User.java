package Task1;

public class User {
    private int ID;
    private String name;
    private String surname;
    private int age;
    private String phone_number;
    public Address address;

    public User(final int ID, final String name, final String surname, final int age, final String phone_number, final Address address) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phone_number = phone_number;
        this.address = address;
    }

    public int getID() {
        return ID;
    }

    public void setID(final int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(final String phone_number) {
        this.phone_number = phone_number;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(final Address address) {
        this.address = address;
    }

    public void viewUser() {
        System.out.println(this.ID + "| User: " + this.name + " " + this.surname);
        System.out.println("Age: " + this.age);
        System.out.println("Phone number: " + this.phone_number);
        address.viewAddress();
    }
}