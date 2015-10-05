package diary.blog;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "POSTS")
public class Blog {

	private ArrayList<BlogPost> blogList = new ArrayList<BlogPost>();

	public Blog() {
		

	}

	public ArrayList<BlogPost> getBlog() {
		return blogList;
	}

	@XmlElement(name = "POST")
	public void setBlog(ArrayList<BlogPost> blog) {
		this.blogList = blog;
	}
}
