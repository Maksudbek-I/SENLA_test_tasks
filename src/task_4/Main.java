package task_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList list = new ArrayList<>();
        int num = in.nextInt();
        int temp;
        while (num > 0){
            temp = num % 10;
            num = num / 10;
            list.add(temp);
        }
        int max = (int) Collections.max(list);
        char maxChar = (char) (48 +max);
        char def = '*';
        char cur;
        Main main = new Main();

        for (int i =1; i < 8; i++){
            for (int j = list.size(); j > 0; j--){
                if (max == (int) list.get(j-1) ){
                    cur = maxChar;
                } else {
                    cur = def;
                }

                switch ((int) list.get(j-1)) {
                    case (0):
                        System.out.print(main.zero(i,cur));
                        break;
                    case (1):
                        System.out.print(main.one(i,cur));
                        break;
                    case (2):
                        System.out.print(main.two(i,cur));
                        break;
                    case (3):
                        System.out.print(main.three(i,cur));
                        break;
                    case (4):
                        System.out.print(main.four(i,cur));
                        break;
                    case (5):
                        System.out.print(main.five(i,cur));
                        break;
                    case (6):
                        System.out.print(main.six(i,cur));
                        break;
                    case (7):
                        System.out.print(main.seven(i,cur));
                        break;
                    case (8):
                        System.out.print(main.eight(i,cur));
                        break;
                    case (9):
                        System.out.print(main.nine(i,cur));
                        break;
                    default:
                        break;
                }

            }
            System.out.println("");
        }


    }

    public String zero(int a, char b){
        String str = "";
        switch (a) {
            case (1):
                str = "  " + b + b + b + "  ";
                break;
            case (2):
                str = " " + b + "   " + b + " ";
                break;
            case (3):
                str = b + "     " + b;
                break;
            case (4):
                str = b + "     " + b;
                break;
            case (5):
                str = b + "     " + b;
                break;
            case (6):
                str = " " + b + "   " + b + " ";
                break;
            case (7):
                str = "  " + b + b + b + "  ";
                break;
            default:
                break;
        }
        return str;
    }

    public String one(int a, char b){
        String str = "";
        switch (a) {
            case (2):
                str = "" +b  + b + "  ";
                break;
            case (7):
                str =""+ b + b + b + " ";
                break;
            default:
                str = " " + b + "  ";
                break;
        }
        return str;
    }
    public String two(int a, char b){
        String str = "";
        switch (a) {
            case (1):
                str = " " + b + b + b + "  ";
                break;
            case (2):
                str = b + "   " + b + " ";
                break;
            case (3):
                str = b + "  " + b + "  ";
                break;
            case (4):
                str = "  " + b + "   ";
                break;
            case (5):
                str = " " + b + "    ";
                break;
            case (6):
                str = "" + b + "     ";
                break;
            case (7):
                str = "" + b + b + b + b + b + " ";
                break;
            default:
                break;
        }
        return str;
    }
    public String three(int a, char b){
        String str = "";
        switch (a) {
            case (1):
                str = "  " + b + b + b + "   ";
                break;
            case (2):
                str =  b + "     " + b + " ";
                break;
            case (3):
                str = "      " + b + " ";
                break;
            case (4):
                str = "  " + b + b + b + "   ";
                break;
            case (5):
                str = "      " + b + " ";
                break;
            case (6):
                str =  b +"     " + b + " ";
                break;
            case (7):
                str = "  " + b + b + b + "   ";
                break;
            default:
                break;
        }
        return str;
    }
    public String four(int a, char b){
        String str = "";
        switch (a) {
            case (1):
                str = "    " + b + "  ";
                break;
            case (2):
                str =  "   " +b  + b + "  ";
                break;
            case (3):
                str = "  " + b +" "  + b + "  ";
                break;
            case (4):
                str = " " + b +"  "  + b + "  ";
                break;
            case (5):
                str = "" + b + b + b + b + b + b + " ";
                break;
            case (6):
                str = "    " + b + "  ";
                break;
            case (7):
                str = "    " + b + "  ";
                break;
            default:
                break;
        }
        return str;
    }
    public String five(int a, char b){
        String str = "";
        switch (a) {
            case (1):
                str = "" + b + b + b + b + b + b + " ";
                break;
            case (2):
                str = b + "      ";
                break;
            case (3):
                str =  str = b + "      ";
                break;
            case (4):
                str = "" + b + b + b + b + b + b + " ";
                break;
            case (5):
                str = "     " + b + " ";
                break;
            case (6):
                str = "     " + b + " ";
                break;
            case (7):
                str = "" + b + b + b + b + b + b + " " ;
                break;
            default:
                break;
        }
        return str;
    }
    public String six(int a, char b){
        String str = "";
        switch (a) {
            case (1):
                str = "" + b + b + b + b + b + b + " ";
                break;
            case (2):
                str = "" + b + "      ";
                break;
            case (3):
                str = b + "      " ;
                break;
            case (4):
                str = "" + b + b + b + b + b + b + " ";
                break;
            case (5):
                str = b + "    " + b + " ";
                break;
            case (6):
                str =  b + "    " + b + " ";
                break;
            case (7):
                str =  "" + b + b + b + b + b + b + " ";
                break;
            default:
                break;
        }
        return str;
    }
    public String seven(int a, char b){
        String str = "";
        switch (a) {
            case (1):
                str =  "" + b + b + b + b + b + b + " ";
                break;
            case (4):
                str =  "  " + b + b + b + b + " ";
                break;
            default:
                str =  "     " + b + " ";
                break;
        }
        return str;
    }
    public String eight(int a, char b){
        String str = "";
        switch (a) {
            case (1):
                str = "  " + b + b + b + "   ";
                break;
            case (2):
                str =  b + "     " + b + " ";
                break;
            case (3):
                str =  b + "     " + b + " ";
                break;
            case (4):
                str = "  " + b + b + b + "   ";
                break;
            case (5):
                str = b + "     " + b + " ";
                break;
            case (6):
                str = b +"     "+ b +" ";
                break;
            case (7):
                str = "  " + b + b + b + "   ";
                break;
            default:
                break;
        }
        return str;
    }
    public String nine(int a, char b){
        String str = "";
        switch (a) {
            case (1):
                str = " " + b + b + b + b + " ";
                break;
            case (2):
                str = "" + b + "   " + b + " ";
                break;
            case (3):
                str = "" + b + "   " + b + " ";
                break;
            case (4):
                str = " " + b + b + b + b + " ";
                break;
            case (5):
                str = "    " + b + " ";
                break;
            case (6):
                str = "    " + b + " ";
                break;
            case (7):
                str = "    " + b + " ";
                break;
            default:
                break;
        }
        return str;
    }
}
