import java.util.Scanner;
public class Reverser{
    
    public static void main(String[] args){
        Scanner integer = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        int choice = 0;
        int result = 0;
        do{
           System.out.print("Välj: \n1. Reverse \n2. Count char \n3. Count words \n4. Count unique \n:");
            choice = integer.nextInt();
            String text="";         
            char[] chars = new char[0];
            
          switch(choice){
              case 1: 
              System.out.print("Skriv in en text: ");
              text = s.nextLine();
              chars = text.toCharArray();
              String reverse = reverseString(chars);
              System.out.println (text+" är " + reverse+ " baklänges");
                if (text.equals (reverse)){
                    System.out.println("Palindrom yo!");
                }
            break;
                
            case 2: 
                System.out.print("Skriv in en text: ");
                text =s.nextLine();
                chars = text.toCharArray();
                System.out.print("Skriv in ett tecken att räkna: ");
                char tecken = s.next().charAt(0);
                System.out.println(tecken);
                result = charCounter(chars, tecken);
                System.out.println("Det finns "+result+"st " + tecken);
              break;
            
            case 3:
                System.out.print("Skriv in en text: ");
                text =s.nextLine();
                chars = text.toCharArray();
                result= wordCounter(chars);
                System.out.println("Det finns " + result + " i texten");
                break;
            
            case 4:
                System.out.print("Skriv in en text: ");
                text =s.nextLine();
                chars = text.toCharArray();
                result= wordCounter(chars);
                System.out.println("Det finns " + result + " i texten");
                break;    
                
            case 5:
                System.exit(0);
              
              default:
                System.out.println("Fel val");
          }
       }while(choice != 5);
    }
    
    public static String reverseString(char[] arrayen){
        String reverse = "";
        
        for (int i = arrayen.length-1; i >= 0; i-- ){
            reverse += arrayen[i];
        }
        return reverse;
    }
    
     public static int charCounter(char[] arrayen, char tecken){
        int count = 0;
        
        for (int i =0; i < arrayen.length; i++){
            if(arrayen[i] == tecken){
                count++;
            }
             
        }
        return count;
    }
    
    public static int wordCounter(char[] arrayen){
        int count = 1; //always at least one word
        if(arrayen[0]== ' '){
                count--;
        }
        
        for (int i =0; i < arrayen.length; i++){

            if(i != arrayen.length-1){
                
                if(arrayen[i] ==' ' && arrayen[i+1] != ' '){
                    count++;
                }
            }
        }        
        return count;
    }
    
    public static int uniqueCounter(char[] arrayen){
        
        for (int i = 0; i < arrayen.length; i++){
            char temp_char = arrayen[i];
            
            for(int j = 0; j < i; j++){
                 if (arrayen[j] == temp_char){
                     count++
                     
                 }
                
            }
            
        }
    
}
