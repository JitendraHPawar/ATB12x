package ex_01_Java_Basics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println("I am Jitendra and I am Master in JAVA1");

        Scanner scanner = new Scanner(System.in);
        //System.out.println("please enter day");
        //int day = scanner.nextInt();

        System.out.println("please enter A");
        int a = scanner.nextInt();

        System.out.println("please enter B");
                int b = scanner.nextInt();
                        int c = a-b;

        System.out.println("Addition is");
        System.out.println(c);
    }
}

