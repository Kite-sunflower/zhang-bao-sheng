import com.sun.jdi.PathSearchingVirtualMachine;

public class H {
    public static void main(String[] args) {
        //给定一个整数 N 和一组 N 个非零整数。请按相同顺序打印该集合中所有奇数的个数以及此类数的个数 K。
        int n = 7;
        int[] arr  = {2,3,4,5,6,7,89,};


        int k = 0;

        for (int value:arr) {
            if((value & 1) ==1){
                if(k > 0) {
                    System.out.print(' ');
                }
                    System.out.print(value );
                    k++;
            }
        }
        System.out.println();
        System.out.println(k);
    }
}
