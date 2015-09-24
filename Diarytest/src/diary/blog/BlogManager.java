package diary.blog;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;

public class BlogManager {

	private DateFormat df;
	private Calendar calobj;
	private Scanner scan;
	private Blog blog;
	private SaveToFile fileSave;
	

	public BlogManager() {
		this.df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		this.scan = new Scanner(System.in);
		this.fileSave = new SaveToFile();
		this.blog = fileSave.readFile();
	}

	
	public void searchAll (){
		System.out.print("Enter title or part of title to search for: ");
		String search = scan.nextLine();
		boolean found = false;
		for (int i = 0; i < blog.getBlog().size(); i++) {
			String title = blog.getBlog().get(i).getTitle();
			title = title.toLowerCase();
			search = search.toLowerCase();

			if (title.contains(search)) {
				System.out.println(" -Post found- ");
				readPrint((i));
				found = true;
			}

		}
		
		for (int i = 0; i < blog.getBlog().size(); i++) {

			for (int j = 0; j<blog.getBlog().get(i).getTags().size(); j++){
				String tag = blog.getBlog().get(i).getTags().get(j);
				tag = tag.toLowerCase();
				search = search.toLowerCase();
				if (tag.equals(search)) {
					System.out.println(" -Post found- ");
					readPrint((i));
					found = true;
				}
			}
		
		}
		
		for (int i = 0; i < blog.getBlog().size(); i++) {
			Date date = blog.getBlog().get(i).getDate();
			search = search.toLowerCase();
			String dateFormat = df.format(date);
			
			 if(dateFormat.contains(search)){
			 System.out.println(" -Post found- ");
			 readPrint((i));
			 found=true;
			 }

		}
		
		if (!found) {
			System.out.println("No post with that title");
		}
		
		
	}
	public void searchBlog(int choice) {

		switch (choice) {
		case 1:
			titleSearch();
			break;

		case 2:
			tagSearch();
			break;

		case 3:
			dateSearch();
			break;
		}
	}

	public void titleSearch() {
		System.out.print("Enter title or part of title to search for: ");
		String search = scan.nextLine();
		boolean found = false;
		for (int i = 0; i < blog.getBlog().size(); i++) {
			String title = blog.getBlog().get(i).getTitle();
			title = title.toLowerCase();
			search = search.toLowerCase();

			if (title.contains(search)) {
				System.out.println(" -Post found- ");
				readPrint((i));
				found = true;
			}

		}
		if (!found) {
			System.out.println("No post with that title");
		}
	}

	public void tagSearch() {
		System.out.print("Enter tag to search for: ");
		String search = scan.nextLine();
		boolean found = false;
		for (int i = 0; i < blog.getBlog().size(); i++) {
			String tag = blog.getBlog().get(i).getTags().get(i);
			tag = tag.toLowerCase();
			search = search.toLowerCase();

			if (tag.equals(search)) {
				System.out.println(" -Post found- ");
				readPrint((i));
				found = true;
			}

		}
		if (!found) {
			System.out.println("No post with that title");
		}
	}

	public void dateSearch() {
		System.out.println("Enter date or part of date using date/month/year hour:minute:seconds format");
		String search = scan.nextLine();
		// Date dater = calobj.getTime();
		boolean found = false;
		for (int i = 0; i < blog.getBlog().size(); i++) {
			Date date = blog.getBlog().get(i).getDate();
			search = search.toLowerCase();
			String dateFormat = df.format(date);
			
			 if(dateFormat.contains(search)){
			 System.out.println(" -Post found- ");
			 readPrint((i));
			 found=true;
			 }

		}
		if (!found) {
			System.out.println("No post with that title");
		}
	}

	// Creates a new BlogPost, inserts BlogPost into ArrayList - blog
	public void createPost(String title, String content, String tag) {
		calobj = Calendar.getInstance();
		Date dater = calobj.getTime();
		BlogPost newPost = new BlogPost(dater, title, content);
		blog.getBlog().add(newPost);
		fileSave.saveFile(blog);
		System.out.println("- Post created - ");

	}

	// Updates(replaces) BlogPost at int index with new title and content
	public void updatePost(int index, String newTitle, String newContent) {
		calobj = Calendar.getInstance();
		Date dater = calobj.getTime();

		// Copy of referenced BloggPost object
		BlogPost editPost = blog.getBlog().get(index);
		editPost.setContent(newContent);
		editPost.setTitle(newTitle);
		editPost.setDate(dater);

		// Replacing previous BloggPost in blogg Arraylist
		blog.getBlog().set(index, editPost);
		fileSave.saveFile(blog);
		System.out.println("- Post updated - ");

	}

	// Removes BlogPost object at int index
	public void removePost(int index) {
		blog.getBlog().remove(index);
		System.out.println("- Post removed - ");
	}

	// Prints a list with all BlogPost titles and datetime
	public void printPosts() {
		int counter = 1;
		for (BlogPost b : blog.getBlog()) {
			String title = b.getTitle();
			Date date = b.getDate();
			String dateFormat = df.format(date);
			System.out.println(counter + ": " + title + " | Date: " + dateFormat);
			counter++;
		}

	}

	// Prints BlogPost with int index.
	public void readPrint(int index) {
		blog.getBlog().get(index).print();
	}

	// Sorts array after date by using a mirrored Date ArrayList bubblesorts
	// both arrays with same index
	public void sortPosts() {

		for (int i = 0; i < blog.getBlog().size(); i++) {
			for (int j = 0; j < blog.getBlog().size(); j++) {
				
				if (blog.getBlog().get(i).getDate().compareTo(blog.getBlog().get(j).getDate()) > 0) {

					BlogPost tempPost = blog.getBlog().get(i);
					blog.getBlog().set(i, blog.getBlog().get(j));
					blog.getBlog().set(j, tempPost);
				}
			}
		}
		fileSave.saveFile(blog);
		

	}

	public int getBlogSize(){
		return blog.getBlog().size(); 
	}
}
