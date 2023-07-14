//doing assignment patterns

public class Pattern {
    public static void main(String[] args) {
        System.out.println("\nPattern 1 : No of columns = Total no of rows");
        pattern1(4);
        System.out.println("\nPattern 2 : No of rows = No of columns");
        pattern2(4);
        System.out.println("\nPattern 3 : Reverse of pattern 2");
        pattern3(4);
        System.out.println("\nPattern 4 : No of rows = No of columns & column numbers also get printed");
        pattern4(4);
        System.out.println("\nPattern 5 : Combination of 2 and 3");
        pattern5(5);
        System.out.println("\nPattern 28 : Diamond Printing");
        pattern28(5);
        System.out.println("\nPattern 30");
        pattern30(5);
        System.out.println("\nPattern 17");
        pattern17(5);
        System.out.println("\nPattern 31 !!");
        pattern31(4);
    }

    static void pattern1(int n){
        //here n is total number of rows
        for (int row=1 ; row<=n ; row++){
            for (int column=1 ; column<=n ; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int row=1 ; row<=n ; row++){
            for (int column=1 ; column<=row ; column++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int row=1 ; row<=n ; row++){
            for (int column=n ; column>=row ; column--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int row=1 ; row<=n ; row++){
            for (int column=1 ; column<=row ; column++){
                System.out.print(column+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int row=1 ; row< 2*n ; row++){
            int ColsInRow = row>n ? 2*n - row : row; //derived formula by observing
            //till n print col = row but after n you should use formula
            for (int column=1 ; column<= ColsInRow ; column++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n){
        for (int row=1 ; row< 2*n ; row++){
            int ColsInRow = row>n ? 2*n - row : row; //derived formula

            //I thought of this :
            //int NoSpaces = row>n ? row-n : n-row;
            //But more easier way is :
            int NoSpaces = n-ColsInRow;

            for(int s=1 ; s<=NoSpaces ; s++) System.out.print(" ");
            for (int column=1 ; column<= ColsInRow ; column++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n){
        //my solution
        for (int row=1 ; row<=n ; row++){
            int ColsInRow = 2*row - 1; //derived formula by observation : odd nos : 1,3,5,..,2n-1
            int NoSpaces = 2*(n-row); //observation on paper
            int firstvalue = row;

            for(int s=1 ; s<=NoSpaces ; s++) System.out.print(" ");
            for(int col=1 ; col<=ColsInRow ; col++){ //will run
                System.out.print(firstvalue+" ");
                if (col <= ColsInRow/2) {
                    firstvalue--; //at false condition it will cause firstvalue to have value equal to 1
                                  //so, 1 got printed
                }
                else {
                    firstvalue++;
                }
            }
            System.out.println();
        }
        //Kunal's Approach : //it is easier and this way is important for pattern17 also.

        //for (row loop){
        //    for (space loop) : for (int s=1 ; s<=n-row ; s++)
        //    for (column loop from row to 1)
        //    for (column loop from 2 to row)
        //}
    }

    static void pattern17(int n){
        for (int row=1 ; row<=2*n -1 ; row++){
            int c = row > n ? 2*n - row : row ;
            int space = row > n ? row - n : n - row ; //Space=row-n (by observation)

            for (int s=1 ; s<=space ; s++) System.out.print("  ");
            for (int col = c ; col>=1 ; col--) System.out.print(col+" ");
            for (int col = 2 ; col<=c ; col++) System.out.print(col+" ");


            System.out.println();
        }
    }

//My way was :
//    static void pattern17(int n){
//        for (int row=1 ; row<=2*n -1 ; row++){
//            if (row <= n){
//                for (int s=1 ; s<=n-row ; s++) System.out.print("  ");
//                for (int col = row ; col>=1 ; col--) System.out.print(col+" ");
//                for (int col = 2 ; col<=row ; col++) System.out.print(col+" ");
//            }
//            else {
//                for (int s=1 ; s<=row-n ; s++) System.out.print("  "); //Space=row-n (by observation)
//                for (int col = 2*n - row ; col>=1 ; col--) System.out.print(col+" ");
//                for (int col = 2 ; col <= 2*n - row ; col++) System.out.print(col+" ");
//            }
//            System.out.println();
//        }
//    }

    static void pattern31(int n) {
        int original_n = n;
        n = 2*n;
        for (int row=0 ; row<=n; row++){
            for (int col=0 ; col<=n ; col++){
                //way of calling Math.min() for 4 values
                int atEveryIndex = Math.min(Math.min(row, col), Math.min(n-row, n-col)); //left=col, right=n-col, top=row, down=n-row
                if(atEveryIndex !=0) {
                    int value = original_n-atEveryIndex+1;
                    System.out.print(value+" ");
                }
            }
            System.out.println();
        }
    }
}

//Output :

// Pattern 1 : No of columns = Total no of rows
// * * * * 
// * * * * 
// * * * * 
// * * * * 

// Pattern 2 : No of rows = No of columns
// * 
// * * 
// * * * 
// * * * * 

// Pattern 3 : Reverse of pattern 2
// * * * * 
// * * * 
// * * 
// * 

// Pattern 4 : No of rows = No of columns & column numbers also get printed
// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 

// Pattern 5 : Combination of 2 and 3
// * 
// * * 
// * * * 
// * * * * 
// * * * * * 
// * * * * 
// * * * 
// * * 
// * 

// Pattern 28 : Diamond Printing
//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * * 
//  * * * * 
//   * * * 
//    * * 
//     * 

// Pattern 30
//         1 
//       2 1 2 
//     3 2 1 2 3 
//   4 3 2 1 2 3 4 
// 5 4 3 2 1 2 3 4 5 

// Pattern 17
//         1 
//       2 1 2 
//     3 2 1 2 3 
//   4 3 2 1 2 3 4 
// 5 4 3 2 1 2 3 4 5 
//   4 3 2 1 2 3 4 
//     3 2 1 2 3 
//       2 1 2 
//         1 

// Pattern 31 !!

// 4 4 4 4 4 4 4 
// 4 3 3 3 3 3 4 
// 4 3 2 2 2 3 4 
// 4 3 2 1 2 3 4 
// 4 3 2 2 2 3 4 
// 4 3 3 3 3 3 4 
// 4 4 4 4 4 4 4 
