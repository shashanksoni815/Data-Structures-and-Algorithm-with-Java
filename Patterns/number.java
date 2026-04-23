package Patterns;

public class number {
    public static void main(String[] args) {
        int n = 5;
        

        for (int i = 0; i < n; i++) {
            for (int j = n-i; j <= cols; j++) {

                if (j == 4) {
                    // Special case: 4^i
                    int value = (int) Math.pow(4, i);
                    System.out.print(value + "\t");
                } else {
                    // Normal case: i * j
                    System.out.print((i * j) + "\t");
                }
            }
            System.out.println();
        }
    }
}
