package hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
@Service
public class TopicService {
	
	TopicDao dao;
	private List<Topic> topicList = new ArrayList<>(Arrays.asList(

            new Topic("_spring", "_Spring FrameWork", "_Spring Description"),
            new Topic("spring", "Spring FrameWork", "Spring Description"),
            new Topic("java", "Java FrameWork", "Java Description")

    ));
	
	public void createTopic() {
		dao.saveAll(topicList);
	}
	public List<Topic> getAllTopicList() {
        return dao.findAll();
    }

    public Optional<Topic> getTopic(String id) {
        return dao.findById(id);
    }


    public void addTopic(Topic topic) {
        dao.save(topic);
    }


	/*
	 * public void updateTopic(Topic topic, String id) { int counter = 0; for (Topic
	 * topic1 : topicList) { if (topic1.getId().equals(id)) { topicList.set(counter,
	 * topic); } counter++; } }
	 */
    public void updateTopic(Topic topic) {
    	dao.save(topic);
    }

    public void deleteTopic(String id) {
        dao.deleteById(id);
    }
}
