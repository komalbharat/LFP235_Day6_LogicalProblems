import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Coupons {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of coupons you require");
        int a = sc.nextInt();
        int [] b = new int[a];


        for (int i = 0; i<b.length; i++){
            Random random = new Random();
            int c = (int) random.nextInt(20);

            boolean check = Arrays.asList(b).contains(c);

            if(check==false){
                b[i] = c;
            }else {
                i--;
            }
        }
        for (int j = 0; j<b.length; j++){
            System.out.println(b[j]);
        }
    }
}