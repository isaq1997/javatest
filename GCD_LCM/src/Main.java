import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer>nums=new ArrayList<>() ;
     int a=147;
     int b=196;
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
        System.out.println(gcd);
    }
}