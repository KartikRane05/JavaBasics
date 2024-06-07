package Class;
public class Constructorfile {
   int modelyear;
   String modelName;
   public Constructorfile(int year, String Name){
        modelName = Name;
        modelyear = year;
   }
   public static void main(String[] args) {
        Constructorfile myobj = new Constructorfile(1955,"Independence");
        System.out.println(myobj.modelName);
        System.out.println(myobj.modelyear);
   }
}
