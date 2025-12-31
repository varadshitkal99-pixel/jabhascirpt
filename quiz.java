import java.util.Scanner;

public class quiz {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] questions ={"1. What is the largest planet in our solar system?",
                "2.Who wrote the play \"Romeo and Juliet\"?",
                "3.What is the chemical symbol for gold?",
                "4. In what year did World War II end?",
                "5.What is the capital city of Australia?"};

        String[][] options ={{"A) Saturn","B) Jupiter","C) Neptune","D) Earth"},
        {"A) Charles Dickens", "B) Jane Austen", "C) William Shakespeare" ,"D) Mark Twain"},
        {"A) Go", "B) Gd", "C) Au", "D) Ag"},
        {"A) 1943", "B) 1945", "C) 1947", "D) 1950"},
        {"A) Sydney", "B) Melbourne", "C) Canberra", "D) Brisbane"}};

        int[] ans = {2,3,3,2,3};
        int guess;
        int score = 0;

        System.out.println("-----------------------------------------------------");
        System.out.println(" __________________Welcome to quiz__________________ ");
        System.out.println("-----------------------------------------------------");



        for(int i =0 ;i<questions.length;i++){
            System.out.println(questions[i]);
            for(String option :options[i]){
                System.out.println(option);
            }
            System.out.println("enter your guess");
            guess = scanner.nextInt();
            if(guess==ans[i]){
                System.out.println("correct!!!");
                score++;

            }else {
                System.out.println("WRONG!");
            }
        }

        System.out.println("your score is "+score+ " out of "+ questions.length );








        scanner.close();

    }
}
