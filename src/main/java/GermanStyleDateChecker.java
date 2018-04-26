import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GermanStyleDateChecker {
    private static Pattern pattern = Pattern.compile("^([012]?\\d|[3][01])[ .-]([0]?\\d|[1][012])[ .-]((19|20)?(\\d))?\\d$");

    public static Matcher getMatcher(String dateString){
        return pattern.matcher(dateString);
    }
}
