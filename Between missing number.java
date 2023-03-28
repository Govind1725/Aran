public class Govindh {
    public static void main(String arg[]) {
        int a[] ={1,2,3,5,6,7,9}; // 4,8-->o/p
        int temp[] = new int[1000];
        for (int i=0; i<a.length; i++){
            temp[a[i]]= a[i];
        }
        for(int i = a[0]; i< a[a.length-1]; i++){
            if (temp[i]==0 || temp[i]<1){
                System.out.println(i);
            }
        }
