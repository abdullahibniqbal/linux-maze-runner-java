package linux.maze.runner.web.domain.model.decorator;

public class Comment extends DrawableDecorator {
    private String text;

    @Override
    public String draw() {
        StringBuilder sb = new StringBuilder();
        sb
        .append(text);

        if(decorator != null) {
            sb
            .append("\t-->")
            .append(decorator.draw());
        }

        return sb.toString();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
