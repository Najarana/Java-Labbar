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
        boolean foundIt = false;
        char[] found = new char[30];

        
        for (int i = 0; i < arrayen.length; i++){
            char temp = arrayen[i];
            
            for(int j = 0; j < found.length; j++){
                 if (temp == found[j]){
                    foundIt=true; 
					break; 
                 }
				 else{foundIt=false;}
			 
                 
            }
			if(foundIt == false){
				found[counter] = arrayen[i];
				System.out.println(found[counter]);
				counter++;
			}
			
            foundIt=false;
        }
		char[] unique = new char[counter];
		System.arraycopy(found, 0, unique, 0, counter);
		String temp = new String(unique);
		System.out.println(temp);
		int result = unique.length;
		
        return result;
    }
    
    
    
}