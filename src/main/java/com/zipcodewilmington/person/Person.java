package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private int height;
    private int numberOfLimbs;
    private String hobby;
    private int grade;
    private String favFood;


    public Person() {
        this.age = Integer.MAX_VALUE;
        this.name = "";

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
//setter
    public void setName(String name) {
        this.name = name;
    }
//setter
    public void setHeight(int height) {
        this.height = height;
    }
//setter
    public void setNumberOfLimbs(int number) {
        this.numberOfLimbs = number;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHobby(String whatever) {
        this.hobby = whatever;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

//getter
    public String getFavFood() {
        return favFood;
    }

    public String getHobby() {
        return hobby;
    }

    public Integer getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }
//getter
    public Integer getAge() {
        return age;
    }

    public Integer getLimbs() {
        return numberOfLimbs;
    }

    public Integer getHeight() {
        return height;
    }
}
