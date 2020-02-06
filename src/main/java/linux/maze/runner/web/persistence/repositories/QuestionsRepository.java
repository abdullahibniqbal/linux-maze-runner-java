package linux.maze.runner.web.persistence.repositories;

import linux.maze.runner.web.persistence.entities.Question;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface QuestionsRepository extends CrudRepository<Question, String> {
    public List<Question> findAll();
}
