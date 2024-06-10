class Person{
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
public class Main{
    public static void main(String[] args) {
        Person persondetail = new Person();
        persondetail.setName("Kartik");
        System.out.println(persondetail.getName());
    }
}
