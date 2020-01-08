package hello;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicDao extends MongoRepository<Topic, String> {

}
