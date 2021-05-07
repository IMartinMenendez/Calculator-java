package org.example;
import java.util.Scanner;
/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Scanner myObj2 = new Scanner(System.in);
        Scanner myObj3 = new Scanner(System.in);
        int num1;
        int result = 0;

        System.out.println("Enter first number");
        num1 = myObj.nextInt();

        System.out.println("Enter operator");
        String operator = myObj2.nextLine();

        System.out.println("Enter second number");
        int num2 = myObj3.nextInt();

        System.out.println("your result is: " + result);
    }
}
