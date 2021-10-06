package exercises;

/**
 *
 * @author Ndachimya Edward
 */
public class Strings {

    public static void printString(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }

    public static void printBackward(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.println(s.charAt(i));
        }
    }

    public static String reverseString(String s) {
        String text = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            text = text + s.charAt(i);
        }
        return text;
    }

    public static boolean isPalindrome(String s) {
        String text = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            text = text + s.charAt(i);
            if (text.equalsIgnoreCase(s)) {
                return true;
            }
        }
        return false;
    }

    public static boolean canSpell(String puzzle, String test) {
        for (int i = 0; i < test.length(); i++) {
            if (puzzle.indexOf(test.charAt(i)) == -1) {
                return false;
            } else {
                int charLoc = puzzle.indexOf(test.charAt(i));
                puzzle = puzzle.substring(0, charLoc) + puzzle.substring(charLoc + 1, puzzle.length());
            }
        }
        return true;
    }

    public static boolean isAbecedarian(String string) {
        char c;
        for (int i = 0; i < string.length() - 1; i++) {
            c = string.charAt(i);
            if (c > string.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Type in your text: ");
//        String text = in.next();
        System.out.println(canSpell("quijibo", "big"));
    }
}
