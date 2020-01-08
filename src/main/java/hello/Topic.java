package hello;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/*
 * public class Greeting {
 * 
 * private final long id; private final String content;
 * 
 * public Greeting(long id, String content) { this.id = id; this.content =
 * content; }
 * 
 * public long getId() { return id; }
 * 
 * public String getContent() { return content; } }
 */
@Document(collection= "topic")
public class Topic {
	
	@Id
    private String id;
    private String name;
    private String description;

    public Topic() {

    }

    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
