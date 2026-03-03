public class BannerUC4 {

    public static void main(String[] args) {

        // Step 1: Create a String array to store banner lines
        String[] banner = {
                "********************************",
                "*                              *",
                "*       WELCOME TO OOPS        *",
                "*                              *",
                "********************************"
        };

        // Step 2: Use enhanced for-loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }

        // Optional: Alternative using String.join()
        System.out.println("\nPrinted using String.join():\n");
        System.out.println(String.join("\n", banner));
    }
}