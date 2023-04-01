import java.util.ArrayList;
import java.util.Collections;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       int[][]arr={{1,2,3},{3,4,6}};
        ArrayList<Integer>arrs=new ArrayList<>();
        int summ=0;
       for(int i=0;i<arr.length;i++){
           summ=0;
           for(int j=0;j<arr[i].length;j++){
                  summ=summ+arr[i][j];

           }
           arrs.add(summ);
       }
        System.out.println(Collections.max(arrs));
    }
}