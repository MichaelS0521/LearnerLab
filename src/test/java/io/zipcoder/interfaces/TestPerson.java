package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {
        Person person = new Person(0L, "John");

        Long actualId = person.getId();
        String actualName = person.getName();

        Long expectedId = 0L;
        String expectedName = "John";

        Assert.assertEquals(actualId, expectedId);
        Assert.assertEquals(actualName, expectedName);
    }

    @Test
    public void testSetName() {
        Person person = new Person(0L, null);

        person.setName("John Smith");
        String actualName = person.getName();

        String expectedName = "John Smith";

        Assert.assertEquals(actualName, expectedName);
    }
}
