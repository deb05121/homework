import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringSmallExerciseTest {
    @Test
    void testCharCounter(){
        Assertions.assertEquals(3,StringSmallExercise.countB("aB_1aB_1aB_1"));
        Assertions.assertEquals(1,StringSmallExercise.countB("leen-NÁJWIB"));
        Assertions.assertEquals(2,StringSmallExercise.countB("WélaBsnvb545gB"));
        Assertions.assertEquals(3,StringSmallExercise.countB("BlaBlaBla"));
    }

    void testSubStrCounter(){
        Assertions.assertEquals(2,StringSmallExercise.helloCount("helloHalihóHihello"));
    }
}
