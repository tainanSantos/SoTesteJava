package pattern_singleton.test2;

public class Person_Attributes {

    private String name;
    private String phone;
    private Integer id;

    private static Person_Attributes instance;

    public static Person_Attributes getInstance(){
        if (instance == null) instance = new Person_Attributes();
        return instance;

    }

    public Person_Attributes() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person_Attributes{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", id=" + id +
                '}';
    }
}
