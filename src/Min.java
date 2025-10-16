import java.util.Scanner;

public class Min {
    //给定一个包含十个整数元素的集合。
    // 求第一个最小值和最后一个最小值之间包含的元素个数。
    // 如果集合中只有一个最小元素，则输出 0。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];

        //读入
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }

        //第一步找出最小值
        int minVal = a[0];
        for (int i = 0; i < 10; i++) {
            if(a[i] < minVal){
                minVal = a[i];
            }
        }
        //第二步，第一次和作后一次出现俄位置
        int firstPos = -1,lastPos =-1;
        for (int i = 0; i < 10; i++) {
            if(a[i] == minVal){
                if(firstPos == -1){
                    firstPos  =i;//只记录一次

                }
                lastPos = i;
            }
        }

        //第三步，计算之间的元素个数
        int between = lastPos -firstPos -1;
        System.out.println(between );
        sc.close();
    }
}
