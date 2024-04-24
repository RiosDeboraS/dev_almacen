package com.almacen.app.rest.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(value = "/")

    public String saludo(){
        return "saludoss !!";
    }


}
