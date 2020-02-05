package linux.maze.runner.web.mappers;

import linux.maze.runner.web.dtos.DrawableDto;
import linux.maze.runner.web.persistence.entities.DrawableEntity;
import org.springframework.beans.BeanUtils;

public class DtoToEntityMapper {
    public static DrawableEntity mapDrawable(DrawableDto dto) {
        DrawableEntity drawableEntity = new DrawableEntity();

        BeanUtils.copyProperties(dto, drawableEntity);

        return drawableEntity;
    }
}
