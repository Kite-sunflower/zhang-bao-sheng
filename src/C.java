import java.util.Scanner;

public class C {
    //给定一个整数 N 和一组 N 个实数：A 1, A 2, ..., AN..
    // 输出以下数字：A 1, A 2 2, ...,, ..., AN–1 N–1, ANN。
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            double result = Math.pow(a[i],i+1);
            if(i>0){
                System.out.print(" ");
                System.out.println(result);
        }
            scanner.close();
    }
}
}
