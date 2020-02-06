package linux.maze.runner.web.controllers;

import linux.maze.runner.web.domain.model.decorator.Answer;
import linux.maze.runner.web.domain.model.decorator.DrawableDecorator;
import linux.maze.runner.web.dtos.BaseDto;
import linux.maze.runner.web.dtos.DrawableDto;
import linux.maze.runner.web.persistence.entities.DrawableEntity;
import linux.maze.runner.web.service.DrawablesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/drawables")
public class DrawablesController {
    @Autowired
    private DrawablesService drawablesService;

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public DrawableDecorator getDrawable(@PathVariable(value = "id") String id) {
        System.out.println("DrawableId: " + id);

        return new Answer("Answer");
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public List<DrawableDto> getDrawables() {
        return drawablesService.getDrawables();
    }

    @RequestMapping(path = "/", method = RequestMethod.POST)
    public BaseDto saveDrawable(@RequestBody DrawableDto requestDto) {
        drawablesService.saveDrawable(requestDto);

        return requestDto;
    }
}
