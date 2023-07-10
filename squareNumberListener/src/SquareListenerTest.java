import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SquareListenerTest {
    @Test
    void testIsSquareListener(){
        Assertions.assertEquals(List.of(1,4,9),SquareListener.makeSqrList(3));
        Assertions.assertEquals(List.of(1,4,9,16,25,36,49,64,81,100),SquareListener.makeSqrList(10));
    }
}
