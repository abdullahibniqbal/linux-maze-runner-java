package linux.maze.runner.web.domain.model.decorator;

public class Link extends DrawableDecorator {
    private String url;

    @Override
    public String draw() {
        StringBuilder sb = new StringBuilder();

        sb
        .append(url);

        if(decorator != null) {
            sb
            .append("\t-->")
            .append(decorator.draw());
        }

        return sb.toString();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
