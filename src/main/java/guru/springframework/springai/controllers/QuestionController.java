package guru.springframework.springai.controllers;

import guru.springframework.springai.model.Answer;
import guru.springframework.springai.model.GetCapitalRequest;
import guru.springframework.springai.model.GetCapitalResponse;
import guru.springframework.springai.model.Question;
import guru.springframework.springai.services.OpenAIService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {

    private final OpenAIService openAIService;

    public QuestionController(OpenAIService openAIService) {
        this.openAIService = openAIService;
    }

    @PostMapping("/ask")
    public Answer askQuestion(@RequestBody Question question) {
        return openAIService.getAnswer(question);

    }

    @PostMapping("/capital")
    public Answer getCapital(@RequestBody GetCapitalRequest getCapitalRequest) {
        return this.openAIService.getCapital(getCapitalRequest);
    }

    @PostMapping("/capitalWithInfo")
    public Answer getCapitalWithInfo(@RequestBody GetCapitalRequest getCapitalRequest) {
        return this.openAIService.getCapitalWithInfo(getCapitalRequest);
    }

    @PostMapping("/capital/json")
    public Answer getCapitalASJSON(@RequestBody GetCapitalRequest getCapitalRequest) {
        return this.openAIService.getCapitalASJSON(getCapitalRequest);
    }

    @PostMapping("/capital/json/format")
    public GetCapitalResponse getCapitalASJSONFormat(@RequestBody GetCapitalRequest getCapitalRequest) {
        return this.openAIService.getCapitalASJSONFormat(getCapitalRequest);
    }

}
