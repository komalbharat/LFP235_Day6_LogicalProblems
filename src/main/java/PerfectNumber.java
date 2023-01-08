import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int N = sc.nextInt();
        int Outcome =0;
        int Total = 0;

        for (int i = 1; i < N; i++ ){

            if (N % i == 0){
                Outcome = i * 1;
                //System.out.println(Outcome);
                Total = Outcome + Total;

            }

        }            System.out.println("Sum of Factor is " + Total);
        if (Total == N){
            System.out.println("The number is perfect");
        }else
            System.out.println("The number is not perfect");

    }

}