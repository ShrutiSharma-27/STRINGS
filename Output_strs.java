import java.util.Arrays;

public class Output_strs {
    public static void main(String[] args) {
        //Here, out is a reference variable of type PrintStream
        //PrintStream is a class and it has a one of the method in it called println
        //You can also change 'out' to something else name but first you have to make change in main file

        System.out.println(56); //println calls valueOf() which inside itself calls toString()
        //where originally it is specified.

        Integer num = new Integer(56);
        System.out.println(num.toString()); //as num is an object of wrapper class Integer so we can use .toString method (as
        // it can take object as an argument) otherwise it work similar as primitive int.

        //Wrapper class is used when you want to apply the object-oriented programming principles with primitive data objects
        //Primitives are stored in stack while objects in heap memory.
        //In python(OOP language) everything is object and everything gets stored in heap.

        System.out.println("Shruti"); //println calls valueOf() which if str is not null then inside itself calls toString()

        System.out.println(new int[] {1,2,3,4,}); // println calls valueOf() and then if it is null-prints null otherwise calls
        //Object.toString(). null.any_method doesn't exist as null is null, it contains nothing.

        //The above 3 println are not same as 1st is taking int, 2nd String, and 3rd object as argument-function overloading
        //Function overloading : at compile time it is decided to use which function among 2 or more functions with same name
        //but have difference in parameters.

        System.out.println(Arrays.toString(new int[] {1,2,3,4,})); //toString function is overridden here. Means, default
        //toString function is not used instead Arrays' toString method is used : Function Overriding

        String name = null;
        System.out.println(name);
    }
}
