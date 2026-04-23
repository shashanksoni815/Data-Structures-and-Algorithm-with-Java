package Patterns;

public class symmetric {
    public static void butterfly(int num) {
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            for(int j = 1; j <= 2*(num-i); j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = num; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            for(int j = 1; j <= 2*(num-i); j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rhombus(int num) {
        for(int i = 1; i <= num; i++) {
            // spaces
            for(int j = 1; j <= num-i; j++){
                System.out.print("  ");
            }
            // stars
            for(int j = 1; j <= num; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollowRhombus(int num) {
        for(int i = 1; i <= num; i++) {
            // spaces
            for(int j = 1; j <= num-i; j++){
                System.out.print("  ");
            }
            // stars
            for(int j = 1; j <= num; j++){
                if (i == 1 || i == num || j == 1 || j == num) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int num) {
        for(int i = 1; i <= num; i++) {
            for(int j = num-i; j >= 1; j-- ) {
                System.out.print("  ");
            }
            for(int j = 1; j <= (2*i)-1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        // bottom diamond
        for(int i = num; i >= 1; i--) {
            for(int j = num-i; j >= 1; j-- ) {
                System.out.print("  ");
            }
            for(int j = 1; j <= (2*i)-1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        butterfly(5);
        rhombus(8);
        hollowRhombus(8);
        diamond(5);
    }
}
