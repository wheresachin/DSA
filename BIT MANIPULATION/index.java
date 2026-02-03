public class index {
    public static void oddorEven(int  n){
        int bitmask =1;

        if((n & bitmask) == 0){
            //evennumber
            System.out.println("even number");
        } else {
            System.out.println("Odd number");
        }

    }
    public static void main(String[] args) {
        oddorEven(3);
        oddorEven(14);
        oddorEven(11);
    }
}
