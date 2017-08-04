package VideoTraining;


import java.util.Scanner;
public class Z_Methods {

    public static void main(String[] args) {
        // TODO code application logic here
        double x, y, z, sum;
        double avg;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        x = in.nextDouble();
        y = in.nextDouble();
        z = in.nextDouble();
        avg = average(x,y,z);
        sum = x + y + z;
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + avg);
    }
    public static double average(double num1, double num2, double num3)
    {
        double avg = (num1 + num2 + num3)/3;
        return avg;
    }
    
}
