package linux.maze.runner.web.domain.model.decorator;

public class Answer extends DrawableDecorator {
    private String description;

    @Override
    public String draw() {
        StringBuilder sb = new StringBuilder();
        sb
        .append(description);

        if(decorator != null) {
            sb
            .append("\t-->")
            .append(decorator.draw());
        }
        return sb.toString();
    }

    public Answer(String description) {
        this.description = description;
    }

    public Answer() {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
