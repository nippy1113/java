import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        char[] chars = args[1].toCharArray();
        ArrayList<Character>  arrayList = new ArrayList<>();
        if (args[1].contains("*")) {
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == '*')
                    arrayList.add('*');
                else
                    arrayList.add(chars[i]);
            }
            String s = "";
            for (int i = 0; i < arrayList.size(); i++) {
                s += arrayList.get(i);
            }
            String test = s.replace("*", ".*");
            s.replace("*", ".*");

            Pattern pattern1 = Pattern.compile(test);
            Matcher matcher = pattern1.matcher(args[0]);
            matcher.find();
            args[1] = args[0].substring(matcher.start(), matcher.end());
        }
        if (args[0].equals(args[1])) {
            System.out.println("OK");
        }
        else {
            System.out.println("KO");
        }

    }
}
