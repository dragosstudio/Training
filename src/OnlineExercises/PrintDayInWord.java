/*
Write a program called PrintDayInWord which prints 
“Sunday”, “Monday”, ... “Saturday” if the int variable 
"day" is 0, 1, ..., 6, respectively.  
Otherwise, it shall print “Not a valid day”. 
Use (a) a "nested-if" statement; 
 */
package OnlineExercises;
import java.util.Random;

public class PrintDayInWord {
    public static void main(String[] args){
    int number;
    Random rand= new Random();
    number = rand.nextInt(7);
        System.out.println("Day is: " + number);
    if (number == 0) System.out.println("Sunday");
        else if (number == 1) System.out.println("Monday");
        else if (number == 2) System.out.println("Tuesday");
        else if (number == 3) System.out.println("Wednesday");
        else if (number == 4) System.out.println("Thursday");
        else if (number == 5) System.out.println("Friday");
        else if (number == 6) System.out.println("Saturday");
    }    
}
