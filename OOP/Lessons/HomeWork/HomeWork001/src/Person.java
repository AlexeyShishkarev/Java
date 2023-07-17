import java.lang.management.ThreadInfo;
import java.util.ArrayList;
import java.util.List;

public class Person extends Human{
    private int yearOdDeath;
    private Person mather;
    private Person father;
    private Person spouse;
    private List<Person> children;


    public Person(String firstName, String lastName, String surName, int yearOfBirth) {
        super(firstName, lastName, surName, yearOfBirth);
        this.children = new ArrayList<>();
    }




    public void setMather(Person mather) {
        this.mather = mather;
    }

    public Person getMather() {
        return mather;
    }

    public void setFather(Person father) {
        this.father = father;
    }
    public Person getFather() {
        return father;
    }

    public void setChildren(Person person) {
        children.add(person);
    }

    public String getChildren(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список детей: \n");
        for (Person person: children) {
            stringBuilder.append(person);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

}
