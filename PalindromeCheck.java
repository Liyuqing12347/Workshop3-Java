import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String inputWord = scanner.nextLine();

        StringBuffer sb = new StringBuffer(inputWord);
        String reversedWord = sb.reverse().toString();

        if(inputWord.equals(reversedWord)){
            System.out.println(inputWord + " is a palindrome.");
        }else{
            System.out.println(inputWord + " is NOT a palindrome.");
        }
        scanner.close();
    }
}
