import java.util.Scanner;

public class AnimalPicker {

	public static void main(String[] args) 
	{
		
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Which animal would you like to see: Dog or Cat?");
		
	boolean tryAgain = true;
	
	while(tryAgain) 
		
		{	

		
		
		String userInput =  keyboard.nextLine();
		
			
			
			if (userInput.equalsIgnoreCase("cat"))
				{
				System.out.println("CAT ASCII ART HERE");
				//valid = true;
				}
			else if (userInput.equalsIgnoreCase("dog"))
				{
				System.out.println("Dog ASCII ART HERE");
				//valid = true;
				}
			else
			{
				System.out.println("Invalid input try again");
				tryAgain = true;
			}
		}
	}

}
