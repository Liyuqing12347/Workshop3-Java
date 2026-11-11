public class CalculateCircle {
    public static void main(String[] args) {
        double radius = 5.0;
        final double PI = 3.14159;

        double perimeter = 2 * PI * radius;
        double area = PI * radius * radius;

        System.out.println("Radius = " + radius);
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);
    }
}
