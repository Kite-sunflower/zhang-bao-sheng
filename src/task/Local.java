package task;

import java.util.Scanner;

/**
 * ClassName:Local
 * Package:task
 * Description:
 *
 * @Author:带刀侍卫
 * @Create:2025/9/26-3:46
 * @Version:1.0
 */
public class Local {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input local(America/Europe/Canada/other)");
        String region = scanner.nextLine().trim().toLowerCase();
        switch (region) {
            case "America":
                System.out.println("You have to pay 5$ for shipping cost");
                break;
            case "Europe":
                System.out.println("You have to pay 7$ for shipping cost");
                break;
            case "Canada":
                System.out.println("You have to pay 3$ for shipping cost");
                break;
            default:
                System.out.println("You have to pay 9$ for shipping cost");
                break;

        }
        scanner.close();

    }
}
