package com.cards;

import com.cards.model.UsersEntity;
import com.cards.service.UsersService;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private UsersService usersService;

    @JsonView(UsersEntity.Views.Public.class)
    @RequestMapping("/all")
    public List<UsersEntity> getAllUsers() {
        return usersService.getAll();
    }

}