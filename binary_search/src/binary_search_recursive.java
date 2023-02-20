public class binary_search_recursive {
    public static  int get_index (int[] arr,int element,int low,int high){
    
        int middle_index =(low+high)/2;
        if (arr[middle_index]==element){
            return middle_index;
        }
        else if (arr[middle_index]<element){
            return  get_index(arr,element,middle_index+1,high);
        }
        return  get_index(arr,element,low,middle_index);

    }
    public static void main (String[] args){
           int arr[] = { 3, 4, 5,5,5, 6,6,6, 7, 8, 9 };
           int a=get_index(arr,6,0,arr.length-1);
           System.out.println(a);
           String s ="oo kk";
           String ax=s.toUpperCase();
        System.out.println(ax);

    }
}
