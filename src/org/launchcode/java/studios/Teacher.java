package org.launchcode.java.studios;

public class Teacher {
    private String name;
    private int grade;
    private double rating;

    public Teacher(String name,int grade,double rating){
        this.name = name;
        this.grade = grade;
        this.rating = rating;
    }
    public String getName(){return this.name;}
    public int getGrade(){return this.grade;}
    public double getRating(){return this.rating;}

    public void setName(String name){this.name = name;}
    public void setGrade(int grade){this.grade=grade;}
    public void setRating(double rating){this.rating=rating;}


}
