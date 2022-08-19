package JavaSyntaxis.Regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

    public static void main(String[] args) {
        String text = """
                It is a long established fact that a reader will be
                distracted by the readable content of a page when looking
                at its layout. The point of using Lorem Ipsum is that it has a
                more-or-less normal distribution of letters, as opposed to using 'Content here, content here',
                making it look like readable English. ShilaevValentin@gmail.com Many desktop publishing packages and web page editors
                now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover
                many web sites still in their infancy. Various versions have Valentin.Shilaev@yandex.ru evolved over the years,
                sometimes by accident, sometimes on purpose (injected humour and the like).
                """;

        Pattern email = Pattern.compile("(\\w+)@(gmail|yandex)\\.(com|ru)");
        Matcher emailMatcher = email.matcher(text);

        while (emailMatcher.find()){
            System.out.println(emailMatcher.group(1));
        }
    }
}
