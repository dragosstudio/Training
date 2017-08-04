
package VideoTraining;

public class I_Clases {
public static void main(String[] args) {

    I_Clases_Date birthday = new I_Clases_Date(00, 00, 0000);
    I_Clases_Date anniversary = new I_Clases_Date(01, 03, 2016);
    
//    birthday.month = 11;
//    birthday.day = 16;
//    birthday.year = 1960;
    birthday.setMonth(01);
    birthday.setDay(25);
    birthday.setYear(1982);
    
        System.out.println( birthday.getDay()+" "
                +birthday.getMonth()+" "
                +birthday.getYear());
        
        System.out.println(birthday.toString());
        System.out.println(anniversary);
    }
}