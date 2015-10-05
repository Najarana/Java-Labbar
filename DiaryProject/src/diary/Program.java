package diary;

import diary.blog.*;
import java.util.Scanner;

public class Program {
	
	public BlogManager blogManager;
	Scanner i = new Scanner(System.in);
	Scanner s = new Scanner(System.in);

	public Program() {
		System.out.println("- Welcome to the blogg -");
		this.blogManager = new BlogManager();

		runProgram();

	}

	// public void runProgram(){
	// boolean loop;
	// do{
	// loop = menu.mainMenu();
	// }while(!loop);
	// }
	public void runProgram() {
		DiaryMenu menu = new DiaryMenu(blogManager);
		int choice;
		boolean exit;
		do {
			choice = menu.mainMenu();
			exit = menuSwitch(choice);
		} while (!exit);
	}

	public boolean menuSwitch(int choice) {
		int postIndex = 0;
		String title = "";
		String content = "";
		String tag = "";
		switch (choice) {

		case 1:
			menuReadPost();
			break;

		case 2:
			menuCreatePost();
			break;

		case 3:
			menuUpdatePost();
			break;

		case 4:
			menuRemovePost();
			break;

		case 5:
			menuSearchDiary();
			break;

		default:
			return true;

		}
		return false;

	}

	public void menuReadPost() {
		System.out.println("Enter number of the post you wish to read");
		try{
			int postIndex = i.nextInt()-1;
			blogManager.readPrint(postIndex);
		}catch(Exception e){
			System.out.println("Invalid input. Must input a number.");
			i.next();
			menuReadPost();
		}
		
		
		
	}

	public void menuCreatePost() {
		System.out.print("Enter title: ");
		String title = s.nextLine();
		System.out.print("Enter content: ");
		String content = s.nextLine();
		System.out.print("Enter tag: ");
		String tag = s.nextLine();
		blogManager.createPost(title, content, tag);
	}

	public void menuUpdatePost() {
		int postIndex = 0;
		System.out.println("Enter number of the post you wish to update");
		try{
			postIndex = i.nextInt()-1;
			blogManager.readPrint(postIndex);
		}catch(Exception e){
			System.out.println("Invalid input. Must input a number.");
			i.next();
			menuUpdatePost();
		}
		System.out.println(" - Current Post - ");
		blogManager.readPrint(postIndex);
		System.out.println("Enter new title: ");
		String title = s.nextLine();
		System.out.println("Enter new text: ");
		String content = s.nextLine();
		System.out.println ("Enter new tag: ");
		String tag = s.nextLine();
		blogManager.updatePost((postIndex), title, content, tag);
	}

	public void menuRemovePost() {
		System.out.println("Enter number of the post you wish to remove");
		int postIndex = i.nextInt() - 1;
		System.out.println(" - Current Post - ");
		blogManager.readPrint(postIndex);
		blogManager.removePost(postIndex);

	}

	public void menuSearchDiary() {
		// System.out.println("Choose what to search for. ");
		// System.out.println("1. Title | 2.Tag | 3.Date");
		// int choice = i.nextInt();
		// blogManager.searchBlog(choice);
		blogManager.searchAll();

	}
	
	public static boolean isInteger(String s, int radix) {
	    Scanner sc = new Scanner(s.trim());
	    if(!sc.hasNextInt(radix)) return false;
	    sc.nextInt(radix);
	    return !sc.hasNext();
	}

}
