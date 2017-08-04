package OnlineExercises;

public class ArraySumAndAverage {
    public static void main(String[] args) {
        double[] values = {1,2,3,4,5};
        double total = 0;
        for (double element : values) { // enhanced for loop
            total += element;
        }
        System.out.println("Total sum = " + total);
        
        double average = 0;
        if (values.length > 0) {
            average = total /values.length;
        }
        System.out.println("Average is = " + average);
    }
}
