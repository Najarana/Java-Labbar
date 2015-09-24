package diary;
import java.util.Scanner;

import diary.blog.BlogManager;

public class DiaryMenu {
	

	BlogManager blogManager = new BlogManager();
	
	public DiaryMenu(){
		
	}

	public int mainMenu(){
		boolean finished = false;
		Scanner i = new Scanner(System.in);
		//do{
		System.out.println("");
		System.out.println("\n - Diary - ");
		blogManager.sortPosts();
		blogManager.printPosts();
		
		
		System.out.println("\n - Diary options -");
		System.out.println("1. Read post");
		System.out.println("2. New post");
		System.out.println("3. Edit post");
		System.out.println("4. Remove post");
		System.out.println("5. Search diary");
		System.out.println("6. Exit");
		System.out.println("\nChoose option:");
		
		int choice = i.nextInt();
		return choice;
//		finished = menuSwitch(choice);
//		//}while(!finished);
//		return finished;
		
		
	}
	
//	public boolean menuSwitch(int choice){
//		int postIndex = 0;
//		String title = "";
//		String content = "";
//		String tag = "";
//		switch(choice){
//		
//		case 1: 
//			System.out.println("Enter number of the post you wish to read");
//			postIndex = i.nextInt()-1;
//			blogManager.readPrint(postIndex);
//			break;
//			
//		case 2: 
//			System.out.print("Enter title: ");
//			title = s.nextLine();
//			System.out.print("Enter content: ");
//			content = s.nextLine();
//			System.out.print("Enter tag: ");
//			tag = s.nextLine();
//			blogManager.createPost(title, content, tag);
//			break;
//			
//		case 3:
//			System.out.println("Enter number of the post you wish to update");
//			postIndex = i.nextInt()-1;
//			System.out.println(" - Current Post - ");
//			blogManager.readPrint(postIndex);
//			System.out.println("Enter new title: ");
//			title = s.nextLine();
//			System.out.println("Enter new text: ");
//			content = s.nextLine();
//			blogManager.updatePost(postIndex, title, content);
//			break;
//			
//		case 4:
//			System.out.println("Enter number of the post you wish to remove");
//			postIndex = i.nextInt()-1;
//			System.out.println(" - Current Post - ");
//			blogManager.readPrint(postIndex);
//			blogManager.removePost(postIndex);
//			break;
//			
//		case 5:
//			System.out.print("Choose what to search for. ");
//			System.out.println("1. Title | 2.Tag | 3.Date");
//			choice = i.nextInt();
//			blogManager.searchBlog(choice);
//			break;
//		
//		default:
//			return true;
//			
//		}
//		return false;
//		
//	}

}
