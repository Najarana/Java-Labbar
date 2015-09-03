import java.util.Random;
import java.util.Scanner;
public class Hangman{
    
    public static void main (String [] args){
        
        
        
        System.out.println("Hangman:");
        printOut(getWord());
        System.out.println("That was your tenth and final guess.");
        System.out.println("The correct word was: "+ getWord());
        
    }
    public static String getWord(){        
        String[] words = {"banan", "telefon", "snusdosa", "kaffe", "spelkonsol", "dator" };
        String word = pickWord(words);
        return word;
    }
    public static String pickWord(String[] array){
        int index = (int)(Math.random()*5);
        //System.out.println(index);
        String word = array[index];
        return word;
    }
    
    public static void printOut(String word){
        System.out.println(word);
        
        String [] splitted = word.split("");
        String[] hangman = new String[splitted.length];
        for(int i = 0; i < hangman.length; i++){
            hangman[i]="_";
            System.out.print(hangman[i]+" ");      
            if (hangman[i]== hangman[hangman.length-1]){
                System.out.println("");
            }
        }
            hangHim(splitted,hangman);
    }
    
    public static void hangHim(String[] wordArray, String[] displayArray){
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        String [] guesses = new String[10]; //10 guesses
        boolean done = false;
        while((counter<10) && (done != true)){
            boolean wrong = true;
            System.out.print("You have used "+counter +" guesses. Enter letter : ");
            String input = scan.nextLine();
            
            
            for (int i = 0; i < wordArray.length; i++){
                
                for (int j = 0; j < displayArray.length; j++){
                
                    if(input.equals(wordArray[j])){
                        displayArray[j] = input; 
                        wrong =  false;
                    }
                }
                if (wrong==true){
                    guesses[counter]=input;
                    counter++;
                    break;
                }
                                
            }
            
            for (int i = 0; i < displayArray.length; i++){
                System.out.print(displayArray[i]+" ");
                //String finished ="";
                //finished+= displayArray[i];
                
                if(i==displayArray.length-1){
                    System.out.println("");
                    //System.out.println(finished);
                }
                if(displayArray == wordArray){
                    System.out.println("DONE!");
                    done = true;
                }
            }
            System.out.println("Wrong guesses:");
            for(String g : guesses){
                if(g != null){
                System.out.print(g+" ");               
                }
            }
            System.out.println("");
        }
                   
    }
    
}