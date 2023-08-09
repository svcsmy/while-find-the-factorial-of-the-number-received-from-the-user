import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Please enter a number");
	
	int factorial = 1;
	int number = scanner.nextInt();
	int i =1;
	while(i<=number) {
		factorial *= i;
		i++;
	}
	System.out.println("Factorial:" + factorial);
	
	

	}

}
