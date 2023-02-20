import java.util.LinkedList;

public class Main {

    public static int fibonacci (int n){
        int a=1;
        int b=1;
        int i=2;
        while (i<n){
            i++;

            b=a+b;
            a=b-a;
        }
return b;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(8));
    }
}