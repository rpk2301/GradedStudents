package io.zipcoder;
import org.junit.*;
import junit.framework.TestCase;
import java.util.Arrays;
import java.util.ArrayList;

public class ClassroomTest {


    @Test
    public void getAvgExamScore()
    {
        // : Given
        Double[] s1Scores = { 100.0, 150.0 };
        Double[] s2Scores = { 225.0, 25.0 };

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = {s1,s2};
        Classroom classroom = new Classroom(students);

        // When
        double output = classroom.getAverageExamScore();

        // Then
        System.out.println(output);
    }

    // : Given
    @Test
    public void testadd() {
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = {100.0, 150.0, 250.0, 0.0};
        Student student = new Student("Leon", "Hunter", examScores);

        // When
        Student[] preEnrollment = classroom.getStudents();
        String preEnrollmentAsString = Arrays.toString(preEnrollment);
        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);
        classroom.addstudent(student);
        Student[] postEnrollment = classroom.getStudents();

        // Then

        String postEnrollmentAsString = Arrays.toString(postEnrollment);


        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);

    }

    @Test
    public void removeStudent()
    {
        Classroom classroom = new Classroom();
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student(firstName, lastName, examScores);
        String firstName2 = "Leonf";
        String lastName2 = "Hunterf";
        Double[] examScores2 = { 100.0, 150.0, 250.0, 0.0 };
        Student student2 = new Student(firstName2, lastName2, examScores2);
        classroom.addstudent(student);
        classroom.addstudent(student2);
       classroom.removestudent("Leon","Hunter");
        System.out.println(classroom.getStudents().toString());
    }







}