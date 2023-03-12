import lombok.Data;

@Data
public class Person {
    private String name;

    private int age;

    public String getString() {
        return "Denys";
    }
}
