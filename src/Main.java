import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Strings array = new Strings();
        array.add("Математический Анализ");
        array.add("Canned Juice");
        array.add("начерт");
        array.add("тубус");

        System.out.println("Отсортированный массив: " + array.getSortedArray());
        System.out.println("Самая длинная строка: " + array.getMaxLengthString());
        System.out.println("Средняя длина: " + array.getAverageLength());
    }
}
