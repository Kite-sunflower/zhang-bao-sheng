import java.util.ArrayList;
import java.util.Scanner;

public class L {

    //给定一个整数 K 和一组非零整数。
    // 打印集合中最后一个小于 K 的数字。如果集合中没有这样的数字，则输出 0。
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input a integer ");

        //创建一个整数k
        int k = scanner.nextInt();

        System.out.println("please input a group integer");

        //创建一个动态数组用来存取输入的整数，读到整数零就停止
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            int num = scanner.nextInt();
            if(num == 0){
                break;

            }
            list.add(num);
        }

        //动态数组拆箱转化为原生数组
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        //取出数组中小于k的数
        int ans = 0;
        for(int v :arr){
            if(v < k){
                ans = v;
            }else{
                System.out.println(0);
            }
        }
        System.out.println(ans);
        scanner.close();
    }
}
