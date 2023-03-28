public class fibonacci {
    public static void main(String[] args) {
        int a0=0;
        int a1=1;
        int res=0;
        int n=4;

        

        for (int i=1;i<=n-1;i++){
            res=a0+a1;
            a0=a1;
            a1=res;
        }
        System.out.println(res);

    }
}
