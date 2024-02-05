import java.util.Random;
import java.util.Scanner; 
public class DiceRoll {
    public static void main(String[] args) {

        Random random = new Random();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Amount of Games ");  
            int numRolls= sc.nextInt();  

            
            for (int i = 0; i < numRolls; i++) {

                int diceRoll = random.nextInt(6) + 1;

                System.out.println("Roll #" + (i + 1) + ": You rolled a " + diceRoll);
            }
        }
    }
}