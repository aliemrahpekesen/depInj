package com.aep.training.depinj.controller;

import com.aep.training.depinj.service.OutputService;

public class FieldInjectedOutputController {

    public OutputService outputInterface;

    public String doOutput(){
        System.out.println("FieldInjected is working..");
        return outputInterface.getOutput();
    }
}
