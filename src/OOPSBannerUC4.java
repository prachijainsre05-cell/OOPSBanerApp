public class OOPSBannerUC4 {
    public static void main(String[] args) {
        // 1. Create the array (7 lines for the banner) [cite: 19, 33]
        String[] lines = new String[9];

        // 2. Fill the array using String.join [cite: 14, 20, 34]
        // Note: These patterns match the "OOPS" look from your handout
        lines[0] = String.join(" ", "     ***  ", "      ***   ", "  ****** ", "       *****  ");
        lines[1] = String.join(" ", "   **   ** ", "   **   ** ", "  **    ** ", "   **     ");
        lines[2] = String.join(" ", "  **     ** ", " **     ** ", " **     ** ", " **     ");
        lines[3] = String.join(" ", "  **     ** ", " **     ** ", " **    ** ", "   **     ");
        lines[4] = String.join(" ", "  **     ** ", " **     ** ", " ******   ", "     ***     ");
        lines[5] = String.join(" ", "  **     ** ", " **     ** ", " **  ", "             **    ");
        lines[6] = String.join(" ", "  **     ** ", " **     ** ", " **       ", "         **    ");
        lines[7] = String.join(" ", "   **   ** ", "   **   ** ", "  **       ", "        **    ");
        lines[8] = String.join(" ", "     ***   ", "     ***   ", "  **        ", "  ***** ");


          // 3. Print everything using a for-each loop [cite: 17, 21, 35]
        for (String line : lines) {
            System.out.println(line);
        }
    }
}