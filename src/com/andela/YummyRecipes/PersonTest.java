package com.andela.YummyRecipes;

import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.*;

public class PersonTest extends Object {

@Test

public void testPerson() {
Person p = new Person("Mwaura", "Waweru", 24, 12,  32, "blue", "male");
Logger l = Logger.getLogger(Person.class.getName());
    l.info("Name: " + p.getFirstName() + p.getLastName());
    l.info("Age:" + p.getAge());
    l.info("Height (cm):" + p.getHeight());
    l.info("Weight (kg):" + p.getWeight());
    l.info("Eye Color:" + p.getEyeColor());
    l.info("Gender:" + p.getGender());
    assertEquals("Mwaura Waweru", p.getFirstName() + " " + p.getLastName());
    assertEquals(24, p.getAge());
    assertEquals(12, p.getHeight());
    assertEquals(32, p.getWeight());
    assertEquals("blue", p.getEyeColor());
    assertEquals("male", p.getGender());
}
}