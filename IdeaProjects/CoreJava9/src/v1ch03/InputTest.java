package v1ch03;

import java.util.Scanner;

/**
 * Created by Yuhui Huang on 10/02/2017.
 * 3-2 P55
 */
public class InputTest {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = in.nextLine();

        System.out.println("How old are you?");
        int age = in.nextInt();

        System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1) + ".");
    }
}
