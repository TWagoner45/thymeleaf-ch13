package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


//@Controller
//@ResponseBody
//@RequestMapping("hello")
//public class HelloController {

    //handles requests at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }

    //lives at /hello/goodbye
//    @GetMapping("goodbye")
//    public String goodbye() {
//        return "Goodbye, Spring!";
    //}

    // Handles requests of the form /hello?name=LaunchCode
    //takes a query parameter called name w/given value used in response
//    @GetMapping("hello")
    //lives at hello/hello
//    @RequestMapping(value = "hello", method= {RequestMethod.GET, RequestMethod.POST})  //removed value="hello" now above the class
//    @ResponseBody
//    public String helloWithQueryParam(@RequestParam String name) {
//        return"Hello, " + name + "!";
//    }
//
//    //handles requests of the form /hello/LaunchCode
//    //the piece of data is part of the path not string
//
//    @GetMapping("hello/{name}") //remove the hello since now above the class
//    @ResponseBody
//    public String helloWithPathParam(@PathVariable String name){
//        return "Hello, " + name + "!";
//    }
//
//    //lives at hello/form
//    @GetMapping("form")
//    //@ResponseBody
//    public String helloForm(){
//        return "form";
//    }
//        return "<html>" +
//                "<body>" +
//                "<form action='hello' method='post'>" + //submit a request to /hello
//                "<input type='text' name='name'>" +
//                "<input type='submit' value='Greet Me!'>" +
//                "</form>" +
//                "</body>" +
//                "</html>";
//    }

//}
