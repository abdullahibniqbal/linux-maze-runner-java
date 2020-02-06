package linux.maze.runner.web.persistence.entities;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "drawableType", discriminatorType = DiscriminatorType.INTEGER)
public class DrawableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected String id;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    protected DrawableEntity decorator;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DrawableEntity getDecorator() {
        return decorator;
    }

    public void setDecorator(DrawableEntity decorator) {
        this.decorator = decorator;
    }
}
