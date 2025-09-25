package task;

import java.util.Scanner;

/**
 * ClassName:Area
 * Package:task
 * Description:enter the radius r of the circle .calculate the area(2*π*r)of a circle with this radius
 *
 * @Author:带刀侍卫
 * @Create:2025/9/18-1:49
 * @Version:1.0
 */
public class Area {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("please input number r");
            double r = scanner.nextDouble();
            double area =2* Math.PI * r;
            System.out.println("area of the circle :" + area);
        }catch(Exception e){
            System.out.println(e);
        }finally {
            scanner.close();
        }
    }

}
