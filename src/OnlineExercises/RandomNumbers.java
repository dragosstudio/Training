package OnlineExercises;



import java.util.Random;
public class RandomNumbers {

    public static void main(String[] args) {
        // random numbers
        int numar1, numar2, countDoubles=0;
        Random rand = new Random();
        for(int i=0; i<100; i++)
        {
        numar1 = rand.nextInt(6)+1;
        numar2 = rand.nextInt(6)+1;
        if(numar1==numar2)
        {countDoubles++;}
        }
        System.out.println("Am dat " + countDoubles + " duble");
    }
    
}
