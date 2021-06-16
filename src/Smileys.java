import java.util.List;

public class Smileys {

    public static int countSmileys(List<String> smileys) {
        int smileyCounter = 0;

        for (String smiley : smileys) {
            if (smiley.matches("[;:][-~]?[)D]")) {
                smileyCounter++;
            }
        }

        return smileyCounter;
    }
}
