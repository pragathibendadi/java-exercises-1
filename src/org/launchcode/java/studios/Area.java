package org.launchcode.java.studios;
import java.util.Scanner;

public class Area {
    public static  void main(String[] args){
        double radius;
        double area;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Please enter Radius of a circle:");
        radius = in.nextDouble();
        area = (radius*radius)*Math.PI; //pi*R^2
        System.out.println("Area of the circle is " +area);
    }

}
