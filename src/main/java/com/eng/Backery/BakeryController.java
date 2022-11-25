package com.eng.Backery;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BakeryController {

    @GetMapping(path = "/")
    public @ResponseBody String home(){
        return "Hello World";
    }


}
