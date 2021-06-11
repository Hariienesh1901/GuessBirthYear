import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome, I can guess your bith year using your Age with mathematical operation");
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("What's your name: ");
		String Name = myObj.nextLine();
		
		System.out.println("What's your age: ");
		int Age = myObj.nextInt();
		
		int cyear = 2021;
		int byear = cyear - Age;
		System.out.println(Name + ", You are born at year " + byear);
	}

}
