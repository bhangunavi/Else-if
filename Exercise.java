import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.close();

        if (age >= 18) {
            System.out.println("You can vote");
        } else if (age >= 13 && age < 18) {
            System.out.println("You are a teenager");
        } else {
            System.out.println("You can't vote");
        }
    }
}