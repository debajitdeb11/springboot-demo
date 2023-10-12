package xyz.debajit.helloworld.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class FunRestController {

    @Value("${myProps.name}")
    private String myName;
    @Value("${myProps.msg}")
    private String myMsg;
    @Value("${myProps.life}")
    private String myLife;


    // expose "/" that returns "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return myName;
    }

    @GetMapping("/debajit")
    public String sayHi() {
        return myMsg;
    }

    @GetMapping("/life")
    public String myLife() {
        return myLife;
    }

    @GetMapping("/message")
    public String msg(){
        return "<h1>" + myName + ", " + myMsg + "</h1>";
    }
}
