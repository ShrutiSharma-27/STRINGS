public class Str_Builder1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);

        //LENGTH of string
        System.out.println(sb.length());

        //GET any character of string
        System.out.println(sb.charAt(3));

        //setCharAt replace the already present character
        //insert add the character at given index without replacing any before character

        //UPDATE string
        sb.setCharAt(4,'i');
        System.out.println(sb);
    }
}

//Output :

// hello
// 5
// l
// helli
