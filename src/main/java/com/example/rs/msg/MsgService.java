package com.example.rs.msg;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MsgService {

    @Autowired
    RuntimeService runtimeService;

    public void startProcessByMessageMethod(Person person){
        runtimeService.createMessageCorrelation("msg-1")
                .setVariable("name", person.getName())
                .setVariable("gender", person.getGender())
                .correlate();

    }
}
