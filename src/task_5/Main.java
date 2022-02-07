package task_5;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int safe = 65;
        ArrayList<Thing> list = new ArrayList<>();
        list.add(new Thing("Книга",9, 4));
        list.add(new Thing("Книга",9, 4));
        list.add(new Thing("Чайник",3, 7));
        list.add(new Thing("Холодильник",8, 45));
        list.add(new Thing("Ноутбук",25, 6));
        list.add(new Thing("Кастрюля",5, 8));
        list.add(new Thing("Ноутбук",25, 6));
        list.add(new Thing("Плита",20, 15));
        list.add(new Thing("Телевизор",15, 10));

        Collections.sort(list);
        while (safe > list.get(list.size()-1).getEfficiency() && list.get(list.size()-1).isStatus()){
            for (int i = 0; i< list.size(); i++){
                if (safe>list.get(i).getVolume() && list.get(i).isStatus()){
                    System.out.println(list.get(i).getName());
                    safe -= list.get(i).getVolume();
                    list.get(i).setStatus(false);
                }
            }
        }

    }
}
