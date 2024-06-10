package Recommend;
import java.util.*;
public class OptionalFile {
    public static void main(String[] args) {
        Map<String,Integer> marks = new HashMap<>();
        marks.put("kartik", 94);
        marks.put("aditi", 96);
        System.out.println(marks.get("rahul"));
        Optional <Integer> marksofperson = Optional.ofNullable(marks.get("kartik"));
        System.out.println(marksofperson);
        if (marksofperson.isPresent()) {
            System.out.println(marksofperson.get());
        }
        else{
            System.out.println("We Dont have this persons data");
        }
    }
}
