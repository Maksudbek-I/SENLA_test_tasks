package task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double number = in.nextDouble();
        if (number % 1 != 0){
            System.out.println("Error");
            return;
        }
        while (number>1){
         for (int i = 2; i <= number;i++){
             if (number % i == 0) {
                 System.out.print(i + " ");
                 number = number/i;
                 break;
             }
         }
        }
    }
}
