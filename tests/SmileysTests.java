import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmileysTests {

    @Test
    public void zeroSmileyShouldReturnZero() {
        assertEquals(0, Smileys.countSmileys(new ArrayList<>()));
    }

    @Test
    public void oneSmileyShouldReturnOne() {
        List<String> smileys = new ArrayList<>();
        smileys.add(":)");
        assertEquals(1, Smileys.countSmileys(smileys));
    }

    @Test
    public void twoSmileyShouldReturnTwo() {
        List<String> smileys = new ArrayList<>();
        smileys.add(":)");
        smileys.add(";D");
        assertEquals(2, Smileys.countSmileys(smileys));
    }

    @Test
    public void sevenSmileyShouldReturnSeven() {
        List<String> smileys = new ArrayList<>();
        smileys.add(":)");
        smileys.add(";D");
        smileys.add(";-D");
        smileys.add(";~D");
        smileys.add(";)");
        smileys.add(";-)");
        smileys.add(":-D");
        smileys.add(";(");
        smileys.add(":(");
        smileys.add("");
        smileys.add("------");
        assertEquals(7, Smileys.countSmileys(smileys));
    }
}
