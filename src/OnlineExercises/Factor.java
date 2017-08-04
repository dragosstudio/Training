
package OnlineExercises;
import java.util.*;
public class Factor {
    public static void main(String[] args) {
// factors sau divizorii
        Scanner keyboard = new Scanner(System.in);
        int number, factor;
        
        System.out.println("Enter an integer: ");
        number = keyboard.nextInt();
        for(factor = 1; factor <= number; factor++){
            if(number % factor ==0){
             System.out.println(factor);   
            }
    }
    } //method
}//class
