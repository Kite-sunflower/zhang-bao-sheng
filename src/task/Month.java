package task;

import java.util.Scanner;

/**
 * ClassName:Month
 * Package:task
 * Description:
 *
 * @Author:带刀侍卫
 * @Create:2025/9/26-5:01
 * @Version:1.0
 */
public class Month {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. 读取月份名称
        String month = scanner.nextLine().trim();
        // 2. 读取年份
        int year = scanner.nextInt();

        int days;   // 结果：当月天数

        switch (month) {
            case "一月":
            case "三月":
            case "五月":
            case "七月":
            case "八月":
            case "十月":
            case "十二月":
                days = 31;
                break;

            case "四月":
            case "六月":
            case "九月":
            case "十一月":
                days = 30;
                break;

            case "二月":
                // 判断闰年
                boolean leap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                days = leap ? 29 : 28;
                break;

            default:
                // 题目保证输入合法，这里简单设为 0（实际可再提示错误）
                days = 0;
        }

        System.out.println("这个月有 " + days + " 天");
        scanner.close();
    }


}
