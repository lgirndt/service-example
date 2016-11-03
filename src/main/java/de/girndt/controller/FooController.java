package de.girndt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FooController {

    @RequestMapping(value = "/", method = RequestMethod.GET,produces = "application/json")
    @ResponseBody
    public String show() {
        return "{\"foo\":\"bar\"}";
    }
}
