package Collection;

import java.util.*;

public class Arrays_ques {
    static Scanner sc=new Scanner(System.in);
    static int[] input(){
        System.out.println("enter size of array");
        int n=sc.nextInt();
       int[] array=new int[n];
        System.out.println("enter elements of array");
        for(int i=0;i< array.length;i++){
            array[i]=sc.nextInt();
        }
        return array;
    }
    static void print(int[]array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +" ");
        }
        System.out.println();
    }
    //find duplicates
    static void duplicate(int[]array){
       HashSet<Integer> a=new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();  //This set stores only the elements that appeared more than once
        for(int n:array) {
            if (!a.add(n)) {
                duplicates.add(n); // store only duplicates
            }
        }
        System.out.println(duplicates);
    }
    //merge sorted array
    static void merge(){
        System.out.println("enter first array");
        int []array1=input();
        System.out.println("enter second array");
        int []array2=input();
        TreeSet<Integer> merged = new TreeSet<>(); //sorted and no duplicates merged
        for(int n:array1) {
             merged.add(n);
            }
        for(int n:array2) {
            merged.add(n);
        }
        System.out.println(merged);
    }
    static void mergeUnsorted() {
        System.out.println("Input first array:");
        int[] array1 = input();

        System.out.println("Input second array:");
        int[] array2 = input();

        ArrayList<Integer> merged = new ArrayList<>();

        for (int n : array1) merged.add(n);
        for (int n : array2) merged.add(n);

        System.out.println("Merged List (Unsorted, With Duplicates): " + merged);
    }
    static void intersection() {
        System.out.println("Enter first array:");
        int[] array1 = input();

        System.out.println("Enter second array:");
        int[] array2 = input();

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int n : array1) set1.add(n);

        for (int n : array2) {
            if (set1.contains(n)) {
                result.add(n);
            }
        }

        System.out.println("Intersection: " + result);
    }



    public static void main(String[] args) {
        int[] array = input();
        print(array);
        duplicate(array);
        merge();
        mergeUnsorted();
        intersection();

    }
}
