import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please input long l and with");
        int l = scanner.nextInt();
        int w = scanner.nextInt();
        int round = 2 * (l + w);
        int area = l * w;
        System.out.println("rectangle area:" + area + "rectangle perimeter:" + round);
scanner.close();

    }
}
