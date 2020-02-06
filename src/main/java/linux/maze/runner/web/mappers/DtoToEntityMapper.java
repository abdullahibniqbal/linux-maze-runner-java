package linux.maze.runner.web.mappers;

import linux.maze.runner.web.dtos.DrawableDto;
import linux.maze.runner.web.persistence.entities.Answer;
import linux.maze.runner.web.persistence.entities.DrawableEntity;
import linux.maze.runner.web.persistence.entities.Question;
import org.springframework.beans.BeanUtils;

public class DtoToEntityMapper {
    public static DrawableEntity mapDrawable(DrawableDto dto) {
        DrawableEntity drawableEntity = createEntity(dto);

        BeanUtils.copyProperties(dto, drawableEntity);

        if(dto.getDrawable() != null) {
            drawableEntity.setDecorator(mapDrawable(dto.getDrawable()));
        }

        return drawableEntity;
    }

    private static DrawableEntity createEntity(DrawableDto dto) {
        DrawableEntity entity;
        if("answer".equals(dto.getDtoType())) {
            entity = new Answer();
        }
        else if("question".equals(dto.getDtoType())) {
            entity = new Question();
        }
        else {
            throw new IllegalArgumentException();
        }
        return entity;
    }
}
