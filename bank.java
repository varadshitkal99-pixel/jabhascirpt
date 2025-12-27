import java.util.Scanner;

public class bank {

    static Scanner scanner = new Scanner(System.in);



    public static void main(String args[]) {

        double deposit;
        double withdraw;
        int choice;
        double balance = 500;
        boolean isRunning = true;


        while(isRunning){
            System.out.println("_______________ IDGAF BANK _______________I");
            System.out.println("what do you want to do");
            System.out.println("1.showbalance");
            System.out.println("1.deposit");
            System.out.println("3.withdraw");
            System.out.println("4.exit");
            System.out.println("____________________________");

            System.out.println("enter your choice (1-4) ->");
            choice = scanner.nextInt();

            switch (choice){
                case 1 -> showbalance(balance);
                case 2 -> {
                    balance += deposit();
                    System.out.println("____________________________");
                    System.out.println("New balance: $" + balance);
                }
                case 3 -> {
                    balance -= withdraw();
                    System.out.println("____________________________");
                    System.out.println("Remaining amount is :$" + balance);
                }
                case 4 -> {
                    isRunning = false;
                    System.out.println("____________________________");
                    System.out.println("Thanks for visiting");
                }

                default -> {
                    System.out.println("____________________________");
                    System.out.println("Invalid choice");
                }



            }

        }



    }
        static void showbalance(double balance){
            System.out.println("your balance is $"+balance);

        }

         static double deposit(){
            double amount ;
            System.out.println("Enter amount to deposit");
            amount = scanner.nextDouble();
            
            if(amount<0){
                System.out.println("amount should not be negative");
                return 0;

            }
            else {
                return amount;
            }

        }

        static double withdraw(){
            Double amount;
            System.out.println("enter amount to withdraw");
            amount=scanner.nextDouble();
            if (amount<0){
                System.out.println("amount should not be negative");

                return 0;
            }else {
                return amount;
            }
        }



}
