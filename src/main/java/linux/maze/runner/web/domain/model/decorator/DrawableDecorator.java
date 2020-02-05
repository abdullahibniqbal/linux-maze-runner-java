package linux.maze.runner.web.domain.model.decorator;

public abstract class DrawableDecorator {
    protected DrawableDecorator decorator;

    public abstract String draw();

    public DrawableDecorator getDecorator() {
        return decorator;
    }

    public void setDecorator(DrawableDecorator decorator) {
        this.decorator = decorator;
    }
}
