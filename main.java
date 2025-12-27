import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String args[]){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int randomizer = random.nextInt(0,11);

        System.out.println("---------Number guessing game---------");
        System.out.println("Enter a number 1-10");

        do{
            System.out.println("Enter a guess");
            guess = scanner.nextInt();
            attempts++;

            if (guess< randomizer){
                System.out.println("you guessed too low");
            }
            else if(guess> randomizer) {
                System.out.println("you guessed too high");
            }



        }while (guess!= randomizer);

        System.out.println("you guessed correct "+ randomizer +" with "+attempts +" attempts");




        scanner.close();
    }

}
