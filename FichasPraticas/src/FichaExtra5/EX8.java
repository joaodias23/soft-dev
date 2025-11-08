package FichaExtra5;

public class EX8 {

    public static boolean vogal(String letra) {

        if (letra == null || letra.length() != 1) {
            return false;
        }

        char c = Character.toLowerCase(letra.charAt(0));

        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main() {
        System.out.println(vogal("a"));
    }
}
