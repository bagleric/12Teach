
import java.util.ArrayList;
import java.util.List;


public class adapter implements SocialMediaEntry{

    private String description;
	private String author;
    private String title;

    public adapter() {
        author = "";
        title = "";
		description = "";
    }
    
    public adapter(String author, String title, String description) {
		
        this.author = author;
        this.title = title + " " + description;
		this.description = description;
    }
         
    public String getUser() {
        return author;
    }

    public void setUser(String author) {
        this.author = author;
    }

    public String getPostText() {
        return title;
    }

    public void setPostText(String title) {
        this.title = title;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
} 