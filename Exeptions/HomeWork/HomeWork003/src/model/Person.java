package model;

public class Person {
    public String firstName;
    public String lastName;
    public String patronymicName;
    public String dateOfBirth;
    public long phoneNumber;
    public String gender;

    @Override
    public String toString() {
        return lastName + " " + firstName + " " + patronymicName + " " + dateOfBirth + " "
                + phoneNumber + " " + gender;
    }
}
