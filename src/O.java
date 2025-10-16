import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.ArrayList;
import java.util.Scanner;

public class O {
    //给定一个整数 N 和一组 N 个整数。
    // 打印集合中小于其左邻居的数的数量，以及这样的数的数量 K.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //给定一个整数
        System.out.println(" please input a integer");
        int n = scanner.nextInt();

        //创建动态数组存取整数K的长度
        System.out.println("please input a group integer");
        ArrayList<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

       //取出右边的数小于左边的数的数量
         int count = 0;
        for (int i = 1; i < n; i++) {
            if(list.get(i) < list.get(i-1)){
                count++;
            }
        }
        System.out.println(count);
        scanner.close();
    }
}
