package linux.maze.runner.web.service;

import linux.maze.runner.web.dtos.DrawableDto;
import linux.maze.runner.web.mappers.DtoToEntityMapper;
import linux.maze.runner.web.mappers.EntityToDtoMapper;
import linux.maze.runner.web.persistence.entities.Answer;
import linux.maze.runner.web.persistence.entities.DrawableEntity;
import linux.maze.runner.web.persistence.repositories.DrawablesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DrawablesServiceImpl implements DrawablesService {
    @Autowired
    private DrawablesRepository drawablesRepository;

    public List<DrawableDto> getDrawables() {
        List<DrawableEntity> drawableEntities = drawablesRepository.findAll();

        List<DrawableDto> drawableDtos = new ArrayList<DrawableDto>();
        drawableEntities.forEach(entity -> drawableDtos.add(EntityToDtoMapper.mapDrawable(entity)));

        return drawableDtos;
    }

    @Override
    public void saveDrawable(DrawableDto drawableDto) {
        DrawableEntity drawableEntity = DtoToEntityMapper.mapDrawable(drawableDto);

        drawablesRepository.save(drawableEntity);
    }
}
