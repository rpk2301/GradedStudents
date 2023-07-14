package io.zipcoder;


import java.util.ArrayList;


public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores = new ArrayList<Double>();
    private double percentile =0;
    private String finalgrade = "IP";
    public Student(String firstName, String lastName, Double[]testScores)
    {
        this.firstName = firstName;
        this.lastName = lastName;
       for(int i=0;i<testScores.length;i++)
       {
           examScores.add(testScores[i]);

        }
    }
public String getexamScores()
{
    StringBuilder sb = new StringBuilder();
    int count = 1;
    sb.append("> Exam Scores: \n");
    for(int i=0;i<examScores.size();i++)
    {
        sb.append("Exam " + count + " -> " + examScores.get(i) + "\n");
        count++;
    }
    String ret = sb.toString();
    return ret;
}
public void addExamScore(double examscore)
{
    examScores.add(examscore);
}

public int getnumofexamstaken()
{
  return  this.examScores.size();
}


    public ArrayList<Double> getExamScores() {
        return examScores;
    }

    public void setExamScorei(int examnumber, double newscore)
    {
        examScores.set(examnumber-1,newscore);
    }


    public double getAverageExamScore() {

        double sum = 0;
        int i = 0;
        for (Double f : examScores) {
            sum += examScores.get(i);
            i++;
        }
        return sum / examScores.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
         {
            sb.append("Student Name:  " + getFirstName() + " " + getLastName() + "\n");
            sb.append("> Average Score: " + getAverageExamScore() + "\n");
            sb.append(getexamScores());
            String ret = sb.toString();

            return ret;
        }
    }




    public void setExamScores(ArrayList<Double> examScores) {
        this.examScores = examScores;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public double getPercentile() {
        return percentile;
    }

    public void setPercentile(double percentile) {
        this.percentile = percentile;
    }
    public void setFinalgrade(String finalgrade) {
        this.finalgrade = finalgrade;
    }

    public String getFinalgrade() {
        return finalgrade;
    }


}
