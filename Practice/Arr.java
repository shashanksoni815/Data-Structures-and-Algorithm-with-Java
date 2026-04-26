package Practice;

public class Arr {
    public static int found(int num[], int key) {
        for(int i = 0; i < num.length; i++) {
            if(num[i] == key){
                return i;
            }
        }
        return -1;
    }
    
    public static void sum(int num[], int key) {
        for(int i = 0; i < num.length; i++) {
            for(int j = i+1; j < num.length; j++) {
                if(num[i] + num[j] == key) {
                    System.out.println("The pair is: " + num[i] + " and " + num[j]);
                }
            }
        }
        // System.out.println("No pair found");
    }
    
    public static void sumMaxArr(int arr[]) {
      int max = Integer.MIN_VALUE;
      int add = 0;
        for(int i =0; i< arr.length; i++){
            for(int j=i; j <= arr.length; j++){
                add = 0;
                for(int k=i; k<j; k++){
                    System.out.print(arr[k] + " ");
                    add += arr[k];
                }
                    System.out.print(" = " + add );
                    if(add > max){
                        max = add;
                    }
                System.out.println();
            }
            System.out.println();
        }
        System.out.print(max);
        
    }
    
    public static void sumMaxArr2(int arr[]) {
        int max = Integer.MIN_VALUE;
        int curr = 0;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1; i< arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        


        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                curr = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                System.out.println(curr);
                if(curr > max){
                    max = curr;
                }
            }
        }
        System.out.print(max);
    }

    public static void Kadanes(int aee[]){
        int max = Integer.MIN_VALUE;
        int curr = 0;
        for(int i = 0; i < aee.length; i++){
            curr += aee[i];
            if(curr > max){
                max = curr;
            }
            if(curr < 0){
                curr = 0;
            }
        }
        System.out.print(max);
    }

    public static void trapedWater(int height[]){
        int idx = height.length;
        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;
        
        int rightHeight[] = new int[idx];
        int leftHeight[] = new int[idx];
        
        rightHeight[0] = height[0];
        for(int i=1; i< idx; i++){
            if(height[i]> rightHeight[i-1]){
               rightHeight[i] = height[i];
            } else {
            rightHeight[i] = rightHeight[i-1]; 
            }
        }
        printArr(rightHeight);
        
        leftHeight[idx-1] = height[idx-1];
        for(int i=idx-2; i>= 0; i--){
            if(height[i] > leftHeight[i+1]){
                leftHeight[i] = height[i];
            }else {
                leftHeight[i] = leftHeight[i + 1];
            }
        }
        printArr(leftHeight);
        // int high = 0;
        int waterHigh = 0;
        for(int i = 0; i < idx; i++){
            // if(rightHeight[i] > leftHeight[i]){
            //     high = leftHeight[i];
            // } else {
            //     high = rightHeight[i];
            // }
            // waterHigh += high - height[i]; 
            int waterLevel = Math.min(leftHeight[i], rightHeight[i]);
            waterHigh += waterLevel - height[i];
        }
        System.out.println(waterHigh);
        
        
        
    }
    
    public static void printArr(int arr[]){
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static void reverse(int arr[]) {
        for(int i=0; i<arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;

        }
        printArr(arr);
    } 
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // int key = 17;
        // System.out.println(found(num, key));
        // sum(num, key);
        // Kadanes(num);
        // int height[] = {4, 2, 0, 6, 3, 2, 5};
        // int target = 15;
        // trapedWater(height);
        // printArr(height);
        reverse(num);
    }    
}
