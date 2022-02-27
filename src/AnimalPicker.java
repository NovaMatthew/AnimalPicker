import java.util.Scanner;

public class AnimalPicker {

	public static void main(String[] args) 
	{
		System.out.println("Which animal would you like to see: Dog or Cat?");
		Scanner keyboard = new Scanner(System.in);
		String userInput =  keyboard.nextLine();
		
		if (userInput.equalsIgnoreCase("cat"))
			{
			System.out.println("CAT ASCII ART HERE");
			}
		else if (userInput.equalsIgnoreCase("dog"))
			{
			System.out.println("Dog ASCII ART HERE");
			}

	
		
	}

}
