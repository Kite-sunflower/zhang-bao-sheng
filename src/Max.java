import java.util.Scanner;

public class Max {
//找出这十个元素中最大值的数。
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double max = -Double.MAX_VALUE;

    for(int i =0;i < 10 ;i++){
        double a  =sc.nextDouble();
        if(a > max)  max = a;
    }
    System.out.println("max = "+ max);
}

}
