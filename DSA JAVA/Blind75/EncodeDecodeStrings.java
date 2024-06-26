package Blind75;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecodeStrings {
public static void main(String[] args) {
    
}
   private static final String DELIMITER = ":;";

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(escapeDelimiter(s)).append(DELIMITER);
        }
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        String[] parts = s.split(DELIMITER);
        for (String part : parts) {
            if (!part.isEmpty()) {
                result.add(unescapeDelimiter(part));
            }
        }
        return result;
    }

    private String escapeDelimiter(String s) {
        return s.replace(":", "::").replace(";", ";;");
    }

    private String unescapeDelimiter(String s) {
        return s.replace("::", ":").replace(";;", ";");
    }
}
