public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        int f = 11;
        int x[] = {1, 4, 6, 8, 11,11, 34, 42};
        int l = 0;
        int r = x.length - 1;
        while (r - l > 1) {
            int mid = (l + r) / 2;
            if (f > x[mid]) {
                l = mid + 1;

            }
            else {
                r = mid;
            }
        }
            if (x[l]==f){
                System.out.println(l);

            }
            else if (x[r]==f){
                System.out.println(r);

            }
         //   System.out.println(x[mid]);
        }
    }




