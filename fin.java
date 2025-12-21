import java.util.Scanner;

public class fin {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
      System.out.println("Enter a name :");
      String name = scanner.nextLine();

      System.out.println("Enter your percentage :");
      int percentage = scanner.nextInt();

      System.out.println("enter your cgpa :");
      double cgpa = scanner.nextDouble();

      System.out.println("Name: " + name);
      System.out.println("Percentage: " + percentage);
      System.out.println("CGPA: " + cgpa);








      scanner.close();
    }

  }
