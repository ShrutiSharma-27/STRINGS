import java.util.Arrays;

public class Str_methods {
    public static void main(String[] args) {
        String a = "Shruti Sharma";
        System.out.println(a.charAt(2)); //charAt() method returns the character present at passed index.

        System.out.println(Arrays.toString(a.toCharArray()));

        System.out.println(a.length());

        System.out.println(a.toLowerCase()); //not convert the original object
        System.out.println(a.toUpperCase());

        System.out.println(a.indexOf('a'));

        System.out.println("     Shruti     ".strip()); //removes trailing and leading spaces.
        System.out.println("     Shruti     ".strip().length()); //length after stripping.

        System.out.println(Arrays.toString(a.split(" "))); //split a into an array wherever we've space as it is specified as the splitting parameter
    }
}
