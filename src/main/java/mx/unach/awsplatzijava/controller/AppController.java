package mx.unach.awsplatzijava.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class AppController {

    @RequestMapping(value = "/members", method = RequestMethod.GET)
    public String members() {

        return "members";

    }

    @RequestMapping(value = "/members/{name}", method = RequestMethod.GET)
    public String getMember(@PathVariable String name) {
        return name;
    }

}
