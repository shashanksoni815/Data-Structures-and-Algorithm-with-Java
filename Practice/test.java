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

    public static void isPalindrome(int n) {
        int num = n;
        int p = 0;
        while(n > 0) {
            int lastDig = n%10;
            p = p*10 + lastDig;
            n/=10;
        }
        if (num == p){
            System.out.print("is palindrome");
        } else {
            System.out.print("is not palindrome");
            
        }
        
    }

    public static void isArmstrong(int n) {
        int num = n;
        int arm = 0;
        int count = 0;
         while(num > 0){
            //  int lastdig = num%10;
             num /=10;
             count++;
         }
         num = n;
         while(num > 0){
             int lastdig = num%10;
             arm += (int)Math.pow(lastdig, count);
             num /=10;
         }
         System.out.print(arm);
    }


    public static void main(String arge[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // isEven(n);
        // System.out.println("is prime: " + isPrime(n));

        //     System.out.println("Hello World");
        // isPalindrome(n);
        isArmstrong(n);
        sc.close();

    }
}
