package VideoTraining;

public class D_LogicalOperators {
    public static void main(String[] args) {
//  && - and
//  &
//  || - or
//  |
//  !  - not
int f=10, g=6, h=7;
    if (f>g && h==25){
        System.out.println("AND both must be true");}
    if (f>g || h==25){
        System.out.println("OR either must be true");}
    if (!(f>g)){
        System.out.println("NOT inverts the logic");}

// ! unary operator 
// if (!a>b) will never compile. ! requires a boolean operand
// should be
// if(!(a>b))  force the relational operator to happen first

int a=5, b=4, c=3, d=2;
        System.out.println(a<b && c>b);
        System.out.println(a>=c || d>=5);
        System.out.println((!(a>b)));
        System.out.println(b>=a && !(d<b));
        System.out.println(a>b || c>b && c<d);
    }//method
}//class
