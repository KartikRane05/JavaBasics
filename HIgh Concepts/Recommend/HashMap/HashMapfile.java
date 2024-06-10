package HashMap;
import java.util.*;
public class HashMapfile {
    public static void main(String[] args) {
        HashMap<String,Integer> marks = new HashMap<>();
            marks.put("Kartik", 94);
            marks.put("Aditi", 96);
            System.out.println(marks);
            System.out.println("--------------------------");
            for(Map.Entry<String,Integer>entry:marks.entrySet()){
                System.out.print(entry.getKey()+"=> ");
                System.out.println(entry.getValue());
                System.out.println("--------------------------");
            }
    }
}
