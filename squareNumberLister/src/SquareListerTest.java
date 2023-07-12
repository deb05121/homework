import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SquareListerTest {
    @Test
    void testIsSquareListener(){
        Assertions.assertEquals(List.of(1,4,9), SquareLister.makeSqrList(3));
        Assertions.assertEquals(List.of(1,4,9,16,25,36,49,64,81,100), SquareLister.makeSqrList(10));
    }
}
