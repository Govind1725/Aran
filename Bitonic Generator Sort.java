public class Govindh {
    public static void main(String arg[]) {
   ArrayList even = new ArrayList();
     ArrayList odd = new ArrayList();
     int k=0;
     int arr[]= {0, 1, 2, 3, 4, 5, 6, 7}; // 0 2 4 6 7 5 3 1

        for (int i = 0; i<arr.length; i++){
         if (i%2==0){
          even.add(arr[i]);
         }
         else {
          odd.add(arr[i]);
         }
        }
        for (Object i:even){
         arr[k++] = (int) i;
        }
        for (Object i:odd){
            arr[k++] = (int)i;
        }
        for (int i: arr){
            System.out.print(i+" ");
        }
     }
}
