package linux.maze.runner.web.domain.model.decorator;

import org.apache.catalina.manager.host.HostManagerServlet;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class DecoratorTest {
    @Test
    public void testQuestion() {
        Question question = new Question();
        question.setTitle("How to install MySQL in CentOS7?");
        question.setDescription("I have installed so and so dependencies...");

        Answer answer = new Answer();
        answer.setDescription("Install MySQL using yum.");

        Comment comment = new Comment();
        comment.setText("Installing with yum worked on my machine");

        question.setDecorator(answer);
        answer.setDecorator(comment);

        System.out.println(question.draw());

        assert("How to install MySQL in CentOS7?\t-->Install MySQL using yum.\t-->Installing with yum worked on my machine".equals(question.draw()));
        assert(question.draw().equals(question.getTitle() + "\t-->" +
                answer.getDescription() + "\t-->" +
                comment.getText()));
    }

    @Test
    public void testListOfAnswers() {
        Question question = new Question();
        question.setTitle("How to install MySQL in CentOS7?");
        question.setDescription("I have installed so and so dependencies...");

        ListOfAnswers listOfAnswers = new ListOfAnswers();
        listOfAnswers.addAnswer(new Answer("Install using yum."));
        listOfAnswers.addAnswer(new Answer("Install using apt-get"));

        Answer controversialAnswer = new Answer("Install using binaries, not yum");

        Comment comment = new Comment();
        comment.setText("Why would we not use the yum installer?");

        controversialAnswer.setDecorator(comment);
        listOfAnswers.addAnswer(controversialAnswer);

        question.setDecorator(listOfAnswers);

        System.out.println(question.draw());

        assert(question.draw().equals("How to install MySQL in CentOS7?\t-->Answers: 1. Install using yum.2. Install using apt-get3. Install using binaries, not yum\t-->Why would we not use the yum installer?"));
    }
}
