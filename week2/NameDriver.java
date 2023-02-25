package week2;

public class NameDriver {
    public static void main(String[] args) {
        Name name1Object = new Name();
        Name name2Object = new Name("John", "D.", "Anderson");
        System.out.println(name2Object.getLast());
        System.out.println(name1Object.toString());
        System.out.println(name2Object);

        name1Object.setFirst("Ann");
        name1Object.setMiddle("Claire");
        name1Object.setLast("Brook");
        System.out.println(name1Object);
    }
}
