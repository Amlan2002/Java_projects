import java.util.Scanner;

public class variables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);

        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println(name);
    }

}
