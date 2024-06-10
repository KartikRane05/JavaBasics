package Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Kartik
 */
public class Setfile {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("bmw");
        cars.add("xyx");
        cars.add("xyx");
        Set<String> kartik = new HashSet<>();
        kartik.add("bmw");
        kartik.add("xyx");
        kartik.add("xyx");
        System.out.println("here comes arraylist");
        System.out.println(cars);
        System.out.println(cars.contains("bmw"));
        System.out.println("here comes set");
        System.out.println(kartik);
    }
}