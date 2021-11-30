package com.aep.training.depinj.controller;

import com.aep.training.depinj.service.OutputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class FieldInjectedOutputController {

    @Autowired
    public OutputService outputService;

    public String doOutput(){
        System.out.println("FieldInjected is working..");
        return outputService.getOutput();
    }
}
