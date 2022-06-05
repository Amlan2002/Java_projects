import java.util.*;

class Loops {

    public static void main(String[] args) {
        // Questions
        // Print all even numbers till n.
        // Run
        // for(; ;) {
        // System.out.println("Apna College");
        // }
        // loop on your system and analyze what happens. Try to think of the reason for
        // the output produced.

        // Make a menu driven program. The user can enter 2 numbers, either 1 or 0.
        // If the user enters 1 then keep taking input from the user for a student’s
        // marks(out of 100).
        // If they enter 0 then stop.
        // If he/ she scores :
        // Marks >=90 -> print “This is Good”
        // 89 >= Marks >= 60 -> print “This is also Good”
        // 59 >= Marks >= 0 -> print “This is Good as well”
        // Because marks don’t matter but our effort does.
        // (Hint : use do-while loop but think & understand why)

        // Qs. Print if a number is prime or not (Input n from the user).

        Scanner sc = new Scanner(System.in);

        //Question no 1
        System.out.println("Enter a number for print all the even no till that input number ");
        int n = sc.nextInt();
        for(int i=0;i<=n;i++) {
            if(i%2 == 0) {
                System.out.println(i);
            }
        }

        //Question 2
        // for(; ;) {
        //     System.out.println("Amlan");
        // }

        //Question 3
        boolean b = true;
        do {
            System.out.println("Enter 1 to contiune and 0 to stop:");
            int c = sc.nextInt();
            if(c == 1){
                System.out.println("Enter the Student marks: ");
                int marks = sc.nextInt();
                if(marks >= 90) {
                    System.out.println("This is Good");
                } else if(marks >= 60 && marks <=89) {
                    System.out.println("This is also Good");
                }else if(marks >= 0 && marks <=59) {
                    System.out.println("This is Good as well");
                }
            }else {
                System.out.println("You are out of loop");
                break;
            }
        } while(b);


        //Question 4
        int i,m=0,flag = 0;
        System.out.println("Enter the number to check whether it is prime or not!");
        int n = sc.nextInt();
        m=n/2;
        if(n==0||n==1) {
            System.out.println(n+" is not prime number");
        } else {
            for(i=2;i<=m;i++) {
                if(n%2 == 0) {
                    System.out.println(n+" is not prime number");
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) {
                System.out.println(n+" is prime number");
            }
        }
    }
}
