package com.aep.training.depinj.controller;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ConstructorInjectedOutputControllerTest {

    @Autowired
    ConstructorInjectedOutputController controller;

    @Test
    void doOutput() {
        System.out.println(controller.doOutput());
    }
}