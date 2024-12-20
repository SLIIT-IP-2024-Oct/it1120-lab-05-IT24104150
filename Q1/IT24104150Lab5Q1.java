import java.util.Scanner;
public class IT24104150Lab5Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read three different integers
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();
        // Finding the smallest and largest numbers
        int smallest = Math.min(num1, Math.min(num2, num3));
        int largest = Math.max(num1, Math.max(num2, num3));
        // Displaying the results
        System.out.println("User entered numbers are : " + num1 + " " + num2 + " " + num3);
        System.out.println("The Smallest number is: " + smallest);
        System.out.println("The Largest number is: " + largest);
        scanner.close();
    }
}