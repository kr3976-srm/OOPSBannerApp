/**
 * OOPSBannerApp
 *
 * UC4: Display OOPS banner using String array and loop
 *
 * @author kr3976
 * @version 1.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Store banner lines in String array
        String[] banner = {

            String.join(" ", "*****", "*****", "*****", "*****"),
            String.join(" ", "*   *", "*   *", "*   *", "*    "),
            String.join(" ", "*   *", "*   *", "*   *", "*    "),
            String.join(" ", "*   *", "*   *", "*****", "*****"),
            String.join(" ", "*   *", "*   *", "*    ", "    *"),
            String.join(" ", "*   *", "*   *", "*    ", "    *"),
            String.join(" ", "*****", "*****", "*    ", "*****")

        };

        // Print banner using loop
        for (String line : banner) {
            System.out.println(line);
        }

    }

}
