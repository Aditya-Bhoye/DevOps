import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A: ");
        int a = sc.nextInt();

        System.out.print("Enter B: ");
        int b = sc.nextInt();

        System.out.print("Enter C: ");
        int c = sc.nextInt();

        int greatest = a;

        if (b > greatest) greatest = b;
        if (c > greatest) greatest = c;

        System.out.println("Greatest = " + greatest);
    }
}
