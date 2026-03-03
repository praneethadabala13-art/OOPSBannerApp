import java.util.HashMap;
import java.util.Map;

public class UC8BannerApp {

    // Centralized Map for storing patterns
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    // Static block to initialize patterns
    static {
        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });
    }

    public static void main(String[] args) {
        renderBanner("OOPS");
    }

    // Function responsible only for rendering
    public static void renderBanner(String word) {

        int height = 5;

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                }
            }

            System.out.println(line);
        }
    }
}