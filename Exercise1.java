import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Task1 greeting
        System.out.print("Enter number between 1-24: ");
        int hour = sc.nextInt();
        if(hour <18){
            System.out.println("Good day");
        }else{
            System.out.println("Good evening");
        }

        // Task2 multiples of 5 from 10-95 while-loop
        System.out.println("\nMultiples of 5 between 10-95:");
        int num =10;
        while(num <=95){
            System.out.print(num + " ");
            num +=5;
        }

        // Task3 sum from 1-10 using while
        int sum=0;
        int i=1;
        while(i<=10){
            sum = sum +i;
            i++;
        }
        System.out.println("\n\nSum of numbers from 1-10 = "+ sum);

        sc.close();
    }
}
