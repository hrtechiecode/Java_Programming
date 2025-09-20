package Recursion;

public class Array {
    //print array
    public static void print(int []arr,int idx){
        if(idx==arr.length){
            return;

        }
        //self work
        System.out.println(arr[idx]);
        //recursive
        print(arr,idx+1);
    }
    public static void main(String[] args) {
        int[]arr={1,2,34,5,6,7};
        print(arr,0);
    }
}
