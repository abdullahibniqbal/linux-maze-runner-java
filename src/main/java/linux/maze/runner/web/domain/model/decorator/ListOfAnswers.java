package linux.maze.runner.web.domain.model.decorator;

import java.util.ArrayList;
import java.util.List;

public class ListOfAnswers extends DrawableDecorator {
    private List<Answer> answers;

    @Override
    public String draw() {
        StringBuilder sb = new StringBuilder();
        sb
        .append("Answers: ");

        for(Integer index = 0; index < answers.size(); index++) {
            Answer answer = answers.get(index);

            sb.append((index + 1) + ". " + answer.draw());
        }
        return sb.toString();
    }

    public void addAnswer(Answer answer) {
        this.answers.add(answer);
    }

    public ListOfAnswers() {
        answers = new ArrayList<Answer>();
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}
