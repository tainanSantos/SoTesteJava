package pattern_singleton.test2;

public class Main2 {

    public static void main(String[] args) {
        Person_Attributes.getInstance().setName("Jose");
        Person_Attributes.getInstance().setPhone("693258741");
        System.out.println(Person_Attributes.getInstance());

        Person_Attributes.getInstance().setName("Maria");
        Person_Attributes.getInstance().setPhone("123654789");
        System.out.println(Person_Attributes.getInstance());
    }
}
