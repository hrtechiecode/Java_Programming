package Multidimensional_array;

public class columnwise_print {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 16}, {3, 5, 6, 8}, {2, 6, 4, 10}};
//        //output
        //error
//        for (int i = 0; i < arr.length; i++) { //row
//          //  System.out.print(arr[i][0]+" ");
//                for (int j = 0; j < arr[0].length; j++) {
//                    System.out.print(arr[j][i] + " ");//valid for same no.of rows and columns
//                }
//                System.out.println();
        for (int j = 0; j < arr[0].length; j++) {
            //  System.out.print(arr[i][0]+" ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i][j] + " ");//valid for same no.of rows and columns
            }
            System.out.println();

        }
    }
}