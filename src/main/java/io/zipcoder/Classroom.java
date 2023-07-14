package io.zipcoder;

import java.lang.reflect.Array;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Classroom {

    public Student[] getStudents() {
        return students;
    }
    private Student[] students;
    public Classroom(int maxnumberofstudents) {
        students = new Student[maxnumberofstudents];
    }
    public Classroom(Student[] students) {
        this.students = students;
    }
    public Classroom() {
        students = new Student[30];
    }
    public double getAverageExamScore() {
        double sum = 0;
        for (int i = 0; i < students.length; i++) {
            sum += students[i].getAverageExamScore();
        }
        return sum / students.length;
    }
    public void addstudent(Student f) {

        for (int i = 0; i < students.length; i++) {

            if (students[i] == null) {
                students[i] = f;
                break;
            }
        }
    }
    public Student[] getStudentsbyScore() {
        Student[] ret = Arrays.copyOf(students, students.length);
        for (int i = 0; i < ret.length - 1; i++) {
            if (ret[i].getAverageExamScore() < ret[i + 1].getAverageExamScore()) {
                Student temp = ret[i];
                ret[i] = ret[i + 1];
                ret[i + 1] = temp;
                i = -1;
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
    public HashMap getGradeBook() {
        //Makes a hashmap, fills it with the student objects in all the keys and sets all the grades values to null.
        HashMap<Student, String> gradesmap = new HashMap<>();
        setPercentile();
        SetFinalGrades();
        for (Student p : students) {
            gradesmap.put(p, p.getFinalgrade());
        }
        return gradesmap;
    }
    public static Student[] reverseArray(Student[] array2) {
        int start = 0;
        int end = array2.length - 1;
        Student[] array = new Student[array2.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = array2[i];
        }
        while (start < end) {
            Student temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return array;
    }
    public void setPercentile() {
        Student[] inord = reverseArray(getStudentsbyScore());
        double SumofAvg = 0;
        double percentile = 0.0;
        for (int i = 0; i < inord.length; i++) {
            inord[i].setPercentile(((double) (i + 1) / (double) inord.length) * (double) 100);
        }
        students = inord;
    }
    public void SetFinalGrades() {

        for (Student p : students) {
            if (p.getPercentile() >= 90) {
                p.setFinalgrade("A");
            } else if (p.getPercentile() <= 89 && p.getPercentile() >= 71) {
                p.setFinalgrade("B");
            } else if (p.getPercentile() >= 50 && p.getPercentile() <= 70) {
                p.setFinalgrade("C");
            } else if (p.getPercentile() >= 11 && p.getPercentile() <= 49) {
                p.setFinalgrade("D");
            } else if (p.getPercentile() <= 10) {
                p.setFinalgrade("E");
            }

        }
    }
}



