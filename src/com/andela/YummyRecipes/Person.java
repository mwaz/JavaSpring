package com.andela.YummyRecipes;
import java.util.Locale;
import  java.util.logging.Logger;

public class Person {
    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String lastName;
    private int age;
    private int height;
    private int weight;
    private  String eyeColor;
    private String gender;


    public Person(String firstName, String lastName, int age, int height, int weight, String eyeColor, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.eyeColor = eyeColor;
        this.gender = gender;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        int usHeight = height;
        if (Locale.getDefault().equals(Locale.US))
            usHeight /= 2.54;
        return usHeight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }



    public static void main(String[] args) {


        for (int aa =0; aa<3 ; aa++) {
            int [] integers  = new int [] {};
            if(aa == 1)
                continue;
            Person p = new Person("Mwaura", "Waweru", 24, 12,  32, "blue", "male");
            Logger l = Logger.getLogger(Person.class.getName());
            l.info("loop now executing" + aa);
            l.info("Name: " + p.getFirstName() + p.getLastName());
            l.info("Age:" + p.getAge());
            l.info("Height (cm):" + p.getHeight());
            l.info("Weight (kg):" + p.getWeight());
            l.info("Eye Color:" + p.getEyeColor());
            l.info("Gender:" + p.getGender());
            l.info("*******************************" );

        }
    }
}
