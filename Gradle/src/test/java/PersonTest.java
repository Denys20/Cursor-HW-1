import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
public class PersonTest {
    @Test
    public void getStringTest() {
        String string = "Denys";

        Person person = new Person();
        String current = person.getString();
        assertEquals(string, current);
    }
}
