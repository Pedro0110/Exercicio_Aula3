import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    
    System.out.println("Informe valor de A");
    int A = sc.nextInt();        
    
    System.out.println("Informe valor de B");    
    int B = sc.nextInt();        

    int X = A + B;

      System.out.println("X =  " + X);
    }
}
