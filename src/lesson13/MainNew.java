package lesson13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainNew {
    public static void main(String[] args) {
        String expression = "    -5*5 + 10/2 - 10";
        String newExpression = expression.replaceAll("\\s", "").trim();
        System.out.println(newExpression);
        Pattern pattern = Pattern.compile("-\\d+|\\d+");
        Matcher matcher = pattern.matcher(newExpression);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
//        char[] charArray = expression.toCharArray();
//        for (int i = 0; i < charArray.length; i++) {
//            if (charArray[i] == '*')
//        }
    }
}
