import java.util.Random;
import java.util.Scanner; 
public class DiceRoll {
    public static void main(String[] args) {
        // Create a random number generator
        Random random = new Random();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Amount of Games ");  
            int numRolls= sc.nextInt();  

            // Roll the dice multiple times
            for (int i = 0; i < numRolls; i++) {
                // Generate a random number between 1 and 6
                int diceRoll = random.nextInt(6) + 1;

                // Print the result
                System.out.println("Roll #" + (i + 1) + ": You rolled a " + diceRoll);
            }
        }
    }
}