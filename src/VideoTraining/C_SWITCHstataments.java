
package VideoTraining;

public class C_SWITCHstataments {
    public static void main(String[] args) {
        
//switch (int expresion/variable or promotable to int){
//            case value 1: instruction set 1;
//            break;
//            case value 2: instruction set 2;
//            break;
//            ...
//            default: instruction set for the case none of the above is true;
//            break;
//        }
//conditional operator  / ternary operator
//<boolean> ? <true part> : <false part>
//            boolean result;
//            result = 10 > 4.5;
//            result = true == true;
//            result = true > true;  //this will not compile
//            result = true != true;
//            result = 0.6666666 == 2.0/3.0;  // not a good ideea to compare doubles and floating point
//            System.out.println(result);
        int choice = 2;
        switch(choice){
            case 1:
                System.out.println("choise is 1");
                break;
            case 2:
                System.out.println("choise is 2");
                break;
            default: 
                System.out.println("choise is neither 1 or 2");
                break;
        }
//conditional operator / ternar
// ? :
        int a;
        a = 12 > 5 ? 23 : 55;
        System.out.println(a); // console will print 23 
    }
}
