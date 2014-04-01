package me.hch.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by huaiwang on 14-3-29.
 */
@Controller
@RequestMapping(value = "/")
public class HomeAction {
    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "index";
    }
}
