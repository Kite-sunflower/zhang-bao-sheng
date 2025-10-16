import java.util.Scanner;

public class Largest {
    //找出这十个元素中最大的两个。
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        long max1 = Long.MIN_VALUE;//第一大元素
        long max2 = Long.MIN_VALUE;//第二大元素

        for (int i = 0; i < 10; i++) {
            long x =sc.nextLong();
            if(x> max1){
                max2 = max1;//新数比第一大还大
                max1 = x; // 第一大数变成第二大
            } else if (x >max2) {//介于第一大和第二之间
                max2 =x;

            }
            {

            }
        }
        System.out.println(max1+" " + max2);
        sc.close();
    }

}
