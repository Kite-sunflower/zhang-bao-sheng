import java.util.ArrayList;
import java.util.Scanner;

public class N {
    //给定一个非零整数集合，其完备符号为 0。
    // 输出该集合中所有正偶数的和。如果所需的数字不在集合中，则输出 0。
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input some integer number");
        ArrayList<Integer> list  = new ArrayList<>();

        while(true){
            int num = scanner.nextInt();
            if(num == 0) break;
            list.add(num);
        }
int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i]=list.get(i);
        }
        int count = 0;
boolean hasPosEven = false;
        for(int value:arr){
            if(value>0 &&((value & 1)==0)){
                count+= value;
                hasPosEven=true;
            }
        }
        System.out.println(hasPosEven ? count:0);
        scanner.close();
        }




    }

