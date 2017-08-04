package VideoTraining;




/*
add decisio-making logic
add a loop

*calculate patienct charges 
-determini if it is an overnight stay (ask the system if this is an overnight and ask for the overnight charges)
- overnight charges
- medication charges
- lab service charges

if is not an overnight stay 
- medication charges
- lab service charges

calculate the charges 
print the final total

ask the user if they want to calculate the charges for another patience 
 */
import java.util.Scanner;

public class Z_SecondChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// overnight charges "overCharg"
// hospital charges "hosCharg"
// medical charge "medCharge"
// lab service charges "labCharg"
// checkovernightstatus "checkOS"

    double overCharg = 0, hosCharg = 0, medCharge = 0, labCharg = 0, TotalFinal = 0;
    String response = "";
    Scanner in = new Scanner(System.in);
    
    do{
        if(checkOS() == true)
            {
                System.out.println("Enter the cost of the hospital stay: ");
                hosCharg = in.nextDouble();
            }
        else
            {
                hosCharg = 0;
            }
        System.out.println("Enter the medication charge: ");
        medCharge = in.nextDouble();
        System.out.println("Enter the lab charge: ");
        labCharg = in.nextDouble();
        TotalFinal = hosCharg + medCharge + labCharg;
        printTotal(TotalFinal);
        System.out.println("Do you have another patient? (y/n)");
        response = in.next();  
        }
    while (response.equalsIgnoreCase("y"));
    }
     
public static boolean checkOS()
    {
            Scanner in = new Scanner(System.in);
            String response = "";
            System.out.println("This is an overnight stay ? (y/n) ");
            response = in.next();
            if (response.equalsIgnoreCase ("y"))
                return true;
            else 
                return false;
    }
    
public static void printTotal (double TotalFinal)
{
    System.out.printf("The total cost for this patient is: %6.2f", TotalFinal);
    System.out.println();
}
}
    

