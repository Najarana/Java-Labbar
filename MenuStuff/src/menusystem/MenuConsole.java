package menusystem;

import java.util.Scanner;

public class MenuConsole extends Menu {

	public MenuConsole(String title) {
		super(title);
	}
	


	public void addMenuItems(String[]items){
		for(String s : items){
			this.items.add(s);
		}
		createMenu();
	}
	
	public void createMenu(){
		for(int i = 0; i<items.size(); i++){
			//System.out.println((i+1)+". "+items.get(i) );
			forMenu.add((i+1)+". "+items.get(i));
		}
	}
	
	public int printMenu(){
		System.out.println(title);
		for(String s : forMenu){
			System.out.println(s);
		}
		int selector = menuControl();
		return selector;
	}
	
	public int menuControl(){
		System.out.print("Enter choice: ");
		Scanner s = new Scanner(System.in);
		int selection;
		try{
			selection = s.nextInt();
		}catch(Exception e){
			System.out.println("Enter a valid option");
			selection = menuControl();
		}
		return selection;
		
	}
	
	public void menuSwitch(){
		
	}
	
	

	public void customShortCut(){
		
	}


}
