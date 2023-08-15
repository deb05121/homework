import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringSmallExerciseTest {
    @Test
    void testCharCounter(){
        Assertions.assertEquals(3,StringSmallExercise.countChar("aB_1aB_1aB_1", 'a'));
        Assertions.assertEquals(3,StringSmallExercise.countChar("aB_1aB_1aB_1", 'B'));
        Assertions.assertEquals(3,StringSmallExercise.countChar("aB_1aB_1aB_1", '_'));
        Assertions.assertEquals(3,StringSmallExercise.countChar("aB_1aB_1aB_1", '1'));
    }

    void testSubStrCounter(){
        Assertions.assertEquals(3,StringSmallExercise.countSubStr("aB_1aB_1aB_1","aB_1"));
    }
}
