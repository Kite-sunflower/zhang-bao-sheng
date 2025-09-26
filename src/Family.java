import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class Family {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int wage = 400;
        System.out.println("please input employee year");
        System.out.println("please input kids number");
        int year = scanner.nextInt();
        int kid = scanner.nextInt();
        int salary = year * 20;
        int subsidy = kid * 30;
        int total = wage + salary + subsidy;

        System.out.println("The total amount is"+ total +"$" + wage + "$"
                +  "minimum wage" + salary + "$ for" + year +  "years experience"
                + subsidy + "$for"+ kid + "kids");

        scanner.close();

    }
}
