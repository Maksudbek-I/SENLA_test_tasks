package task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char current;
        int sum = 0;
        for (int i = 0; i < s.length();i++){
            current = s.charAt(i);
            if(Character.isDigit(current)){
                System.out.println("ПОБЕДА");
                sum+= Character.getNumericValue(current);
                System.out.println(sum);
            }
        }
    }
}
