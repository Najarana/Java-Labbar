 import java.util.Scanner;
public class Counter{
    public static void main(String[] args){
        Scanner integer = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        System.out.print("Skriv in en text: ");
        String text = s.nextLine();
        char[] chars = text.toCharArray();
        
        int result = uniqueCounter(chars);
        System.out.println("Det finns "+result+ "unika tecken");
    }
 public static int uniqueCounter(char[] arrayen){
        int counter = 0;
        boolean found = false;
        char[] found = new char[10];

        
        for (int i = 0; i < arrayen.length; i++){
            
            
            for(int j = 0; j < arrayen.length; j++){
                 if (arrayen[i] == arrayen[j]){
                     found=true;
                     
                 }
                 if (found){
                    counter++;
                 }
            }
            found=false;
        }
        return counter;
    }
    
    
    
}