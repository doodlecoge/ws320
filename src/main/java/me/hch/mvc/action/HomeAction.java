package me.hch.mvc.action;

import me.hch.mvc.dao.TheDao;
import me.hch.mvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by huaiwang on 14-3-29.
 */
@Controller
@RequestMapping(value = "/")
public class HomeAction {
    @Autowired
    private TheDao theDao;

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        theDao.addHospital();
        List hospitals = theDao.getHospitals();

        List<User> users = theDao.getUsers();
        for (User user : users) {
            System.out.println("=========" + user);
        }
        return "index";
    }
}
