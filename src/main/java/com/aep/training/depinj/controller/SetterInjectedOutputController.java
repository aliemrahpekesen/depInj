package com.aep.training.depinj.controller;

import com.aep.training.depinj.service.OutputService;

public class SetterInjectedOutputController {

    private OutputService outputService;

    public void setOutputService(OutputService outputService) {
        this.outputService = outputService;
    }

    public String doOutput(){
        System.out.println("SetterInjected is working..");
        return outputService.getOutput();
    }


}
