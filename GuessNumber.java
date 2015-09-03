import java.util.Random;
import java.util.Scanner;
public class GuessNumber{
    public static void main (String [] args){
        Random generator = new Random();
        Scanner scan = new Scanner(System.in);        
        randomNr(scan, generator);
        
    } 
    
    public static void randomNr(Scanner scan, Random generator){
        boolean guessagain = false;
        
        do{
            int rndI =generator.nextInt(99)+1;
            int guessNr = 1;
            boolean correct = false;
            while(correct==false && guessNr < 6){
                System.out.print("Enter " +guessNr+"st guess." );
                int guess = scan.nextInt();                
                correct = guessCheck(guess,rndI);
                if(correct == false){
                    guessNr++;
                }            
            }
            System.out.println("Correct number was"+rndI);
            System.out.print("Enter 5 to guess again: ");
            if(scan.nextInt()==5){
                rndI =generator.nextInt(99)+1;
                guessagain = true;
            }
            
        }while(guessagain == true);
        
    }
    
    public static boolean guessCheck(int guess, int correct){
                
                if (correct < guess ){
                    System.out.println("You guessed high!");                                     
                }
                
                else if (correct > guess ){
                    System.out.println("You guessed low!");
                                       
                }else{
                    System.out.println("Correct!");
                    
                    return true;
                    
                }
        return false;
    }
    
}