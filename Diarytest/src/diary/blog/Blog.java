package diary.blog;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement( name = "POSTS")
public class Blog {
	
	private ArrayList<BlogPost> blog = new ArrayList<BlogPost>();
	
	public Blog(){
		
	}
	//Getter for Arraylist - blog
	public ArrayList<BlogPost> getBlog(){
		return blog;
	}
	
	@XmlElement(name = "POST")
	public void setBlog(ArrayList<BlogPost> blog){
		this.blog=blog;
	}
}
