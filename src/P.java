import java.util.ArrayList;
import java.util.Scanner;

public class P {
    //给定一个整数 K 和一组非零整数；其完成的符号是数字 0。打印集合中小于 K 的数字的数量。
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
        int k = 10;
        int count = 0;

        for (int value:arr){
            if(value < k){
                count++;
            }
        }
        System.out.println(count);
        scanner.close();
        }
    }

