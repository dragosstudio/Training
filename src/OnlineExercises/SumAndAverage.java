package OnlineExercises;

/*
Write a program called SumAndAverage to produce the sum of 1, 2, 3, ..., to 100. 
Also compute and display the average. The output shall look like:
The sum is 5050
The average is 50.5
Modify the program to use a "while-do" loop instead of "for" loop.
Modify the program to use a "do-while" loop.
What is the difference between "for" and "while-do" loops? What is the difference between "while-do" and "do-while" loops?
Modify the program to sum from 111 to 8899, and compute the average. Introduce an int variable called count to count the numbers in the specified range.
Modify the program to sum only the odd numbers from 1 to 100, and compute the average. (HINTS: n is an odd number if n % 2 is not 0.)
Modify the program to sum those numbers from 1 to 100 that is divisible by 7, and compute the average.
Modify the program to find the "sum of the squares" of all the numbers from 1 to 100, i.e. 1*1 + 2*2 + 3*3 + ... + 100*100.
 */
/*
package Exercises;
public class SumAndAverage {
    public static void main (String[] args){
       
        int sum=0;
        double average;
        
        for ( int x=1; x<=100; ++x){
            sum += x;
           } 
            System.out.println("The sum is: " + sum);
            average = sum /100.0;
            System.out.println("The average: " + average);
        
    }
  */  

/*
// "while-do" loop
public class SumAndAverage {
    public static void main (String[] args){
        int sum=0, lowerLimit=1, x = 1;
        double average, upperLimit = 100.0;
        
            while (x <= upperLimit){
            sum += x;
            ++x;
            }
        System.out.println("The sum is: " + sum);
        average = sum / upperLimit;
        System.out.println("The average: " + average);
    }
}
*/
// "do-while" loop
public class SumAndAverage {
    public static void main (String[] args){
        int sum=0, lowerLimit=1, x = 1;
        double average, upperLimit = 100.0;
        
        do {sum += x;
            ++x;
            }
        while (x <= upperLimit);
                
        System.out.println("The sum is: " + sum);
        average = sum / upperLimit;
        System.out.println("The average: " + average);
    }
}
