import java.util.Scanner;

public class EnterPIN {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int pin, entry;
		String password;
		
		password = "Dennis1234";
		pin = 12345;
		
		System.out.println("WELCOME TO THE BANK OF JAVA.");
		System.out.print("ENTER YOUR PASSWORD: ");
		String entered = keyboard.nextLine();
		
		while ( ! entered.equals(password)) {
			System.out.println("\nINCORRECT PASSWORD. TRY AGAIN.");
			System.out.print("ENTER YOUR PASSWORD: ");
			entered = keyboard.nextLine();
		}
		
		System.out.println("\nPASSWORD ACCEPTED. ENTER YOUR PIN");
		entry = keyboard.nextInt();
		while ( entry != pin ) {
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
		}
		System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17.");
	}
}