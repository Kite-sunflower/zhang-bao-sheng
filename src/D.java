import java.util.Scanner;

public class D {
    //给定整数 N 和 N 个实数 A₁, A₂, …, Aₙ，输出序列
    //A₁^N , A₂^(N-1) , A₃^(N-2) , … , Aₙ₋₁² , Aₙ¹
    //即：第 i 个数乘的指数是 (N − i + 1)。
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            if(i>0){
                System.out.print(" ");
                System.out.println(Math.pow(a[i],n-1));
            }
        }
        scanner.close();
    }
}