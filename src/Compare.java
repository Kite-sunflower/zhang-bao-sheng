import java.util.Scanner;

public class Compare {
    //找出十个元素中的最小值和最大值。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double max = Double.MAX_VALUE;
        double min = -Double.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            double x = sc.nextDouble();
            if(x< min) min = x;
            if(x> max) max = x;
        }
        System.out.println("min = "+ min);
        System.out.println("max = "+ max);
        sc.close();
    }
}
