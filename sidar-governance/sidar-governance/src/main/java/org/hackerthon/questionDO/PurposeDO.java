package org.hackerthon.questionDO;

import java.util.List;

public class PurposeDO {

    private final List<String> questions;

    public PurposeDO(List<String> questions)
    {
        this.questions = questions;
    }

    public List<String> getQuestions() {
        return questions;
    }
    
}
