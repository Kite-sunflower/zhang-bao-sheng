import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input score of geometry, algebra, and physics.");
        int g = scanner.nextInt();
        int a = scanner.nextInt();
        int p = scanner.nextInt();

        int average = (g+a+p)/3;
        System.out.println(average);
    }
}
