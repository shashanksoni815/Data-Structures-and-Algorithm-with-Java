package Patterns;

public class numberpattern {
    public static void main(String[] args) {

        int rows = 5;
        int cols = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {

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
