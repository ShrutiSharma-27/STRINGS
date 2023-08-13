//Substring, Concatenation, Splitting

import java.util.Arrays;

public class Str_substring {
    public static void main(String[] args){
        String s = "abcdef";

        System.out.println(s.substring(1,4)); //2nd index as argument is not printed
        System.out.println(s.substring(0,0));
        System.out.println(s.substring(0,1));
        System.out.println(s.substring(5,6));
//      System.out.println(s.substring(5,4)); will throw error
        System.out.println(s.substring(2)); //if you'll not pass 2nd argument then it will print till end of the string

        //printing all substrings of s
        for (int i=0 ; i<s.length() ; i++){  //from 0 to 5
            for (int j=i+1 ; j<=s.length() ; j++){
                System.out.println(s.substring(i,j));
            }
        }
        System.out.println();

        //Concatenation
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1+" "+s2;
        System.out.println(s3);

        s3+='M';
        s3+=10;

        System.out.println(s3);

        //split
        String s4 = "abc def ghi jkl mno";
        String[] parts = s4.split(" "); //splitting on space
        System.out.println(Arrays.toString(parts));

        String s5 = "abc,def,ghi,jkl mno";
        String[] parts1 = s5.split(","); //splitting on ,
        System.out.println(Arrays.toString(parts1));
    }
}

//Output :

// bcd

// a
// f
// cdef
// a
// ab
// abc
// abcd
// abcde
// abcdef
// b
// bc
// bcd
// bcde
// bcdef
// c
// cd
// cde
// cdef
// d
// de
// def
// e
// ef
// f

// Hello World
// Hello WorldM10
// [abc, def, ghi, jkl, mno]
// [abc, def, ghi, jkl mno]
