import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B {
    //给定整数 K、N 和一组 N 个实数：
    // A1、A2、...、AN。从该集合中导出 K-e 个数的幂：A1K、A2K、...、ANK。

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input a integer k");
        int k = scanner.nextInt(); //给定幂次数
        System.out.println("please input a integer n");
        int n = scanner.nextInt(); //给定n个数

        //创建一个数组
        double[] list = new double[n];
        for (int i = 0; i < n; i++) {
           list[i] = scanner.nextDouble();
        }

        //按照题目输出，空格分格
        for (int i = 0;i < n; i++) {
            if(i >0){
                System.out.print(" ");
                System.out.print(Math.pow(list[i],k));
            }
        }
        scanner.close();
    }
}
