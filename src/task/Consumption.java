package task;

import java.util.Scanner;

/**
 * ClassName:Consumption
 * Package:task
 * Description:
 *
 * @Author:带刀侍卫
 * @Create:2025/9/26-3:28
 * @Version:1.0
 */
public class Consumption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please X");
        int x = scanner.nextInt();
        System.out.println("please Y");
        int y = scanner.nextInt();

        double wikipedia = x * 0.1;
        double meme = y * 0.05;
        double salary = wikipedia + meme;

        if (salary > 100 && meme > wikipedia) {
            System.out.println("Too much consumption" + "how many memes" + y);

        } else {
            System.out.println("Well consumption");
        }
    }
}
