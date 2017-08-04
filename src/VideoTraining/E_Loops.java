package VideoTraining;
import java.util.*;

public class E_Loops {

    public static void main(String[] args) {
        
//while loop********************************************************************
        int count = 0;
        System.out.println("Result of while loop: ");
        while (count < 3)
        {
        System.out.println("Hello motherfucker" + count);
        count++;
        }
//output the multiples of 5 less than 100 
        int j=5, k=1, product=0;
        while (product<95){
            product= j*k++;
            System.out.println(product);
        }
//output even numbers in descending order from 70 to 50 inclusive
        int even=70;
        while (even>=50){
            System.out.println(even);
            even= even-2;
        }
//sum the numbers from 1-100 and output the result
        int x=1, sum=0;
        while (x<=100){
            sum += x++;
            System.out.println(sum);
        }
        
//do while*********************************************************************
        System.out.println("Result of do/while loop: ");
        do {
        System.out.println("Hello World");
        count++;
        } while (count < 3);

        int i = 1;
        do {
        i *= 5;
        System.out.println("i = " + i);
        } while (i < 126);


//for loop *********************************************************************
        for (int r=0; r<5; r++){
            System.out.println("i=" +r);
        }
    
        for (int w=0, h=4; w<5 && h<7; w++, h+=2){
            System.out.print("i=" +w+" , ");
            System.out.println("j=" +h+" , ");
        }
    
        int[] valori = {1, 3, 5, 7, 9};
        for (int nr: valori) {
            System.out.println(nr);
        }

//EXAMPLE SENTINEL CONTROLED LOOP***********************************************
//Scanner keyboard=new Scanner(System.in);
//int grade, sum=0;
//        System.out.println("Enter a grade (-1 to quit): ");
//        grade = keyboard.nextInt();
//        
//        while (grade != -1){
//            sum += grade;
//            System.out.println("Enter a grade (-1 to quit): ");
//        grade = keyboard.nextInt();
//        }
//System.out.println("The sum is: " + sum);


//break and continue************************************************************

        for (int v=0; v<5; v++){
            System.out.println("v="+v);
            if (v==1) continue;
            if (v==2) break;
            System.out.println("v dupa conditii=" +v);
        }


//nested loop*******************************************************************

    forulExterior: for(int p=0; p<4; p++){
            for(int u=1; u<4; u++) {
                if(u==2 && p==1) continue forulExterior;
                System.out.println("i=" + p + ", j= " +u);
            }
        }


    }//method
}//class