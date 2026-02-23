/**
 * OOPSBannerApp UC5: Render OOPS as Banner using Inline Array Initialization
 *
 * This use case extends UC4 by defining and populating the String array in a more
 * concise way at the time of declaration using String.join() method to create each
 * line of the banner. This further enhances code readability and maintainability.
 *
 * @author Developer
 * @version 5.0
 */
public class OOPSBannerUC5 {

    public static void main(String[] args) {
        // UC5: Define and populate the String array in a single statement (Inline Initialization)
        // Each element calls String.join() directly to construct a row of the banner
        String[] lines = {
           String.join(" ", "     ***  ", "      ***   ", "  ****** ", "       *****  "), // Line 0
           String.join(" ", "   **   ** ", "   **   ** ", "  **    ** ", "   **     ")
           String.join(" ", "  **     ** ", " **     ** ", " **     ** ", " **     "), // Line 1
           String.join(" ", "  **     ** ", " **     ** ", " **    ** ", "   **     "), // Line 2
           String.join(" ", "  **     ** ", " **     ** ", " ******   ", "     ***     "), // Line 3
           String.join(" ", "  **     ** ", " **     ** ", " **  ", "             **    "), // Line 4
           String.join(" ", "  **     ** ", " **     ** ", " **       ", "         **    "), // Line 5
           String.join(" ", "   **   ** ", "   **   ** ", "  **       ", "        **    " ), // Line 6
           String.join(" ", "     ***   ", "     ***   ", "  **        ", "  ***** "),//Line7
        };

        // Use an enhanced for-each loop to iterate and print the banner lines
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
