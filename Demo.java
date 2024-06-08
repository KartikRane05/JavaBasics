class Person{
    private String Name;
    public String getname(){
        return Name;
    }
    public void setname(String name){
        this.Name = name;
    }
}
public class Demo {
    public static void main(String[] args) {
        Person myperson = new Person();
        myperson.setname("Kartik Rane");
        System.out.println(myperson.getname());
    }
}