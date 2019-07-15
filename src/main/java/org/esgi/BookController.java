package org.esgi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/bonjour")
public class BookController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String bonjour() {

        customerService.test();

        return "bonjour!";
    }

    //    @RequestMapping("/find" ,method = RequestMethod.GET)
    @RequestMapping(value="/find")
    @ResponseBody
    public String find() {

        System.out.println("on passe par FIND!!!!");
        return customerService.test2();

    }

}
