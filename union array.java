public class Govindh {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = {1, 2, 3, 84, 5,};
        int b[] = {1, 2, 3};
        int n = a.length;
        int m = b.length;
        int union = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i] == b[j]) {
                    union++;
                }
            }
        }
        return (n + m) - union;
    }
