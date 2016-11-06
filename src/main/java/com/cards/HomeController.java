package com.cards;

import com.cards.model.QuestionsEntity;
import com.cards.model.UsersEntity;
import com.cards.service.QuestionsService;
import com.cards.service.UsersService;
import com.cards.service.impl.UsersServiceImpl;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private UsersService usersService;

    @Autowired
    private QuestionsService questionsService;

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

//    @JsonView(UsersEntity.Views.Public.class)
//    @RequestMapping("/all")
//    public List<UsersEntity> getAllUsers() {
//        return usersService.getAll();
//    }
//
//    @JsonView(QuestionsEntity.Views.Public.class)
//    @RequestMapping("/all_questions")
//    public List<QuestionsEntity> getAllQuestions() {
//        return questionsService.getAll();
//}

}