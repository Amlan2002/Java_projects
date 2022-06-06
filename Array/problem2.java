package Array;

import java.util.Scanner;

//Find the maximum & minimum number in an array of integers. 
public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int num[] = new int[size];

        //input
        for(int i =0;i<size; i++) {
            num[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        //output
        for (int i = 0; i<num.length; i++) {
            if(num[i]<min) {
                min = num[i];
            }
            if(num[i]>max){
                max = num[i];
            }
        }

        System.out.println("Minmum num is: "+min);
        System.out.println("Maximum num is: "+max);


        //close scanner class to prevent memory leak
        sc.close();
    }
}
