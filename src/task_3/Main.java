package task_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String  text= in.nextLine();
        String[] words = text.split(" ");
        ArrayList<Word> current = new ArrayList<>();
        Word temp;
        for(String word : words){
            temp = new Word();
            temp.count(word);
            current.add(temp);
        }
        Collections.sort(current);
        for (int i = 0; i < current.size(); i++) {
            System.out.println(current.get(i).getWord());
        }
    }
}
