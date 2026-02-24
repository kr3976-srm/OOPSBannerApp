/**
 * OOPSBannerApp UC5 – Render OOPS as Banner using Inline Array Initialization
 *
 * This use case extends UC4 by defining and populating the String array in a more
 * concise way at the time of declaration using String.join() method to create each
 * line of the banner.
 *
 * @author kr3976
 * @version 5.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Define and initialize the banner array inline using String.join()
        String[] lines = {
            String.join( " ","   ***   ", "   ***   ", "******   ", "   ***** "),
            String.join( " "," **   ** ", " **   ** ", "**    ** ", " **      "),
            String.join( " ","**     **", "**     **", "**     **", "**       "),
            String.join( " ","**     **", "**     **", "**    ** ", " **      "),
            String.join( " ","**     **", "**     **", "******   ", "   ***   "),
            String.join( " ","**     **", "**     **", "**       ", "      ** "),
            String.join( " ","**     **", "**     **", "**       ", "       **"),
            String.join( " "," **   ** ", " **   ** ", "**       ", "      ** "),
            String.join( " ","   ***   ", "   ***   ", "**       ", " *****   ")
        };

        // Print banner using loop
        for (String line : lines) {
            System.out.println(line);
        }

    }
}
