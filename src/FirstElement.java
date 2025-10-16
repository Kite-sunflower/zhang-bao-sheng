import java.util.Scanner;

public class FirstElement {
    //给定一组十个整数元素。求第一个最小值之后的元素个数。
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int[] a  =new int[10];

        //读入10个整数
        for (int i = 0; i < 10; i++) {
           a[i] = sc.nextInt();
        }

        int minValue  = a[0];
        int pos = 0; // 第一个最小值的下标

        for (int i = 0; i < 10; i++) {
            if(a[i] < minValue){
                minValue  =a[i];
                pos = i;
            }
        }
        int after = 10-pos -1; //后面还剩下几个
        System.out.println(after);
        sc.close();

    }
}
