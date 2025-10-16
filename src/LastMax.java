import java.util.Scanner;

public class LastMax {
    //找出十个整数元素中最后一个最大值的数字。

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxValue = Integer.MAX_VALUE;
        int lastIdx = -1;

        for (int i = 0; i <10 ; i++) {
            int x =sc.nextInt();
            if(x >= maxValue){
                maxValue = x;
                lastIdx = i;
            }
        }
        System.out.println("最后一个最大值 = "+ maxValue);
        System.out.println("他所在的下标是="+ lastIdx);
    }
}
