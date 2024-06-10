import java.util.*; 
public class Kartik {
    public static void main(String[] args) {
        ArrayList<Integer> Cars = new ArrayList<>();
        Cars.add(5);
        Cars.add(2);
        Cars.add(7);
        Collections.sort(Cars);
        for(Integer i :Cars){
            System.out.println(i);
        }

    }
}
