public class Largest {
    public static int getlargestn(int number[] ) {
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for (int i=0;i<number.length;i++){
            if (largest<number[i]){
                largest=number[i];
            }
            if (smallest>number[i]){
                smallest=number[i];
            }
        }
        System.out.println("Smallest Value is :-"+smallest);
        return largest;

    }

    public static void main(String[] args) {
        int number[]={1,2,43,5,6,7,8,76};
        System.out.println("Largest Value is :-"+getlargestn(number));
    }
}
