public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 25;
        int c = 15;

        int greatest = a;

        if (b > greatest) greatest = b;
        if (c > greatest) greatest = c;

        System.out.println("Greatest = " + greatest);
    }
}
