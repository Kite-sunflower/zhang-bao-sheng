package task;

import com.sun.jdi.PathSearchingVirtualMachine;

/**
 * ClassName:exchange
 * Package:task
 * Description:create two variables a and b, and initially set them each to a different number. write a program that swaps both values.
 * Example; a = 10, b = 20
 * Output: a = 20, b = 10
 *
 * @Author:带刀侍卫
 * @Create:2025/9/18-2:46
 * @Version:1.0
 */
public class Exchange {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        var tamp = a;
        a = b;
        b = tamp;
        System.out.println(a);
        System.out.println(b);

    }
}
