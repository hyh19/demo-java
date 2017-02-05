package v1ch03;

import java.util.*;

/**
 * 3-3 读取输入数据
 * @author Yuhui Huang
 */
public class InputTestX {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("What is your name? ");
		String name = in.nextLine();
		
		System.out.print("How old are you? ");
		int age = in.nextInt();

		System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1) + ".");
		
	}

}
