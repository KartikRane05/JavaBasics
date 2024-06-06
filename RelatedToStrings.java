public class RelatedToStrings {
    public static void main(String[] args) {
        String Name = "my name is kartik ";
        int length = Name.length();
        System.out.println("The length of "+Name+" is "+length);
        System.out.println(Name.toUpperCase());
        System.out.println(Name.toLowerCase());
        // finding the character in the string
        System.out.println(Name.indexOf("kartik"));
        // i want to include "" in my string how can i
        String Para = "my name is \"Kartik\" ";
        System.out.println(Para);
        String txt = "It\'s alright.";
        System.out.println(txt);
    }
}
