import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int N = sc.nextInt();
        int temp = 0;

        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
                temp = temp + 1;
            }
        }
        if (temp == 0) {
            System.out.println("The number is prime");
        } else
            System.out.println("The number is not prime");

    }

}