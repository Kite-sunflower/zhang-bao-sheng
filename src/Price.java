import java.util.Scanner;

public class Price {

    public static void main(String[] args) {

        System.out.println("please input laptop of price");
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();

        double count = p + (p * 0.1);
        System.out.println("The total price of the laptop is " + count);
        scanner.close();
    }
}
