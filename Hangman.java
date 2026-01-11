import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = "dih";

        ArrayList<Character> wordstate = new ArrayList<>();
        int wrongguess = 0;

        for (int i = 0; i < word.length(); i++) {
            wordstate.add('_');
        }

        System.out.println("----------------------------------------");
        System.out.println("       Welcome to hangman game          ");
        System.out.println("----------------------------------------");


    while (wrongguess < 7){

        System.out.print(hangman(wrongguess));

        for (char c : wordstate){
        System.out.print(c+" ");
    }
        System.out.println();

        System.out.println("Enter a letter");
        char guess = scanner.next().toLowerCase().charAt(0);

        if (word.indexOf(guess)>=0){
            System.out.println("correct");
            for (int i = 0;i<word.length();i++){
                if (word.charAt(i) == guess){
                    wordstate.set(i,guess);
                    System.out.println(wordstate);

                }

            }
            if(!wordstate.contains('_')){
                System.out.println(hangman(wrongguess));
                System.out.println("You Win!!");
                System.out.println("The word was "+word);
                break;
            }

        }
        else {
            wrongguess++;
            System.out.println("Wrong");

        }}

    if(wrongguess >= 7){
        System.out.println(hangman(wrongguess));
        System.out.println("Game over!!");
        System.out.println("the correct word was "+ word);
    }



        scanner.close();
    }


    static String hangman (int wrongguesses){
        return switch (wrongguesses){
            case 1 -> """
                       o
                    
                    
                   
                    """;
            case 2 -> """
                       o
                      /
                    
                    
                    """;
            case 3 -> """
                       o
                      /|
                    
                    
                    """;

            case 4 -> """
                       o
                      /|\\
                    
                    
                    """;


            case 5 -> """
                       o
                      /|\\
                       |
                    
                    """;


            case 6 -> """
                       o
                      /|\\
                       |
                      /
                    """;


            case 7 -> """
                       o
                      /|\\
                       |
                      / \\
                    """;
            default -> " ";


        };


    }
}
