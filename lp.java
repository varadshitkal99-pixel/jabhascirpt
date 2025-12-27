import java.util.Scanner;


public class lp {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        char sym;

        System.out.println("enter rows");
        rows =scanner.nextInt();

        System.out.println("enter col");
        columns =scanner.nextInt();

        System.out.println("enter symbol");
        sym =scanner.next().charAt(0);




    for (int i=1;i<=rows;i++) {
        for (int j = 1; j <= columns; j++) {
            System.out.print(sym);

        }
        System.out.println();
    }

        scanner.close();
    }

}
