package org.launchcode.java.studios;

public class HelloWorld {
    private String message = "Hello World";

    public void sayHello() {

        String message = "Goodbye World";

        // prints "Goodbye World"
        System.out.println(message);

        // prints "Hello World"
        System.out.println(this.message);

    }

    public static void sayGoodBye(){
        String msg = "sayGoodBye";
        System.out.println(msg);
    }
    public static void main(String[] args){
        HelloWorld a = new HelloWorld();
        a.sayHello();
        HelloWorld.sayGoodBye();
        a.sayGoodBye();


    }
}
