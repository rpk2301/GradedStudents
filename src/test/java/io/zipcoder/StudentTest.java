package io.zipcoder;
import org.junit.Assert;
import org.junit.Test;


public class StudentTest {


    @Test
    public void testGetScoresandBigConstructor()
    {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        String output = student.getexamScores();

        // Then
        System.out.println(output);


    }


    @Test
    public void addExamScore()
    {
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { };
        Student student = new Student(firstName, lastName, examScores);

        // When
        student.addExamScore(100.0);
        String output = student.getexamScores();

        // Then
        System.out.println(output);




    }

    @Test
    public void setExamScore()
    {
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        student.setExamScorei(1, 150.0);
        String output = student.getexamScores();

        // Then
        System.out.println(output);
    }




    @Test
    public void getAverageExamScore()
    {
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        Double output = student.getAverageExamScore();

        // Then
        System.out.println(output);
    }

    @Test
    public void testtoString()
    {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        String output = student.toString();

        // Then
        System.out.println(output);



    }










}