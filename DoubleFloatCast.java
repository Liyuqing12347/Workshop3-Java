public class DoubleFloatCast {
    public static void main(String[] args) {
        // Task1 PI to double then float
        double piDouble = 3.1415926535;
        float piFloat = (float) piDouble;
        System.out.println("PI double: " + piDouble);
        System.out.println("PI float: " + piFloat);

        // Task2 dollar amount with cents 23.99
        double money1 = 23.99;
        System.out.println("\nmoney 23.99 double: " + money1);

        // Task3 zero cents 23.00
        double money2 = 23.00;
        System.out.println("money 23.00 double: " + money2);
    }
}
