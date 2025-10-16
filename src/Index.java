import java.util.Scanner;

public class Index {
    //给定一个大小为 N 的数组。首先打印偶数索引的元素，然后打印奇数索引的元素。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        StringBuilder even = new StringBuilder();
        StringBuilder odd  = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if(i %2 ==0){
                even.append(a[i]).append(' ');
            }else{
                odd.append(a[i]).append(' ');
            }
        }
        System.out.print(even);
        System.out.print(odd);
    }
}
