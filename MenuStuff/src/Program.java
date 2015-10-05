import menusystem.Menu;
import menusystem.MenuConsole;


public class Program {
	public Program(){
		System.out.println("-Program running-");
	}
	
	public void runProgram(){
		Menu menu = new MenuConsole("-Main Menu-");
		String[] items = {"Menu1", "Menu2", "Menu3", "Menu4"};
		((MenuConsole)menu).addMenuItems(items);
		menuSwitch(((MenuConsole)menu).printMenu());
		
	}

	public void menuSwitch(int selector){
		
		switch(selector){
		case 1:
			Menu menu = new MenuConsole("-Case 1 Menu-");
			String[] items = {"CaseMenu1", "CaseMenu2"};
			((MenuConsole)menu).addMenuItems(items);
			((MenuConsole)menu).printMenu();
			
			break;
		case 2:
			menu = new MenuConsole("-Case 2 Menu-");
			String[] items2 = {"CaseMenu3", "CaseMenu4"};
			((MenuConsole)menu).addMenuItems(items2);
			((MenuConsole)menu).printMenu();
			break;
		case 3:
			break;
		case 4:
			break;
		}
	}

}
