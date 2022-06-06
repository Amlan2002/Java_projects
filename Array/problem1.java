package Array;

import java.util.Scanner;

//Take an array of names as input from the user and print them on the screen.
public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        String names[] = new String[size];

        //input
        for(int i =0;i<size; i++) {
            names[i] = sc.next();
        }

        //output
        for (int i = 0; i<names.length; i++) {
            System.out.println("name "+(i+1)+" is : "+names[i]);
        }


        //close scanner class to prevent memory leak
        sc.close();
    }
}
