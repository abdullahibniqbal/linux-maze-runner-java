package linux.maze.runner.web.dtos;

public class DrawableDto extends BaseDto {
    private DrawableDto drawable;
    private String dtoType;
    private String text;
    private String title;
    private String description;
    private String url;

    public DrawableDto getDrawable() {
        return drawable;
    }

    public void setDrawable(DrawableDto drawable) {
        this.drawable = drawable;
    }

    public String getDtoType() {
        return dtoType;
    }

    public void setDtoType(String dtoType) {
        this.dtoType = dtoType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
