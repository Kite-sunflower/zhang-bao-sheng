package task;

import java.util.Scanner;

/**
 * ClassName:Rectangle
 * Package:task
 * Description:enter the wide w and height h of the rectangle. find and display on the console the perimeter and area of the given rectangle
 *
 * @Author:带刀侍卫
 * @Create:2025/9/18-2:30
 * @Version:1.0
 */
public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("please input number w");
            double w = scanner.nextDouble();
            System.out.println("please input number h");
            double h = scanner.nextDouble();
            double area = w * h;
            double perimeter = 2 * (w+h);
            System.out.println("Perimeter of a rectangle:"+ perimeter);
            System.out.println("area of a rectangle:"+ area);
        }catch(Exception e){
            System.out.println(e);
        }finally{
            scanner.close();
        }
    }
}
