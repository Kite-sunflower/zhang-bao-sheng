import java.util.Scanner;

public class LastPlus {
    //找出十个元素中的最小正数。如果缺少所需元素，则输出 0。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;//目前还没有读到任何正数
        for (int i = 0; i < 10; i++) {
            int x = sc.nextInt();
            if(x > 0){
                if(count == 0 || x< count){
                    count = x;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}
