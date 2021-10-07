/**
 * Filter even numbers via Java streams
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreams {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);list.add(2);list.add(3);list.add(4);
        List<Integer> even = list.stream().filter(number -> number % 2 ==0).collect(Collectors.toList());
        even.forEach(System.out::println);
    }
}
