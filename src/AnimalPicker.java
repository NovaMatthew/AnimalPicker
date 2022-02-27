import java.util.Scanner;

public class AnimalPicker {

	public static void main(String[] args) 
	{
		
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Which animal would you like to see: Dog, Cat, or Fish?");
		
		boolean tryAgain = true;
		
		while(tryAgain) 
		{	
			String userInput =  keyboard.nextLine();
		

			if (userInput.equalsIgnoreCase("cat"))
			{
				System.out.println("\n            _       \n   ___ __ _| |_ ___ \n  / __/ _` | __/ __|\n | (_| (_| | |_\\__ \\\n  \\___\\__,_|\\__|___/  ");
				
			}
			else if (userInput.equalsIgnoreCase("dog"))
			{
				System.out.println("      _                 \n   __| | ___   __ _ ___ \n  / _` |/ _ \\ / _` / __|\n | (_| | (_) | (_| \\__ \\\n  \\__,_|\\___/ \\__, |___/\n              |___/     ");
			
			}
			else if(userInput.equalsIgnoreCase("fish"))
			{
				System.out.println("   __ _     _     \n /  _(_)___| |__  \n | |_| / __| \'_ \\ \n |  _| \\__ \\ | | |\n |_| |_|___/_| |_|");
			}
			else if(userInput.equalsIgnoreCase("bird"))
			{
				System.out.println("   ___     ___\n  (o o)   (o o)\n (  V  ) (  V  ) \n/--m-m- /--m-m-");
			}
			else 
			{
				System.out.println("Invalid input try again:");
				tryAgain = true;
			}
		}
	}

}
