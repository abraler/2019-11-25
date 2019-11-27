public class Solution {

    //这种解题的方法可能会导致死循环
    //
    // 问题在意，如果是个负数,左移最高位还是一，会导致死循环

    public static int NumberOf1(int n) {
        int num=0;
        while(n!=0){
            if(n%2==1){
                num++;
            }
            n=n/2;
        }
        return num;
    }
    //正确的解法，应该是用一个数左移来判断是不是1

    private static int NumberOf2(int n) {
        int count = 0;
        int flag = 1;
        while (flag != 0) {
            if ((n & flag) != 0) {
                count++;
                System.out.println(flag);
            }
            flag = flag << 1;
        }
        return count;
    }



    //下面这种方法不对，问题在于如果是个小的负数时（-15），最后一次你的flag是一个极大负数，
            //  n=-15;而flag=-2147483648         所以有问题


    private static int NumberOf3(int n) {
        int count = 0;
        int flag = 1;
        while ((n>=0?flag<=n:flag>=n)){
            if ((n & flag) != 0) {
                count++;
                System.out.println(flag);
            }
            flag = flag << 1;
        }
        return count;
    }


    private static int NumberOf4(int n){
        int count=0;
        while(n!=0){
            count++;
            n=(n&n-1);
        }
        return count;
    }





    public static void main(String[] args) {
        int a=-15;
        int g=NumberOf4(a);
        System.out.println(g);
    }
}