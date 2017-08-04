/*
Write a program called Product1ToN to compute the product of 
integers 1 to 10 (i.e., 1×2×3×...×10). 
Try computing the product from 1 to 11, 1 to 12, 1 to 13 and 1 to 14. 
Write down the product obtained and explain the results.
 */
package OnlineExercises;

public class Product1ToN {
    public static void main (String[] args) {
        
        int  upperlimit=14;
        long product=1, x=1;
        
        do {
           product *= x;
           ++x;
           }
        while (x<=upperlimit);
 
//        for (int x=1; x<=upperlimit; x++){
//             product *= x;
//            }

        System.out.println("1x2x3x4x....x11 = " + product);
    }
}
