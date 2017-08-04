package VideoTraining;

public class G_Methods {
    public static void main(String[] args ) {
        
        System.out.println("hello");
        
        double variable;
        
        variable = Math.sqrt(100.0)+45.6;
        
        System.out.println("The square rooot of 100 +45.6 is: " + variable);
        System.out.println("2 to the 3rd power:" + Math.pow(2.0,3.0));
        System.out.println("Value of PI is: " + Math.PI);

        String name = new String("Colin"); //name object
        int stringLength = name.length();
        System.out.println("len has: " + stringLength);
        
        
        double [] data= new double[100];
        
        for (int i=0; i<data.length; i++){
            data[i] = Math.random();
        }
        
        double result;
        result = findAverage(data);
        System.out.println("The average of the arrai is: " + result);
    }//main method
    
    static double findAverage(double[] array){
        double average=0.0, sum=0.0;
        
        for(int i=0; i< array.length; i++){
            sum += array[i];
        }
        average = sum / array.length;
        return average;
    }// findAverage method
    
    
    
}//class

