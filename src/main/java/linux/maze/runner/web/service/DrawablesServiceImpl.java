package linux.maze.runner.web.service;

import linux.maze.runner.web.dtos.DrawableDto;
import linux.maze.runner.web.mappers.DtoToEntityMapper;
import linux.maze.runner.web.persistence.entities.Answer;
import linux.maze.runner.web.persistence.entities.DrawableEntity;
import linux.maze.runner.web.persistence.repositories.DrawablesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrawablesServiceImpl implements DrawablesService {
    @Autowired
    private DrawablesRepository drawablesRepository;

    public List<DrawableEntity> getDrawables() {
        drawablesRepository.save(new Answer("Use yum to install MySQL."));
        drawablesRepository.save(new Answer("Use binaries to install MySQL."));

        return drawablesRepository.findAll();
    }

    @Override
    public void saveDrawable(DrawableDto drawableDto) {
        DrawableEntity drawable = DtoToEntityMapper.mapDrawable(drawableDto);

        drawablesRepository.save(drawable);
    }
}
