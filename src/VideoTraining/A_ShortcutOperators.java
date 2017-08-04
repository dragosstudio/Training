
package VideoTraining;

public class A_ShortcutOperators {
    public static void main(String[] args) {

//  combined assignment
//  +=   "plus-gets"
//  +=  -=  *=  /=  %=

//  increment and decrement
//  a++
//  ++a
//  b=a++   -  post increment
//  b=++a   -  pre increment
        int a=10, b=6, c;
        double d1 = 3.5, d2 = 12.1;
        final double Tax_rate = 0.07;
        final double Tax_rate2;
        
//        Tax_rate = 0.12;  // will not work 
// if the final variable is already declared 
// you can not change it
        Tax_rate2 = 15.2;
        
        // a = a+b;  // 16
        // a += b;   // 16
        // a /= b;   // 1 because ist's a int division
        // d2 *= a + b;   // d2 = d2 * (a+b);
        //a++; //11
        //++a; //11
        
//        System.out.println(a++);    
// 10 because the increment happends after printing
// but the value of a is 11 in memory
//        System.out.println(++a);
// 11 because the increment happends before printing

//        b += a++ + ++a;  // b = 6 + ( 11 + 11) result=28 
//        System.out.println(b);

        
    }
    
}
