package diary;
import java.util.Scanner;

import diary.blog.BlogManager;

public class DiaryMenu {
	

	BlogManager blogManager;
	
	public DiaryMenu(BlogManager blogManager){
		this.blogManager = blogManager;
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
	}
}