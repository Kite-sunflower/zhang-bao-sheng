import java.util.Scanner;

public class Consecutive {
    //给定一组十个整数元素。求连续最小元素的最大个数。


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] a = new int[10];

            /* 1. 读入 + 找全局最小值 */
            int minVal = Integer.MAX_VALUE;
            for (int i = 0; i < 10; i++) {
                a[i] = sc.nextInt();
                if (a[i] < minVal) minVal = a[i];
            }

            /* 2. 找最长连续最小段 */
            int maxCnt = 0, cur = 0;
            for (int i = 0; i < 10; i++) {
                if (a[i] == minVal) {
                    cur++;
                    maxCnt = Math.max(maxCnt, cur);
                } else {
                    cur = 0;      // 断开重置
                }
            }

            System.out.println(maxCnt);
            sc.close();
        }
    }

