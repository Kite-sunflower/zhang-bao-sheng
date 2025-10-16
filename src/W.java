import java.util.ArrayList;
import java.util.Scanner;

public class W {

    //给定一个整数 N 和一组由 N 个实数组成的数列，
    // 如果该数列构成一个递减序列，则输出 0；否则，输出第一个不满足条件的数的个数。
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        //输入整数N
        System.out.println("please input a integer");
        int n = scanner.nextInt();

        //创建动态数组存取n个整数
        ArrayList<Integer> list =new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        //判断这个数组是不是递减序列
        int result = 0;
        for (int i = 1; i < n; i++) {
            if(list.get(i) >= list.get(i -1)){
                result = i+1;
              break;
            }
        }
        System.out.println(result);
        scanner.close();

    }
}
