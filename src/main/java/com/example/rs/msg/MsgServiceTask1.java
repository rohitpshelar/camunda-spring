package com.example.rs.msg;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MsgServiceTask1 implements JavaDelegate {

    Logger log = LoggerFactory.getLogger(MsgServiceTask1.class);

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        log.info("Executed MsgServiceTask1 ");
        delegateExecution.setVariable("servicevar", "servicevalue");
    }
}
