package diary.blog;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlType(propOrder= {"title", "content", "date", "tag", "tags"} )

@XmlRootElement( name = "POST")

public class BlogPost {
		
	private Date date;
	
	private String title;
	
	private String content;
	
	private String tag;
	
	private ArrayList<String> tags = new ArrayList<String>();
	
	//Constructors
	public BlogPost (Date createdDate, String title, String content, String tag){
		setDate(createdDate);
		setTitle(title);
		setContent(content);
		setTag(tag);
		setTags(tags);
//		this.date = createdDate;
//		this.title = title;
//		this.content = content;
//		this.tag = tag;
//		this.tags.add(tag);
		
	}
	
	public BlogPost (Date createdDate, String title, String content){
		setDate(createdDate);
		setTitle(title);
		setContent(content);
//		
//		this.date = createdDate;
//		this.title = title;
//		this.content = content;
		
	}
	
	public BlogPost(){
		
	}
	
	public void print(){
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		String dateFormat = df.format(date);
		System.out.println(title + " | Date: " + dateFormat + " | Tags" + tags);
		System.out.println(content);
	}
	
	//Setters
	@XmlAttribute(name = "CONTENT")
	public void setContent(String content){
		this.content=content;
	}
	@XmlAttribute(name = "DATE")
	public void setDate(Date date){
		this.date=date;
	}
	@XmlAttribute(name = "TITLE")
	public void setTitle(String title){
		this.title = title;
	}
	
	@XmlAttribute(name = "TAG")
	public void setTag(String tag){
		this.tag = tag;
	}
	@XmlAttribute(name = "TAGS")
	public void setTags(ArrayList<String> tags){
		tags.add(tag);
		this.tags=tags;
		
	}
	
	//Getters
	public Date getDate(){
		return date;
		
	}
	public String getContent(){
		return content;
			
	}
	public String getTitle(){
		return title;
	}
	
	public String getTag(){
		return tag;
	}
	
	public ArrayList<String> getTags(){
		return tags;
	}

}
