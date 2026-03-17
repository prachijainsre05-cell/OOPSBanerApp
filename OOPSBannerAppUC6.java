public class OOPSBannerAppUC6 {

    public static void main(String[] args) {

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        for (int i = 0; i < 9; i++) {
            System.out.println(o[i] + "   " + o[i] + "   " + p[i] + "   " + s[i]);
        }
    }

    // O Pattern (Fixed symmetry)
    public static String[] getOPattern() {
        return new String[] {
            "   *****   ",
            "  **   **  ",
            " **     ** ",
            " **     ** ",
            " **     ** ",
            " **     ** ",
            " **     ** ",
            "  **   **  ",
            "   *****   "
        };
    }

    // P Pattern (Aligned properly)
    public static String[] getPPattern() {
        return new String[] {
            " ******    ",
            " **   **   ",
            " **    **  ",
            " **   **   ",
            " ******    ",
            " **        ",
            " **        ",
            " **        ",
            " **        "
        };
    }

    // S Pattern (Fixed spacing symmetry)
    public static String[] getSPattern() {
        return new String[] {
            "   *****   ",
            "  **       ",
            " **        ",
            "  **       ",
            "   *****   ",
            "       **  ",
            "        ** ",
            "       **  ",
            "   *****   "
        };
    }
}