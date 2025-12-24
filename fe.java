import java.util.Scanner;

public class fe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double kg;
        double lbs;
        
        System.out.println("enter your weight if you want to convert in kg press 1 or want to convert weight in lbs press 2");
        int lk = scanner.nextInt(); 
        

        if (lk ==1) {
            
        
        System.out.println("enter your weight in kg ");
        kg = scanner.nextDouble();
        double newlbs = kg * 2.20462;
        System.out.println("your weight in lbs is" + newlbs);
        }

       else if(lk == 2){
        System.out.println("enter your weight in kg ");
        lbs = scanner.nextDouble();
        double newkg = lbs / 2.20462;
        System.out.println("your weight in lbs is" + newkg);
       }

       else{
        System.out.println("type correct input");
       }
        scanner.close();
    }
}