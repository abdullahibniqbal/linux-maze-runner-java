package linux.maze.runner.web.persistence.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("1")
public class Answer extends DrawableEntity {
    private String description;

    public Answer(String description) {
        this.description = description;
    }

    public Answer() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
