import java.util.ArrayList;

public class Operators_strs {
    public static void main(String[] args) {
        System.out.println('a'+'b'); //char is converted to it's int value (ASCII value)
        //after printing garbage collection will come and take "ab" as it's no longer of any use because you've not stored it anywhere.

        System.out.println("a"+"b"); //I converted it to
        System.out.println('a'+3); //97(ASCII value of 'a') + 3 = 100
        System.out.println((char)('a'+3));
        System.out.println("a"+1); //int will be converted to the Integer wrapper class which will call .toString()
        System.out.println("Shruti" + new ArrayList<>());
        System.out.println("a" + new Integer(56));
        //**operator + is only defined, in Java, for primitives and if any 1 of the operand is string.
        //It means you can use + with any of the complex objects but the condition is that atleast 1 object should be of type string.
        //Hence, new Integer(56) + new ArrayList<>() will give error
        System.out.println(new Integer(56) + "" + new ArrayList<>()); //now it'll work

        //Java doesn't allow you to do operator overloading like we can do in C++ & Python.
        //Java avoids it because it results in poor code and it has only overloaded the + operator for strings(exception) to support concatenation.
    }


}
