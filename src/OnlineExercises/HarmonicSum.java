/*
Write a program called HarmonicSum (LOOP) to compute the sum of a harmonic series, 
as shown below, where n=50000. The program shall compute the sum 
from left-to-right as well as from the right-to-left. 
Obtain the difference between these two sums and explain the difference. 
Which sum is more accurate?

Harmonic (n)=1+1/2+1/3+1/4+ ..... 1/n 

*/
package OnlineExercises;
import java.util.*;

/*
public class HarmonicSum {
    public static void main(String[] args) {
        double x=1, harmonic=0, y=2;
        List<Double>  arc = new ArrayList<>();
        do {
        arc.add(x / y);
        y++;
    } while (y <= 50000);

    for (Double double1 : arc) {
        harmonic += double1;
    }
       
        System.out.println("Harmonic sum is: " + harmonic);
    }
}
// using double streamedHarmonic = arc.stream().mapToDouble(Double::doubleValue).sum();


*/
public class HarmonicSum {
    public static void main(String[] args) {
        int num=50000;
        double result = 0.0;
        while(num>0){
            result = result + 1.0/num;
            num--;
        }
        System.out.println("Harmonic sum is = " + result);
    }
}

   