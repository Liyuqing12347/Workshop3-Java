import java.util.Scanner;

public class PictureFrameCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width of picture: ");
        double width = sc.nextDouble();
        System.out.print("Enter height of picture: ");
        double height = sc.nextDouble();
        System.out.print("Enter cost per cm: ");
        double costPerCm = sc.nextDouble();

        double perimeter = 2 * (width + height);
        double totalCost = perimeter * costPerCm;

        System.out.println("Total frame cost = " + totalCost);
        sc.close();
    }
}
