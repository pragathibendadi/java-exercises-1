package org.launchcode.java.studios;

import java.util.Map;

public class Principal {
    public static void main(String[] args){
        Teacher pragathi = new Teacher("wilton",2,4.5);
        Student Pari = new Student("pari",101,"Meckelvey");
        Pari.addmarks("English:",95);
        Pari.addmarks("Math:",85);
        Pari.addmarks("social:",82);

        Pari.setTeacher(pragathi);

        System.out.println("student name:"+Pari.getName());
        System.out.println("Id:"+Pari.getId());
        System.out.println("School name:"+Pari.getSchool());
        System.out.println("Teacher name:"+Pari.getTeacher().getName());
        System.out.println("Grade:"+Pari.getTeacher().getGrade());
        System.out.println("Teaching grade:"+Pari.getTeacher().getRating());
        for( Map.Entry<String,Integer> entry : Pari.getMarklist().entrySet()){
            System.out.println(entry.getKey()+entry.getValue());
        }
        //System.out.println(Pari.getMarklist());
        Student Kriti = new Student("Kriti",102,"ISC", pragathi);

        System.out.println("------------------------");
        System.out.println("name:"+Kriti.getName());
        System.out.println("Id:"+Kriti.getId());
        System.out.println("school name:"+Kriti.getSchool());
        System.out.println("Teacher name:"+Kriti.getTeacher().getName());
        System.out.println("Grade:"+Kriti.getTeacher().getGrade());
        System.out.println("Teaching grade:"+Kriti.getTeacher().getRating());



    }
}
