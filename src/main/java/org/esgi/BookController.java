package org.esgi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/spitter")
public class BookController {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String bonjour() {
        return "bonjour!";
    }
}
