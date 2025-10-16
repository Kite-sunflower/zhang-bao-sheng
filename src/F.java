import java.util.Scanner;

public class F {
    //给定整数 K、N 和一组 N 个整数。如果集合中存在小于 K 的数，则输出 True；否则，输出 False。

    public static void main(String[] args) {
        int k = 6;
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input integer n");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();//这里要持续输入n个数字
        }

        boolean found = false;
        for (int value : arr) {
            if (value < k) {
                found = true;
                break;
            }
        }
        System.out.println(found);
        scanner.close();
    }
}
