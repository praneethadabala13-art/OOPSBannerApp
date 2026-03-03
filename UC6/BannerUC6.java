public class BannerUC6 {

    public static String[] getO() {

        String[] O = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        return O;
    }

    public static String[] getP() {

        String[] P = {
                "****** ",
                "*     *",
                "****** ",
                "*      ",
                "*      "
        };

        return P;
    }

    public static String[] getS() {

        String[] S = {
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        };

        return S;
    }

    public static void main(String[] args) {

        String[] O = getO();
        String[] P = getP();
        String[] S = getS();

        String[][] banner = { O, P, S };

        for (int row = 0; row < 5; row++) {

            for (int letter = 0; letter < banner.length; letter++) {

                System.out.print(banner[letter][row] + "  ");
            }

            System.out.println();
        }
    }
}