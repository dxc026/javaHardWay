import java.util.Scanner;

public class RudeQuestions{
	public static void main(String[]args){
		String name;
		int age;
		double weight, income;
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Hello. What is your name?");
		name = key.next();
		
		System.out.println("Hi, " + name + "! How old are you?");
		age = key.nextInt();
		
		System.out.println("So you're " + age + ", eh? That's not very old.");
		System.out.print( "How much do you weigh, " + name + "? " ); 
		weight = key.nextDouble();
		System.out.println( weight + "! Better keep that quiet!!" );
		
		System.out.print("Finally, what's your income, " + name + "? " );
		income = key.nextDouble();
		
		System.out.print( "Hopefully that is " + income + " per hour" );
		System.out.println( " and not per year!" );
		System.out.print( "Well, thanks for answering my rude questions, " );
		System.out.println( name + "." );
	}
}