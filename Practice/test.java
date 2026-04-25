package Practice;
import java.util.Scanner; 

public class test {
    public static void isEven(int num) {
        if(num % 2 == 0) {
            System.out.println(": is Even");
        } else {
            System.out.println(": is Odd");
        }
    }

    public static boolean isPrime(int n) {
        for(int i = 2; i < n; i++) {
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String arge[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isEven(n);
        System.out.println("is prime: " + isPrime(n));

            System.out.println("Hello World");
        sc.close();

    }
}
