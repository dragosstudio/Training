package VideoTraining;
import java.util.*;

public class F_Array {
    public static void main(String[] args) {
        int[] grades;
        int size = 3;
        int randNR;
        
        grades = new int[size];
        Random rand=new Random();
                
        grades[0] = 99;
        grades[1] = 87;
        grades[2] = grades[1] - 15;
        System.out.println("array grades content:");
        for (int NR : grades){
            System.out.println(NR);
        }
        
// new array named: data
        double[] data = new double[10];
        for(int i=0; i<data.length; i++){
            randNR = rand.nextInt(50)+1;
            data[i] = randNR;  
        }
        System.out.println("pozitia 8 este : "+ data[7]);
// a for each loop
        for(double d : data) {
// for each elemet in this array 
// get one out and store it in the variable d
            System.out.println(d);
        }
        
        double result;
        result = findAverage(data);
        System.out.println("average of the data array is: " + result);
    }   // end main
    
    static double findAverage(double[] array) {
        double average = 0.0, sum = 0.0;
        
        for(int i=0; i<array.length; i++){
            sum +=array[i];
        }
        average = sum /array.length;
        return average;
    } 
    //multidirectional arrays
//    public static void main(String[] args) {
//        int[][] s_bi = new int[4][];
//        s_bi[0] = new int[4];
//        s_bi[1] = new int[2];
//        s_bi[3] = new int[3];
//        System.out.println(s_bi[1][1]);
//        int[][] x_bi = {{11, 22, 33, 44}, {1, 2}, {9, 8, 7}};
//        System.out.println(x_bi[0][2]); //33
//        System.out.println(x_bi[2][2]); //7
//        String[][] pampam = new String[2][3];
//        pampam[0][1] = "hello there";
//        pampam[1][2] = " dragos";
//        System.out.print(pampam[0][1]);
//        System.out.println(pampam[1][2]);
//        System.out.println(pampam[1][0]); //[2][0]cerem valori inafara array ......eroare
//    }
}
