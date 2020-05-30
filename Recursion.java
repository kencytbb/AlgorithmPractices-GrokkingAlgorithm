import java.util.Arrays;

public class Recursion {
    
    public int fact(final int x) {
        if (x == 1) {
            return 1;
        }
        return x * fact(x - 1);
    }

    public int sumArray(final int[] arr) {
        if (arr.length <= 0) {
            return 0;
        }
        return arr[0] + sumArray(Arrays.copyOfRange(arr, 1, arr.length));
    }

    public int countElementOfArray(int[] arr){
        if(arr.length <= 0){
            return 0;
        }
         return 1 + countElementOfArray(Arrays.copyOfRange(arr, 1, arr.length));        
    }

    public static void main(final String[] args) {
        final Recursion recursive = new Recursion();
        final int factNumber = recursive.fact(3);
        System.out.println(factNumber);

        // use recursive sum item in array.
        final int[] arr = new int[] { 2, 3, 5, 7 };
        final int[] emptyArr = new int[] {};
        final int total = recursive.sumArray(arr);
        final int totalEmpty = recursive.sumArray(emptyArr);
        System.out.println(total);
        System.out.println(totalEmpty);

        //count element in array - we can use array.length, but I'm using recursive to count total element in an array
        final int[] countArr = new int[] { 2, 3, 5, 7, 10 };
        int count = recursive.countElementOfArray(countArr);
        System.out.println(count);

    }
}