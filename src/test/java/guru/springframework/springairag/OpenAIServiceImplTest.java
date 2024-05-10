package guru.springframework.springairag;

import guru.springframework.springairag.model.Answer;
import guru.springframework.springairag.model.Question;
import guru.springframework.springairag.services.OpenAIService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OpenAIServiceImplTest {

    @Autowired
    OpenAIService openAIService;

    @Test
    void getAnswer() {

        final Answer answer = openAIService.getAnswer(
                new Question("Give me information about actor Tom Holland"));
        System.out.println("Got the answer");
        System.out.println(answer.answer());
    }

}