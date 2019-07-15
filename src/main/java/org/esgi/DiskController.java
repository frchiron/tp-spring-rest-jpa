package org.esgi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
@RequestMapping("/disk")
public class DiskController {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String bonjour() {
        return "bonjour le disque!";
    }
}
