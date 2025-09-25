package task;

import java.util.Scanner;

/**
 * ClassName:Meal
 * Package:task
 * Description:
 *
 * @Author:带刀侍卫
 * @Create:2025/9/26-4:44
 * @Version:1.0
 */
public class Meal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input meal");
        String food = scanner.nextLine().trim().toLowerCase();

        switch (food) {
            case "pizza":
                System.out.println(" pizza 3$");
                break;
            case "hot dog":
                System.out.println("hot dog 1.5$");
                break;
            case "burger":
                System.out.println("burger 3$");
                break;
            default:
                System.out.println("error");
        }
        scanner.close();
    }
}
