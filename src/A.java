import java.util.ArrayList;
import java.util.Scanner;

public class A {
    //给定一个整数 N 和一组包含至少两个零的 N 个整数。
    // 输出该集合中最后两个零之间的数字之和（如果最后两个零是连续的，则输出 0）。
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //输入一个是整数N
        System.out.println("please input a integer");
        int n = scanner.nextInt();

        //创建动态数组存取n个整数
        ArrayList<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        //集合中最后两个零之间数的数字之和，如果两个零连续的输出零
        int endZero = -1;// 用来记录“最后一个 0”的下标，-1 表示还没遇到
        int sum = 0;
        for (int i = list.size()-1; i >=0; i--) {
            if(list.get(i) == 0){ //第一次遇到0
                if(endZero == -1){
                    endZero = i;
                }else{ //第二次遇到0
                    //累加firstZero +1 到 i-1之间的数
                    for (int j = i+1;j< endZero;j++) {
                        sum +=list.get(j);

                    }
                    break;

                }

            }

        }
        System.out.println(sum);
        scanner.close();
    }
}
