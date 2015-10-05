package menusystem;

import java.util.ArrayList;

public class Menu {
	int selector;
	String title;
	ArrayList<String> items;
	ArrayList<String> forMenu;
	
	public Menu(String title) {
		this.title = title;
		items = new ArrayList<String>();
		forMenu = new ArrayList<String>();
	}
	
	
}
