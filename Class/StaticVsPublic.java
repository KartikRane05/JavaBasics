package Class;
public class StaticVsPublic {
    static void Staticfunc(){
        System.out.println("I am From static");
    }
    public void Publicfunc(){
        System.out.println("I am from Public");
    }
    public static void main(String[] args) {
        // static func
        Staticfunc();
        // public func
        StaticVsPublic myobj = new StaticVsPublic();
        myobj.Publicfunc();
    }
}
