package io.zipcoder.interfaces;

import io.zipcoder.interfaces.interfaces.Learner;
import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation() {
        Student student = new Student(0L, null);

        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance() {
        Student student = new Student(0L, null);

        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn() {
        Student student = new Student(0L, null);
        double actualStudyTime = 4.5;
        double expectedStudyTime = student.getTotalStudyTime();

        student.learn(actualStudyTime);

        Assert.assertEquals(expectedStudyTime + actualStudyTime, student.getTotalStudyTime(), 0.01);
    }
}
