/*
Exercise CheckOddEven (if-else): 
Write a program called CheckOddEven which prints "Odd Number" if 
the int variable “number” is odd, 
or “Even Number” otherwise. 
The program shall always print “BYE!” before exiting.
 */
package OnlineExercises;
import java.util.Random;

public class CheckOddEven {
    public static void main(String[] args){
        int nr;
        Random rand = new Random();
        nr = rand.nextInt(1000);
        System.out.println("Generating random number: " + nr);
        if (nr%2!=0){
            System.out.println("Odd Number");
        }
        else {
            System.out.println("Even Number");
            
        }
        
            System.out.println("BYE");
    }
}
