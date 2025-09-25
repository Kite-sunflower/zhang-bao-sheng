package task;

import java.util.Scanner;

/**
 * ClassName:Season
 * Package:task
 * Description:
 *
 * @Author:带刀侍卫
 * @Create:2025/9/26-4:14
 * @Version:1.0
 */
public class Season {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input number 1-12");

        int season = scanner.nextInt();
        switch (season) {
            case 2, 3, 4: {
                System.out.println("spring");
                break;

            }
            case 5, 6, 7: {
                System.out.println("summer");
                break;
            }
            case 8, 9, 10: {
                System.out.println("autumn");
                break;
            }
            case 11, 12, 1: {
                System.out.println("winter");
                break;
            }
            default:
                System.out.println("error");
        }
        scanner.close();
    }
}
