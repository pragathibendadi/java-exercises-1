package org.launchcode.java.studios;

public class ConditionalStatementsDemo {
    public static void main(String[] args) {
//        int x = 25; if statement
//        int y = 35;
//        if (x > y) {
//            System.out.println("x is smaller than y");
//        } else {
//            System.out.println("y is smaller than x");
//
//        }
//        int day = 2;//day is called expression
//        switch(day){//switch used to check more than one condition
//            case 1: System.out.println("1st rank"); //if day=1 excute this n print
//                break;
//            case 2: System.out.println("2nd rank");
//                break;
//            case 3: System.out.println("3rd rank");
//                break;
//            default : System.out.println("Enter valid input");
//        }
//    }
//IF ELSE IF Statements
        int marks = 86;
        if (marks > 85) {
            System.out.println("A Grade");
        } else if (marks > 75) {
            System.out.println("B Grade");
        } else if (marks > 55) {
            System.out.println("C Grade");
        } else if (marks > 45) {
            System.out.println("d Grade");
        } else {
            System.out.println("fail");
        }

    }
}
