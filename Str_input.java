import java.util.Scanner;

public class Str_input {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter space separated string (more than 3): ");
        String s1 = input.next(); //take input till a space is encountered
        String s2 = input.next();
        //because before it there was next() method so it starts taking input from the same line.
        String s3 = input.nextLine(); //take input till a newline character is encountered

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        //length function
        System.out.println(s1.length()); //for strings, length is a function but for arrays it is a data member.

        //indexing in strings unlike python

        for (int i=0 ; i<s2.length() ; i++){
            char c = s2.charAt(i);
            System.out.println(c);
        }

    }
}

//Output :

// Enter space separated string (more than 3): 
// ved upnishad ramayan sanskrit books
// ved
// upnishad
//  ramayan sanskrit books
// 3
// u
// p
// n
// i
// s
// h
// a
// d
