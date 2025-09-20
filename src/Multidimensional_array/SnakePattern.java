package Multidimensional_array;

public class SnakePattern {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 16}, {3, 5, 6, 8}, {2, 6, 4, 10}};
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0) {
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
                else{
                for (int j =arr[0].length-1 ; j >=0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
                }
            System.out.println();
            }
        //reverse snake pattern
        System.out.println("reverse order  column wise");
        for (int j = 0; j < arr[0].length; j++) {
            if(j%2==0) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            else{
                for (int i =arr.length-1 ; i >=0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }

        }
    }