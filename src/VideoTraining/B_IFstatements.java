package VideoTraining;

public class B_IFstatements {
//    public static arrayexample (String[] args){
//// SINTAXA 1 - if
//        if (boolean){
//        instructiuni pentru conditie adevarata;
//        }
//// SINTAXA 2 - if - else
//        if (boolean){
//        instructiuni pentru conditie adevarata;            
//        }
//        else
//        instructiuni pentru conditie falsa;
//// SINTAXA 3 - else if
//        if (boolean){
//            set instructiuni 1;
//        }else if (boolean){
//            set instructiuni 2;
//        }else if (boolean)
//            set instructiuni 3;
//        else{           // optional
//                set instructiuni n;
//                }
//
//    } // end of method
    public static void main(String[] args) {
        int a=10, b=13;
// SINTAXA 1 - if
        if (a>b){
            System.out.println("10 nu este mai mare ca 13");
        }
// SINTAXA 2 - if - else      
        if (b>a){
            System.out.println("13 mai mare ca 10");
        }
        else 
            System.out.println("if-ul nostru nu este adevarat");
// SINTAXA 3 - else if
        int x=8;
        if (x>5){
            System.out.println("ai nota de trecere");
        } else if (x<10){
            System.out.println("dar nici premiant nu esti");
        }else if (x==8){
            System.out.println("e fix ce trebuie");
        }else
            System.out.println("restu nu mai conteaza");
    }
} // end of class
