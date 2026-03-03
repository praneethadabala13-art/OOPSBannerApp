import java.util.Collections;

public class BannerUC5 {

    public static void main(String[] args) {

        int width = 30;
        int height = 7;

        String[] banner = {
                String.join("", Collections.nCopies(width, "*")),

                "*" + String.join("", Collections.nCopies(width - 2, " ")) + "*",
                "*" + String.join("", Collections.nCopies(width - 2, " ")) + "*",
                "*" + String.join("", Collections.nCopies(width - 2, " ")) + "*",
                "*" + String.join("", Collections.nCopies(width - 2, " ")) + "*",
                "*" + String.join("", Collections.nCopies(width - 2, " ")) + "*",

                String.join("", Collections.nCopies(width, "*"))
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}