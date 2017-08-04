package VideoTraining;
public class Literals {
    public static void main(String[] args) {
//integer literal
        int iX = 1000;
        int iY = 1_00__0;

//integer floating point literals
        double dW = 4923.6;
        double dX = 4.9236e3;
        double dY = 492360e-2;
        double dZ = 492_360e-2;

//boolean integer literals
        boolean boleanT = true;
        boolean boleanF = false;

// character literals: all character inclosed in single quote ' '\
        char a = 'A';
        char one = '1';
        char aDec = 65; // ASCII letter A reprezentare decimala
        char aHex = 0x41; //ASCII letter A reprezentare hexadecimala
        char aOct = 0101; // ASCII letter A reprezentare OCTAL
        char aBin = 0b01000001; //ASCII leter A reprezentare binara

// octo literals
        int seven = 07;
        int eight = 010;
        int nine = 011;

// string literal
        String h = "The quick brown fox.";
        String j = "He told me a\"bad\"idea.";
    /* escape sequnces
\b - backspace
\f - form feed
\r - carriage return
\n - new line
\t - horizontal tab
\' - single quote
\" - double quote
\\ - backslash
\ooo - three octal digit ASCII value
    */
// sys out
        System.out.println("iX = " + iX);
        System.out.println("iY = " + iY);
        System.out.println("dW = " + dW);
        System.out.println("dX = " + dX);
        System.out.println("dY = " + dY);
        System.out.println("dZ = " + dZ);
        System.out.println("boleanT = " + boleanT);
        System.out.println("boleanF = " + boleanF);
        System.out.println("char literal prima reprezentare = " + a);
        System.out.println("char literal a doua reprezentare = " + one);
        System.out.println("char literal decimal 65 = " + aDec);
        System.out.println("char literal hexa 0x41 = " + aHex);
        System.out.println("char literal octal 0101 = " + aOct);
        System.out.println("char literal binar 0b01000001 = " + aBin);
        System.out.println("octo literal 07  = " + seven);
        System.out.println("octo literal 010  = " + eight);
        System.out.println("octo literal 011  = " + nine);
        System.out.println("String 1 = " + h);
        System.out.println("String 2 = " + j);
    }
}
