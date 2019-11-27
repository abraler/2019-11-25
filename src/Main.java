public class Main {
    public static void main(String[] args) {
        int a=15;
        int num=0;
        /*
        char[]b=Integer.toBinaryString(a).toCharArray();
        for (int i = 0; i <b.length ; i++) {
            if(b[i]=='1'){
                num++;
            }
        }
        */

        String c=Integer.toBinaryString(-15).toString();

        for (int i = 0; i <c.length() ; i++) {
            if(c.charAt(i)=='1'){
                num++;
            }
        }
        System.out.println(num);
    }
}
