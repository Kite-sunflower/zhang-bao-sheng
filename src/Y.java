import java.util.ArrayList;
import java.util.Scanner;

public class Y {

    //给定一个整数 N 和一组 N 个实数。
    // 检查该集合是否构成一个上升序列。如果是，则输出 True，如果不是，则输出 False。
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //给定一个整数n
        System.out.println("please input a integer");
        int n = scanner.nextInt();

        //创建一个动态数组
        System.out.println("please input a group integer");
        ArrayList<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        //判断改集合是不是上升序列
        boolean isFlag = true;
        for (int i = 1; i < n; i++) {
            if(list.get(i) <= list.get(i-1)){
                isFlag = false;
            }

        }
        System.out.println(isFlag);
        scanner.close();
    }
}
