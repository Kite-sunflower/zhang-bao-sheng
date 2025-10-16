import java.util.Scanner;

public class Inequality {
    //给定一个大小为 10 的整数数组 A。
    // 求出其元素 A[i] 中第一个满足双重不等式的元素的个数：
    // A[1] < A[i] < A[10]。如果没有这样的元素，则输出 0。

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] A = new int[10];
            for (int i = 0; i < 10; i++) A[i] = sc.nextInt();

            int count = 0;
            for (int i = 0; i < 10; i++) {
                if (A[0] < A[i] && A[i] < A[9]) { // 双重不等式
                    count++;
                    break;        // 只取第一个，找到就停
                }
            }
            System.out.println(count);
            sc.close();
        }
    }

