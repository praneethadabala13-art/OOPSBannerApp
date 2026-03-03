import java.util.HashMap;
import java.util.Map;

public class CharacterPatternMap {

    private static Map<Character, CharacterPattern> patternMap = new HashMap<>();

    static {
        patternMap.put('O', new CharacterPattern('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        }));

        patternMap.put('P', new CharacterPattern('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        }));

        patternMap.put('S', new CharacterPattern('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        }));
    }

    public static CharacterPattern getPattern(char ch) {
        return patternMap.get(ch);
    }
}