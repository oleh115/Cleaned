package package115.parser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringParser {
    public List<String> stringToList(String value) {
        return new ArrayList<String>(Arrays.asList(value.split(";")));
    }

    public String[] stringToArray(String value) {
        return value.split(";");
    }
}
