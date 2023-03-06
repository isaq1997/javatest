import java.util.ArrayList;
import java.util.List;

public class Main {
    public static  int gcd(int a,int b){
        int gcd=0;
        int c;
        if (a>b){
            c=b;
        }
        else {
            c=a;
        }

        for (int i=1;i<=c/2;i++){
            if (a%i==0 &&b%i==0){
                gcd=i;
            }

        }
        return gcd;

    }
    public static  int lcm(int a,int b){
        int lcm=0;
        int c;
        lcm=a*b/gcd(a,b);
        return lcm;

    }
    public static void main(String[] args) {
     int a=147;
     int b=196;

        System.out.println(gcd(a,b));
        System.out.println(lcm(a,b));
    }
}