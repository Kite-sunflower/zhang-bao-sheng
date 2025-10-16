import java.util.Scanner;

public class LastElement {
    //给定数字 a、b (0 < a < b) 和一组十个元素。
    // 找出区间 (a, b) 中包含的最小元素。如果缺少所需元素，则输出 -1。

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        //判断a大于0 并且a< b
        if(a<= 0 || a>=b){
            System.out.println(-1);
            return;
        }

        double min = -1;//目前还没有找到
        for (int i = 0; i < 10; i++) {
            double x =sc.nextDouble();
            if(x>a && x<b){
                if(min == -1 || x<min){
                    min = x;
                }
            }

        }
        System.out.println(min);
        sc.close();
    }
}
