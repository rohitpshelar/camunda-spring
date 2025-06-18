package com.example.rs.msg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {

    @Autowired
    MsgService msgService;

     @RequestMapping(value = "/msgstart", method = RequestMethod.POST)
//    @POST(value = "/msgstart")
    public void persistPerson(@RequestBody Person person){
        msgService.startProcessByMessageMethod(person);
    }
}
