package assignment2;

import java.util.Scanner;

public class MainClass3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Person person = new Person("hoang", "hoang@gmail", 100);
        person.depositMoney();

        int bills[] = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter bills: ");
            bills[i] = input.nextInt();
        }
//        return total;
        int total = person.calcTotal(bills);
        System.out.println("Total" + total);

        boolean bCheck = person.payMoney(total);
        if( bCheck ) {
            System.out.println("Pay successful");
        } else {
            System.out.println("Can not paid");
        }

    }
}
