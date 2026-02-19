package Arrays;

public class rainWater {
    public static void waterContain(int[] altitude) {
        int totalLength = altitude.length;
        
        int rightside[] = new int[totalLength];
        int leftside[] = new int[totalLength];
    }



    public static void main(String[] args) {
        int altitude[] = {3,2,1,5,3,4,6,1,2,4,1};
        waterContain(altitude);


        int height[] = {1, 2, 0, 3, 2, 0, 1, 2}; 

        int height_size = height.length;

        // int left[] = {1, 2, 2, 3, 3, 3, 3, 3};
        // int right[] = {3, 3, 3, 3, 2, 2, 2, 2};

        int left[] = new int[height_size];
        int right[] = new int[height_size];

        left[0] = height[0];
        for (int i = 1; i < height_size; i++) {
            left[i] = Math.max(left[i-1], height[i]);
        }

        right[height_size - 1] = height[height_size - 1];
        for (int i = height_size - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i]);
        }

        int result = 0;
        for(int i = 0; i < height.length; i++){
            result = result + (Math.min(left[i] , right[i]) - height[i] );
        }
        System.out.println(result);
    }
}
