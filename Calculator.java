import java.util.Scanner;
import java.util.Locale;
public class Calculator{
    public static void main(String[] args){
        double [] values;
        int choice;
        double result =0;
        Scanner reader = new Scanner(System.in);
        
        System.out.println(" - Calculator Running - ");
        do{
                       
            System.out.println("Which operation would you like to perform: \n1.Addition \n2.Subtraction \n3.Multiplication  \n4. Division \n5. Quit");
            choice = reader.nextInt();
            do{
                switch(choice){
                    case 1: 
                        values = getValues();
                        result = addition(values[0], values[1]);
                    break;
                    
                    case 2: 
                        values = getValues();
                        result = subtraction(values[0], values[1]);
                    break;
                    
                    case 3:
                        values = getValues();
                        result = multiplication(values[0], values[1]);
                    break;
                    
                    case 4: 
                        values = getValues();
                        result = division(values[0], values[1]);
                    break;
                    
                    case 5: 
                        System.out.println("Closing Calculator");
                        System.exit(0);
                        break;
                                                   
                    default:
                        System.out.println("Please enter a number from 1 to 5");                        
                }
                
            }while(choice>5 && choice >0);
            System.out.println("Result: "+ result);
             
        }while(choice!=5);
         
    }   
    
        public static double addition(double x, double y){
              double result = x+y;
              return result;
        }
        
        public static double subtraction(double x, double y){
              double result = x-y;
              return result;
        }
        
        public static double multiplication(double x, double y){
              double result = x*y;
              return result;
        }
        
        public static double division(double x, double y){
              double result = x/y;
              return result;
        }
        
        public static double[] getValues(){
                Scanner reader = new Scanner(System.in);               
                reader.useLocale(Locale.ENGLISH);
                System.out.print("Please input first value: ");
                double value1=reader.nextDouble();
                System.out.print("Please second first value: ");
                double value2=reader.nextDouble();
                double[] values = {value1,value2};                
                return values;
        }
    
    }
                  
