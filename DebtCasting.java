public class DebtCasting {
    public static void main(String[] args) {
        long usDebtLong = 34000000000000L;
        System.out.println("Original long value: " + usDebtLong);

        int debtInt = (int) usDebtLong;
        System.out.println("After cast to int: " + debtInt);

        double usDebtDouble = 34000000000000.0;
        byte debtByte = (byte) usDebtDouble;
        System.out.println("After cast to byte: " + debtByte);
    }
}
