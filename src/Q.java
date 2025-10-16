import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.ArrayList;
import java.util.Scanner;

public class Q {
    //给定一个整数 K 和一组非零整数；其完备的符号为 0。
    //打印集合中第一个大于 K
    // 的数的个数。如果集合中没有这样的数，则输出 0。
        public static void main(String[] args) {
            System.out.println("please input some integer number");
            ArrayList<Integer> list  = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            while(true){
                int num = scanner.nextInt();
                if(num == 0) break;
                list.add(num);
            }
            int[] arr = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                arr[i]=list.get(i);
            }

            int k= 9;
            int count = 0;
            for (int v:arr){
                if(v>k){
                    count= 1;
                    break;
                }
            }
            System.out.println(count);
            scanner.close();
    }
}
