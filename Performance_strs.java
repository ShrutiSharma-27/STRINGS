//**important for interview round

public class Performance_strs {
    public static void main(String[] args) {
        String series = "";
        for (int i=0 ; i<26 ; i++){
            char ch = (char)('a'+i);
            series+=ch;  //concatenation //everytime it creates new object by copying the previous object's(which get de-referenced.) value
            System.out.println(ch);
        }
        System.out.println(series);
    }

    //if you want to add n characters to string then time complexity for that is O(n^2) as it creates n objects during the process.
    //for example in the above code a,ab,abc,abcd,...,abcdefghijklmnopqrstuvwxy objects were created which is equal to
    // 1+2+3+4+...+n = n(n+1)/2 => O(n^2) : Reason - Copying

    //Although the for loop runs for n times but everytime it also takes time to recreate previous string + add the new character

    //Solution : it can be avoided if we use a data type that unlike Strings allows us to modify it's value which is StringBuilder.
    //         : only 1 object made, reference is same (not changed), changes are made in same object

    //StringBuilder is a separate class in Java like String class.
}
