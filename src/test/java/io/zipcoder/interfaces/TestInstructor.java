package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation() {
        Instructor instructor = new Instructor(0L, null);

        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Instructor instructor = new Instructor(0L, null);

        Assert.assertTrue(instructor instanceof  Person);
    }

    @Test
    public void testTeach() {
        Instructor instructor = new Instructor(0L, null);
        Student student = new Student(0L, null);
        double initialStudyTime = student.getTotalStudyTime();
        double numberOfHours = 5.0;

        instructor.teach(student, numberOfHours);

        Assert.assertEquals(initialStudyTime + numberOfHours, student.getTotalStudyTime(), 0.01);
    }

    @Test
    public void testLecture() {
        Instructor instructor = new Instructor(0L, null);
        Student[] students = {
                new Student(1L, "John"),
                new Student(2L, "Smith"),
                new Student(3L, "Michael")
        };

        double initialStudyTime = students[0].getTotalStudyTime();

        double numberOfHours = 6.0;

        instructor.lecture(students, numberOfHours);

        double expectedNumberHours = numberOfHours / students.length;
        for (Student student : students){
            Assert.assertEquals(initialStudyTime + expectedNumberHours, student.getTotalStudyTime(), 0.01);
        }
    }
}
