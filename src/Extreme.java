import java.util.Scanner;

public class Extreme {
    //找出十个整数元素的最后一个极值（即最小值或最大值）的数值。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        //输入并确定最大值最小值
        for (int i = 0; i < 10; i++) {
            a[i] =sc.nextInt();
            if(a[i] > max){
                max = a[i];
            }
            if(a[i] < max){
                max = a[i];
            }
        }

        //从后往前找最后一次出现的极值
        int lastExtreme = a[9];
        for (int i = 9; i >=0; i--) {
            if(a[i] == max || a[i] == min){
                lastExtreme = a[i];
                break;
            }
        }
        System.out.println(lastExtreme);
        sc.close();
    }
}
