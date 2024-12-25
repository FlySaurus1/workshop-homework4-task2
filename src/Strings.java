import java.util.ArrayList;

public class Strings {
    private final ArrayList<String> strings;

    public Strings() {
        this.strings = new ArrayList<>();
    }

    public void add(String str) {
        int insertIndex = 0;
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() > str.length()) {
                break;
            }
            insertIndex = i + 1;
        }
        strings.add(insertIndex, str);
    }

    public String getMaxLengthString() {
        if (strings.isEmpty()) {
            return null;
        }
        return strings.get(strings.size() - 1);
    }

    public double getAverageLength() {
        if (strings.isEmpty()) {
            return 0.0;
        }
        int totalLength = 0;
        for (String str : strings) {
            totalLength += str.length();
        }
        return (double) totalLength / strings.size();
    }

    public ArrayList<String> getSortedArray() {
        return new ArrayList<>(strings);
    }
}
