package Hackwithinfy;

import java.util.Scanner;
//You have an oil tank with a capacity of C litres that
//can be bought and sold by N people. The people
//are standing in a queue are served sequentially in
//the order of array A.
//Some of them want to sell a litre of oil and some of
//them want to buy a litre of oil and A describes this.
//Here, A[i] = 1 denotes that the person wants to sell
//a litre of oil and A[i] = -1 denotes that the person
//wants to buy a litre of oil.
//When a person wants to sell a litre of oil but the
//tank is full, they cannot sell it and become upset.
//Similarly, when a person wants to buy a litre of
//oil but the tank is empty, they cannot buy it and
//become upset. Both these cases cause disturbances.
//You can minimize the disturbance by filling the tank
//initially with a certain X litres of oil.
//Find the minimum initial amount of oil X that results
//in the least number of disturbances.
public class Water_level {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of people
        int  c= sc.nextInt(); //capacity of tank
        int[] arr = new int[n];

        for (int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int oil=0;
        int min=0;
        int max=0;
        for (int i = 0; i<n; i++) {
            oil=arr[i];
            min=Math.min(min, oil);
            max = Math.max(max, oil);
        }
        int minX = Math.max(0, -min);
        int maxX = Math.min(c, c - max);

        if (minX > maxX) {
            System.out.println("Not possible to avoid disturbance");
        } else {
            System.out.println("Minimum oil needed: " + minX);
        }
    }

}
