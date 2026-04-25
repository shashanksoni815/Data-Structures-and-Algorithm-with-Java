package Practice;
import java.util.Scanner; 

public class test {
    public static void isEven(int num) {
        if(num % 2 == 0) {
            System.out.print(": is Even");
        } else {
            System.out.print(": is Odd");
        }
    }


    public static void main(String arge[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isEven(n);
            System.out.print("Hello World");
        sc.close();

    }
}
