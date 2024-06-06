package Functions;
public class Overload {
    // simple thing two functions can have same name
    static int plusMethod(int x, int y) {
        return x + y;
    }
      
    static double plusMethod(double x, double y) {
        return x + y;
    }
    public static void main(String[] args) {
        int ans = plusMethod(20, 50);
        double ans1 = plusMethod(5.5,5.5);
        System.out.println(ans);
        System.out.println(ans1);
    }
}
