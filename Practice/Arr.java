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

    public static void main(String[] args) {
        int num[] = {1, -2, 6, -1, 3};
        // int key = 17;
        // System.out.println(found(num, key));
        // sum(num, key);
        Kadanes(num);
    }    
}
