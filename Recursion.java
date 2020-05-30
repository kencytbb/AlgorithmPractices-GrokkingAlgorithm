import java.util.Arrays;

public class Recursion {
    
    public int fact(int x){
        if(x ==1 ){
            return 1;
        }
        return x * fact(x-1);
    }

    public int DCStrategy(int[] arr){
        if(arr.length <= 0){
            return 0;
        }
       return  arr[0] + DCStrategy(Arrays.copyOfRange(arr, 1, arr.length));
    }

    public static void main(String[] args) {
        Recursion recursive = new Recursion();
        int factNumber = recursive.fact(3);
        System.out.println(factNumber);

        int[] arr = new int[]{2,3,5,7};
        int total = recursive.DCStrategy(arr);
        System.out.println(total);

    }
}