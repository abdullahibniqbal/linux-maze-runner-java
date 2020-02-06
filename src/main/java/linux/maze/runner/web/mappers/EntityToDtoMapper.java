package linux.maze.runner.web.mappers;

import linux.maze.runner.web.dtos.DrawableDto;
import linux.maze.runner.web.persistence.entities.DrawableEntity;
import org.springframework.beans.BeanUtils;

public class EntityToDtoMapper {
    public static DrawableDto mapDrawable(DrawableEntity entity) {
        DrawableDto dto = new DrawableDto();

        BeanUtils.copyProperties(entity, dto);

        return dto;
    }
}
