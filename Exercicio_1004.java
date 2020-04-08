import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
    int x;
    int y;
        
    Scanner sc = new Scanner(System.in);

    System.out.println("Insira o primeiro número");
    x = sc.nextInt();        

    System.out.println("Insira o segundo número");
    y = sc.nextInt();        

    int PROD = x + y;

      System.out.println("PROD = " + PROD);
    }
}
