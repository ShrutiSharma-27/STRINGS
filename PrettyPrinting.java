public class PrettyPrinting {
    public static void main(String[] args) {

        //below are some examples of pretty printing and there are many other placeholders available apart from float
        //and string :
                //%c - Character
                //%d - Decimal number (base 10)
                //%e - Exponential floating-point number
                //%f - Floating-point number
                //%i - Integer (base 10)
                //%o - Octal number (base 8)
                //%s - String
                //%u - Unsigned decimal (integer) number
                //%x - Hexadecimal number (base 16)
                //%t - Date/time
                //%n - Newline

        float a = 453.1234f;
        //using printf because it's a formatted string
        System.out.printf("Formatted number is %f",a); //'%' is the placeholder
        System.out.printf("\nFormatted number is %.2f",a);

        float b = 349.237f;
        System.out.printf("\nFormatted number is %.2f\n",b); //also rounds off

        System.out.println(Math.PI);
        System.out.printf("Value of pi upto 3 decimal places : %.3f",Math.PI);

        System.out.printf("My name is %s and love watching %s","Shruti","movies");
    }
}