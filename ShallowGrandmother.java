import java.util.Scanner;

public class ShallowGrandmother {
public static void main( String[] args ) {
Scanner keyboard = new Scanner(System.in);
int age, age2;
double income, cute, happy;
boolean allowed, allowed2;

System.out.println("Grandma#1");
System.out.println( "Enter your age: " );
age = keyboard.nextInt();

System.out.println( "Enter your yearly income: " );
income = keyboard.nextDouble();

System.out.println( "How cute are you, on a scale from 0.0 to 10.0? " );
cute = keyboard.nextDouble();

allowed = ( age > 25 && age < 40 && ( income > 50000 || cute >= 8.5 ) );

System.out.println( "Allowed to date my grandchild? " + allowed );

System.out.println();

System.out.println("Grandma#2");

System.out.println( "Enter your age: " );
age2 = keyboard.nextInt();

System.out.println( "On a scale from 0.0 to 10.0, how happy do you make my grandchild? " );
happy = keyboard.nextDouble();

allowed2 = ( age2 >25 && age2<40 && happy>=9.0);
System.out.println( "Allowed to date my grandchild? " + allowed2 );

	}
}