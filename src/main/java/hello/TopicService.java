package hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class TopicService {
	
	private List<Topic> topicList = new ArrayList<>(Arrays.asList(

            new Topic("_spring", "_Spring FrameWork", "_Spring Description"),
            new Topic("spring", "Spring FrameWork", "Spring Description"),
            new Topic("java", "Java FrameWork", "Java Description")

    ));
	
	public List<Topic> getAllTopicList() {
        return topicList;
    }

    public Topic getTopic(String id) {
        return topicList.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
    }


    public List<Topic> addTopic(Topic topic) {
        topicList.add(topic);
        return topicList;
    }


    public void updateTopic(Topic topic, String id) {
        int counter = 0;
        for (Topic topic1 : topicList) {
            if (topic1.getId().equals(id)) {
                topicList.set(counter, topic);
            }
            counter++;
        }
    }

    public void deleteTopic(String id) {
        topicList.removeIf(topic -> topic.getId().equals(id));
    }
}
