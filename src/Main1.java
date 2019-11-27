public class Main1 {
    public static double Power(double base, int exponent) {
        if(base==0){
            return 0;
        }

        if(exponent==0){
            return 1;
        }
        return (Math.pow(base,exponent));
    }

    public static void main(String[] args) {
        System.out.println(Power(89,0));
    }
}