import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class helloTest {
    @Test
    @DisplayName("ทำการทดสอบ sawadee")
    public void case01() {
        // Arrange
        hello hello = new hello();
        String name = "songgold";
        // Act
        String actualResult = hello.sawadee(name);
        // Assert
        assertEquals("Hello songgold", actualResult);
    }
}