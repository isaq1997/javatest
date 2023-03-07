import java.util.ArrayList;
import java.util.List;

public class Main {
    public static  int gcd(int a,int b){
        int gcd=0;
        int c=(a>b)?b:a;
        for (int i=1;i<=c/2;i++){
            if (a%i==0 &&b%i==0){
                gcd=i;
            }

        }
        return gcd;

    }
    public static  int lcm_1(int a,int b){
        int lcm=a*b/gcd(a,b);
        return lcm;

    }
    public static  int lcm_2(int a,int b){
        int lcm=(a>b)?b:a;
        while (true){
            if(lcm%a==0&&lcm%b==0){
                 return  lcm;
            }
            lcm++;
        }

    }
    public static void main(String[] args) {
     int a=72;
     int b=60;

        System.out.println(gcd(a,b));
        System.out.println(lcm_2(a,b));
    }
}