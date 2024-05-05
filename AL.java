package Lesson20;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.List;
import java.util.Set;

public class AL {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("Banan");
        list.add("Portağal");
        list.add("Çiyələk");
        for (String meyve:list){
            System.out.println(meyve);
        }
        Set<Integer>set=new HashSet<>();
        set.add(5);
        set.add(10);
        set.add(15);
        set.add(15);
        set.add(20);
        for (Integer ededler:set){
            System.out.println(ededler);
        }
        Queue<String>queue=new LinkedList<>();
        queue.add("Maşın");
        queue.add("Qatar");
        queue.add("Avtobus");
        while (!queue.equals("Qatar")){
            System.out.println(queue);
        }
    }
}
