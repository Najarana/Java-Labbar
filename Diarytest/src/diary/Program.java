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
		DiaryMenu menu = new DiaryMenu();
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
		int postIndex = i.nextInt();
		blogManager.readPrint(postIndex);
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
		boolean hasInt = false;
		do {
			if (i.hasNextInt()) {
				int input = i.nextInt();
				if (input > 0 && input < blogManager.getBlogSize()+1) {
					postIndex = i.nextInt() - 1;
					hasInt = true;
				}

			} else {
				System.out.println("Not a valid post number!");
			}

		} while (!hasInt);
		System.out.println(" - Current Post - ");
		blogManager.readPrint(postIndex);
		System.out.println("Enter new title: ");
		String title = s.nextLine();
		System.out.println("Enter new text: ");
		String content = s.nextLine();
		blogManager.updatePost((postIndex), title, content);
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

}
