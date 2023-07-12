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






public void removestudent(String firstName, String lastName)
{

    for(int i=0;i<students.length;i++)
    {
        if(students[i].getFirstName().equals(firstName)&& students[i].getLastName().equals(lastName))
        {
            ArrayList<Student> toarr = new ArrayList<Student>();
            for(Student p: students)
            {
                toarr.add(p);
            }
            toarr.remove(toarr.get(i));
            for(int f =0;f<toarr.size();f++)
            {
                students[f]=toarr.get(f);
            }
        }
    }

    // Reorder the array
        int insertIndex = 0;

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (i != insertIndex) {
                    students[insertIndex] = students[i];
                    students[i] = null;
                }
                insertIndex++;
            }
        }
    }





}


