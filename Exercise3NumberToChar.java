import java.util.Scanner;

public class Exercise3NumberToChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer between 0-35: ");
        int input = sc.nextInt();

        if(input <=9){
            System.out.println(input);
        }else{
            char outputChar = (char)(input -10 + 65);
            System.out.println(outputChar);
        }
        sc.close();
    }
}
