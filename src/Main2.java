public class Main2 {

    public static void reOrderArray(int [] array) {
        int a=0;
        int b=array.length-1;
        while(a<b){
            if(array[a]%2==1){
                a++;
            }
            if(array[b]%2==0){
                b--;
            }
            else{
                int d=array[a];
                array[a]=array[b];
                array[b]=d;
            }
        }
    }
    private static void reOrderArray1(int []a){
        int []b=a.clone();
        int j=0;
        for (int i = 0; i <a.length ; i++) {
            if(b[i]%2==1){
                a[j]=b[i];
                j++;
            }
        }
        for (int i = 0; i <a.length ; i++) {
            if(b[i]%2==0){
                a[j]=b[i];
                j++;
            }
        }

    }
    public static void main(String[] args) {
        int[]a={1,2,3,4,5,6,7,8,9,10};
        reOrderArray1(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}