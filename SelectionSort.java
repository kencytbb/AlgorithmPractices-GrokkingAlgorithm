public class SelectionSort {   


    public void sortSmallToLarge(int[] arr){    
        int index = 0;
        for(int i =0 ; i< arr.length;i++){                       
            index =i;
            for(int j= i+1; j < arr.length; j++){//use second for loop to loop single element in first loop throught all remaining element;
                if(arr[j] < arr[i]){// find smallest number
                    index = j;
                }
            }            
            int smallestNumber = arr[index]; // create variable to hold smallest number
            arr[index] = arr[i];// swap position, it means when smallest number has index 3 we assigned value from current index to smallest index 
            arr[i] = smallestNumber; // swap back value of smallest index to current position.
            
        }            
    }
  
    public static void main(String[] args) {
        SelectionSort sort = new SelectionSort();  
        int[] arr = new int[]{5, 3, 6, 2, 10};  
        sort.sortSmallToLarge(arr);      
    }
}