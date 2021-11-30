package com.aep.training.depinj.controller;

import com.aep.training.depinj.service.OutputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedOutputController {

    private OutputService outputService;

    @Autowired
    public void setOutputService(OutputService outputService) {
        this.outputService = outputService;
    }

    public String doOutput(){
        System.out.println("SetterInjected is working..");
        return outputService.getOutput();
    }


}
