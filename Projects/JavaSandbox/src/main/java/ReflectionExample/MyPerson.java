package ReflectionExample;

public class MyPerson {
    // Fields
    private int id;
    private String name;

    // Constructors
    public MyPerson() {
        this.id = -1;
        this.name = "Noname";
    }

    public MyPerson(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Methods
    public void sayHello() {
        System.out.println("id: " + id +
                " name: " + name +
                " says hallo!");
    }

    @Override
    public String toString() {
        return "MyPerson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
