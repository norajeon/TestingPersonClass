package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetHeight() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setHeight(expected);

        // Then
        Integer actual = person.getHeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testNumLimbs() {
        // Given
        Person person = new Person();
        Integer expected = 4;

        // When
        person.setNumberOfLimbs(expected);

        // Then
        Integer actual = person.getLimbs();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetGrade() {
        // Given
        Person person = new Person();
        Integer expected = 10;

        // When
        person.setGrade(expected);

        // Then
        Integer actual = person.getGrade();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetHobby() {
        // Given
        Person person = new Person();
        String expected = "reading";

        // When
        person.setHobby(expected);

        // Then
        String actual = person.getHobby();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetFavFood() {
        // Given
        Person person = new Person();
        String expected = "ice cream";

        // When
        person.setFavFood(expected);

        // Then
        String actual = person.getFavFood();
        Assert.assertEquals(expected, actual);
    }
}
