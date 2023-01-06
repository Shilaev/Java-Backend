package Algorithms;

public class addComma {
    public static StringBuffer add(StringBuffer str) {
        int len = str.length() - 1;
        if (len < 3) {
            return str;
        }

        StringBuffer newStr = new StringBuffer(str);
        newStr.delete(len - 3, len);
        return add(newStr)
                .append(".")
                .append(str, len - 3, len);
    }
}
