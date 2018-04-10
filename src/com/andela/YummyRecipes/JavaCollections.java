package com.andela.YummyRecipes;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class JavaCollections {

    private String firstName;
    private String secondName;
    private int  age;
    private  int  height;
    private int weight;


    public JavaCollections(String firstName, String secondName, int age, int height, int weight) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
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

public  static  void main(String[] args ){
        //Needs to always create an object that inherits the method from the actual class..
        // C is the object in this case
        JavaCollections C = new JavaCollections("mwaz", "wawesh", 26, 7, 56);
        Logger l = Logger.getLogger(JavaCollections.class.getName());

        // Objects can hold any kind of data type
        Object[] elements  = new Object [6];

        elements[1] = C.getHeight();
        elements[2] = C.getAge();
        elements[3] = C.getWeight();
        elements[4] = C.getFirstName();
        // Using the standard print for elements
        l.info("Elements:" + " " + elements[1]);
        l.info("Elements length:" + " " + elements.length);

        // Populating a list
        List<Integer> listOfIntegers = new ArrayList<>();
        listOfIntegers.add(Integer.valueOf(235));
        listOfIntegers.add(Integer.valueOf(290));
        listOfIntegers.add(Integer.valueOf(200));
        l.info("All list items:" + " " + listOfIntegers);


        //Looping through an array of items using Iterable
        for(int listItem : listOfIntegers)
        l.info("Individual item in listofIntegers:" + " " + listItem);



}

}
