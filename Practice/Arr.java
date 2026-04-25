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
    
    
    public static void main(String[] args) {
        int num[] = {1, 3, 5, 7, 8, 9};
        int key = 18;
        System.out.print(found(num, key));
    }   
        
         
}
