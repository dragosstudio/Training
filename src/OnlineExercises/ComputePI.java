/*
Write a program called ComputePI to compute the value of π, 
using the following series expansion. 
You have to decide on the termination criterion used in the computation 
(such as the number of terms used or the magnitude of an additional term). 
Is this series suitable for computing π?
π=4*(1-1/3 + 1/5-1/7 + 1/9-1/11 + 1/13-1/15 + ......)
 */
package OnlineExercises;

import java.util.Scanner;
//will do 2 clases
// 1. will calculate PI  (must return a double type result) the limit must be: n
// 2. will display : text(PI calculat cu o precizie de 1/n + result
//fie o ecuatie creata din "t" termeni unde t=(max-1)/2

class ComputePI {

    public static void main(String[] args) {
        System.out.println("Imput the end number of precision for PI calcul.");
        System.out.println("Number must be pozitive odd and bigger than 3 and smaller than 101. ");
// verifiing if the number between is between 3-101
        int max;
        Scanner in = new Scanner(System.in);
        max = in.nextInt();
        boolean val = true;

        if (max % 2 != 0 && max < 101 && max > 3) {
            System.out.println("Number is valid.");
        } else {
            val = false;
        }
//end of verify

        if (val == true) {
//firs array of fractions: seriesNR
            double[] seriesNR;
            seriesNR = new double[max];
            int x = -1;

            for (int i = 1; i < max-2; i++) {
                x = x + 2;
                seriesNR[i] = 1.0 / x;
                System.out.println("fractionarul este : " + x);
            }
// end of: seriesNR
//            double[] sum;
//            sum = new double[max];
//            
//            for (int i = 1; i < sum.length; i++) {
//                sum[i] = seriesNR[i] + seriesNR[i + 1];
//                System.out.println(sum[i]);
//            }

            double[] dif;
            dif = new double[max];

            for (int i = 1; i < seriesNR.length; i++) {
                dif[i] = seriesNR[i] - seriesNR[i+1];

                System.out.println("seriesNR[i] : " + seriesNR[i]);
                System.out.println("dif["+i+"]: " + dif[i]);
            }

        } else {
            System.out.println("Number is invalide !");
        }
    }
}
