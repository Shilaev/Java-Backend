package CodeWars;

//        "the-stealth-warrior" gets converted to "theStealthWarrior"
//        "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
public class CamelCase {
    public static String toCamelCase(String s) {
        StringBuilder userString = new StringBuilder(s);

        userString.replace(0, s.length(), toCamelCase(s));

//        for (int i = 0; i <= userString.length() - 1; i++) {
//            char currentChar = userString.charAt(i);
//            if (currentChar == '-' || currentChar == '_'){
//                userString.deleteCharAt(i);
//                userString.replace(i+1, i+1, toCamelCase())
//            }
//        }

        return s;
    }

    public static void main(String[] args) {
        toCamelCase("asdf_lkjsf");
    }
}
