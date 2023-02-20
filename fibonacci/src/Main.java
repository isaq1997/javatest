import java.util.LinkedList;

public class Main {

    public static int fibonacci (int n){
        int a=0;
        int b=1;
        int i=0;
        while (i<=n-2){
            i++;
            a=b;
            b=a+b;
        }
return b;
    }

    public static void main(String[] args) {
fibonacci(3);
        System.out.println(fibonacci(3));
    }
}