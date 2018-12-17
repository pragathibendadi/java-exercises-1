package org.launchcode.java.studios;

import javax.security.auth.Subject;
import java.util.HashMap;

public class Student {
    private String name;
    private int id;
    private String school;
    private  Teacher teacher;
    private HashMap<String,Integer> Marklist;

    public Student(String name, int id, String school) {
        this.name = name;
        this.id = id;
        this.school = school;
        this.Marklist = new HashMap<>();
    }

    public Student(String name, int id, String school, Teacher teacher) {
        this(name, id, school);
        this.teacher = teacher;


    }

    public String getName(){return this.name;}//get method
    public int getId(){ return this.id;}
    public String getSchool(){return this.school;}
    public Teacher getTeacher(){return this.teacher;}


    public void setName(String name){this.name = name;}//set method
    public void setId(int id){this.id = id;}
    public void setSchool(String school){this.school = school;}
    public void setTeacher(Teacher teacher){this.teacher= teacher;}
    public void addmarks(String subject, Integer marks){
        Marklist.put(subject,marks);
    }
    public HashMap<String,Integer> getMarklist(){return this.Marklist;}
}

