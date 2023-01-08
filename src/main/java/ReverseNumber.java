import java.util.Scanner;
public class ReverseNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter number");
        int N = sc.nextInt();
        int Reminder = 0;

        while (N > 0){
            Reminder = N % 10;
            System.out.print(Reminder);
            N = N / 10;
        }

    }

}