import java.util.Scanner;


public class temoconvo{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        double temp;
        double newtemp;
        String unit;

        System.out.println("Enter your temp");
        temp = scanner.nextDouble();


        System.out.println("convo temp in celcius or farharenite press(C/F)");
        unit = scanner.next().toUpperCase();

        newtemp = (unit.equals("C")) ? (temp - 32)* 5/9 : (temp * 9/5)+32;

        System.out.println(newtemp + ""+unit);

        


        scanner.close();

    }



}


//format for operator

//(condition)? true/false