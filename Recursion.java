public class Recursion {
    
    public int fact(int x){
        if(x ==1 ){
            return 1;
        }
        return x * fact(x-1);
    }

    public static void main(String[] args) {
        Recursion recursive = new Recursion();
        int factNumber = recursive.fact(3);
        System.out.println(factNumber);

    }
}