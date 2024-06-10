package Arraylist;
/**
 * Arraylistfile
 */
import java.util.*;;
 public class Arraylistfile {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        // adding the elements in the array
        cars.add("Suzuki");
        cars.add("Honda");
        cars.add("Mahindra");
        cars.add("Jeep");
        cars.add("Bmw");
        System.out.println(cars);
        // how to sort the array according to number or alphabet
        Collections.sort(cars);
        System.out.println(cars);
        //remove the particular index 
        cars.remove(4); // remove suzuki
        System.out.println(cars);
        // set the thing at particular index
        cars.set(3, "XUV300");
        System.out.println(cars);
        // array size
        System.out.println(cars.size());
        // get the particular element
        System.out.println(cars.get(2));
        // remove all the element
        cars.clear();
        System.out.println(cars);
    }
}