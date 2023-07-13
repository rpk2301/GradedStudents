package io.zipcoder;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Classroom {

    public Student[] getStudents() {
        return students;
    }

    private Student[] students;

    public Classroom(int maxnumberofstudents)
    {
        students = new Student[maxnumberofstudents];
    }

    public Classroom(Student[] students)
    {
        this.students = students;
    }

    public Classroom()
    {
        students = new Student[30];
    }
    public double getAverageExamScore()
    {
        double  sum = 0;
        for(int i=0; i<students.length;i++)
        {
            sum += students[i].getAverageExamScore();
        }
        return sum/students.length;
    }

public void addstudent(Student f) {

   for(int i =0; i<students.length;i++)
   {

        if (students[i] ==null) {
            students[i]=f;
            break;
        }

    }
}

public Student[] getStudentsbyScore()
{
    Student[] ret = Arrays.copyOf(students,students.length);
    for(int i=0;i<ret.length-1;i++)
    {
        if(ret[i].getAverageExamScore()<ret[i+1].getAverageExamScore())
        {
            Student temp = ret[i];
            ret[i]=ret[i+1];
            ret[i+1]=temp;
            i=-1;
        }
    }
    return ret;









}





public void removestudent(String firstName, String lastName) {


    int index = 0;

    for (int i = 0; i < students.length; i++) {
        if (students[i].getFirstName().equals(firstName) && students[i].getLastName().equals(lastName)) {
            // ArrayList<Student> toarr = new ArrayList<Student>(Arrays.asList(students));
            index = i;
            break;
        }
    }
    for (int i = index; i < students.length - 1; i++) {

        students[i] = students[i + 1];
        if (i == students.length - 2) {
            students[i + 1] = null;
        }

    }
}








}


