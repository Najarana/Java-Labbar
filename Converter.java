import java.util.Scanner;
import java.util.Locale;

public class Converter{
    public static void main (String[] args){
        
        int choice = 0;
        double temp = 0;
        double result = 0;
        double length = 0;
        double weight = 0;
        
        Scanner reader = new Scanner(System.in);
        reader.useLocale(Locale.ENGLISH);
        System.out.println("What do you want to convert?");
        System.out.print("1. Temperature \n2. Measurements \n3. Weight \n");
        choice = reader.nextInt();
        
        
        
        
        switch(choice){
            case 1:
                do{
                    System.out.print("Choose: \n1. Celsius -> Fahrenheit \n2. Celsius -> Kelvin"+
                                               " \n3. Fahrenheit -> Celsius \n4. Kelvin -> Celsius \n");
                    choice = reader.nextInt();
                    
                    switch(choice){
                        case 1:
                            System.out.print("Input temperature value: ");
                            temp = reader.nextDouble();
                            //String tempFormat = Integer.toString((int)temp);
                            result = convertCtoF(temp);
                            //String resFormat = Integer.toString((int)result);
                            System.out.println("Temperature C:"+temp+" equals F:" + result);
                        break;
                        
                        case 2: 
                            System.out.print("Input temperature value: ");
                            temp = reader.nextDouble();
                            result = convertCtoK(temp);
                            System.out.println("Temperature C:"+temp+" equals K:" + result);
                        break;
                        
                        case 3: 
                            System.out.print("Input temperature value: ");
                            temp = reader.nextDouble();
                            result = convertFtoC(temp);
                            System.out.println("Temperature F:"+temp+" equals C:" + result);
                        break;
                        
                        case 4:
                            System.out.print("Input temperature value: ");
                            temp = reader.nextDouble();
                            result = convertKtoC(temp);
                            System.out.println("Temperature K:"+temp+" equals C:" + result);
                        break;
                        
                        case 5:
                            System.out.print("Back");                        
                        break;
                        
                        default: System.out.println("Choose an option 1-5");
                        
                       
                    }
                    
                }while(choice !=5);
                break;
            
            case 2:
                do{
                System.out.print("Choose: \n1. Meter -> Yard \n2. Yard->Meter \n3. Inch-Centimeter \n4. Centimeter->Inch \n5. Back \n");
                choice = reader.nextInt();
                switch(choice){
                    case 1:
                        System.out.print("Enter measurement in metres: ");
                        length = reader.nextDouble();
                        result = convertMtoY(length);
                        System.out.println(length+"metres equals "+result+" yards.");
                    break;
                    
                    case 2:
                        System.out.print("Enter measurement in yards: ");
                        length = reader.nextDouble();
                        result = convertYtoM(length);
                        System.out.println(length+"yards equals "+result+" metres.");
                    break;

                    case 3:
                        System.out.print("Enter measurement in Inches: ");
                        length = reader.nextDouble();
                        result = convertInToCm(length);
                        System.out.println(length+"Inches equals "+result+" Centimeters.");
                        break;
                    
                    case 4: 
                        System.out.print("Enter measurement in cm: ");
                        length = reader.nextDouble();
                        result = convertCmToIn(length);
                        System.out.println(length+"centimeters equals "+result+" inches.");
                        break;
                    
                    case 5:
                            System.out.print("Back");                        
                        break;
                        
                        default: System.out.println("Choose an option 1-5");
                
                }
                
            }while(choice!=5);
            break;
            
            case 3: 
            do{
                System.out.print("Choose: \n1. Pound -> Kilogram \n2. Ounce->Gram \n3. Ton-> Pound \n4. Back \n");
                choice = reader.nextInt();
                
                switch(choice){
                    case 1: 
                        System.out.print("Enter weight in pounds: ");
                        weight = reader.nextDouble();
                        result = convertPdToKg(weight);
                        System.out.println(weight+"pounds equals "+result+" kilograms.");
                        break;
                        
                    case 2: 
                        System.out.print("Enter weight in ounces: ");
                        weight = reader.nextDouble();
                        result = convertOzToG(weight);
                        System.out.println(weight+"pounds equals "+result+" grams.");
                        break;
                    
                    case 3: 
                        System.out.print("Enter weight in ounces: ");
                        weight = reader.nextDouble();
                        result = convertTonToPound(weight);
                        System.out.println(weight+"Tonnes equals "+result+" pounds.");
                        break;
                    
                    case 4: 
                        System.out.println("Back");
                        break;
                    
                    default: System.out.println("Choose an option 1-4");
                        
                        
                }
                
            }while(choice!=4);
            case 4: 
                System.exit(0);
                break;
             
            default: System.out.println("Choose an option 1-4");
            
        }while(choice!=4);
    
    }
    public static double convertCtoF(double temp){
        double fahrTemp = temp*9/5+32;
        return fahrTemp;
    }
    
    public static double convertCtoK(double temp){
        double kelvinTemp = temp+273.15;
        return kelvinTemp;
    }
    
    public static double convertFtoC(double temp){
        double celcTemp = (temp-32)*5/9;
        return celcTemp;
    }
    
    public static double convertKtoC(double temp){
        double celcTemp = temp-273.15;
        return celcTemp;
   }
    
    public static double convertMtoY(double measurement){
        double yard = measurement*1.0936;
        return yard;
    }
    
    public static double convertYtoM(double measurement){
        double metre = measurement/1.0936;
        return metre;
    }
    
    public static double convertInToCm(double measurement){
        double cm = measurement/0.39370;
        return cm;
    }
    
    public static double convertCmToIn(double measurement){
        double inch = measurement*0.39370;
        return inch;
    }
    
    public static double convertPdToKg(double weight){
        double kg = weight/2.2046;
        return kg;
    }
    
    public static double convertOzToG(double weight){
        double gram = weight/0.035274;
        return gram;
    }
    
    public static double convertTonToPound(double weight){
        double pound = weight*2204.6;
        return pound;
    }
}