package hello;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
    private TopicService topicService;


    @RequestMapping("/topics")
    public List<Topic> all_topics() {

        return topicService.getAllTopicList();
    }

    @GetMapping("/topics/{id}")
    public Topic getTopic(@PathVariable("id") String id) {
        return topicService.getTopic(id);
    }


    @PostMapping("/topics/topics")
    public  List<Topic> addTopic(@RequestBody Topic topic) {
        return topicService.addTopic(topic);

    }


    @PutMapping("/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable("id") String id) {
        topicService.updateTopic(topic, id);
    }

    @DeleteMapping("/topics/{id}")
    public void deleteTopic(@PathVariable("id") String id) {
        topicService.deleteTopic(id);
    }
	
}

// build trigger!
/*public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	
	 * @RequestMapping("/greeting") public Greeting
	 * greeting(@RequestParam(value="name", defaultValue="World") String name) {
	 * return new Greeting(counter.incrementAndGet(), String.format(template,
	 * name)); }
	 
	
	@GetMapping("/greeting")
	
	 * public Greeting greeting1(@RequestParam(value="name",
	 * defaultValue="World How are you?") String name) { return new
	 * Greeting(counter.incrementAndGet(), String.format(template, name)); }
	 
	@PutMapping("/greetings")
	public Greeting greeting2(@RequestParam(value="name", defaultValue="World") String name) {
		return new Greeting(counter.incrementAndGet(),
							String.format(template, name));
	}
}*/
