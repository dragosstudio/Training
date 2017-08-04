package VideoTraining;

public class G_Methods2 {

    public static void main(String[] args) {
        int cubeOfSeven;

        cubeOfSeven = cube(7); //method call (invocation)
        outputMessage();
        System.out.println(cubeOfSeven);

        int[] array = {12, 56, 899, 78};
        double average = findAverage(array);
        
        System.out.println("average of the array is: " + average);

    }//main method

    public static double findAverage(int[] a) {
        double result;
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        result = (double)sum / a.length;
        return result;
    }

    public static void outputMessage() {  // static void doesn't need a return type
        System.out.println("Hello");
        System.out.println("from a method");
    }

    public static int cube(int parameter) {
        int result;
        result = parameter * parameter * parameter;
        return result;
    }
}
