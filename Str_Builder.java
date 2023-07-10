public class Str_Builder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder(); //StringBuilder is a mutable object like arrays
        for (int i = 0; i < 26; i++) {
            builder.append((char) ('a' + i)); //no new object has been created as every change is made in the original object builder
        }
        System.out.println(builder);

        builder.append(10); System.out.println(builder);
        builder.append(4.5); System.out.println(builder); //you can append various other data types

        builder.deleteCharAt(0); System.out.println(builder);

        builder.delete(1,3); System.out.println(builder); //delete characters at index 1 & 2

        System.out.println(builder.indexOf("h"));
        builder.reverse(); System.out.println(builder);

        builder.insert(1, 'd'); System.out.println(builder); //insert at index 1
        builder.insert(6, 'd'); System.out.println(builder); //insert at index 6

        System.out.println(builder.lastIndexOf("d")); //d is present at index 1 and 6 but this function returns the last one that is 6

        builder.deleteCharAt(2); System.out.println(builder);
        builder.delete(0,4); System.out.println(builder);
        builder.replace(7,10,"ABC"); System.out.println(builder); //will replace from index 7,8,9

    }
}