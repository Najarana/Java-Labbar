import java.util.Scanner;
public class IntSortArray{
    
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the amount of numbers to be sorted: ");
		int length = s.nextInt();
		int[] rawArray = new int[length];
		
		System.out.print("Enter "+length+" numbers: ");
		for (int i = 0; i < length; i++){ 
			rawArray[i] = s.nextInt();
			}
		//int[] rawArray = {5,6,7,3,2,4};
		int[] sorted = sortArray(rawArray);
		for(int i = 0; i < sorted.length; i++){
			System.out.print(sorted[i]);
		}
		
	}
	
	public static int[] sortArray(int[] array) {
		int[] sortedArray = array;
		int temp;
		boolean sorter = true;
		int counter = 0;
		
		while(sorter){
			sorter = false;
			for(int i = 0; i < array.length-1; i++){
				if(array[i]<array[i+1]){
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					sorter=true;
				}
				
			
			}
			
		}
		return sortedArray;			
				
		
	}
}
