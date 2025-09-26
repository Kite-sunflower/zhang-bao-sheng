import java.util.Scanner;

public class Horse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input horse on with and long.");
        int l = scanner.nextInt();
        int w = scanner.nextInt();
        int area = l * w;
        System.out.println(" total_area =" + area);
        scanner.close();
    }
}
