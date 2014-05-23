package me.hch.mvc.action;

import me.hch.mvc.dao.TheDao;
import me.hch.trigger.TriggerFactory;
import me.hch.trigger.TriggerInfo;
import me.hch.trigger.TriggerInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by huaiwang on 5/23/14.
 */
@Controller
@RequestMapping("/trigger")
public class TriggerAction {
    @Autowired
    private TheDao theDao;

    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap map) {
        List<TriggerInfo> triggerInfos = theDao.getTriggerInfos();
        map.put("triggers", triggerInfos);
        return "triggers";
    }

    @RequestMapping("/update")
    @ResponseBody
    public String update() {
        List<TriggerInfo> triggerInfos = theDao.getTriggerInfos();
        triggerInfos.clear();
        for (TriggerInfo triggerInfo : triggerInfos) {
            TriggerInterface trigger = TriggerFactory.getTrigger(triggerInfo);
            TriggerFactory.addTriggerInstance(trigger);
        }
        return "{'result':'success'}";
    }
}
