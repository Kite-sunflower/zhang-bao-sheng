import java.util.Scanner;

public class Value {
    public static void main(String[] args) {

        System.out.println("please input bitcoin number");
        Scanner scanner = new Scanner(System.in);
        int value  = scanner.nextInt();
        double increase  = 0.1;

        double salary = value + (value * increase);
        System.out.println("total_bitcoin_value" + salary + "bitcoin_increase_value" + value * increase);

    }
}
