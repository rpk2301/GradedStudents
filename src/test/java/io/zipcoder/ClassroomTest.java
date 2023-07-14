package io.zipcoder;
import org.junit.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

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
        Classroom classroom = new Classroom(2);
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
     //  classroom.removestudent("Leon","Hunter");
       ArrayList<Student> f = new ArrayList<Student>();
       for(Student p: classroom.getStudents())
       {
        f.add(p);
       }
        System.out.println(f);
    }

@Test
    public void getStudentsByScore()
{
    Student leon = new Student("Leon", "Baker",new Double[]{5.,5.,3.,8.,3.});
    Student leon1 = new Student("Leon1", "Baker",new Double[]{5.,5.,10.,8.,3.});
    Student leon2= new Student("Leon2", "Baker",new Double[]{5.,35.,3.,8.,3.});
    Student leon3 = new Student("Leon3", "Baker",new Double[]{5.,5.,9.,8.,2.});
    Student[] stuarr = new Student[4];
    Classroom classs = new Classroom(4);
    classs.addstudent(leon);
    classs.addstudent(leon1);
    classs.addstudent(leon2);
    classs.addstudent(leon3);
   Student[] ret = classs.getStudentsbyScore();
    for (Student student : ret) {
        System.out.println(student.toString());
    }

}

@Test
    public void testgetGradeBook()
{
    Student leon = new Student("Leon", "Baker",new Double[]{5.,5.,3.,8.,3.});
    Student leon1 = new Student("Leon1", "Baker",new Double[]{5.,5.,10.,8.,3.});
    Student leon2= new Student("Leon2", "Baker",new Double[]{5.,35.,3.,8.,3.});
    Student leon3 = new Student("Leon3", "Baker",new Double[]{5.,5.,9.,8.,2.});
    Student[] stuarr = new Student[4];
    Classroom classs = new Classroom(4);
    classs.addstudent(leon);
    classs.addstudent(leon1);
    classs.addstudent(leon2);
    classs.addstudent(leon3);
    classs.setPercentile();
   HashMap <Student,String> ricky = classs.getGradeBook();
   System.out.println(ricky.entrySet());

}



}