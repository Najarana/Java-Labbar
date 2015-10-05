package diary.blog;
import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;



public class SaveToFile {
	
	File file = new File ("diary.xml");
	
	
	public void saveFile(Blog theBlog){
		
	
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Blog.class);
			Marshaller  jaxbMarshaller = jaxbContext.createMarshaller();
			
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(theBlog, file);
			
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public Blog readFile(){
		Blog blogFile = new Blog();
		if(file.exists()){
		
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Blog.class);
		
			Unmarshaller jaxbUnmarshaller;
			jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			blogFile = (Blog) jaxbUnmarshaller.unmarshal(file); 
			//postList.add(post);
			
			
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("FELMED"+e.getMessage());
		}
		
		
		
	}
		return blogFile;
	}

}
