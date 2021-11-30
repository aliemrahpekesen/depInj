package com.aep.training.depinj.controller;

import com.aep.training.depinj.service.impl.PrinterOutputServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FieldInjectedOutputControllerTest {

    public  FieldInjectedOutputController controller;

    @BeforeEach
    void setUp() {
        controller = new FieldInjectedOutputController();
        controller.outputInterface = new PrinterOutputServiceImpl();
    }

    @Test
    void doOutput() {
        System.out.println(controller.doOutput());
    }

}