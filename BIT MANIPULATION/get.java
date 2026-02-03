public class get {
    public static int getIhBit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }
    public static int clearIhBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int updateIhBit(int n, int i, int newBit){
        if(newBit == 0){
            return clearIhBit(n, i);

        }
        else{
            return getIhBit(n, i);
        }
    }
    public static void main(String[] args) {
        // System.out.println(getIhBit(10, 3));
        System.out.println(clearIhBit(10, 1));
        
    }
}
