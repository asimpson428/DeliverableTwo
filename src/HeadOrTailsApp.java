import java.util.Scanner;

public class HeadOrTailsApp {
	
	public static void main(String[] args) {
	
		// Initializing the variables
		 int correctCount = 0, k = 0, user_guess;
		 
		// Take input for headsOrTailsGuess
			Scanner sc= new Scanner(System.in);     //Standard input stream
			System.out.print("\nGuess which will have more: heads or tails? ");
			String headsOrTailsGuess= sc.nextLine();  //reads string 
			
			user_guess = headsOrTailsGuess.equals("heads")?1:2;
			
			// Take input for number of flips
			System.out.print("\nHow many times shall we flip a coin? ");  
	        int numberOfFlips= sc.nextInt(); 
	        
	        int max = 2;
	        int min = 1;
	        int range = max - min + 1;
	        int[] coin_flips = new int[numberOfFlips];
	        
	        for (int i = 0; i < numberOfFlips; i++)
	        {
	            // Generating random number
	            int rand1 = (int)(Math.random() * range) + min;
	            coin_flips[k++] = rand1;
	        }
	        
	        for (int i = 0; i < numberOfFlips; i++) 
	        {
	            if (coin_flips[i] == 1)
	            {
	                System.out.println("heads");
	                if (user_guess == 1)
	                {
	                    correctCount++;
	                }
	                
	            }
	            
	            else if (coin_flips[i] == 2)
	            {
	                System.out.println("tails");
	                if (user_guess == 2)
	                {
	                    correctCount++;
	                }
	            }
	        }
	        
	     // Calculating the correct guess percentage
	        int correct_percent = (correctCount*100) / numberOfFlips;
	        
	        // Final output statement
	        System.out.println("Your Guess, "+headsOrTailsGuess+", came up "+correctCount+" time(s). That's "+correct_percent+"%.");
	        
		}
	}
    
	                
	                
			
	
	
	
		
	


