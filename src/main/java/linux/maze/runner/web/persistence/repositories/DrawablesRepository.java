package linux.maze.runner.web.persistence.repositories;

import linux.maze.runner.web.persistence.entities.DrawableEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DrawablesRepository extends CrudRepository<DrawableEntity, String> {
    public List<DrawableEntity> findAll();
}
