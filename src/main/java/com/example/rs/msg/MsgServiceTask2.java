package com.example.rs.msg;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.camunda.bpm.engine.delegate.Expression;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MsgServiceTask2 implements ExecutionListener {

    Logger log = LoggerFactory.getLogger(MsgServiceTask2.class);
    Expression input1;
    Expression input2;
    String inputVal;
    String wish;

    @Override
    public void notify(DelegateExecution delegateExecution) throws Exception {
        inputVal = (String) input1.getValue(delegateExecution);
        wish = (String) input2.getValue(delegateExecution);
        log.info("Listener input1 ={}", inputVal);
        log.info("Listener input2 ={}", wish);
    }
}
