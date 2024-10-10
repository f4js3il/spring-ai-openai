package guru.springframework.springai.services;

import guru.springframework.springai.model.Answer;
import guru.springframework.springai.model.GetCapitalRequest;
import guru.springframework.springai.model.GetCapitalResponse;
import guru.springframework.springai.model.Question;

public interface OpenAIService {

    String getAnswer(String question);

    Answer getAnswer(Question question);

    Answer getCapital(GetCapitalRequest getCapitalRequest);

    Answer getCapitalWithInfo(GetCapitalRequest getCapitalRequest);

    Answer getCapitalASJSON(GetCapitalRequest getCapitalRequest);

    GetCapitalResponse getCapitalASJSONFormat(GetCapitalRequest getCapitalRequest);
}
