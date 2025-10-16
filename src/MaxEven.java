import java.util.Scanner;

public class MaxEven {
    //找出十个非零整数元素中最大的偶数。如果缺少所需的元素，则输出 0。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxEven = 0;
        for (int i = 0; i < 10; i++) {
            int x = sc.nextInt();
            if(x != 0 && x %2 == 0 && x>maxEven){ // 数组中的数大于maxEven
                maxEven = x;
            }
        }
        System.out.println(maxEven);
        sc.close();
    }
}
