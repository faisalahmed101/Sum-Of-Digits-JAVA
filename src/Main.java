import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to sum of digits");
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a integer number for digit calculation: ");
        int number = input.nextInt();


        System.out.println(digitCalculator(number));

    }
    public static int digitCalculator(int num){
        int finalNum = 0;
         while (num > 0){
            int digit = num % 10;
            finalNum += digit;
            num/=10;
         }

        return finalNum;
    }

}

