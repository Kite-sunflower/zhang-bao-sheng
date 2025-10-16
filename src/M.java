import java.util.ArrayList;
import java.util.Scanner;

public class M {
    //给出一组非零整数；其完成的符号是数字 0。打印集合中的项目数。

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input some integer number");
        ArrayList<Integer> list = new ArrayList<>();

        while(true){
            int num = scanner.nextInt();
            if(num == 0)break;
            list.add(num);
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        System.out.println(arr.length);
    }
}
