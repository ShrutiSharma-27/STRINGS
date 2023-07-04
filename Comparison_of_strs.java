public class Comparison_of_strs {
    public static void main(String[] args) {
        String a = "Shruti";
        String b = "Shruti";
        String c = a;
        // 1) '==' (comparator) method : checks whether the 2 reference variables are pointing to the same objects or not.
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(b==c);

        //how to create a different object of same value ?
        //using new keyword
        String x = new String("Shruti");
        String y = new String("Shruti");
        //this created two different objects with same value "Sharma" but outside String pool and inside heap.

        System.out.println(x==y);
        System.out.println(c==y);

        // 2) .equals method : checks whether the 2 reference variables are having same value or not.
        System.out.println(a.equals(x));
        System.out.println(b.equals(c));
    }
}

//Output :

//true
//true
//true
//false
//false
//true
//true
