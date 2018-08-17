package com.example.hp.reportclass;

public class ReportCard extends Student {
    String name;
    char englishGrade;
    String mathGrade;
    int historyGrade;
    double biologyGrade;

    public ReportCard() {
        name = "Anu";
        englishGrade = 'A';
        mathGrade = "A-";
        historyGrade = 85;
        biologyGrade = 90.5;
    }

    String Grades[] = new String[20];// a string array to score different subject grades of student

    public String getName() //getting eng subject marks of  student
    {
        return name;
    }

    public void setName(String name)//setting eng subject marks of  student
    {
        name = "Anusha";
    }

    public char getEnglishGrade()//getting eng subject marks of  student
    {
        return englishGrade;
    }

    public void setEnglishGrade()//setting eng subject marks of  student
    {
        englishGrade = 'B';
    }

    public String getMathGrade()//getting maths subject marks of  student
    {
        return mathGrade;
    }

    public void setMathGrade()//setting maths subject marks of  student
    {
        mathGrade = "A+";
    }

    public int getHistoryGrade()//getting history subject marks of  student
    {
        return historyGrade;
    }

    public void setHistoryGrade()//setting history subject marks of  student
    {
        historyGrade = 88;
    }

    public double getBiologyGrade()//getting biology subject marks of  student
    {
        return biologyGrade;
    }

    public void setBiologyGrade()//setting bio subject marks of  student
    {
        biologyGrade = 95.8;
    }
    @Override
    public String toString() {

        return ("Name:" + getName() + "; English grade:" + getEnglishGrade() + " History grade: " + getHistoryGrade() + "; Math grade:" + mathGrade + "Biology grade:" + getBiologyGrade());
    }

    public static void main(String args[]) {
        ReportCard r = new ReportCard();

        String abc = r.toString();
        System.out.print(abc);

    }

}

