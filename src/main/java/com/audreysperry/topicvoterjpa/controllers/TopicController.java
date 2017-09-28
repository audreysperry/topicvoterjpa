package com.audreysperry.topicvoterjpa.controllers;

import com.audreysperry.topicvoterjpa.dao.TopicDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TopicController {

    @Autowired
    private TopicDao topicDao;

    @RequestMapping("/")
    public String topicList(Model model) {
        model.addAttribute("topics", topicDao.findAll());

        return "index";
    }
}
