package ex_01_Java_Basics;

import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        System.out.println("please enter number");
        int c;
        System.out.println("please enter number a and b ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        c=a+b;
        System.out.println(c);

    }
}
