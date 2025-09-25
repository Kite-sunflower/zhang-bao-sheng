package task;

import java.util.Scanner;

/**
 * ClassName:Leap
 * Package:task
 * Description:
 *
 * @Author:带刀侍卫
 * @Create:2025/9/26-4:56
 * @Version:1.0
 */
public class Leap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        // 闰年条件：
        // 1. 能被4整除
        // 2. 若能被100整除，则必须也能被400整除
        boolean isLeap;
        if (year % 4 != 0) {
            isLeap = false;
        } else if (year % 100 != 0) {
            isLeap = true;
        } else {          // 这里 year % 100 == 0
            isLeap = (year % 400 == 0);
        }

        if (isLeap) {
            System.out.println("this year is leap");
        } else {
            System.out.println("this year is not leap");
        }
        scanner.close();
        //远程提交
    }
}
