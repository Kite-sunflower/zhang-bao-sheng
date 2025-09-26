import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input radius r the number");
        int r = scanner.nextInt();
        double area = Math.PI * r * r;
        double perimeter = 2 * Math.PI * r;
        System.out.println("circle's area:" + area + "circle's perimeter:"+ perimeter);

    }
}
