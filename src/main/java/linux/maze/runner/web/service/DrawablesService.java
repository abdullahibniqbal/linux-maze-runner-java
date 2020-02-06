package linux.maze.runner.web.service;

import linux.maze.runner.web.dtos.DrawableDto;
import linux.maze.runner.web.persistence.entities.DrawableEntity;

import java.util.List;

public interface DrawablesService {
    public List<DrawableDto> getDrawables();
    public void saveDrawable(DrawableDto drawableDto);
}
