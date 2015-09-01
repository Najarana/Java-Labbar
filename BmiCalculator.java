import java.util.Scanner;

public class BmiCalculator{
    public static void main (String [] args){
        
                      
        double[] values = getValues();
        int bmi = calcBmi(values[0], values[1]);
        System.out.println("Your BMI is : "+bmi);
        
    }
    
    
    public static int calcBmi(double weight, double height){
        double bmiDouble = weight/(height*height);
        int bmiResult = roundDouble(bmiDouble);
        return bmiResult;
        
    } 
    
    
    public static double[] getValues(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Please input first value: ");
        double weight=reader.nextDouble();
        System.out.print("Please second first value: ");
        double height=reader.nextDouble();
        double[] values = {weight,height};                
        return values;
        }
        
    public static int roundDouble(double x){
        int result = (int)(x+0.5);
        return result;
    }
    
}