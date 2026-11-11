import java.util.Scanner;

public class Exercise2FindMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double n1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double n2 = sc.nextDouble();
        System.out.print("Enter third number: ");
        double n3 = sc.nextDouble();

        double min = n1;
        if(n2 < min) min = n2;
        if(n3 < min) min = n3;

        System.out.println("The smallest number is: " + min);
        sc.close();
    }
}
