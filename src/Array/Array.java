package Array;

import java.util.Arrays;
import java.util.List;

public class Array {
public static void A(){
    // Example 1: Arrays.toString() for 1D array
    String[] str = {"hritika", "hritika", "hi", "hello"};
    System.out.println("Using Arrays.toString():");
    System.out.println(Arrays.toString(str));
    System.out.println();

    // Example 2: Arrays.asList() to convert array to list
    System.out.println("Using Arrays.asList():");
    System.out.println(Arrays.asList(str));
    System.out.println();

    // Example 3: Arrays.deepToString() for 2D array
    int[][] int2DArray = {
            {1, 2},
            {3, 4}
    };
    System.out.println("Using Arrays.deepToString():");
    System.out.println(Arrays.deepToString(int2DArray));

}
    public static void main(String[] args) {
                int[] arr;

                // allocating memory for 5 integers.
                arr = new int[5];

                // initialize the elements of the array
                // first to last(fifth) element
                arr[0] = 10;
                arr[1] = 20;
                arr[2] = 30;
                arr[3] = 40;
                arr[4] = 50;

                // accessing the elements of the specified array
                for (int i = 0; i < arr.length; i++)
                    System.out.println("Element at index "
                                               + i + " : " + arr[i]);
        A();
    }

}
