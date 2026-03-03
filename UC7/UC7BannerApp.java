public class UC7BannerApp {

    public static void main(String[] args) {

        String word = "OOPS";

        int height = 5;

        for (int row = 0; row < height; row++) {

            for (char ch : word.toCharArray()) {

                CharacterPattern cp = CharacterPatternMap.getPattern(ch);

                if (cp != null) {
                    System.out.print(cp.getPattern()[row] + "  ");
                }
            }

            System.out.println();
        }
    }
}