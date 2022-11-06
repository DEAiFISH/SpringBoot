package com.deaifish.boot.controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class WebController {

    //    @RequestMapping(value = "/get",method = RequestMethod.GET)
    @GetMapping("/get")
    public String get() {
        return "method_get";
    }

    @PostMapping("/post")
    public String post(){
        return "method_post";
    }

    @DeleteMapping("/delete")
    public String delete(){
        return "method_delete";
    }

    @PutMapping("/put")
    public String put(){
        return "method_put";
    }
}
