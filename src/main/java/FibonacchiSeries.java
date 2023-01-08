import java.util.Scanner;

public class FibonacchiSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int N = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 1; i<= N; i++){
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }

}