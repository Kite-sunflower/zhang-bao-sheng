package task;

import java.util.Scanner;

/**
 * ClassName:Cost
 * Package:task
 * Description:
 *
 * @Author:带刀侍卫
 * @Create:2025/9/26-4:27
 * @Version:1.0
 */
public class Cost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input calls second");
        int second = scanner.nextInt();
        int fixedCost = 25;
        if (second < 500) {
            double amount = second * 0.01 + fixedCost;
            System.out.println(amount);
        } else if (second > 500 && second < 800) {
            double amount = fixedCost + 5 + (800 - second) * 0.008;
            System.out.println(amount);
        } else {
            double amount = fixedCost + 5 + 2.4 + (second - 800) * 0.005;
            System.out.println(amount);
        }
    }
}
