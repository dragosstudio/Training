package OnlineExercises;

import java.util.*;

public class PrimeNumbers {

    public static void main(String[] args) {

////******************************************************************************
////how to populate an array with the numbers containg a given int        
//        System.out.print("Imput the number: ");
//        int number;
//        Scanner keyboar = new Scanner(System.in);
//        number = keyboar.nextInt();
//        int[] series;
//        series = new int[number+1];
//        for (int k=1; k < series.length; k++){
//            series[k] = k; 
////            System.out.println(series[k]);
//            }
////******************************************************************************        
//        for (int i=2; i<number; ++i){
//            
//            if (number % series[i] != 0){
//                System.out.println(number + " is prime");
//                break;
//            }
//            else{
//                System.out.println(number + " is NOT prime");
//                break;
//            }
//        }
////******************************************************************************
        System.out.print("Imput the number: ");
        int number;
        Scanner keyboard = new Scanner(System.in);
        number = keyboard.nextInt();
        boolean isPrime = true;
                
        for (int factor =2; factor <number; factor++){
            if(number%factor==0){
                isPrime=false;
            }
        }
        if (isPrime) {
            System.out.println(number + " is prime");
        }
        else{
            System.out.println(number + " is NOT prime");
        }

    }//method
}//class
