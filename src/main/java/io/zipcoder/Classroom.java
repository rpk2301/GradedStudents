package io.zipcoder;

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

        Student[] ret = new Student[students.length+1];
        if(students.length!=0) {
            for (int i = 0; i < students.length; i++) {
                ret[i] = students[i];
            }
            ret[ret.length - 1] = f;
        } else if (ret.length==1) {
         ret[0] = f;
        }
        students=ret;
}

public void removestudent(String firstName, String lastName)
{

    for(int i=0;i<students.length;i++)
    {
        if(students[i].getFirstName().equals(firstName)&& students[i].getLastName().equals(lastName))
        {
            ArrayList<Student> toarr = new ArrayList<Student>();
            toarr = (ArrayList<Student>) Arrays.asList(students);
            toarr.remove(i);
            students = (Student[]) toarr.toArray();
        }
    }

    // Reorder the array
    int nullIndex = 0;
    for (int i = 0; i < students.length; i++) {
        if (students[i] == null) {
            Student temp = students[i];
            students[i] = students[nullIndex];
            students[nullIndex] = temp;
            nullIndex++;
        }
    }





}

}
