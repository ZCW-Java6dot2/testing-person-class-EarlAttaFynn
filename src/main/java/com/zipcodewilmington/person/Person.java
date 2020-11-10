package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    //Instance fields
    private String name;
    private int age;
    private String hairColor;
    private String dosha;
    private int birthday;
    private int height;

    //Constructors
    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public void setDosha(String dosha) {
        this.dosha = dosha;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    //Getters

    public String getDosha() {
        return dosha;
    }

    public int getBirthday() {
        return birthday;
    }

    public String getHairColor() {
        return hairColor;
    }


    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
