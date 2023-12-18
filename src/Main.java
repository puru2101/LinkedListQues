import java.util.Arrays;
import java.util.stream.Stream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Stream<Integer> stringStream = Stream.iterate((40), i->i+2).limit(20);
        String[] arr= new String[]{"a","b","c"};
        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
        Stream<String> streamOfArrayFull = Arrays.stream(arr);
        streamOfArrayFull.forEach(s-> System.out.println(s+" ,"));
        streamOfArrayPart.forEach(s-> System.out.println(s+" ,"));



        Stream<Integer> streamofstring = Stream.of(1,2,3,4);
        stringStream.forEach(s-> System.out.println(s+" ,"));



       Stream<String> str=Stream.<String>builder().add("a").add("b").add("c").build();
       str.forEach(s-> System.out.println(s+" ,"));

        }
    }
