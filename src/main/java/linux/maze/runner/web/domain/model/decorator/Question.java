package linux.maze.runner.web.domain.model.decorator;

public class Question extends DrawableDecorator {
    private String title;
    private String description;

    @Override
    public String draw() {
        StringBuilder sb = new StringBuilder();
        sb
        .append(title);

        if(decorator != null) {
            sb
            .append("\t-->")
            .append(decorator.draw());
        }

        return sb.toString();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
